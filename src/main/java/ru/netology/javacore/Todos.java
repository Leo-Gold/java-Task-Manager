package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;

public class Todos {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public String getAllTasks() {
        StringBuilder sb = new StringBuilder();
        tasks
                .stream()
                .sorted()
                .forEach(task -> sb.append(task).append(" "));
        return sb.toString().trim();
    }
}
