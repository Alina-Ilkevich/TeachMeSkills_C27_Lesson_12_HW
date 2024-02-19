package com.teachmeskills.lesson12.task2.run;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.teachmeskills.lesson12.task2.consts.Consts.*;

/**
 * This class is used to search for a phone number, document number and email in the line
 */
public class Runner {
    public static void main(String[] args) {
        int emailCount = 0;
        int phoneNumberCount = 0;
        int docNumberCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String line = scanner.nextLine();
        Pattern pattern1 = Pattern.compile(REGEXP_EMAIL);
        Matcher email = pattern1.matcher(line);
        while (email.find()) {
            System.out.println("Email: " + email.group());
            emailCount++;
        }
        if (emailCount == 0){
            System.out.println("There is no email in the line");
        }
        Pattern pattern2 = Pattern.compile(REGEXP_PHONE_NUMBER);
        Matcher phoneNumber = pattern2.matcher(line);
        while (phoneNumber.find()) {
            System.out.println("Phone number: " + phoneNumber.group());
            phoneNumberCount++;
        }
        if (phoneNumberCount == 0){
            System.out.println("The phone number is missing in the line");
        }
        Pattern pattern3 = Pattern.compile(REGEXP_DOC_NUMBER);
        Matcher docNumber = pattern3.matcher(line);
        while (docNumber.find()) {
            System.out.println("Document number: " + docNumber.group());
            docNumberCount++;
        }
        if (docNumberCount == 0){
            System.out.println("The document number is missing in the line");
        }
        scanner.close();
    }
}
