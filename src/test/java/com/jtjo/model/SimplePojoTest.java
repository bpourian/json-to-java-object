package com.jtjo.model;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("SimplePojo Class - demonstrating the use of GSON")
class SimplePojoTest {

    private SimplePojo actual;
    private Gson gson;
    private JsonObject jsonObject;

    @BeforeEach
    public void beforeEach(){
        gson = new Gson();
        jsonObject = new JsonObject();
    }

    @Test
    @DisplayName("Simple Json converted into Java object")
    public void jsonToObjectOne(){

        /* Given a simple json object response has been received **/
        jsonObject.addProperty("name", "bpourian");
        jsonObject.addProperty("age", 2);
        jsonObject.addProperty("favouriteColour", "Pink");
        jsonObject.addProperty("address", "Test Address");
        jsonObject.addProperty("random", "randomData");

        /* When we convert the json object to a java object using GSON **/
        actual = gson.fromJson(jsonObject, SimplePojo.class);

        /* Then the object should contain the value from the json object **/
        assertEquals("bpourian", actual.getName());
        assertEquals(2, actual.getAge());
        assertEquals("Pink", actual.getFavouriteColour());
    }

}