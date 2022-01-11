package com.idi.springbootididemoandlab.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Evgeny Borisov
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ccc")
@Table(name = "CUSTOMERS")
public class Customer implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "FULL_NAME")
    private String name;

    private int age;






}




