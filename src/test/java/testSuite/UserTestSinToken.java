package testSuite;

import config.ApiConfig;
import factoryRequest.FactoryRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class UserTestSinToken extends BasicAuthTestBaseUser{

    @Test
    @DisplayName("Verify the create user and create project - todo.ly")
    public void createUserProject() {
        request.setUrl(ApiConfig.CREATE_USER)
                .setBody(body.toString());
        response = FactoryRequest.make("post").send(request);
        response.then().statusCode(200).body("Email",equalTo(body.get("Email")));

        valueAuth = "" ;

        //Create Project sin token
        request.setUrl(ApiConfig.CREATE_PROJECT)
                .setHeaders(auth, valueAuth).setBody(body.toString());
        response = FactoryRequest.make("post").send(request);
        response.then().statusCode(200);

    }

}
