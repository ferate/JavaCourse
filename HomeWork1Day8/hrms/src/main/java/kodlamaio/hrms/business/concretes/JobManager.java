package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.entities.concretes.Job;


@Service
public class JobManager implements JobService {
	
	private JobDao jobDao;
	
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}


	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll());
	}
			

	@Override
	public DataResult<List<Job>> getByJobName(String name) {		
		return new SuccessDataResult<List<Job>>(this.jobDao.findByJobName(name),"Kullanıcı Bulundu");
	}


	@Override
	public Result add(Job job) {
		List<Job> jobs = this.jobDao.findByJobName(job.getJobName());
		
		if(jobs.isEmpty())
		{
			this.jobDao.save(job);
			return new SuccessResult("İş Eklendi");			
		}
		else
		{
			return new ErrorResult("İş Daha Önceden Tanımlı");
		}
		
	}

	

}
