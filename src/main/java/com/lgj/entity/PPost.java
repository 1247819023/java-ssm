package com.lgj.entity;

import java.util.Date;

public class PPost {
    private Integer post_id;

    private Integer author_id;

    private String post_caption;

    private String post_content;

    private Date post_time;

    public PPost(Integer post_id, Integer author_id, String post_caption, String post_content, Date post_time) {
        this.post_id = post_id;
        this.author_id = author_id;
        this.post_caption = post_caption;
        this.post_content = post_content;
        this.post_time = post_time;
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getPost_caption() {
        return post_caption;
    }

    public void setPost_caption(String post_caption) {
        this.post_caption = post_caption == null ? null : post_caption.trim();
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content == null ? null : post_content.trim();
    }

    public Date getPost_time() {
        return post_time;
    }

    public void setPost_time(Date post_time) {
        this.post_time = post_time;
    }
}