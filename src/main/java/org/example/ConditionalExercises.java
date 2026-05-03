package org.example;

public class ConditionalExercises {

    public boolean lessThanFive(int number) {
        if (number < 5) {
            return true;
        } else {
            return false;
        }
    }

    public String getAgeGroup(int age) {
        if (age >= 0 && age <= 12) {
            return "child";
        } else if (age >= 13 && age <= 19) {
            return "teen";
        } else if (age >= 20 && age <= 64) {
            return "adult";
        } else {
            return "unknown";
        }
    }

    public boolean isValidPassword(String password) {
        // It is safer to check for null to avoid errors
        if (password != null && password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }
}
