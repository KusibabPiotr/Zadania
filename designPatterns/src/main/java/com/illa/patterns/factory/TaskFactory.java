package com.illa.patterns.factory;

public class TaskFactory {

    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public Task createTask(final String taskType){

        switch (taskType){
            case PAINTING_TASK:
                return new PaintingTask("Painting task","white","kitchen");
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping Task","Tyskie",25);
            case DRIVING_TASK:
                return new DrivingTask("Driving Task","Birmingham","Bike");
            default:
                return null;
        }
    }
}
