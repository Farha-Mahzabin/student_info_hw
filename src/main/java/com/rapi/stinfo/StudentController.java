package com.rapi.stinfo;

import com.rapi.stinfo.models.*;
import com.rapi.stinfo.repositories.*;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentRepository repository;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Student> getAllStudents()
	{
		//return "AABDAGJADI";
		return repository.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") ObjectId id)
	{
		return repository.findBy_id(id);
	}
	
	
	@RequestMapping(value = "/id", method = RequestMethod.PUT)
	public void modifyStudentById(@PathVariable("id") ObjectId id, @Valid @RequestBody Student student)
	{
		student.set_id(id);
		repository.save(student);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Student createStudent(@Valid @RequestBody Student student)
	{
		student.set_id((ObjectId.get()));
		repository.save(student);
		return student;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletePet(@PathVariable ObjectId id)
	{
		repository.delete(repository.findBy_id(id));
	}
	
}
