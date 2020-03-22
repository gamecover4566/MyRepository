package com.test.test.mapper;


import java.util.List;
import com.test.test.Guest;
public interface GuestMapper {
	/*
	 * �޽���̸��� 	GuestMapper.xml ������ id����ġ
	 * �޽������Ÿ���� GuestMapper.xml ������ parameterType ����ġ
	 * �޽�帮��Ÿ���� GuestMapper.xml ������ resultType ����ġ
	 */
	/*
	<select id="selectByNo" resultType="com.itwill.guest.Guest" 
	parameterType="_int">
		select * from guest where guest_no=#{guest_no}
	</select>
	 */
	public Guest selectByNo(int no);
	/*
	<select id="selectAll" resultType="com.itwill.guest.Guest">
		select * from guest
	</select>
	 */
	public List<Guest> selectAll();
	public int insertGuest(Guest guest);
	public int deleteGuest(int guest_no);
	public int updateGuest(Guest guest);
}