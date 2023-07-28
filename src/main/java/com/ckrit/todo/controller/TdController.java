package com.ckrit.todo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ckrit.todo.dao.TdRepository;
import com.ckrit.todo.dto.Todo;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class TdController {

	private final TdRepository tdRepository;

	/**
	 * 신규 할일 작성
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/tdnew")
	@ResponseBody
	public boolean tdNew(@RequestBody String reqBody) {
		boolean isSuccessNew = tdRepository.tdNew(reqBody);
		return isSuccessNew;
	}

	/**
	 * 할일 내용 수정
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/tdupdate")
	@ResponseBody
	public boolean tdUpdate(@RequestBody String reqBody) {
		boolean isSuccessUpdate = tdRepository.tdUpdate(reqBody);
		return isSuccessUpdate;
	}

	/**
	 * 목표일자 수정
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/changetargetdate")
	@ResponseBody
	public boolean changeTargetDate(@RequestBody String reqBody) {
		boolean isSuccessUpdate = tdRepository.changeTargetDate(reqBody);
		return isSuccessUpdate;
	}

	/**
	 * 할일 완료
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/complete")
	@ResponseBody
	public boolean complete(@RequestBody String reqBody) {
		boolean isSuccessUpdate = tdRepository.complete(reqBody);
		return isSuccessUpdate;
	}

	/**
	 * 할일 완료 취소
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/cancelcomplete")
	@ResponseBody
	public boolean cancelComplete(@RequestBody String reqBody) {
		boolean isSuccessUpdate = tdRepository.cancelComplete(reqBody);
		return isSuccessUpdate;
	}

	/**
	 * 할일 삭제
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/delete")
	@ResponseBody
	public boolean delete(@RequestBody String reqBody) {
		boolean isSuccessUpdate = tdRepository.delete(reqBody);
		return isSuccessUpdate;
	}

	/**
	 * 회원 할일 조회 작성일순(완료 포함, 삭제 제외)
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/alltdorderdate")
	@ResponseBody
	public List<Todo> allTdOrderDate(@RequestBody String reqBody) {
		List<Todo> todos = tdRepository.getAllTdOrderDate(reqBody);
		return todos;
	}

	/**
	 * 회원 할일 조회 작성일역순(완료 포함, 삭제 제외)
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/alltdreversedate")
	@ResponseBody
	public List<Todo> allTdReverseDate(@RequestBody String reqBody) {
		List<Todo> todos = tdRepository.getAllTdReverseDate(reqBody);
		return todos;
	}

	/**
	 * 회원 할일 조회 목표일순(완료 포함, 삭제 제외)
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/alltdordertargetdate")
	@ResponseBody
	public List<Todo> allTdOrderTargetdate(@RequestBody String reqBody) {
		List<Todo> todos = tdRepository.getAllTdOrderTargetdate(reqBody);
		return todos;
	}

	/**
	 * 회원 할일 조회 목표일역순(완료 포함, 삭제 제외)
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/alltdreversetargetdate")
	@ResponseBody
	public List<Todo> allTdReverseTargetdate(@RequestBody String reqBody) {
		List<Todo> todos = tdRepository.getAllTdReverseTargetdate(reqBody);
		return todos;
	}

	/**
	 * 회원 할일 조회(완료 제외, 삭제 제외)
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/progresstdorderdate")
	@ResponseBody
	public List<Todo> progressTdOrderDate(@RequestBody String reqBody) {
		List<Todo> todos = tdRepository.getProgressTdOrderDate(reqBody);
		return todos;
	}

	/**
	 * 회원 할일 조회(완료 제외, 삭제 제외)
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/progresstdreversedate")
	@ResponseBody
	public List<Todo> progressTdReverseDate(@RequestBody String reqBody) {
		List<Todo> todos = tdRepository.getProgressTdReverseDate(reqBody);
		return todos;
	}

	/**
	 * 회원 할일 조회(완료 제외, 삭제 제외)
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/progresstdordertargetdate")
	@ResponseBody
	public List<Todo> progressTdOrderTargetdate(@RequestBody String reqBody) {
		List<Todo> todos = tdRepository.getProgressTdOrderTargetdate(reqBody);
		return todos;
	}

	/**
	 * 회원 할일 조회(완료 제외, 삭제 제외)
	 * 
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/progresstdreversetargetdate")
	@ResponseBody
	public List<Todo> progressTdReverseTargetdate(@RequestBody String reqBody) {
		List<Todo> todos = tdRepository.getProgressTdReverseTargetdate(reqBody);
		return todos;
	}
}
