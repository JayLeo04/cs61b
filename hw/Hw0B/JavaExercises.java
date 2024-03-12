public class JavaExercises {

    // makeDice method returns an array of integers representing dice faces
    public static int[] makeDice() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    // takeOrder method returns an array of Strings based on the customer's name
    public static String[] takeOrder(String customerName) {
        if ("Ergun".equals(customerName)) {
            return new String[]{"beyti", "pizza", "hamburger", "tea"};
        } else if ("Erik".equals(customerName)) {
            return new String[]{"sushi", "pasta", "avocado", "coffee"};
        } else {
            return new String[3]; // returns an empty String array of size 3
        }
    }

    // findMinMax method returns the positive difference
    // between the max and min elements of an array
    public static int findMinMax(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        return max - min; // return the positive difference
    }
}