package apiTests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Ignore;
import org.junit.Test;

public class ResponseJsonPath {

    @Ignore
    public void checkStatusCode (){
        Response response = RestAssured.get("http://cybertekchicago.com/instructor/all");
        System.out.println(response.getStatusCode());
    }

    @Ignore
    public void singleObjectAttribute(){
//jsonPath helps to read attributes separately
        Response response = RestAssured.get("http://cybertekchicago.com/student/1618");
        JsonPath jsonPath =response.jsonPath();
        int batch=jsonPath.get("batch");
        String firstName= jsonPath.getString("firstName");
        String streetAddress=jsonPath.getString("company.address.street");
        System.out.println("Student id #1618 info is as follows: "+batch+firstName+streetAddress);
    }

    @Test
    public void singleObj(){
        Response response = RestAssured.get("http://cybertekchicago.com/student/1610");
        JsonPath jpStudent= response.jsonPath();
        System.out.println(jpStudent.getString("firstName"));
    }

}
