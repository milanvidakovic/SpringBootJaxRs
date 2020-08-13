package com.minja.controllers;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.minja.entities.Student;
import com.minja.services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Path("/rest/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "OK";
    }

 	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
    public Collection<Student> getStudenti() {
		return studentService.getStudents();
	}

	@POST
	@Path("/insert")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student insert(Student s) {
		return studentService.insert(s);
	}

	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student update(Student s) {
		return studentService.update(s);
	}

	@DELETE
	@Path("/delete/{id}")
	public boolean delete(@PathParam("id") long id) {
		return studentService.delete(id);
	}

}
