import java.util.*;

// Meal Plan Interface - Represents a generic meal type
interface MealPlan {
    String getMealType();
}

// Specific Meal Types (Standalone Classes) implementing MealPlan
class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High-Protein";
    }
}

// Generic Meal Class - Stores meal details
class Meal<T extends MealPlan> {
    private String mealName; // Name of the meal
    private T mealType; // Type of meal (Vegetarian, Vegan, etc.)

    // Constructor to initialize Meal object
    Meal(String mealName, T mealType) {
        this.mealName = mealName;
        this.mealType = mealType;
    }

    public String getMealName() {
        return mealName;
    }

    public T getMealType() {
        return mealType;
    }

    @Override
    public String toString() {
        return "MealName: " + mealName + " | Meal Type: " + mealType.getMealType();
    }
}

// Meal Plan Generator - Manages and stores meal plans
class MealPlanGenerator {
    private List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();

    // Method to add a meal plan dynamically
    public <T extends MealPlan> void addMealPlan(Meal<T> meal) {
        mealPlans.add(meal);
    }

    // Method to display all available meal plans
    public void displayMealPlans() {
        System.out.println("Personalized Meal Plans:");
        for (Meal<?> meal : mealPlans) {
            System.out.println(meal);
        }
    }
}

// Main Class
public class PersonalMealPlan {
    public static void main(String[] args) {
        // Creating different meal plans
        Meal<VegetarianMeal> vegMeal = new Meal<>("Grilled Tofu Salad", new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>("Avocado Toast", new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>("Chicken & Avocado Bowl", new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = new Meal<>("Steak with Quinoa", new HighProteinMeal());

        // Creating a meal plan generator system
        MealPlanGenerator generator = new MealPlanGenerator();
        generator.addMealPlan(vegMeal);
        generator.addMealPlan(veganMeal);
        generator.addMealPlan(ketoMeal);
        generator.addMealPlan(proteinMeal);

        // Display all available meal plans
        System.out.println("University Course Catalog:");
        generator.displayMealPlans();
    }
}
