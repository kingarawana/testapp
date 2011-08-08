package com.test
import org.bson.types.ObjectId

import com.google.code.morphia.annotations.*
class Role {
	
	
   @Id ObjectId id
   String roleName
   boolean isSuperAdmin = false
   int sortOrder = 0

	static constraints = {
		authority blank: false, unique: true
	}
}
