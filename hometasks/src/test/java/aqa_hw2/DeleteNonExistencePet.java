package aqa_hw2;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteNonExistencePet {

    @Test

    public void verifyNonExistencePetCannotBeDeleted (){

        int nonexistentPetId = -199;
        Response getResponse = given().get("https://petstore.swagger.io/v2/pet/" + nonexistentPetId);
        assertEquals (404, getResponse.getStatusCode());

        given().delete("https://petstore.swagger.io/v2/pet/" + nonexistentPetId);
        Response deletedNonExistenPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + nonexistentPetId);
        System.out.println(deletedNonExistenPetResponse.asPrettyString());
        assertEquals(404, deletedNonExistenPetResponse.getStatusCode());


    }
}
