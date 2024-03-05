package com.sheryians.major;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MajorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MajorApplication.class, args);
	}

}

/* insert into roles(id, name) values (1,'ROLE_ADMIN'),(2,'ROLE_USER');
 * 
 * insert into user_role(user_id, role_id) values (1,1),(1,2);
 * 
 * insert into user (id,email,password,firstName,lastName) values (1,'admin@gmail.com','12345','Admin','khan')
 * 
 * admin is admin email
 * password is = 123456
 * 
 * user is pranay email
 * password is = 123456
 * 
 * 
 * */
