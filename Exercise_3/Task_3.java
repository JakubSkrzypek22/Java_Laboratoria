package Exercise_3;

public class Task_3 {
    public void RunTask(){

        String[] words;
        words = new String [] {"Jakub" , "Oliwia" , "Ola" , "Wojtek" , "Oskar"};

        System.out.println("\nAll words in UpperCase");
        for(String word : words){
            System.out.println(word.toUpperCase());

        }
    }
}
