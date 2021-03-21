package com.illa.patterns.factory;

public final class PaintingTask implements Task{

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isDone;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println("* go to B&Q and buy " + color + " paint");
        System.out.println("* paint " + whatToPaint + " before she comes back from work");
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
