package tobeto.bootcampProject.business.requests.bootcampstate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBootcampStateRequest {
    private int id;
    private int state;
}
