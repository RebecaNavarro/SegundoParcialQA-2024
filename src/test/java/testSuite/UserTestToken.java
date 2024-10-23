package testSuite;

import config.ApiConfig;
import factoryRequest.FactoryRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UserTestToken extends BasicAuthTestBaseUser{

    @Test
    @DisplayName("Verify the create, update, delete user - todo.ly")
    public void createProject() {
        request.setUrl(ApiConfig.CREATE_USER)
                .setBody(body.toString());
        response = FactoryRequest.make("post").send(request);

        response.then().statusCode(200).body("Email",equalTo(body.get("Email")));

    }

}
