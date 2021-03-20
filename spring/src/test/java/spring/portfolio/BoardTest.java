package spring.portfolio;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTest {

    private final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(BoardConfig.class);
    @Test
    public void shouldAddTaskToToDoList(){
        // given
        Board bean = context.getBean(Board.class);
        TaskList toDoList = bean.getToDoList();
        // when
        boolean isAdded = toDoList.addTaskToList("Shopping for dinner");
        List<String> tasks = toDoList.getTasks();
        // then
        assertThat(isAdded).isTrue();
        assertThat(tasks).hasSize(1);
        assertThat(tasks).containsOnly("Shopping for dinner");
    }

    @Test
    public void shouldAddTaskToInProgressList(){
        // given
        Board bean = context.getBean(Board.class);
        TaskList inProgressList = bean.getInProgressList();
        // when
        boolean isAdded = inProgressList.addTaskToList("Cleaning room");
        List<String> tasks = inProgressList.getTasks();
        // then
        assertThat(isAdded).isTrue();
        assertThat(tasks).hasSize(1);
        assertThat(tasks).containsOnly("Cleaning room");
    }

    @Test
    public void shouldAddTaskToDoneListFinal(){
        // given
        Board bean = context.getBean(Board.class);
        TaskList doneListFinal = bean.getToDoList();
        // when
        boolean isAdded = doneListFinal.addTaskToList("Wash dishes");
        List<String> tasks = doneListFinal.getTasks();
        // then
        assertThat(isAdded).isTrue();
        assertThat(tasks).hasSize(1);
        assertThat(tasks).containsOnly("Wash dishes");
    }

}