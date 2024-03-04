package tobeto.bootcampProject.business.responses.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdEmployeeResponse {
    private int id;
    private String position;
    private  String userName;
}