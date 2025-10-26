package Exercise_3;

public class Task_7 {

    public void RunTask() {
        // Define and initialize two String arrays with the same values
        String[] array1 = {"apple", "banana", "cherry", "date", "fig"};
        String[] array2 = {"apple", "banana", "cherry", "date", "fig"};

        boolean areEqual = true;

        // Compare the arrays element by element
        if (array1.length != array2.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (!array1[i].equals(array2[i])) {
                    areEqual = false;
                    break;
                }
            }
        }

        // Print the result
        if (areEqual) {
            System.out.println("The arrays are the same.");
        } else {
            System.out.println("The arrays are different.");
        }
    }
}
