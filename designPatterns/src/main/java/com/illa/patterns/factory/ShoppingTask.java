package com.illa.patterns.factory;

public final class ShoppingTask implements Task{

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isDone;

    public ShoppingTask(final String taskName,final  String whatToBuy,final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println("* go to shop");
        System.out.println("* buy " + quantity + " of " + whatToBuy);
        isDone = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }
}
