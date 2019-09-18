/*Tomáš Varga*/
public class Math extends Subject {
    public int reverse(int num) {

        int reversed = 0;

        if (num == 0) return 0;

        if (num % 10 == 0) return 0;

        while (num != 0) {
            reversed = reversed * 10;
            reversed = reversed + num % 10;
            num = num / 10;
        }

        return reversed;

    }

    public boolean primeNumber(int num) {

        if(num == 0) return false;

        for (int i = 2; i < num; i++) {
            System.out.println(i);
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
