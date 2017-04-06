package com.sdajava.exerciseLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Andrzej on 06.04.2017.
 */
public class Task {

    String id;
    String title;
    TaskType type;

    public Task(String id, String title, TaskType type) {
        this.id = id;
        this.title = title;
        this.type = type;
    }

    public Task(){
    }

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public TaskType getType() {return type;}

    public void setType(TaskType type) {this.type = type;}

}

