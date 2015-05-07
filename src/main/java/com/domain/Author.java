package com.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

import java.util.List;

/**
 * Created by txiong on 5/4/2015.
 */
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(hidden = true)
    @JsonProperty("id")
    private Long id;

    @Column(name = "first_name")
    @JsonProperty("firstName")
    private String firstName;

    @Column(name = "last_name")
    @JsonProperty("lastName")
    private String lastName;

    @OneToMany(mappedBy = "author")
    @JsonManagedReference("authorBook")
    @ApiModelProperty(hidden = true)
    private List<Book> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
