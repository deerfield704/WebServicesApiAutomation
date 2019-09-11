package apiTests;

import apiModels.CustomResponse;
import apiModels.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class CustomResTest {


    @Test
    public void CustomCheck() throws Exception {

        Response response = RestAssured.get("http://cybertekchicago.com/student/all");
        ObjectMapper mapper = new ObjectMapper();
        CustomResponse cr = mapper.readValue(response.asString(), CustomResponse.class);

        System.out.println(cr.getStudents().size());

        int count = 0;

        for (Student student : cr.getStudents()
        ) {
            if (cr.getCompany().getAddress().getCity().equalsIgnoreCase("chicago"))
                count++;
        }
        System.out.println("total students work in Chicago: " + count);


    }
}
