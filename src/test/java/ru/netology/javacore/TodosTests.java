package ru.netology.javacore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodosTests {

    Todos todos = new Todos();

    @Test
    public void testAddTask() {
        todos.addTask("Сходить на акробатику");
        final String result = todos.getAllTasks();
        assertEquals(result, "Сходить на акробатику");
    }

    @Test
    public void testSortingTodos() {
        todos.addTask("Сходить на хастл");
        todos.addTask("Сходить на квест");
        todos.addTask("Сходить в бассейн");
        final String result = todos.getAllTasks();
        assertEquals(result, "Сходить в бассейн Сходить на квест Сходить на хастл");
    }

    @Test
    public void testRemoveTask() {
        todos.addTask("Хастл");
        todos.addTask("Акробатика");
        todos.addTask("Бассейн");
        todos.removeTask("Акробатика");
        final String result = todos.getAllTasks();
        assertEquals(result, "Бассейн Хастл");
    }
}
