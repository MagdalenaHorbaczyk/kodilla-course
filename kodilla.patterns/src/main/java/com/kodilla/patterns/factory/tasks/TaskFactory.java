package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Drive one", "Airport", "TAXI");
            case PAINTING_TASK:
                return new PaintingTask("Painting one", "Black", "Cat");
            case SHOPPING_TASK:
                return new ShoppingTask("ZooPlus shop", "Cats food", 2);
            default:
                return null;
        }
    }
}
