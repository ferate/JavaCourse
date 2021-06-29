package kodlamaio.hrms.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	List<JobAdvertisement> getByIsActiveTrue();
	List<JobAdvertisement> getByIsActiveAndDateOfDeadline(boolean isActive,LocalDate dateOfDeadline);
	List<JobAdvertisement> getByIsActiveAndDateOfCreate(boolean isActive,LocalDate dateOfCreate);
	List<JobAdvertisement> getByIsActiveAndEmployer_UserId(boolean isActive,int employerUserId);
	
	@Modifying
	@Transactional
	@Query("update JobAdvertisement j set j.isActive=false where j.id =:id")
	void setDeactiveJobAdvertisement(int id);
	
	
}
