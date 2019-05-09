package com.greglturnquist.learningspringboot;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



// POJO stands for Plain Old Java Object

//The @Data annotation from Lombok generates getters, setters, a toString()
//method, an equals() method, a hashCode() method, and a constructor for all
//required (that is, final) fields
//The @Document annotation flags this class as suitable for storing in a MongoDB
//data store
//The id field is marked with Spring Data's @Id annotation, indicating this is the
//primary key of our Mongo document
@Data
@Document
public class Chapter {

	@Id
	private String id;
	private String name;

	public Chapter(String name) {
		this.name = name;
	}

}
