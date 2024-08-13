package java_fundamentals.puzzle_task;

import java.util.ArrayList;

public class puzzle_test {
    public static void main(String[] args) {

    puzzle generator = new puzzle();
	ArrayList<Integer> randomRolls = generator.getTenRolls();
	System.out.println(randomRolls);

    String letter = generator.getRandomLetter();
    System.out.println(letter);

    String password = generator.generatePassword();
    System.out.println(password);

    String newPassword = generator.getNewPasswordSet(14);
    System.out.println(newPassword);

    
    }
}