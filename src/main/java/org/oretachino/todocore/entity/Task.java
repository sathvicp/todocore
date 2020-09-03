package org.oretachino.todocore.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Title is mandatory.")
    @Size(min = 1, max = 220)
    private String title;

    @Size(max = 2500)
    private String description;

    @NotBlank(message = "Completion status can't be empty.")
    @Column(columnDefinition = "BIT(1) DEFAULT 0")
    private boolean completed;
}
