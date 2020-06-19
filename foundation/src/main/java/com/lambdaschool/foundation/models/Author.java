package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "authors")

public class Author extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long authorid;

    @Column(nullable = false)
    private String firstname;
    private String lastname;


    @OneToMany(mappedBy = "author",
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "author",
            allowSetters = true)
    private List<Wrote> book = new ArrayList<>();

    public Author() {
    }

    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
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

    public long getAuthorid() {
        return authorid;
    }

    public void setAuthorid(long authorid) {
        this.authorid = authorid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

