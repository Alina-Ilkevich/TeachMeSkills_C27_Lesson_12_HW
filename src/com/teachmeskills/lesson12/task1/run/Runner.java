package com.teachmeskills.lesson12.task1.run;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.teachmeskills.lesson12.task1.consts.Consts.REGEXP;

/**
 * This class is used to search for an abbreviation in the line
 */
public class Runner {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile(REGEXP);
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            count++;
            System.out.println(matcher.group());
        }
        if (count == 0){
            System.out.println("I find nothing");
        }
        scanner.close();
    }
}
