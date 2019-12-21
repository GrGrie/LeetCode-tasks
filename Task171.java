public class Task171{
    
    //Given a column title as appear in an Excel sheet, return its corresponding column number.


    static public int titleToNumber(String s) {
        int sum = 0, symbolID = 0;
        for(int i = 0; i < s.length(); i++){
            symbolID = (int)s.charAt(i) - 64;
            sum += symbolID * Math.pow(26, s.length() - i - 1);
        }  
        
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));   // Column ZY have number 701
    }
}
