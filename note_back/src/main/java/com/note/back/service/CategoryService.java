package com.note.back.service;

import com.note.back.domain.Category;
import com.note.back.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public void add(Category bean) {
        categoryMapper.insert(bean);
    }

    public void delete(Integer id) {
        categoryMapper.deleteByPrimaryKey(id);
    }

    public void update(Category bean) {
        categoryMapper.updateByPrimaryKeySelective(bean);
    }

    public Category get(Integer id) { return categoryMapper.selectByPrimaryKey(id); }

    public List<Category> list(){
        List<Category> categories = categoryMapper.selectAll();
        return categories;
    }

}
