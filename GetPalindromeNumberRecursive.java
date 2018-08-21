public class GetPalindromeNumberRecursive {
    public static void main(String args[]){
        System.out.println(getPalindromeNumber(133));
    }

    private static int getPalindromeNumber(int n){
        return getPalindromeNumber(n,n);
    }

    private static int getPalindromeNumber( int n, int r ){
        if(r==0)
            return n;
        return getPalindromeNumber(n * 10 + r % 10 , r / 10);
    }
}
