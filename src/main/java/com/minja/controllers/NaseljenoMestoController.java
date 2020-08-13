package com.minja.controllers;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.minja.entities.NaseljenoMesto;
import com.minja.services.NaseljenoMestoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Path("/rest/mesto")
public class NaseljenoMestoController {

    @Autowired
	NaseljenoMestoService naseljenoMestoService;
		
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<NaseljenoMesto> getMesta(){
		return naseljenoMestoService.getMesta();
	}
}