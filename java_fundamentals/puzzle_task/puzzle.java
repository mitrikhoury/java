package java_fundamentals.puzzle_task;
import java.util.Random;
import java.util.ArrayList;
public class puzzle {
    
    public ArrayList<Integer> getTenRolls(){
         ArrayList<Integer> array = new ArrayList<>();
         Random R = new Random();
         for(int i = 0 ; i <10 ; i++){ 
            array.add( R.nextInt(21)); // random number between 0 to 20 ...
         }
    return array;
    }

    public String getRandomLetter(){
        Random R = new Random();
        char[] alphabet = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        String x ="";
        x = String.valueOf(alphabet[R.nextInt(26)]);
     return x;
    }

    public String generatePassword(){

      String password = "";
      for(int i =0 ; i < 8 ; i++){
        password += getRandomLetter();
      }
        return password;
    }

    public String getNewPasswordSet(int length){

        String newPassword ="";
        for(int i =0 ;i<length ; i++){
            newPassword += getRandomLetter();
        }
        return newPassword;

    }

}
