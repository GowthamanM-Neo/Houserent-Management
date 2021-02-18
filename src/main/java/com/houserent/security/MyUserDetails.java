package com.houserent.security;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.houserent.model.UserDao;
import com.houserent.repo.RoleRepo;

public class MyUserDetails implements UserDetails {
    
    /**
     * 
     */
	
	@Autowired
	RoleRepo roleRepo;
	
    private static final long serialVersionUID = 1L;
    
    private String email;
    private String password;
    private boolean active;
    private List<GrantedAuthority> authorities;
    
    public MyUserDetails(String username) {
        this.email = username;
    }
    
    public MyUserDetails() {
        // TODO Auto-generated constructor stub
    }
    
    public MyUserDetails(UserDao user) {
        
        
        System.out.println(user.getEmail());
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.active = user.isActive();
        System.out.print("Role repo" + roleRepo.findById(1));
        System.out.println(roleRepo.findById(user.getRole_id()).get().getRole().toString());
        String role = roleRepo.findById(user.getRole_id()).get().getRole().toString();
        
        this.authorities = Arrays.stream(role.split(","))
                        .map(SimpleGrantedAuthority :: new)
                        .collect(Collectors.toList());
    }

 

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return this.authorities;
    }
    
    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return this.password;
    }
    
    public String getEmail() {
        // TODO Auto-generated method stub
        return this.email;
    }
    
    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }
    
    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }
    
    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }
    
    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return this.active;
    }

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
    
}

