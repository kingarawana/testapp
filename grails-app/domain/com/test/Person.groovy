package com.test

import org.bson.types.ObjectId

class Person {
	static mapWith = "mongo"
	
	ObjectId id
	String name;
    static constraints = {
    }
}
