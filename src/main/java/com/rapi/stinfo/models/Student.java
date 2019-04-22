package com.rapi.stinfo.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Student {
	@Id
	public ObjectId _id;
	
	
	public String name;
	public String roll;
	
	public Student(ObjectId _id, String name, String roll)
	{
		this._id = _id;
		this.name = name;
		this.roll = roll;
	}
	
	public String get_id() {
		return _id.toHexString(); 
	}
	
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRoll() {
		return this.roll;
	}
	
	public void setRoll(String roll) {
		this.roll = roll;
	}
}

