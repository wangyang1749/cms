package com.wangyang.cms;

import com.wangyang.cms.pojo.entity.ArticleTags;
import com.wangyang.cms.pojo.entity.Tags;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestUtil {

    @Test
    public void test(){
        Set<Integer> tagsId = new HashSet<>();
        // Build post categories
        List<ArticleTags> articleTags = tagsId.stream().map(tagId -> {
            ArticleTags tags = new ArticleTags();
            tags.setTagsId(tagId);
            tags.setArticleId(1);
            return tags;
        }).collect(Collectors.toList());


    }
}
