package com.demo.user;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;



import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.user.entity.User;
import com.demo.user.service.UserService;





@ExtendWith(MockitoExtension.class)
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Mock
	private UserService userService;

	@Test
	public void saveUserTest() {
		User userResponse = mock(User.class);
		when(userResponse.getUserId()).thenReturn(101);
		User userReq = mock(User.class);
		when(userService.saveUser(any(User.class))).thenReturn(userResponse);
		User userres = userService.saveUser(userReq);
		assertEquals(userResponse.getUserId(), userres.getUserId());

	}

	@Test
	public void UpdateUser() {

		User userResponse = mock(User.class);
		when(userResponse.getUserId()).thenReturn(10);
		User userReq = mock(User.class);
		when(userService.addOrUpdate(any(User.class))).thenReturn(userResponse);
		User usertres = userService.addOrUpdate(userReq);
		assertEquals(userResponse.getUserId(), usertres.getUserId());


	}

	@Test
	public void findByUserId() {
		User userResponse = mock(User.class);
		when(userResponse.getUserId()).thenReturn(10);
		User userReq = mock(User.class);
		when(userService.findByUserId(any(Integer.class))).thenReturn(userResponse);
		User userres = userService.findByUserId(userReq.getUserId());
		assertEquals(userResponse.getUserId(), userres.getUserId());

	}

}
