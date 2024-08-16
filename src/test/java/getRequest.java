import io.restassured.RestAssured;

public class getRequest {
    public static void main(String[] args) {

       RestAssured.given().baseUri("https://reqres.in/api/unknown").when().get().prettyPrint();
    }


}
