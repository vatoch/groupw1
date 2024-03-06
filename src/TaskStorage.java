import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.*;

public class TaskStorage {
    private final static Map<String,Task> tasks = new HashMap<>();

    public static void addTask(Task task) {
        if(tasks.containsKey(task.getName())) {
            System.out.println("Task with such name already exists");
            return;
        }
        tasks.put(task.getName(), task);
        System.out.println("Task added successfully");

    }

    public static void allTasksInfo() {
        if(tasks.isEmpty()) {
            System.out.println("Tasks storage is empty");
        }
        for(Map.Entry<String,Task> entry : tasks.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void updateTask( Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter task name");
        String name = scanner.nextLine();
        Task task = tasks.get(name);
        if(task==null) {
            System.out.println("Task with such name doesn't exist");
            return;
        }
        System.out.println("Enter task description : ");
        String description = scanner.nextLine();

        task.setDescription(description);
        System.out.println("task updated successfully");
    }

    public static Task getTask(String taskName) {
        Task task = tasks.get(taskName);
        if(task==null) {
            System.out.println("Task with such name doesn't exist");
        }
        return task;
    }

    public static void deleteTask(String taskName) {
        Task task = tasks.get(taskName);
        if(task==null) {
            System.out.println("Task with such name doesn't exist");
            return;
        }
        tasks.remove(taskName);
        System.out.println("Task deleted successfully");
    }
}
