package com.company;
 import java.util.*;
import java.text.SimpleDateFormat;
/**
 * Created by ls059 on 2/5/18.
 */
public class messageList {

    static Map<String, Map<Integer, String>> messages = new HashMap<>();
    public messageList(){

    }

    static void newChat(String n, String m){

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

        sortByValue(messages.get(n));
    }
    public static <K, V extends Comparable<? super V>> Map<K, V>
    sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

}

