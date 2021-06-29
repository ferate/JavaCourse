package kodlamaio.hrms.business.abstracts;

import java.time.LocalDate;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public interface JobAdvertisementService {
	Result add(JobAdvertisement jobAdvertisement);	
	//Result updateJobAdvertisement(int id,int userId);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getByIsActiveTrue();
	DataResult<List<JobAdvertisement>> getByIsActiveAndDateOfDeadline(boolean isActive,LocalDate dateOfDeadline);
	DataResult<List<JobAdvertisement>> getByIsActiveAndDateOfCreate(boolean isActive,LocalDate dateOfCreate);
	DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_UserId(boolean isActive,int employerUserId);
	Result setDeactiveJobAdvertisement(int id);
}
