package org.rituraj.annotations.excercise.deprecated;

public class LegacyAPI {
    @Deprecated
    void oldFeature() {
        System.out.println("This feature is deprecated");
    }

    void newFeature() {
        System.out.println("This is the new feature");
    }
}
