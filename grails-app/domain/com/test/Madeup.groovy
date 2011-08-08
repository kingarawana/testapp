package com.test

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

class Madeup {
	static mapWith = "mongo"
	
	ObjectId id;
	String data;
	String name;
	String alias;
	String kind;
	String shop;
	
    static constraints = {
		shop(nullable: true)
    }
}
