package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookid;


    @NotNull
    @Column(nullable = false)
    private String booktitle;


    @NotNull
    @Column(nullable = false,
            unique = true)
    private String isbn;


    @Column
    private long copydate;


    @ManyToOne
    @JoinColumn(name = "sectionid", nullable = false)
    @JsonIgnoreProperties(value = "books", allowSetters = true)
    private Section section;

    @OneToMany(mappedBy = "book",
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "book",
            allowSetters = true)
    private List<Wrote> authors = new ArrayList<>();


    public Book() {
    }

    public Book(@NotNull String booktitle, @NotNull String isbn, long copydate, Section section) {
        this.booktitle = booktitle;
        this.isbn = isbn;
        this.copydate = copydate;
        this.section = section;
    }

    public String getCreatedBy() {
        return getCreatedBy();
    }

    public Date getCreatedDate() {
        return getCreatedDate();
    }

    public String getLastModifiedBy() {
        return getLastModifiedBy();
    }

    public Date getLastModifiedDate() {
        return getLastModifiedDate();
    }


    public long getBookid() {
        return bookid;
    }

    public void setBookid(long bookid) {
        this.bookid = bookid;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public long getCopydate() {
        return copydate;
    }

    public void setCopydate(long copydate) {
        this.copydate = copydate;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public List<Wrote> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Wrote> authors) {
        this.authors = authors;
    }

    public void setWrotes(List<Wrote> authors) {
        this.authors = authors;
    }
}


