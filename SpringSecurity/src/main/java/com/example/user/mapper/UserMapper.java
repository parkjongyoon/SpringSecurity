package com.example.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.user.domain.User;

@Mapper
public interface UserMapper {
	
	public User getUser(String username);
	
	public List<String> getAuthority(String username);
}
