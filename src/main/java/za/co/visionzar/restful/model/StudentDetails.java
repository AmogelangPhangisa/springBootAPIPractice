package za.co.visionzar.restful.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetails {

    private String studentId;
    private String studentName;
    private String studentAddress;
    private String studentPhoneNumber;

}
