package org.kshrd.template.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.kshrd.template.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
	@Select("Select id,username,gender,age,position, office,start_work,salary,user_hash from table_user order by id")
	@Results({ @Result(property = "startWork", column = "start_work"),
			@Result(property = "userHash", column = "user_hash") })
	public List<User> getAllUser();

	@Delete("Delete From table_user where user_hash=#{userHash}")
	public boolean deleteUser(@Param("userHash") String userHash);

	@Select("Select id,username,gender,age,position, office,start_work,salary,user_hash from table_user where user_hash=#{userHash} order by id")
	@Results({ @Result(property = "startWork", column = "start_work"),
			@Result(property = "userHash", column = "user_hash") })
	public User findUserByHashCode(@Param("userHash") String userHash);

	@Update("Update table_user SET "
			+ "username=#{user.username}, gender=#{user.gender}, age=#{user.age}, position=#{user.position}, "
			+ "office=#{user.office},start_work=#{user.startWork}, salary=#{user.salary} where user_hash=#{user.userHash}")
	public boolean updateUser(@Param("user") User user);

	@Insert("Insert Into table_user(username,gender,age,position,office,start_work,salary,user_hash) Values("
			+ "#{user.username},#{user.gender},#{user.age},#{user.position}, #{user.office},#{user.startWork},#{user.salary},#{user.userHash})")
	public boolean insertUser(@Param("user") User user);
}
