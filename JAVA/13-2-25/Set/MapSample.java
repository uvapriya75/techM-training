package org.example.collections;
import java.util.*;
public class MapSample {
        public static void main(String[] args) {
            HashMap<Integer, String> hm = new HashMap<>();
            Hashtable<Integer, String> ht = new Hashtable<>();
            LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();
            TreeMap<Integer, String> tm = new TreeMap<>();
            hashMap(hm);
            hashTable(ht);
            LinkedhashMap(lm);
            treeMap(tm);
        }

        public static void hashMap(HashMap<Integer, String> hm) {
            hm.put(1, "one");
            hm.put(2, "two");
            hm.put(3, "three");
            System.out.println("Initial Hashmap hm1 are : "
                    + hm);
            hm.put(2, "For");
            System.out.println("Updated Map " + hm);
            hm.remove(1);
            System.out.println("Mappings after removal are : "
                    + hm);
            System.out.println("Map traversal:");

            for (Map.Entry<Integer, String> e : hm.entrySet())
                System.out.println("Key: " + e.getKey()
                        + " Value: " + e.getValue());
            System.out.println("---------------------------------------------------------------------------------");
        }

        public static void hashTable(Hashtable<Integer, String> ht) {
            ht.put(4, "four");
            ht.put(5, "five");
            ht.put(6, "six");
            System.out.println("Initial Hashtable ht are : "
                    + ht);
            ht.put(2, "While");
            System.out.println("Updated Map " + ht);
            ht.remove(1);
            System.out.println("Mappings after removal are : "
                    + ht);
            System.out.println("Map traversal:");

            for (Map.Entry<Integer, String> e : ht.entrySet())
                System.out.println("Key: " + e.getKey()
                        + " Value: " + e.getValue());
            System.out.println("---------------------------------------------------------------------------------");
        }

        public static void LinkedhashMap(LinkedHashMap<Integer, String> lm) {
            lm.put(7, "seven");
            lm.put(8, "eight");
            lm.put(9, "nine");
            System.out.println("Initial linkedHashMap lm are : "
                    + lm);
            lm.put(2, "Do");
            System.out.println("Updated Map " + lm);
            lm.remove(1);
            System.out.println("Mappings after removal are : "
                    + lm);
            System.out.println("Map traversal:");

            for (Map.Entry<Integer, String> e : lm.entrySet())
                System.out.println("Key: " + e.getKey()
                        + " Value: " + e.getValue());

            System.out.println("---------------------------------------------------------------------------------");
        }

        public static void treeMap(TreeMap<Integer, String> tm) {
            tm.put(4, "four");
            tm.put(6, "six");
            tm.put(3, "three");
            System.out.println("Initial treeMap tm1 are : "
                    + tm);
            tm.put(2, "For");
            System.out.println("Updated Map " + tm);
            tm.remove(1);
            System.out.println("Mappings after removal are : "
                    + tm);
            System.out.println("Map traversal:");

            for (Map.Entry<Integer, String> e : tm.entrySet())
                System.out.println("Key: " + e.getKey()
                        + " Value: " + e.getValue());
        }

}
