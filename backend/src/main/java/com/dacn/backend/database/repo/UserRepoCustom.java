package com.dacn.backend.database.repo;

import com.dacn.backend.database.entity.User;

public interface UserRepoCustom {
	/**
	 * 
	 * @param id
	 * @param username
	 * @param password
	 * @param name
	 * @param className
	 * @param assignedMachineId
	 * @param role
	 * @param studentId
	 * @return
	 */
	public User addUser(String username, String password, String name, String className, int assignedMachineId, String role, int studentId);
	
	/**
	 * 
	 * @param studentId
	 * @return
	 */
	public User findUserById(int studentId);
	
	public User getLoginInfo(String username);
}
