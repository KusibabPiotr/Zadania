package spring.portfolio;

public final class Board {

    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneListFinal;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneListFinal) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneListFinal = doneListFinal;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneListFinal() {
        return doneListFinal;
    }

}