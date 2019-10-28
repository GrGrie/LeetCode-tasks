import java.util.*;
public class Task7{
    public static int reverse(int x) {
        int ans = 0;
        while(x != 0){
            int lastDigit = x % 10;
            int tmp = ans*10 + lastDigit;
            if((tmp - lastDigit) / 10 != ans) return 0;
            ans = tmp;
            x /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(reverse(input.nextInt()));
        input.close();
    }
}
    