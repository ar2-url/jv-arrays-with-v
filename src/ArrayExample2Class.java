public class ArrayExample2Class {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {1, 2, 3};  // gdy cztery to powinno dac  - false

        int[] arrayThree = {3, 4, 5};
        int[] arrayFour = {5, 6, 7, 8};

        boolean arraysHaveTheSameSize = doArraysHaveTheSameSize(arrayOne, arrayTwo);
        System.out.println("Tablice maja ten sam rozmiar: " + arraysHaveTheSameSize);

        boolean doArraysHaveTheSameValue = doArraysHaveTheSameValue(arrayOne, arrayTwo);
        System.out.println("tablice maja ta sama wartosc: " + doArraysHaveTheSameValue);

        // przyklad z dwoma roznymi tablicami

        boolean doArraysHaveTheSameValue2 = doArraysHaveTheSameValue2(arrayThree, arrayFour);
        System.out.println("tablice maja te same elementy: " + doArraysHaveTheSameValue2);

    }

    public static boolean doArraysHaveTheSameSize(int[] arrayOne, int[] arrayTwo) {


        if (arrayOne.length == arrayTwo.length) {
            return true;
        } else {
            return false;
        }

    }
    // ta linia  return arrayOne.length == arrayTwo.length;     daje ten sam wynik co poprzednie cztery linie

    // return arrayOne.length == arrayTwo.length ? true : false;

    /* public static boolean doArraysHaveTheSameValue(int[] arrayOne, int[] arrayTwo) {
        var arrayOne = arrayOne;
        if(arrayOne) }  */


    public static boolean doArraysHaveTheSameValue(int[] arrayOne, int[] arrayTwo) {
        // if(arrayOne[0] == arrayTwo[0])

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] != arrayTwo[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean doArraysHaveTheSameValue2(int[] arrayThree, int[] arrayFour) {
        // tu wywolac
        if(doArraysHaveTheSameSize(arrayThree, arrayFour)) {
            for (int i = 0; i < arrayThree.length; i++) {
                if (arrayThree[i] != arrayFour[i]) {
                    return false;
                }
            }

            return false;
        } else {
            return false;
        }

    }
}


