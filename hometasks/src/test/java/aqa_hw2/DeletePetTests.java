package aqa_hw2;

import aqa_hw2.dto.CategoryDto;
import aqa_hw2.dto.NotFoundPetDto;
import aqa_hw2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeletePetTests {

    @Test

    public void verifyPetCanBeRemoved (){
        int petIdToCreate = 818;
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

        assertEquals(818, postResponseDto.getId());

        Response previouslyCreatedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyCreatedPetDto = previouslyCreatedPetResponse.as(PetDto.class);
        assertEquals(petIdToCreate, previouslyCreatedPetDto.getId());

        given().delete("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        Response deletedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        assertEquals(404, deletedPetResponse.getStatusCode());

        NotFoundPetDto notFoundPetDto = deletedPetResponse.as(NotFoundPetDto.class);
        assertEquals("error", notFoundPetDto.getType());
        assertEquals("Pet not found", notFoundPetDto.getMessage());


    }
}
