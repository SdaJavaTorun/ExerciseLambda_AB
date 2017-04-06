package com.sdajava.exerciseLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List<Task> tasks =  getTasks();
        List<String> titles = taskTitles (tasks);

        titles.forEach(System.out::println);

        //for (String title : titles){
        //    System.out.println(title);
    }


    public static List <String> taskTitles (List<Task> tasks){
        List<String> readingTitles = new ArrayList<>();
        for (Task task : tasks){
            if (task.getType() == TaskType.READING){
                readingTitles.add(task.getTitle());
            }
        }
        return readingTitles;
    }

    public static List<Task> getTasks() {
        List <Task> tasks = new ArrayList<>();

        Task task1 = new Task("1", "Dziwny", TaskType.READING);
        Task task2 = new Task("2","Dziwniejszy", TaskType.NOTREADING);

        tasks.add(task1);
        tasks.add(task2);

        return tasks.stream().collect(Collectors.toList());
    }
}