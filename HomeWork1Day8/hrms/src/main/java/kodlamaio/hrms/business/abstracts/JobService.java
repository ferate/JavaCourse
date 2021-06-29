package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Job;

@Service
public interface JobService {
	Result add(Job job);
	DataResult<List<Job>>  getAll();	
	DataResult<List<Job>> getByJobName(String jobName);
	

}
