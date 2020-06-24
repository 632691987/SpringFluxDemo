package org.personal.springfluxdemo.web1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User
{
    private String name;

    private String gender;

    private Integer age;
}
