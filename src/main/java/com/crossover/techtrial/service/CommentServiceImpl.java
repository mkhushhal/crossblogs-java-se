package com.crossover.techtrial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crossover.techtrial.model.Comment;
import com.crossover.techtrial.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentRepository commentRepository;

	/*
	 * Returns all the Comments related to article along with Pagination
	 * information.
	 */
	@Override
	public List<Comment> findAll(Long articleId) {
		return commentRepository.findByArticleIdOrderByDate(articleId);
	}

	/*
	 * Save the default article.
	 */
	@Override
	public Comment save(Comment comment) {
		return commentRepository.save(comment);
	}
}
