package com.empire.announcementservice.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Announcement implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private LocalDate creationDate;
    private LocalDate modificationDate;
    private String userID;
    private Boolean status;



//        id
//            title
//    description
//            creationDate
//    modificationDate
//            category
//    userId
//            status

}
