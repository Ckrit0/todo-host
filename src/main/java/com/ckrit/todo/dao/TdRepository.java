package com.ckrit.todo.dao;

import java.util.List;

import com.ckrit.todo.dto.Todo;

public interface TdRepository {

	boolean tdNew(String reqBody);

	boolean tdUpdate(String reqBody);

	boolean changeTargetDate(String reqBody);

	boolean complete(String reqBody);

	boolean cancelComplete(String reqBody);

	boolean delete(String reqBody);

	List<Todo> getAllTdOrderDate(String reqBody);

	List<Todo> getAllTdReverseDate(String reqBody);

	List<Todo> getAllTdOrderTargetdate(String reqBody);

	List<Todo> getAllTdReverseTargetdate(String reqBody);

	List<Todo> getProgressTdOrderDate(String reqBody);

	List<Todo> getProgressTdReverseDate(String reqBody);

	List<Todo> getProgressTdOrderTargetdate(String reqBody);

	List<Todo> getProgressTdReverseTargetdate(String reqBody);

}
