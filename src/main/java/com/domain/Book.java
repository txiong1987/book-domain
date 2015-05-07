package com.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

/**
 * Created by txiong on 5/4/2015.
 */
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(hidden = true)
    @JsonProperty("id")
    private Long id;

    @Column(name = "title")
    @JsonProperty("title")
    private String title;

    @Column(name = "author_id")
    @JsonProperty("authorId")
    private Long authorId;
    
    @ManyToOne()
    @JoinColumn(name = "author_id", referencedColumnName = "id", insertable = false, updatable = false)
    @JsonBackReference("authorBook")
    @ApiModelProperty(hidden = true)
    private Author author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public void setAuthorId(Long authorId) {
    	this.authorId = authorId;
    }
    
    public Long getAuthorId() {
    	return authorId;
    }
}
