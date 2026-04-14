package service;

import domain.Task;
import java.util.ArrayList;


public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask (String title) {
        Task task = new Task(nextId, title);
        tasks.add(task);
        nextId++;
        }

    public void listTasks() {
        for (Task task : tasks)
            System.out.println(task);


        }






}

