package testing.fundamentals;

/**
 * Write and test a program that:
 * Replaces all the spaces in a text with “:”
 * Ads in a text, after every “a” letter the length of the text read until then.
 * Appends to the end of the text the number of “z” letters found in the text
 * Replaces all the even number in an array with their half
 * Specifies if the array contains elements that fit inside a number interval
 * Finds the position of the min element from the array (if they are multiple elements, the last position, if there aren’t => return -1)
 */
public class ArrayStringsExercises {

    public String changeSpaceInString(String text) {

        // 1.Apply split on string and concatenate words with ":"
        // 2.Iterate over the string and copy all the characters until " " and then add ":" in a new string
        // 3. Iterate over string and change the string directly
        // 4. user replace
        // Varianta1:
        // String textChanged;
        // textChanged = text.replace(" ",":");
        // return textchanged;
        return text.replace(" ", ":");

    }

    //Ads in a text, after every “a” letter the length of the text read until then.
    public String insertLengthAfterLetterA(String text) {
        return "";
    }

    //
    public String appendsLength(String text) {
        return text + text.length();
    }

    public int[] replaceEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] / 2;
            }
        }
        return array;
    }

    //Finds the position of the min element from the array (if they are multiple elements, the last position, if there aren’t => return -1)
    public int findPosOffMinElement(int[] inputArray) {
      //  int min = Integer.MAX_VALUE; //pt.ca sigur exista un numar mai mic decat acesta din array
        if (inputArray.length == 0) {
            return -1;
        }
        int min = inputArray[0];
        int index = 0;
        for (int i = 1; i < inputArray.length; i++){
            if (inputArray[i] <= min) {
                min = inputArray[i];
                index = i;
            }
        }
        return index;
    }

   }
