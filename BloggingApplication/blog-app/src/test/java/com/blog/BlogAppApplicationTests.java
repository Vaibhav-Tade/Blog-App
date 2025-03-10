package com.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blog.repository.UserRepository;

@SpringBootTest
class BlogAppApplicationTests {
	
	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
		
	}
	
	@Test
	public void repositoryTest() {
		String className = userRepository.getClass().getName();
		String packageName = userRepository.getClass().getPackageName();
		
		System.out.println(className);
		System.out.println(packageName);
	}

}
