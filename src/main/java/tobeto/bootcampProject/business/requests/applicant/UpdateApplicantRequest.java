package tobeto.bootcampProject.business.requests.applicant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateApplicantRequest {
    private int id;
    private String userName;
    private  String firstName;
    private  String lastName;
    private String about;
}
