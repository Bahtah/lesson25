package dom;

import java.util.*;

public class Main {

    /**
     * Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз.
     * Метод натыйжаны жаңы set катары кайтарышы керек.
     * @param args
     */

    public static void main(String[] args) {

        Random rnd = new Random();
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            s1.add(rnd.nextInt(10));
            s2.add(rnd.nextInt(10));
        }

        System.out.println("Биринчи Set тин ичиндеги рандомный сандар");
        for (Integer i : s1) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("Экинчи Set тин ичиндеги рандомный сандар");
        for (Integer i : s2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("Симметрия жаны Set " + symmetricDifference(s1, s2));
    }

    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){

        Set<Integer> temp = new TreeSet<>(set1);
        set1.removeAll(set2);
        set2.removeAll(temp);

        Set<Integer> resultatEquals = new TreeSet<>(set1);
        resultatEquals.addAll(set2);

        if (resultatEquals.isEmpty()){
            System.out.println("Окшош сандар жок");
        }
        return resultatEquals;
    }
}
