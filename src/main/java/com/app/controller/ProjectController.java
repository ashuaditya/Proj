package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.PerformaInvoice;
import com.app.model.ProjectDetails;
import com.app.repo.PerformaInvoiceRepository;

@Controller
@RequestMapping("/nicsi")
public class ProjectController {
	


	@Autowired
	PerformaInvoiceRepository piRepository;

	//1. Show Product Form with Backing Object
	@RequestMapping("/reg")
	public ModelAndView showReg(ModelMap map) {

		//Form Backing Object
		ModelAndView mav = new ModelAndView("projectDetails");
		mav.addObject("projectDetails", new ProjectDetails());
		return mav;
		

	}

	//2. Read Form Data on  submit
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveData(@ModelAttribute ProjectDetails pd, Model model,MultipartFile file){
		
		ProjectDetails projDet = new ProjectDetails();

		//Getting UI data
		/*
		 *
		 * projDet.setProjName(pd.getProjName());
		 * System.out.println("Name="+pd.getProjName()); 
		 * projDet.setCloudAccNumber(pd.getCloudAccNumber());
		 * System.out.println("Cloud Account="+pd.getCloudAccNumber());
		 * projDet.setYear(pd.getYear()); System.out.println("Year="+pd.getYear());
		 * 
		 */

		PerformaInvoice pi = new PerformaInvoice();
		List<PerformaInvoice> list =  pd.getPi();
		for (PerformaInvoice p : list){
			if(p != null) {
				if(p.getPiNumber() != null) {
					pi.setPiNumber(p.getPiNumber());
					System.out.println("PI Number="+p.getPiNumber());
				}
				if(p.getPiAmount() != null){
					pi.setPiAmount(p.getPiAmount());
					System.out.println("PI Amount="+p.getPiAmount());
				}
				if(p.getPiDate() != null){
					pi.setPiDate(p.getPiDate());

					System.out.println("PI Date="+p.getPiDate());
				}
				if(p.getFileName() != null){
					//How to Save PDF File in hard disk and save path in database
				}
				
			}
		}
		return null;
	}

}



