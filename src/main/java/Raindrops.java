import java.util.LinkedList;
import java.util.List;

public class Raindrops {
    public static String convert(int input) {
        StringBuilder rain=new StringBuilder();
        int original=input;
        List<Integer> primes = new LinkedList<Integer>();
        int i = 2;
        while (input != 1 && input > 1) {
            if (input % i == 0) {
                primes.add(i);
                input = input / i;
            }
            else i++;
        }
        if(primes.contains(3))rain.append("Pling");
        if(primes.contains(5))rain.append("Plang");
        if(primes.contains(7))rain.append("Plong");
        if((!primes.contains(3))&&(!primes.contains(5))&&(!primes.contains(7)))rain.append(original);

        return rain.toString();
    }
}
