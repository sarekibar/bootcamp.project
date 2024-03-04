package tobeto.bootcampProject.business.rules;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tobeto.bootcampProject.core.exceptions.types.BusinessException;
import tobeto.bootcampProject.dataAccess.abstracts.ApplicantRepository;
import tobeto.bootcampProject.dataAccess.abstracts.BootCampRepository;
import tobeto.bootcampProject.entity.Applicant;
import tobeto.bootcampProject.entity.User;

@AllArgsConstructor
@Service
public class BootcampBusinessRules {
    public BootCampRepository bootCampRepository;
    /*public  void checkIfUserNameExists(String name){
        Applicant applicant= bootCampRepository.g(name);
        if(user!=null){
            throw  new BusinessException("böyle bir username daha önce kullanılmıştır");
        }
    }*/
}
