package com.houserent.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.houserent.model.UserDao;
import com.houserent.repo.*;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepo UserRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<UserDao> user = UserRepo.findByEmail(email);
		System.out.println(user);
		return user.map(MyUserDetails::new).get();
	}
	
}
