package aqa_hw2;

import aqa_hw2.dto.CategoryDto;
import aqa_hw2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PutPetTests {
    @Test
    public void verifyPetCanBeModified(){

        int petIdToCreate = 513;
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("Korgi");
        String petNameToCreate = "Lilu";
        String status = "available";

        PetDto petDtoToCreate = new PetDto(petIdToCreate,categoryDto,petNameToCreate,status);


        Response createdPetResponse = given()
                .contentType("application/json")
                .body(petDtoToCreate)
                .post("https://petstore.swagger.io/v2/pet");

        PetDto postResponseDto = createdPetResponse.as(PetDto.class);

        assertEquals(513, postResponseDto.getId());

        Response previouslyCreatedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyCreatedPetDto = previouslyCreatedPetResponse.as(PetDto.class);
        assertEquals(petIdToCreate, previouslyCreatedPetDto.getId());
        assertEquals(categoryDto.getName(), previouslyCreatedPetDto.getCategory().getName());
        assertEquals(petNameToCreate, previouslyCreatedPetDto.getName());
        assertEquals(status, previouslyCreatedPetDto.getStatus());


        CategoryDto updateCategoryDto = new CategoryDto();
        updateCategoryDto.setName("Haski");
        String updatePetName = "Volodya";
        String updateStatus = "reserved";

        petDtoToCreate.setCategory(updateCategoryDto);
        petDtoToCreate.setName(updatePetName);
        petDtoToCreate.setStatus(updateStatus);

        Response updatedPetResponse = given()
                .contentType("application/json")
                .body(petDtoToCreate)
                .put("https://petstore.swagger.io/v2/pet");

        Response UpdatePetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto UpdatedPetDto = UpdatePetResponse.as(PetDto.class);
        assertEquals(petIdToCreate, UpdatedPetDto.getId());
        assertEquals(updateCategoryDto.getName(), UpdatedPetDto.getCategory().getName());
        assertEquals(updatePetName, UpdatedPetDto.getName());
        assertEquals(updateStatus, UpdatedPetDto.getStatus());
        System.out.println(updatedPetResponse.asPrettyString());

    }
}
