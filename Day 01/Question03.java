public class Question03 {
    public static void main(String args[]){
        int number = 123456;
        int reverse = 0;
        int temp;

        while(number > 0){
            temp = number % 10;
            reverse = reverse * 10 + temp;
            number = number /10;
        }
        System.out.println("Reverse order of the number is: "+ reverse);
    }
}
