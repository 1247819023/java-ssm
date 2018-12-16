package com.lgj.entity;

import java.util.List;

public class PAuthor {
    private Integer author_id;

    private String author_name;

    private String author_sex;

    private String author_phone;

    private String author_address;

    private PPost pPost;

    private List<PPost> pPostList;

    public List<PPost> getpPostList() {
        return pPostList;
    }

    public void setpPostList(List<PPost> pPostList) {
        this.pPostList = pPostList;
    }

    public PPost getpPost() {
        return pPost;
    }

    public void setpPost(PPost pPost) {
        this.pPost = pPost;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name == null ? null : author_name.trim();
    }

    public String getAuthor_sex() {
        return author_sex;
    }

    public void setAuthor_sex(String author_sex) {
        this.author_sex = author_sex == null ? null : author_sex.trim();
    }

    public String getAuthor_phone() {
        return author_phone;
    }

    public void setAuthor_phone(String author_phone) {
        this.author_phone = author_phone == null ? null : author_phone.trim();
    }

    public String getAuthor_address() {
        return author_address;
    }

    public void setAuthor_address(String author_address) {
        this.author_address = author_address == null ? null : author_address.trim();
    }

    public PAuthor() {
    }

    public PAuthor(Integer author_id, String author_name, String author_sex, String author_phone, String author_address) {
        this.author_id = author_id;
        this.author_name = author_name;
        this.author_sex = author_sex;
        this.author_phone = author_phone;
        this.author_address = author_address;
    }
}