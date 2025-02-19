package org.example.entities;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Courses {
    private long id;

    private String title;
    private String description;


    //-------------------------

    //ALREADY DEFINED BY LOMBOK
//    public Courses(long id, String title, String description) {
//        this.id = id;
//        this.title = title;
//        this.description = description;
//    }
//    public Courses(){
//        super();
//    }

    //--------------------------

}
