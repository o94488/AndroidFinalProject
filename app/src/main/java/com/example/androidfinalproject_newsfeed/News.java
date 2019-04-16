package com.example.androidfinalproject_newsfeed;

public class News {

    private String title; //article of url
    private String body; //body of article
    private String url; //uuid

    /**
     *title body and new id constructor
     * @param title
     * @param body
     * @param url
     */
    public News(String title, String body, String url){
        this.title = title;
        this.body = body;
        this.url = url;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    public String getBody() {
        return body;
    }

    /**
     *
     * @param body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     *
     * @return
     */
    public String geturl() {
        return url;
    }

    /**
     *
     * @param url
     */
    public void seturl(String url) {
        this.url = url;
    }
}

