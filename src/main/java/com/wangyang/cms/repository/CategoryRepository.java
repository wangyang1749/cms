package com.wangyang.cms.repository;

import com.wangyang.cms.pojo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
