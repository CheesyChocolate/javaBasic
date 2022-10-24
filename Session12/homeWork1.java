package Session12;

public class homeWork1  {
    ///////////////////////////////////////////////////////////////////////even sum till 100
    // public static void main(String Args[])  {
    //     int evenSum = 0;
    //     for(int i=0; i<100; i=+2)
    //         evenSum += i;
    // }
    ///////////////////////////////////////////////////////////////////////even sum till 100
    // public static void main(String Args[])  {
    //     int evenSum =0;
    //     for(int i=0; i<50; i++) {
    //         evenSum += 2*i;
    //     }
    // }
    //////////////////////////////////////////////////////////////////////Lowercase English alphabet letters in a row
    // public static void main(String[] args)  {
    //     String s = ""; 
    //     for(int i=0; i<'z'-'a'+1; i++)
    //     s += (char)('a'+i);
    //     System.out.println(s);
    // }
    ///////////////////////////////////////////////////////////////////////Counts the number of times the character c appears in the string s
    // static int func(String s, char c) {
    //     int res = 0;
    //     for(int i=0; i<s.length(); i++)
    //     if(s.charAt(i) == c)
    //     res++;
    //     return res;
    // }
    ///////////////////////////////////////////////////////////////////////nserts string s2 between the nth and (n+1)th characters of string s1
    // static String func(String s1, String s2, int n) {
    //     String a = s1.substring(0, n);
    //     String b = s1.substring(n, s1.length());
    //     return a + s2 + b;
    // }
    ///////////////////////////////////////////////////////////////////////
    // /*Compiler error because compiler does not know math and it cannot see that the two 
    // conditionals are exhaustive for the input space. It is afraid of some input failing to satisfy 
    // both conditions and reaching the end of the function before reaching any return statement.*/
    // public static int func(int n) {
    //     if(n%2==0)
    //     return 0;
    //     else if(n%2==1)
    //     return 1;
    //     return n;       //fix
    // }
    // public static void main(String[] args){
    //     System.out.println(func(33));
    // }
    ///////////////////////////////////////////////////////////////////////
    // public static int weird(int n) {
    //     if(n==1)
    //         return 1;
    //     else if(n%2 == 0)
    //         return weird(n/2);
    //     else
    //         return weird(n+1);
    // }
    // public static void main(String Args[]) {
    //     for(int i=1; i<100;i++) {
    //         System.out.print(weird(i) + '\t');
    //     }
    // }
    ///////////////////////////////////////////////////////////////////////
    public static int weirder(int n) {
        if(n==1)
            return 1;
        else if(n%2 == 0)
            return weirder(n/2);
        else
            return weirder(3*n+1);
    }
    public static void main(String Args[])  {
        for(int i=1; i<100; i++)
            System.out.print(weirder(i + '\t'));
    }
}