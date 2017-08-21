package com.sabututxp.bcspreparationassistant.Model;

/**
 * Created by s on 8/21/17.
 */

public class SubjectsCatagory {
    private int id;
    private String title;

    public SubjectsCatagory(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
