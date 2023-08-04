public class main {

    public static void printLastLetters(String[] arr){
        for(int i = 0; i < arr.length; i++){
            String str = arr[i];
            char ultimoChar = str.charAt(str.length() - 1);
            System.out.println(ultimoChar);
        }
    }

    public static String concatenateLastLetters(String[] arr){
        String concat = "";

        for(int i = 0; i < arr.length; i++){
            String str = arr[i];
            char ultimoChar = str.charAt(str.length() - 1);
             concat += ultimoChar;
        }
        return concat;
    }



    public static void main(String[] args) {
        String[] mioArray = {"Lorenzo", "Devy", "Sara", "Fabio", "Giovanni"};
        printLastLetters(mioArray);
        String a = concatenateLastLetters(mioArray);
        System.out.println(a);
    }
}
