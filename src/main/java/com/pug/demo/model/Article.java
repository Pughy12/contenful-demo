package com.pug.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {

    private Sys sys;
    private Fields fields;

    public Article() {
    }

    public Sys getSys() {
        return sys;
    }

    public Fields getFields() {
        return fields;
    }


    @JsonIgnoreProperties(ignoreUnknown = true)
    private class Sys {

        private String id;

        public Sys() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }


    @JsonIgnoreProperties(ignoreUnknown = true)
    private class Fields {
        private String articleTitle;
        private String articleTag;
        private String articleDate;
        private String articleContent;
        private Author articleAuthor;

        public Fields() {
        }

        public String getArticleTitle() {
            return articleTitle;
        }

        public void setArticleTitle(String articleTitle) {
            this.articleTitle = articleTitle;
        }

        public String getArticleContent() {
            return articleContent;
        }

        public void setArticleContent(String articleContent) {
            this.articleContent = articleContent;
        }

        public String getArticleTag() {
            return articleTag;
        }

        public void setArticleTag(String articleTag) {
            this.articleTag = articleTag;
        }

        public String getArticleDate() {
            return articleDate;
        }

        public void setArticleDate(String articleDate) {
            this.articleDate = articleDate;
        }
    }
}
