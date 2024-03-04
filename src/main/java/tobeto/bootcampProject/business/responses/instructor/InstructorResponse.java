package tobeto.bootcampProject.business.responses.instructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstructorResponse {
    private int id;
    private String about;
    private  String userName;
    private  String companyName;
}
