package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sections")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sectionid;

    @NotNull
    @Column(nullable = false,
            unique = true)
    private String sectionname;

    @OneToMany(mappedBy = "sections",
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "sections",
            allowSetters = true)
    private List<Book> book = new ArrayList<>();

    public Section() {
    }

    public Section(@NotNull String sectionname) {
        this.sectionname = sectionname;
    }

    public long getSectionid() {
        return sectionid;
    }

    public void setSectionid(long sectionid) {
        this.sectionid = sectionid;
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }
}
