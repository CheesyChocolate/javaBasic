public class Lab {

    /* main method */
    public static void main(String[] args) {
       System.out.println(pow(2, 4));
    }

   /* recursive function which takes two
    non-negative integer arguments n,m and
    computes the power n^m.
    “for” or “while” loops are forbidden.
    e.g.
    pow(3, 2) = 9
    pow(1, 6) = 1
    pow(2, 3) = 8
    pow(10, 2) = 100 */
    public static int pow(int a, int b) {
        if(b==1)
          return a;
       else
          return pow(a, b-1) * a;
    }

    /* Write a function which takes two positive
    integer arguments n,m and returns n % m.
    Don’t use % operator.
    e.g.
    mod(3, 2) = 1
    mod(3, 6) = 3
    mod(35, 4) = 3
    mod(100, 10) = 0 */
    public static int mod(int a, int b) {
        return a - (a/b)*b;
    }

    /* Write a recursive function which takes two
    positive integer arguments n,m and returns n
    % m. Don’t use %, *, / operators.
    e.g.
    mod(3, 2) = 1
    mod(3, 6) = 3
    mod(35, 4) = 3
    mod(100, 10) = 0 */
    public static int simplemod(int a, int b) {
    if(a<b)
        return a;
    else
        return simplemod(a-b, b);
    }

    /* Write the classic max(int, int) function
    without using operators > or < (you can use
    ==) and without using Math library.
    e.g.
    max(6, 3) = 6
    max(-3, 0) = 0
    max(-2, -9) = -2 */
    public static int max(int a, int b) {
    for(int i=0; ;i++)
        if(a+i == b)
            return b;
        else if(a-i == b)
            return a;
    }

    public static int maxAliDaghighi(int a, int b) {
        if(a/b == 0)
            return b;
        else if(b/a == 0)
            return a;
        else
            return a; // a == b case
    }

    /* • Write a recursive function which takes a
    string parameter and checks if it is a
    palindrome.
    e.g.
    isPal(“winnie”) = false
    isPal(“hannah”) = true
    isPal(“aaa”) = true
    isPal(“abc”) = false */
    public static boolean isPal(String s) {
        if(s.length() == 0 || s.length() == 1)
            return true;
        return s.charAt(0) == s.charAt(s.length()-1) && isPal(s.substring(1, s.length()-1));
    }

    /* • Write a recursive function which takes a
    string parameter and checks if all its
    characters appear only once.
    e.g.
    isUnique(“pickle”) = true
    isUnique(“moon”) = false
    isUnique(“trash”) = true
    isUnique(“malaria”) = false */
    public static boolean isUnique(String s) {
        if(s.length() == 1)
            return true;
        else {
            // check if first character repeats somewhere else
            for(int i=1; i<s.length(); i++)
                if(s.charAt(0) == s.charAt(i))
                    return false;
        // first character is OK
        // check the rest
        return isUnique(s.substring(1));
        }
    }

}
