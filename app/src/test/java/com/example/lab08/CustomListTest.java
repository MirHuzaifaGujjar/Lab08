package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        list.deleteCity(calgary);
        // This will fail initially because deleteCity() doesn't exist yet
        assertFalse(list.hasCity(calgary)); // After deleting, the city should no longer be in the list
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City vancouver = new City("Vancouver", "BC");
        list.addCity(calgary);
        list.addCity(vancouver);
        // This will fail initially because countCities() doesn't exist yet
        assertEquals(2, list.countCities()); // The list should have 2 cities
    }
}
