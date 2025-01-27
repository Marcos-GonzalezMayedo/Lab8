package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>()); return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount(); list.addCity(new City("Estevan", "SK")); assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * Test the hasCity() method:
     */
    @Test
    public void hasCityTest() {
        list = MockCityList();
        City sampleCity = new City("Estevan", "SK");
        list.addCity(sampleCity);
        assertTrue(list.hasCity(sampleCity));
    }

    /**
     * Testing deleteCity()
     */
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City sampleCity = new City("Estevan", "SK");
        list.addCity(sampleCity);

        list.deleteCity(sampleCity);

        assertEquals(list.getCount(), 0);

    }

    /**
     * Testing getCountTest()
     */
    @Test
    public void getCountTest() {
        list = MockCityList();
        City sampleCity = new City("Estevan", "SK");
        list.addCity(sampleCity);
        assertEquals(list.getCount(), 1);
    }
}
