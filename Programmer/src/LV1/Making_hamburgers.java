package LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Making_hamburgers {
    public int solution(int[] ingredient) {
        List<Integer> hamburger = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> result = Arrays.asList(1,2,3,1);
        int count = 0;

        for(int i = 0; i < ingredient.length; i++) {
            hamburger.add(ingredient[i]);

            if (hamburger.size() >= 4) {
                temp.add(hamburger.get(hamburger.size()-4));
                temp.add(hamburger.get(hamburger.size()-3));
                temp.add(hamburger.get(hamburger.size()-2));
                temp.add(hamburger.get(hamburger.size()-1));

                if (temp.equals(result)) {
                    count++;
                    hamburger.remove(hamburger.size()-1);
                    hamburger.remove(hamburger.size()-1);
                    hamburger.remove(hamburger.size()-1);
                    hamburger.remove(hamburger.size()-1);
                }
            }
            temp.clear();
        }
        return count;
    }
}
