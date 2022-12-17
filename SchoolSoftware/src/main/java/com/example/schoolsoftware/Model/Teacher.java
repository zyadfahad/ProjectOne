package com.example.schoolsoftware.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher {
    @NotNull(message = "Id can't be null")
    private Integer id;

    @NotEmpty(message = "Nmae can't be empty")
    private String name;

    @NotNull(message = "Salary can't be null")
    private Integer salary;
}
