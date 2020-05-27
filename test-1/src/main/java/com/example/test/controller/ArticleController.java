package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test.dto.Article;
import com.example.test.service.ArticleService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@RequestMapping("/article/list")
	public String showList(Model model) {
		List<Article> articleList = articleService.getList();
		model.addAttribute("articleList", articleList);

		return "article/list";
	}
}