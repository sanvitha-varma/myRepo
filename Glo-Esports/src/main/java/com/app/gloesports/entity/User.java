package com.app.gloesports.entity;

import lombok.*;

/*
    task is to add the required annotation to make this class a JPA entity
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /*
        task is to add a new column id of type Long.
        It should support the auto-generation of the primary key.
        Use appropriate annotation.
     */
    private Long id;
    /*
        task is to add a new column name of type String.
        It should not be null.
        Use appropriate annotation.
     */
    private String name;
    /*
        task is to add a new column email of type String.
        It should not be null.
        It should be unique.
        Use appropriate annotation.
     */
    private String email;

    /*
        task is to establish the mapping between User and Equipment
        it should be a appropriate mapping as per the diagram
     */
}


