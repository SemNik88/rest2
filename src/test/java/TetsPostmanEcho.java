import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TetsPostmanEcho {
    @Test
    void shouldPost() {

        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .body("netologyNEW")
                .when()
                .post("/post")
                .then()
                .log()
                .body()
                .statusCode(200)
                .body("data", equalTo("netology"))
                ;
    }
}
