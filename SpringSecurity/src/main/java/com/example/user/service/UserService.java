package com.example.user.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.user.domain.User;
import com.example.user.mapper.UserMapper;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userMapper.getUser(username);
		user.setAuthorities(getAuthorities(username));
		return user;
	}
	
	public Collection<GrantedAuthority> getAuthorities(String username){
		List<String> authorityList = userMapper.getAuthority(username);
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for(String authority : authorityList) {
			authorities.add(new SimpleGrantedAuthority(authority));
		}
		
		return authorities;
	}

}
