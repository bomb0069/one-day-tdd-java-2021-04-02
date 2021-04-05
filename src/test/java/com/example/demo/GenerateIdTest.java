package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GenerateIdTest {

    @Mock
    Random random;

    @Test
    public void random_with_1_should_be_generate_001_at_tail() {
        //Arrange
        GenerateId generateId = new GenerateId();
        when(random.nextInt(999)).thenReturn(1);
        generateId.setRandom(random);

        //Act
        String id = generateId.generate();

        //Assert
        assertEquals("20210402141308001", id);
    }

    @Test
    public void random_with_2_should_be_generate_002_at_tail() {
        GenerateId generateId = new GenerateId();
        when(random.nextInt(999)).thenReturn(2);

        generateId.setRandom(random);
        String id = generateId.generate();

        assertEquals("20210402141308002", id);
    }

    @Test
    public void random_with_55_should_be_generate_055_at_tail() {
        GenerateId generateId = new GenerateId();
        when(random.nextInt(999)).thenReturn(55);

        generateId.setRandom(random);
        String id = generateId.generate();

        assertEquals("20210402141308055", id);
    }
}
