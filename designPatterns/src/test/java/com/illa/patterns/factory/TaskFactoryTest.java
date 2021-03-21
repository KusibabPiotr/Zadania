package com.illa.patterns.factory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTest {

    @Test
    public void shouldReturnShoppingTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task task = taskFactory.createTask(TaskFactory.SHOPPING_TASK);
        task.executeTask();
        //then
        assertThat(task.getTaskName()).isEqualTo("Shopping Task");
        assertThat(task.isTaskExecuted()).isTrue();
    }

    @Test
    public void shouldReturnPaintingTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task task = taskFactory.createTask(TaskFactory.PAINTING_TASK);
        task.executeTask();
        //then
        assertThat(task.getTaskName()).isEqualTo("Painting task");
        assertThat(task.isTaskExecuted()).isTrue();
    }

    @Test
    public void shouldReturnDrivingTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task task = taskFactory.createTask(TaskFactory.DRIVING_TASK);
        task.executeTask();
        //then
        assertThat(task.getTaskName()).isEqualTo("Driving Task");
        assertThat(task.isTaskExecuted()).isTrue();
    }

}