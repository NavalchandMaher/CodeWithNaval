package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	public static Long userId;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		System.out.println("my user pass----------"+username);
		
		User user=userRepo.findByUsername(username);
		
		try {
		System.out.println("sssssssssssss------"+user.getId());
		    userId=user.getId();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		if(user==null)
		{
			System.out.println("*************user not found****************");
			throw new UsernameNotFoundException("User 404");
		}
		else {
			System.out.println("User info Is this******===============-----------");
			return new UserPrincipal(user);
		}
	}
	
	public Long getUserId()
	{
		return userId;
	}
	

}
