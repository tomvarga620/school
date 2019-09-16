public class Math extends Subject {
    public int reverse(int num){

        int reversed = 0;

        if(num == 0) return 0;

        if(num%10 == 0) return 0;

        while(num!=0){
            reversed = reversed * 10;
            reversed = reversed + num%10;
            num = num/10;
        }

        return reversed;

    }
}
