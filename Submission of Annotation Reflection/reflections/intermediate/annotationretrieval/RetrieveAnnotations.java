package org.rituraj.reflections.intermediate.annotationretrieval;

public class RetrieveAnnotations {
    public static void main(String[] args) {
        Author author = AnnotatedClass.class.getAnnotation(Author.class);
        if (author != null) {
            System.out.println("Author: " + author.name());
        }
    }
}
