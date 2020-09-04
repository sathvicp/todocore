package org.oretachino.todocore.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Calendar;

@Entity
public class Task {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotBlank(message = "Title is mandatory.")
    @Size(min = 1, max = 220)
    private String title;

    @Size(max = 2500)
    @NotNull(message = "Description can't be null.")
    private String description = "";

    @NotNull(message = "Completion status can't be empty.")
    @Column(columnDefinition = "BIT(1) DEFAULT 0")
    private boolean completed;

    @Temporal(TemporalType.DATE)
    private Calendar dueDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
