package testing.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayStringsExercisesTest {
    @Test
    void shouldReplaceSpaceInString(){
        //Given
        String inputText = "Textul pe care testam";
        String expectedResult = "Textul:pe:care:testam";
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
        //When
        String actualResult = arrayStringsExercises.changeSpaceInString(inputText);
        //Then
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void shoulAppendLength(){
        //Given
        String inputText = "Characters";
        String expectedResult = "Characters10";
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
        //When
        String actualResult = arrayStringsExercises.appendsLength(inputText);
        System.out.println("Actual result = " + actualResult);
        //Then
        assertEquals(expectedResult,actualResult);
        assertThat(actualResult).endsWith("10");
    }
    @Test
    void shouldReplaceEvenNumbers(){
        //Given
        int[] inputArray = {1,2,4,5,6};
        int[] expectedArray = {1,1,2,5,3};
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
        //When
        int[] actualResultedArray = arrayStringsExercises.replaceEvenNumbers(inputArray);
        //Then
        assertArrayEquals(expectedArray,actualResultedArray);
    }

    //Finds the position of the min element from the array (if they are multiple elements, the last position, if there aren’t => return -1)
   @Test
    void shouldFindIndexOfMinElement(){
        //Given
        int[] inputArray = {2,3,1,4,5,6};
        int expectedResult = 2;
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
        //When
        int actualResult = arrayStringsExercises.findPosOffMinElement(inputArray); //am creat cu Alt+Enter metoda - sugereaza Intellij
        //Then
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void shouldReturnDefaultValueForEmptyArray(){
        //Given
        int[] inputArray = {};
        int expectedResult = -1;
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
        //When
        int actualResult = arrayStringsExercises.findPosOffMinElement(inputArray);
        //Then
        assertEquals(expectedResult,actualResult);
    }

    //Daca sunt mai multe elemente minime egale, sa ne returneze ultima pozitie a elementului respectiv! - TEMA
    @Test
    void shouldReturnLastPositionForMultipleMin(){
        //Given
        int[] inputArray = {2,3,1,3,4,5,3,1,6,1};
        int expectedResult = 9;
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
        //When
        int actualResult = arrayStringsExercises.findPosOffMinElement(inputArray); //am creat cu Alt+Enter metoda - sugereaza Intellij
        //Then
        assertEquals(expectedResult,actualResult);
    }
}