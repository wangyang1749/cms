package com.wangyang.cms.pojo.vo;

import com.wangyang.cms.pojo.entity.Article;
import com.wangyang.cms.pojo.entity.Category;
import com.wangyang.cms.pojo.entity.Tags;

import java.util.List;

public class ArticleVO extends Article {
    private List<Tags> tags;
    private List<Category> categories;

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
