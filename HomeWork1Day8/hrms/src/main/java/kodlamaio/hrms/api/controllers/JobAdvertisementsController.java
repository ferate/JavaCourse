package kodlamaio.hrms.api.controllers;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/JobAdvertisements")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
		
	}
	
	@PostMapping("/add")	
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {		
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@PostMapping("/setDeactiveJobAdvertisement")
	public Result setDeactiveJobAdvertisement(@RequestParam int id) {
		this.jobAdvertisementService.setDeactiveJobAdvertisement(id);
		return new SuccessResult();
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getByIsActiveTrue")
	public DataResult<List<JobAdvertisement>> getJobAdvertisementByIsActiveTrue() {
		return this.jobAdvertisementService.getByIsActiveTrue();		
	}
	
	@GetMapping("/getByIsActiveAndDateOfDeadline")
	public DataResult<List<JobAdvertisement>> getByIsActiveAndDateOfDeadline(@RequestParam("isActive") boolean isActive,@RequestParam("dateOfDeadline") @DateTimeFormat(iso =DateTimeFormat.ISO.DATE) LocalDate dateOfDeadline){
		return this.jobAdvertisementService.getByIsActiveAndDateOfDeadline(isActive, dateOfDeadline);
		
	}
	
	@GetMapping("/getByIsActiveAndDateOfCreate")
	public DataResult<List<JobAdvertisement>> getByIsActiveAndDateOfCreate(@RequestParam("isActive") boolean isActive,@RequestParam("dateOfCreate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateOfCreate){
		return this.jobAdvertisementService.getByIsActiveAndDateOfCreate(isActive, dateOfCreate);
	}
	
	@GetMapping("/getByIsActiveAndEmployer_UserId")
	public DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_UserId(@RequestParam("isActive") boolean isActive,@RequestParam("employerUserId") int employerUserId){
		return this.jobAdvertisementService.getByIsActiveAndEmployer_UserId(isActive, employerUserId);
	}
	
}
