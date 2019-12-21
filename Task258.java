public class Task258{
    // Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

    static public int addDigits(int num) {
        if(num == 0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
    }
    
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}