package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.dao.ArticleDao;
import com.example.test.dto.Article;

@Service
public class ArticleService {
	@Autowired
	private ArticleDao articleDao;
	public List<Article> getList() {
		// 
		return articleDao.getList();
	}

}
