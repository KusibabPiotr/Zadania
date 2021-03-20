package spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {

    private final List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public boolean addTaskToList(String task){
        return tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
