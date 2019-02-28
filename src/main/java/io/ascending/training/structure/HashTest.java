package io.ascending.training.structure;

import java.util.HashMap;
import java.util.Map;

//https://www.journaldev.com/21095/java-equals-hashcode
public class HashTest {

    public static void main(String[] args) {
        Map<DataKey, Integer> hm = getAllData();

        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Ryo");
        System.out.println(dk.hashCode());

        Integer value = hm.get(dk);

        System.out.println(value);

    }

    private static Map<DataKey, Integer> getAllData() {
        Map<DataKey, Integer> hm = new HashMap<>();

        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Ryo");
        System.out.println(dk.hashCode());

        hm.put(dk, 10);

        return hm;
    }

}
