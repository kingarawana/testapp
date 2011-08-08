package com.test

import org.bson.types.ObjectId

class Asset {
	static mapWith = "mongo"
	
	ObjectId id;
	String data;
	String name;
	String alias;
	String kind;
	String shop;
	List tags;
	Date date;
    static constraints = {
		shop(nullable: true)
		data(nullable: true)
		alias(nullable: true)
		kind(nullable: true)
		tags(nullable: true)
		date(nullable: true)
		name(nullable: true)
    }
}
