package com.test.test;

import java.util.List;

public interface GuestService {

	/*
	 * ���� ����Ʈ
	 */
	List<Guest> selectAll() throws Exception;

	/*
	 * CREATE
	 */
	boolean insertGuest(Guest guest) throws Exception;

	/*
	 * READ ONE
	 */
	Guest selectByNo(int no) throws Exception;

	/*
	 * DELETE
	 */
	boolean deleteGuest(int no) throws Exception;

	/*
	 * UPDATE
	 */
	boolean updateGuest(Guest updateGuest) throws Exception;

}