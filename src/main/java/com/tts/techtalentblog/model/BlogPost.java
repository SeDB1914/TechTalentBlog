package com.tts.techtalentblog.model;

public class BlogPost {

    private Long id;
    private String title;
    private String author;
    private String blogEntry;

    public BlogPost(String title, String author, String blogEntry) {
        this.title = title;
        this.author = author;
        this.blogEntry = blogEntry;
    }


}
