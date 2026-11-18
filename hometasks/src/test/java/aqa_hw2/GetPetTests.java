package aqa_hw2;

import aqa_hw2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetPetTests {
    

    @Test
    public void verifyPetCanBeObtained (){

        int entityIdToFind = 1999;

        Response response = given().get("https://petstore.swagger.io/v2/pet/" + entityIdToFind);
        System.out.println(response.asPrettyString());

        PetDto petDto = response.as(PetDto.class);
        System.out.println(petDto);
        assertEquals(200, response.statusCode());

        assertEquals(entityIdToFind, petDto.getId());

    }
}
