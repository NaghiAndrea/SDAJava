package fundamentals;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TasksExercises {
    static float pi = (float) Math.PI;
    int x = 10;
    static int y = 1;

    //Write an application that will read diameter of a circle (variable of type float) and
    //calculate perimeter of given circle.
    //Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
    public static void circlePerimeter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert diameter / Introduceti diametrul cercului: ");
        float diameter = input.nextFloat();
        //  float pi = 3.14f;

        System.out.print("The perimeter: " + (diameter * pi));
    }

    //Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
    // Your application should read two variables: weight (in kilograms, type float) and height
    // (in centimeters, type int). BMI should be calculated given following formula: weight/height(m)^2
    // The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal values.
    // Your program should write "BMI optimal" or "BMI not optimal", according to the assumptions above.

    public static void bmiCalculator() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti inaltimea (cm): ");
        int height = input.nextInt();

        System.out.print("Introduceti greutatea (kg): ");
        float weight = input.nextFloat();

        float bmi = weight / ((float) height * (float) height / 10000);
        System.out.println("BMI = " + bmi);
        if ((bmi >= 18.5) && (bmi <= 24.9)) {
            System.out.println("BMI optimal");
        } else
            System.out.println("BMI not optimal");
    }

    //Write an application that takes a positive number from the user (type int) and writes
    // all numbers from 1 to the given number, each on the next line, with the following changes:
    //● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
    // ● in place of numbers divisible by 7, instead of a number the program should write "Buzz"
    // ● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"

    public static void fizzBuzz() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti numarul: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println("Fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //Write an application that takes a positive number from the user (type int) and prints
    // all prime numbers greater than 1 and less than the given number.

    public static void primeNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti numarul: ");
        int num = input.nextInt();
        System.out.println("Numerele prime mai mari decat 1 si mai mici decat " + num + " : ");
        for (int i = 2; i < num; i++) {
            boolean divizibil = false;

            for (int k = 2; k <= (i / 2); k++) {
                if (i % k == 0) {
                    divizibil = true;
                }
            }
            if (divizibil == false) {
                System.out.print(i + " ");
            }
        }
    }

    //Write an application that will take a positive number from the user (type int) and
    // calculate the Fibonacci number at the indicated index. For example, if the number
    // equals 5, your program should print the fifth Fibonacci number. In Fibonacci sequence,
    // each number is the sum of the two preceding ones.

    public static void fibonacci() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti indexul dorit: ");
        int num = input.nextInt();
        int[] myArray = new int[num + 1];

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Index: " + i + " : ");
            if (i > 1) {
                myArray[i] = myArray[i - 1] + myArray[i - 2];
                System.out.println(myArray[i]);
            } else {
                myArray[i] = i;
                System.out.println(myArray[i]);
            }
        }
        System.out.println("\nNumarul Fibonacci la indexul: " + num + " este " + myArray[num]);
    }


    //Write an application that gets one positive number (type int) from the user and
    // calculates a sum of digits of the given number.
    // Hint: to make some operations on every single digit of the number (digit by digit),
    // you can calculate the remainder of dividing the number by 10
    // (to get the value of the last digit) and divide the number by 10 (to "move" to the next digit).
    public static void numDigitsSum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg: ");
        int numar = input.nextInt();
        int sum = 0;
        do {
            sum = sum + numar % 10;
            numar = numar / 10;
        } while (numar > 0);

        System.out.println("Suma cifrelor este: " + sum);

    }

    //Write an application that will read texts (variables of the String type) until the user gives the text "Enough!"
// and then writes the longest of the given texts (not including the text "Enough!"). If the user does
// not provide any text, write "No text provided".

    public static void maxText() {
        //Afiseaza primul cuvant dintre cele mai lungi, daca au aceeasi lungime
        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti textul: ");
        String text = "";
        StringBuilder textIntreg = new StringBuilder("");

        while (!(text.equals("Enough!"))) {
            text = input.next();
            if (!(text.equals("Enough!"))) {
                textIntreg.append(text);
                textIntreg.append(" ");
            }
        }

        System.out.println("Textul: " + textIntreg);

        StringBuilder cuvant = new StringBuilder("");
        boolean cuvantNou = false;
        int charCounter = 0;
        int max = 0;
        StringBuilder maxCuvant = new StringBuilder("");
        for (int i = 0; i < textIntreg.length(); i++) {

            if (textIntreg.charAt(i) != ' ') {
                cuvant.append(textIntreg.charAt(i));
                charCounter++;
            } else cuvantNou = true;
            if ((cuvantNou == true) || (i == (textIntreg.length() - 1))) {
                if (charCounter > max) {
                    max = charCounter;
                    maxCuvant = cuvant;
                }
                charCounter = 0;
                cuvant = new StringBuilder("");
                cuvantNou = false;
            }
        }

        if (max == 0) System.out.println("Nu a fost introdus text");
        else
            System.out.println("Cel mai lung cuvant: " + maxCuvant);
    }

    public static void maxTextVar2() {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti textul: ");
        String text = "";
        StringBuilder textIntreg = new StringBuilder("");

        int dim = 0;
        while (!(text.equals("Enough!"))) {
            text = input.next();
            if (!(text.equals("Enough!"))) {
                textIntreg.append(text);
                textIntreg.append(" ");
                dim++;
            }
        }

        System.out.println("Textul: " + textIntreg);

        StringBuilder[] textArray = new StringBuilder[dim];
        int[] lengthTextArray = new int[dim];
        StringBuilder cuvant = new StringBuilder("");
        boolean cuvantNou = false;
        int dimLengthText = 0;
        int charCounter = 0;
        int max = 0;
        StringBuilder maxCuvant = new StringBuilder("");
        for (int i = 0; i < textIntreg.length(); i++) {

            if (textIntreg.charAt(i) != ' ') {
                cuvant.append(textIntreg.charAt(i));
                charCounter++;
            } else cuvantNou = true;
            if ((cuvantNou == true) || (i == (textIntreg.length() - 1))) {
                textArray[dimLengthText] = cuvant;
                lengthTextArray[dimLengthText] = charCounter;
                if (charCounter > max) {
                    max = charCounter;
                    maxCuvant = cuvant;
                }
                charCounter = 0;
                dimLengthText++;
                cuvant = new StringBuilder("");
                cuvantNou = false;
            }
        }
        //    System.out.println("Cel mai lung cuvant: " + maxCuvant);
        if (max == 0) System.out.println("Nu a fost introdus text");
        else {
            System.out.println("Cel mai lung cuvant: ");
            for (int i = 0; i < textArray.length; i++) {
                if (lengthTextArray[i] == max)
                    System.out.println(textArray[i]);
            }
        }
    }

    //Write an application that reads a text from the user (type String) and counts
    // a percentage of occurrences of a space character.
    public static void spaceOccurencePercentage() {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti textul: ");
        String text = input.nextLine();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        System.out.println("Lungime text: " + text.length());
        System.out.println("Numarul de aparitii caracter spatiu: " + count);
        System.out.println("Procentul aparitiei caracterului spatiu: " + (((float) count / (float) text.length()) * 100) + "%");
    }

    //   Write an application that "stutters", that is, reads the user's text (type String),
    //   and prints the given text, in which each word is printed twice.
    //   For example, for the input: "This is my test" the application should print "This This is is my my test test".

    public static void stutters() {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti textul: ");
        String text = input.nextLine();

        StringBuilder textTwice = new StringBuilder("");
        StringBuilder word = new StringBuilder("");

        boolean newWord = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i));
            } else newWord = true;
            if ((newWord == true) || (i == (text.length() - 1))) {
                textTwice.append(word + " " + word + " ");

                word = new StringBuilder("");
                newWord = false;
            }
        }

        System.out.println(textTwice);
    }

    //Write an application that reads two lowercase letters of the Latin alphabet (type char)
    // and calculates how many characters is there in the alphabet between given letters.
    // Hint - use the ASCII code table and treat the characters as int numbers.
    public static void lowerCaseDistance() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti 2 caractere lowercase: ");
        String char1 = input.next();
        String char2 = input.next();
        int result = 0;
        if (((int) char1.charAt(0) - (int) char2.charAt(0)) > 0) {
            result = (int) char1.charAt(0) - (int) char2.charAt(0) - 1;
        } else {
            result = (int) char2.charAt(0) - (int) char1.charAt(0) - 1;
        }
        System.out.println(result + " caractere sunt intre litera " + char1.charAt(0) + " si litera " + char2.charAt(0));
    }

    //Write an application that reads from the user 10 arbitrarily large numbers
    // (variables of type int) and prints those that occurred at least twice.

    public static void multipleOccureNum() {
        Scanner input = new Scanner(System.in);
        int[] numArray = new int[10];
        int max = 0;
        System.out.println("Introduceti 10 numere intregi: ");
        for (int i = 0; i < 10; i++) {
            numArray[i] = input.nextInt();
            if (numArray[i] > max) {
                max = numArray[i];
            }
        }
        int[] occureArray = new int[max + 1];
        for (int i = 0; i < numArray.length; i++) {
            occureArray[numArray[i]]++;
        }
        for (int i = 0; i < occureArray.length; i++) {
            if (occureArray[i] > 1) {
                System.out.print(i);
                System.out.println("  " + occureArray[i] + " ori");
            }
        }
    }

    //Write an application that takes 10 numbers from the user (type int) and write the length
// of the longest such subsequence of these numbers, which is increasing.
// For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should
// write "5" as the length of the longest increasing subsequence (underlined in the example).

    public static void longestIncrSubseQ() {
        Scanner input = new Scanner(System.in);
        int[] numArray = new int[10];
        int max = 0;
        System.out.println("Introduceti 10 numere intregi: ");
        for (int i = 0; i < 10; i++) {
            numArray[i] = input.nextInt();
        }

        for (int i = 0; i < (numArray.length - 1); i++) {
            int count = 1;
            int k = i;
            while ((k < (numArray.length - 1)) && (numArray[k] < numArray[k + 1])) {
                count++;
                k++;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println("The length of the longest increasing subsequence: " + max);
    }

    // //Write an application that will read from the user the date of your next SDA classes
    //    and calculate how many days are left to them. Hint: read the date as String and parse
    //    it to LocalDate. Get the current date using LocalDate.now() method.

    public static void nextSdaClassDate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti data pentru urnmatorul curs SDA (in format: dd.MM.yyyy): ");
        String text = input.nextLine();


        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate dataCurs = LocalDate.parse(text, dateFormat);
        System.out.println(dataCurs);

        LocalDate now = LocalDate.now();
        System.out.println(now);

        Period numarZile = Period.between(now, dataCurs);
        System.out.println("Mai sunt " + numarZile.getDays() + " zile pana la urmatorul curs SDA.");
    }

//Write an application that takes a positive number from the user (type int)
// and prints all prime numbers greater than 1 and less than the given number.

    public static void printAllPrimeNumbers() {
        System.out.println("Give me a number: ");
        Scanner scanner = new Scanner(System.in);
        int newNumber = scanner.nextInt();
        if (newNumber <= 1) {
            System.out.println("The number is not greater than 1");
            return;  // intrerupe executia metodei - termina metoda
        }
        for (int i = 2; i < newNumber; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int nr) {
        if (nr == 2) return true;
        if (nr == 0 || nr == 1 || nr % 2 == 0) return false;

        for (int i = 3; i * i <= nr; i += 2) { //verifica radical nr
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime4(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                isPrimeNo = false;
                break; //intrerupe for-ul
            }
        }
        return isPrimeNo;
    }

    private static boolean isPrime3(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i != 0) {
                continue;  //merge la urmatoarea iteratie in for
            }
            isPrimeNo = false;
            break; //intrerupe for-ul
        }
        return isPrimeNo;
    }


    private static boolean isPrime2(int nr) {
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime1(int nr) {
        for (int i = 2; i < nr; i++) {
            int rest = nr % i;
            if (rest == 0) {
                return false; //se intrerupe executia metodei
            }
        }
        return true;
    }

    public static void fizzBuzz2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti numarul: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println("Fizz buzz");
                continue;   //intrerupe si se intoarce la urmatoarea valoare i
                // break ar fi iesit din for
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 7 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);

        }
    }

    public static void longestWord() {
        System.out.println("Type your text: ");
        Scanner scanner = new Scanner((System.in));
        String word = "";
        String longestWord1 = "";
        while (!word.equals("Enough!")) {
            if (longestWord1.length() < word.length()) {
                longestWord1 = word;
            }
            word = scanner.next();
        }

        if (longestWord1.length() == 0) {
            System.out.println("No text provided");
            return;     //intrerup executia metodei
        }
        System.out.println("The longest word: " + longestWord1);
    }

    public static void longestWord2() {
        System.out.println("Type your text: ");
        Scanner scanner = new Scanner((System.in));
        String word = "";
        String longestWord1 = "";
        do {
            word = scanner.next();
            if ((!word.equals("Enough!")) && (longestWord1.length() < word.length())) {
                longestWord1 = word;
            }
        }
        while (!word.equals("Enough!"));
        if (longestWord1.length() == 0) {
            System.out.println("No text provided");
            return;     //intrerup executia metodei
        }
        System.out.println("The longest word: " + longestWord1);
    }

//Write an application that "stutters", that is, reads the user's text (type String), and prints
//the given text, in which each word is printed twice.
//For example, for the input: "This is my test" the application should print "This This is is
//my my test test".

    public static void stuttersImproved() {
        System.out.println("Type your text: ");
        Scanner scanner = new Scanner((System.in));

        String text = scanner.nextLine();
        String[] wordsArray = text.split(" ");

        System.out.println("Stutters: ");

        for (int i= 0; i < wordsArray.length - 1 ; i++){
            System.out.print((wordsArray[i] + " " +wordsArray[i] + " "));
        }
        System.out.println(wordsArray[wordsArray.length - 1] + " " + wordsArray[wordsArray.length - 1]  );

    }

    public static void testStrings() {
        String s1 = "abc", s2 = "abc" , s3 = new String("abc");
        System.out.println(s1 == s2);            //Output: true
        System.out.println(s1 == s3);            //Output: false
        System.out.println(s1.equals(s3));       //Output: true
    }

    public static void testObjects(){

        Dog dog1 = new Dog( "Azorel");
        dog1.setName("Azorel");

        Dog dog2 = new Dog("Azorel");
        dog2.setName("Azorel");

        System.out.println(dog1 == dog2);           //Output: false - pointeaza catre alte zone de memorie
        System.out.println(dog1.equals(dog2));
                        //Output: false - referintele difera - dog1 si dog2 verifica referintele lor
                        //Output: true - dupa ce am suprascris metoda equals
    }

/* inainte sa facem constructorul public Dog (String name)
    public static void testObjects1(){
        //facem 2 instante de Dog; La prima instanta sa-i dam numele Azorel
        Dog dog1 = new Dog();
        dog1.setName("Azorel");

        Dog dog2 = new Dog();
        dog2.setName("Azorel");

        System.out.println(dog1 == dog2);           //Output: false - pointeaza catre alte zone de memorie
        System.out.println(dog1.equals(dog2));      //Output: false

    }
    */

}


