package com.example.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test.dto.Article;

@Mapper
public interface ArticleDao {
	public List<Article> getList();
}