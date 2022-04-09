import java.util.Scanner;
public class Main {

    static void f(int n, int count){
        int result;

        result=n-5;
        System.out.print(result+" ");

        count++;

        if (result == 0 || result < 0){
            reverse(count,result);
        }else {
            f(result,count);
        }
    }
    static void reverse (int k, int result){
        for (int i = 0; i < k; i++){
            result += 5;
            System.out.print(result + " ");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayac = 0;

        int number =input.nextInt();
        System.out.print(number+" ");

        f(number,sayac);
    }
}