package com.demo.user.service;

import com.demo.user.Vo.ResponseTemplateVO;
import com.demo.user.entity.User;

public interface UserService {

	public User findByUserId(int id);

	public User saveUser(User user);

	public ResponseTemplateVO getUserWithDepartment(int userId);

	public User addOrUpdate(User users);

	public void deleteById(int userId);
}
