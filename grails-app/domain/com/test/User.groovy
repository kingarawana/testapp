package com.test

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Id;

class User {
	
	ObjectId id
	String username
	String password
	boolean enabled
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	
	static mapWith = "mongo"
	static constraints = {
		username blank: false, unique: true
		password blank: false
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this).collect { it.role } as Set
	}
	
	void setAuthorities(Set<Role> role){
		
	}
}
