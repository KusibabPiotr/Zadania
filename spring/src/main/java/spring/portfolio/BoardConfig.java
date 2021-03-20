package spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;

    @Autowired
    @Qualifier("inProgressList")
    private TaskList inProgressList;

    @Autowired
    @Qualifier("doneListfinal")
    private TaskList doneListfinal;

    @Bean
    public Board getTaskBoard(){
        return new Board(toDoList,inProgressList,doneListfinal);
    }

    @Bean("toDoList")
    public TaskList getTaskList(){
        return new TaskList();
    }

    @Bean("inProgressList")
    public TaskList getInProgressList(){
        return new TaskList();
    }

    @Bean("doneListfinal")
    public TaskList getDoneListFinal(){
        return new TaskList();
    }
}
