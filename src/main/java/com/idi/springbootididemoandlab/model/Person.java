package com.idi.springbootididemoandlab.model;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    @NonNull
    private String name;
    private int age;

    @Singular
    private List<String> nicknames;

    @Singular
    private Map<String, Integer> children;

    @Singular("דג")
    private Set<String> fish;
}
