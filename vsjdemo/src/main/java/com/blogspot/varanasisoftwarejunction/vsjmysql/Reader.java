package com.blogspot.varanasisoftwarejunction.vsjmysql;

import javax.persistence.*;

@Entity
@Table(name = "reader")
public class Reader {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;

    //public Book getBook() {
        //return book;
 //   }

    public void setBook(Book book) {
        this.book = book;
    }

    @ManyToOne
    private Book book;

    public Integer getId() {
        return id;

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}