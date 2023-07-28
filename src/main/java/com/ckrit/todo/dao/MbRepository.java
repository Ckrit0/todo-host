package com.ckrit.todo.dao;

import com.ckrit.todo.dto.Member;

public interface MbRepository {
	public boolean join(String reqBody);

	public boolean changePw(String reqBody);

	public boolean leave(String reqBody);

	public boolean auth(String reqBody);

	public Member getMbByMbNo(String reqBody);

	public Member getMbByIdPw(String reqBody);

}
