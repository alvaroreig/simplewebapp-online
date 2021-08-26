package com.arg.springonline.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.arg.springonline.entities.Area;
import com.arg.springonline.repositories.AreaRepository;

@Controller
public class AreaController {
	private Logger logger = LoggerFactory.getLogger(AreaController.class);

	@Autowired
	private AreaRepository areaRepository;

	@GetMapping("/areas")
	public String users(ArrayList<Area> areas, Model model) {

		List<Area> retrievedAreas = (List<Area>) areaRepository.findAll();
		model.addAttribute("areas", retrievedAreas);
		logger.info("Retrieving " + retrievedAreas.size() + " areas");
		return "area/areas";
	}
	
	@GetMapping("/area")
	public String greetingForm(Model model) {
		model.addAttribute("area", new Area());
		return "area/area";
	}
	
	@PostMapping("/area")
	public String userSubmit(@ModelAttribute Area area, Model model) {
		areaRepository.save(area);
		logger.info("Storing new area: " + area);
		model.addAttribute("area", area);
		return "area/areaResult";
	}
}
