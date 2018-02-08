package com.company;
 import java.util.*;
import java.util.stream.*;

/**
 * Created by ls059 on 2/5/18.
 */
public class messageList {

    static Map<String, Map<Long , String>> messages = new HashMap<>();
    public messageList(){

    }

    static void newChat(String n, String s, String m){
        messages.put(n + s, new HashMap<>());
        messages.get(n + s).put(System.currentTimeMillis(), m);

    }

    public static void chat(String n, String s){
        showConversation(n, s);

        Scanner message = new Scanner(System.in);
        System.out.println("Enter your message here");
        String m = message.nextLine();
        messages.get(n+s).put(System.currentTimeMillis(), m);



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

    public static void showConversation(String n, String s) {
        Map<Long, String> conversation = Stream.concat(messages.get(n).entrySet().stream(), messages.get(s).entrySet().stream())
                .collect(Collectors.toMap(
                        entry -> entry.getKey(), // The key
                        entry -> entry.getValue() // The value
                        )
                );
        messages.put(n + s, conversation);
        sortByValue(messages.get(n + s));
        for (Map.Entry<Long, String> e : messages.get(n+s).entrySet()) {
            System.out.println(e.getValue());
            e.getValue();
            System.out.println(e);
        }
    }
}

