package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        messageList.newChat("jack", "hey");
        System.out.println(messageList.messages.get("jack"));
        while(true){
            Scanner use = new Scanner(System.in);
            System.out.println("Would you like to : Start a new message(start), or continue a chat(continue)");
            String mode = use.next();
            if(mode.equalsIgnoreCase("start")){

            }else if(mode.equalsIgnoreCase("continue")){

            }else{
                System.out.println("Please input the correct operation.");
            }
        }
    }
}
