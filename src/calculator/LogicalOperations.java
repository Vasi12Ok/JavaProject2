package calculator;

public class LogicalOperations {
    public static void main(String[] args) {

//    public int checkBiggerNumber(int firstNumber, int secondNumber) {
//
//       System.out.println();
//
//           if (firstNumber > secondNumber) {
//               return firstNumber;
//       } else {
//
//                return secondNumber;

//        System.out.println(verifyTextFastTrackIT("FastTrackIT"));


//    public static String verifyTextFastTrackIT(String text){
//        if (text.equals("FastTrackIT")){
//        return "Learning text comparison";
//    }else{
//      return "Got to try some more";

//        String text = "FastTrackIT";
//        int number = 3;

//        if(text.equals("FastTrackIT") && number <= 3) {
//            System.out.println(text + number);
//        } else if (!text.equals("FastTrackIT") && number >= 4) {
//            System.out.println(number + text);
//    }

//    public String orCondition(int number) {

//        if (number > 8 || number == 6) {

//            return "The amount of snow this winter was(cm): " + number;

//        } else {

//            return "The forecast snow is(cm): " + number;

//        }

//    }


//    public String greaterThanEqualTo (int number) {

//        if ( number > 3 && number != 4) {

//          return "The number is greater than 3 and not equal to 4";

//        } else if (number == 4) {

//            return "The number is equal to 4";

//        } else if (number < 3); {

//            return "The number is lower than 3";

//        }
//        public void printNumber (int number){

//            switch (number) {

//                case 0:

//                    System.out.println("The number os 0");

//                    break;

//                case 1:

//                    System.out.println("The number is 1");
//
//                    break;
//
//                case 2:
//
//                    System.out.println("The number is 2");
//
//                    break;
//
//                case 3:
//
//                    System.out.println("The number is 3");
//
//                    break;
//
//                case 4:
//
//                    System.out.println("The number is 4");
//
//                    break;
//
//                case 5:
//
//                    System.out.println("The number is 5");
//
//                    break;
//
//                case 6:
//
//                    System.out.println("The number is 6");
//
//                    break;
//
//                case 7:
//
//                    System.out.println("The number is 7");
//
//                    break;
//
//                case 8:
//
//                    System.out.println("The number is 8");
//
//                    break;
//
//                case 9:
//
//                    System.out.println("The number is 9");
//
//                    break;
//
//                default:
//
//                    System.out.println("Not allowed");
//
//            }
//
//        }
//        public boolean isNumberEven (int number) {
//
//            if (number % 2 == 0){
//
//                return true;
//
//            } else {
//
//                return false;
//
//            }
//
//        }
//    }
//
//    public boolean isEligibleToVote (int number) {
//
//        if (number >= 18) {
//
//            return true;
//
//        } else {
//
//            return false;
//
//        }
//
//    }
//
//    public int returnBiggestNumber (int firstNumber, int secondNumber, int thirdNumber){
//
//        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
//
//            return firstNumber;
//
//        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
//
//            return secondNumber;
//
//        } else {
//
//            return thirdNumber;
//
//        }


        //     1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
        //        Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza
//    public void countForwards(int smallest, int biggest) {
//        int i = 1;
//        for (int i = smallest; i <= biggest; i++) {
//            System.out.println(i);
//
//        }
//    }
//
//         2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
//            Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza
//    public void countBackward(int biggest, int smallest) {
//        int x = 100;
//        for (int i = biggest; i >= smallest; i--) {
//            System.out.println(i);
//
//        }
//    }
//         3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite,
//           pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
//
//    public void countFirstToSecond() {
//        int x = 10;
//        int y = 20;
//
//        for (int i = 10; i <= 20; i++) {
//            System.out.println(i);
//    }


//         5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

//        String comma = "";
//        for (int i = 2; i <= 100; i += 2) {
//            System.out.print(comma + i);
//            comma = ", ";

//    }

//         6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100

//         public class DisplayOddNumbers {
//           public static void OddNumbers() {
//            int number = 100;
//               System.out.print("List of odd numbers from 1 to "+number+": ");
//            for (int i = 1; i <= number; i++) {
//                if (i % 2 != 0) {
//                  System.out.print(i + " ");
//                }
//            }


//         7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
//            Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

//    public static class countTo100 {
//        public static void printSum() {
//            int sum = 0;
//            for (int i = 1; i <= 100; i++) {
//                sum = i + sum;
//
//            }
//            System.out.println(sum);


//            8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
//            Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor. La final, metoda sa returneze media. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
//         class printSumAverage {
//         public static void printSumAndAverage(){
//             int sum = 0;
//             for (int i = 1; i <= 100; i++) {
//                sum = i + sum;
//
//                }
//                System.out.println(sum);
//                System.out.println(sum/100f);


//             9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
//       int term=7;
//        for(int i=1;i<=term;i++){
//                for(int j=term;j>=i;j--){
//                System.out.print("* ");
//                }
//                System.out.println();//new line


//       While Loop
//              1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
//                Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

//          declare variables
//          1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
//             Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
        public void countToHundredWhile ( int givenNumber){

            while (givenNumber <= 100) {

                System.out.println(givenNumber);

                givenNumber++;

            }

//            2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
//            Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

            public void countBackwardsWhile ( int givenNumber){

                while (givenNumber >= -100) {

                    System.out.println(givenNumber);

                    givenNumber--;

                }

            }
//            3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
//                    Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

            public void countBetweenWhile ( int firstNumber, int secondNumber){

                while (firstNumber <= secondNumber) {

                    System.out.println(firstNumber);

                    firstNumber++;

                }

            }
//            4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
//                Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

            public void countBetweenWhile ( int firstNumber, int secondNumber){

                if (firstNumber < secondNumber) {

                    while (firstNumber <= secondNumber) {

                        System.out.println(firstNumber);

                        firstNumber++;

                    }

                } else if (secondNumber < firstNumber) {

                    while (secondNumber <= firstNumber) {

                        System.out.println(firstNumber);

                        firstNumber++;

                    }

                } else {

                    System.out.println("The numbers are equal");

                }

            }
//            5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
            public void evenNumbersWhile () {

                int number = 1;

                while (number <= 100) {

                    number++;

                    if (number % 2 == 0) {

                        System.out.println(number);

                    }

                }

            }
//            6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

            public void unevenNumbersWhile () {

                int number = 1;

                while (number <= 100) {

                    number++;

                    if (number % 2 != 0) {

                        System.out.println(number);

                    }

                }

            }
//            7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval. Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

            public void sumAndAverageWhile () {

                int firstNumber = 111;

                int secondNumber = 8899;

                double sum = 0;

                int count = 0;


                while (firstNumber <= secondNumber) {

                    sum += firstNumber;

                    firstNumber++;

                    count++;

                }

                System.out.println(sum);

                double average = sum / count;

                System.out.println("The average of the numbers is: " + average);

            }
        }
//        8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

        public float divideBySevenWhile(int firstNumber, int lastNumber) {

            float count = 0F;

            float sum = 0F;

            while (firstNumber <= lastNumber) {

                if (firstNumber % 7 == 0) {

                    count ++;

                    sum += firstNumber;

                }

                firstNumber++;

            }

            float average = sum / count;

            return average;

        }
//        9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

        public void fibonacci() {

            int count = 20;

            int num1 = 0;

            int num2 = 1;



            int i=1;

            while(i<=count)

            {

                System.out.print(num1+" ");

                int sumOfPrevTwo = num1 + num2;

                num1 = num2;

                num2 = sumOfPrevTwo;

                i++;

            }

        }
    }