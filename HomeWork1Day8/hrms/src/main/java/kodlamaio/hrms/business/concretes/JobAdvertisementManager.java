package kodlamaio.hrms.business.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import net.bytebuddy.asm.Advice.This;


@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	
	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {		
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş İlanı Kaydı Yapıldı");
	}
	

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() {		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveTrue(),"Aktif İş İlanları Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {		
		Sort sort = Sort.by(Sort.Direction.ASC,"id");
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort),"Bütün İş İlanları Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndDateOfDeadline(boolean isActive, LocalDate dateOfDeadline) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveAndDateOfDeadline(isActive,dateOfDeadline),"İlgili Tarihteki İş İlanları Aktiflik Durumuna Göre Listelendi");
	
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndDateOfCreate(boolean isActive, LocalDate dateOfCreate) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveAndDateOfCreate(isActive, dateOfCreate), "İş İlanları Statusu ve Oluşturulma Tarihine Göre Listelenmiştir");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_UserId(boolean isActive, int employerUserId) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveAndEmployer_UserId(isActive, employerUserId), "İlgili Şirkete Ait İş İlanları Listelenmiştir");
	}

	@Override
	public Result setDeactiveJobAdvertisement(int id) {
		this.jobAdvertisementDao.setDeactiveJobAdvertisement(id);
		return new Result(true, "İş İlanı Pasif Edildi");
	}

	
	


	
	
	

	

	
	
	

}
