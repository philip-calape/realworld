package com.fortis.realworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealworldApplication.class, args);
	}
	/*
		TODO
			1. Create Entities
				USER
					-id
					-email
					-password
					-followingUsers
					-articleFavorited
				PROFILE
					-username
					-bio
					-image
					-following:boolean
				ARTICLE
					-author:User
					-contents
					-createdAt
					-updatedAt
					-userFavorited
					-comments
				COMMENT
					-author
					-article
					-createdAt
					-updatedAt
					-body
	 */
}
