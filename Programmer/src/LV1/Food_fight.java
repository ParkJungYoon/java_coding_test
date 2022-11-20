package LV1;

public class Food_fight {
    public String food_fight(int[] food) {
        int temp = 0;
        String food_string = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < food.length; i++) {
            temp = food[i] / 2;
            sb.append(String.valueOf(i).repeat(temp));
        }
        food_string = sb.toString();
        StringBuilder food_array = new StringBuilder(food_string);

        sb.append('0');
        sb.append(food_array.reverse().toString());

        return sb.toString();
    }
}
