package aqa_hw2;

import aqa_hw2.dto.CategoryDto;
import aqa_hw2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatePetTests {

    @Test
    public void verifyPetCanBeCreated (){

        int petIdToCreate = 812;
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("Aussi");
        String petNameToCreate = "Laura";
        String status = "available";

       PetDto petDtoToCreate = new PetDto(petIdToCreate,categoryDto,petNameToCreate,status);


        Response createdPetResponse = given()
                .contentType("application/json")
                .body(petDtoToCreate)
                .post("https://petstore.swagger.io/v2/pet");

        PetDto postResponseDto = createdPetResponse.as(PetDto.class);
        System.out.println(createdPetResponse.asPrettyString());

        assertEquals(812, postResponseDto.getId());

        Response previouslyCreatedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyCreatedPetDto = previouslyCreatedPetResponse.as(PetDto.class);
        assertEquals(petIdToCreate, previouslyCreatedPetDto.getId());
        assertEquals(categoryDto.getName(), previouslyCreatedPetDto.getCategory().getName());
        assertEquals(petNameToCreate, previouslyCreatedPetDto.getName());
        assertEquals(status, previouslyCreatedPetDto.getStatus());

    }

}
