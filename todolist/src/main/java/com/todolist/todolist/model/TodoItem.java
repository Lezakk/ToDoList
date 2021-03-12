package com.todolist.todolist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class TodoItem {
    private long id;
    @NotBlank
    private String title;
    private String description;

    public TodoItem(long id, @NotBlank String title, String description, boolean done) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
    }

    private boolean done;

    public TodoItem() {
    }


    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
