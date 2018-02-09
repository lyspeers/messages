package com.company;

import java.time.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;


public class Main {

    public static void main(String[] args) {
	// write your code here




        while(true){
            Scanner use = new Scanner(System.in);
            System.out.println("Would you like to: Start a new message(start), continue a chat(continue), or exit(exit)");
            String mode = use.next();
            if(mode.equalsIgnoreCase("start")){
                System.out.println("Who is sending the message.(First name last Initial)");
                Scanner sender = new Scanner(System.in);
                String s = sender.next();

                System.out.println("Who is receiving the message.(First name last Initial)");
                Scanner reciver = new Scanner(System.in);
                String r = reciver.next();

                System.out.println("What is the message being sent");
                Scanner message = new Scanner(System.in);
                String m = message.next();
                messageList.newChat(r, s, m);
            }else if(mode.equalsIgnoreCase("continue")){
                System.out.println("Who is sending the message.(First name last Initial)");
                Scanner sender = new Scanner(System.in);
                String s = sender.next();

                System.out.println("Who is receiving the message.(First name last Initial)");
                Scanner reciver = new Scanner(System.in);
                String r = reciver.next();
                messageList.chat(r,s);

            }else if(mode.equalsIgnoreCase("exit")){
                break;
            }
            else{
                System.out.println("Please input the correct operation.");
            }
        }
    }
}
