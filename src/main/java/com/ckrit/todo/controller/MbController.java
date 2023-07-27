package com.ckrit.todo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ckrit.todo.dao.MbRepository;
import com.ckrit.todo.dto.Member;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class MbController {
	
	private final MbRepository mbRepository;
	
	/**
	 * 회원 가입
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/join")
	@ResponseBody
	public boolean join(@RequestBody String reqBody) {
		boolean isSuccessJoin = mbRepository.join(reqBody);
		return isSuccessJoin;
	}
	
	/**
	 * 비밀번호 변경
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/changepw")
	@ResponseBody
	public boolean changePw(@RequestBody String reqBody) {
		boolean isSuccessChangePw = mbRepository.changePw(reqBody);
		return isSuccessChangePw;
	}
	
	/**
	 * 회원 탈퇴
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/leave")
	@ResponseBody
	public boolean leave(@RequestBody String reqBody) {
		boolean isSuccessLeave = mbRepository.leave(reqBody);
		return isSuccessLeave;
	}
	
	/**
	 * 이메일 인증
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/auth")
	@ResponseBody
	public boolean auth(@RequestBody String reqBody) {
		boolean isSuccessAuth = mbRepository.auth(reqBody);
		return isSuccessAuth;
	}
	
	/**
	 * 회원번호로 회원정보 받기
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/getmbbymbno")
	@ResponseBody
	public Member getMbByMbNo(@RequestBody String reqBody) {
		Member mb = mbRepository.getMbByMbNo(reqBody);
		return mb;
	}
	
	/**
	 * 아이디/이메일 과 패스워드로 회원정보 받기
	 * @param reqBody
	 * @return
	 */
	@PostMapping("/login")
	@ResponseBody
	public Member getMbByIdPw(@RequestBody String reqBody) {
		Member mb = mbRepository.getMbByIdPw(reqBody);
		return mb;
	}

}
