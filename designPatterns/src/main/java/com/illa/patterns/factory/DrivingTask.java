package com.illa.patterns.factory;

public class DrivingTask implements Task{

    private final String taskName;
    private final String where;
    private final String using;
    private boolean isDone;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println("* go to " + where);
        System.out.println("* take " + using + " which belongs to your mum");
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
