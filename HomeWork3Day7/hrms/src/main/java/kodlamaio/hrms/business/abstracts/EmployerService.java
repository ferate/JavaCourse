package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.entities.concretes.Employer;

@Service
public interface EmployerService {
	DataResult<List<Employer>> getAll();

}
