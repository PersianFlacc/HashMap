package p2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        generateUniqueIds(hashMap, 10000);

        System.out.println(hashMap);
    }

    public static String generateUniqueId(Map<String, Integer> hashMap) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            stringBuilder.setLength(0);
            for (int i = 0; i < 10; i++) {
                int randomCharCode = random.nextInt(26) + 65;
                stringBuilder.append((char) randomCharCode);
            }
            String uniqueId = stringBuilder.toString();
            if (!hashMap.containsKey(uniqueId)) {
                return uniqueId;
            }
        }
    }

    public static void generateUniqueIds(Map<String, Integer> hashMap, int numberOfIds) {
        for (int i = 0; i < numberOfIds; i++) {
            String uniqueId = generateUniqueId(hashMap);
            hashMap.put(uniqueId, i);
        }
    }
}