package com.idi.springbootididemoandlab.model;

import lombok.*;

/**
 * @author Evgeny Borisov
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private String name;
    private int age;
}
