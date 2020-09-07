package array;

public class Gcd {

    public int calculategcd(int a, int b) {

        if (a != b){
            if (a > b){
                a = a-b;
            }
            else{
                b = b-a;
            }
           return calculategcd(a, b);
        }

            return a;
    }


}
