import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Five {
    public static void main(String[] args) {

        System.out.println(addTo(3));
        System.out.println(addTo(19));
    }

    private static String addTo(int i) {
        String value = "";
        ArrayList<String> z = new ArrayList<>();
        int sum = 0;
        int xy = i;
        int x = 0;
        int y = 0;



        while(x<i){
            sum += xy;

            z.add(String.valueOf(xy));
            xy--;
            //System.out.println(x);
            x++;
        }



        Collections.reverse(z);

        for(int xx = 0; xx<z.size(); xx++){
            value +=  z.get(xx) + " +";
        }

        String newStr = value.substring(0, value.length() - 1);

        value = newStr + " = " + sum;

        return value;
    }



}
