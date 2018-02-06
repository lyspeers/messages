package com.company;
 import java.util.*;
/**
 * Created by ls059 on 2/5/18.
 */
public class messageList {
    //static String g[] = {"hi"};
    //static String h[] = {"hello"};

    static Map<String, ArrayList<String>> messages = new HashMap<>();
    public messageList(){

    }

    static void newChat(String n, String m){

        messages.put(n, new ArrayList<>());
        messages.get(n).add(m);
    }
    static void oldChat(String n){
        for(int i = messages.get(n).size(); i > 0; i--){
            System.out.println(messages.get(n).get(i));
        }
    }
    private void chat(String n){

        Scanner sender = new Scanner(System.in);
        System.out.println("What is the message you would like to send");
        String s = sender.nextLine();

        Scanner message = new Scanner(System.in);
        System.out.println("Enter your message here");
        String m = message.nextLine();

        String c = s + " :" + m;
        messages.get(n).add(c);
    }

}
