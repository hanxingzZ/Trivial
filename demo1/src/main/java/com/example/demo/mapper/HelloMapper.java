package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Mapper
@Repository
public interface HelloMapper {

	int deleteByPrimaryKey(Integer userId);

	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	void insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer userId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	List<User> getAllUser();
}
