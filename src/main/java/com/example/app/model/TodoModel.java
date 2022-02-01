package com.example.app.model;

import javax.persistence.*;

@Entity
@Table(name="todo")
public class TodoModel {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            @Column(name="id")
    Integer id;

    @Column(name="title")
    String title;

    @Column(name="done")
    boolean done;

    @Column(name="priority")
    String priority;

    @Column(name="description")
    String description;

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
