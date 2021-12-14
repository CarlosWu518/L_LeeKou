package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AreOccurrencesEqual {
    public static void main(String[] args) {
        String s = "aaabb";
        new AreOccurrencesEqual().areOccurrencesEqual(s);
    }
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm = new HashMap();
        int count = 1;
        for (char c:s.toCharArray()){
            if (hm.get(c) == null) {
                hm.put(c, 1);
            } else {
                count = hm.get(c);
                hm.put(c,++count);
            }
        }
        for (Map.Entry me:hm.entrySet()) {
            if (!me.getValue().equals(count)) return false;
        }
        return true;
    }
}
