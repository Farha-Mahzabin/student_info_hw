package com.rapi.stinfo.repositories;

import com.rapi.stinfo.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

public interface StudentRepository extends MongoRepository<Student, String> {
	Student findBy_id(ObjectId  _id);
}
