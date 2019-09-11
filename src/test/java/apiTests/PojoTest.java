package apiTests;

import apiModels.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;


public class PojoTest {


    @Test
    public void singleDeserealization()throws Exception{

        Response response = RestAssured.get("http://cybertekchicago.com/student/1618");
        ObjectMapper mapper =new ObjectMapper();

        Student student =mapper.readValue(response.asString(),Student.class);

        System.out.println(student.getCompany().getCompanyId());
        System.out.println(student.getFirstName());


    }
@Test
    public void singleDeserialization2()throws Exception{

        Response response = RestAssured.get("http://cybertekchicago.com/student/1610");
        ObjectMapper mapper= new ObjectMapper();
        Student student1 = mapper.readValue(response.asString(), Student.class);


}

























    }



