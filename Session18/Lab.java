import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lab {

    /* main method */
    public static void main(String[] args) {
        System.out.println(isBalanced("()()(()"));
        System.out.println(isBalanced("()())()"));
        System.out.println(isBalanced("(()())()"));
        System.out.println(isBalanced("((()))"));
    }

    /* Write a function which takes a string and checks if all
    of the parentheses (if any) in it are balanced.
    Hint: Use stack
    e.g.
    isBalanced(“(yeah)”) = true
    isBalanced(“(yeah)(i)am(ba(lan)ced)”) = true
    isBalanced(“((something)”) = false
    isBalanced(“no parenthesis”) = true
    isBalanced(“we(i)rd”) = true */
    static boolean isBalanced(String s) {
        // the kind of elements that you
        // push to the stack has no importance
        // in this question
        Stack<Object> st = new Stack<>();
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)=='(')
                st.push(null);
            else if(s.charAt(i) == ')'){
                if(st.empty())
                    return false;
                else
                    st.pop();
            }
        return st.empty();
    }

    /* Write a function which takes two stacks as
    parameters and swaps their contents without
    changing the order of the elements. You are only
    allowed to use primitive data types and one extra
    stack (don’t use more stacks). Allowed operations on
    a stack are standard ops like push, pop, peek, size. */
    static void transfer(Stack<Integer> s1, Stack<Integer> s2) {
        while(!s1.empty())
            s2.push(s1.pop());
    }
    static void stackSwap(Stack<Integer> s1, Stack<Integer> s2) {
        Stack<Integer> temp = new Stack<>();
        int s1Size = s1.size();
        transfer(s2, temp);
        transfer(s1, temp);
        for(int i=0; i<s1Size; i++)
            s2.push(temp.pop());
        transfer(temp, s1);
    }

    /* In your high-school, one of your friends has a rich dad and
    upon your friend’s academic success, his dad decided to gift
    all the school with unlimited amount of baklava. Baklavas are
    distributed from school cafeteria one-by-one and initially 500
    students are in the queue. Each time with 60% probability, the
    student in the front of the queue decides to eat one more
    piece and enters the queue back again from the back.
    Baklavas are served until there’s no one left in the queue. A
    piece of baklava costs 7 liras.
    Simulate this process and find out the average spending of
    rich guy for this festival. */
    static int baklavaMadness(int numStudents, int baklavaCost, double p) {
        Queue<Object> q = new LinkedList<>();
        int baklavasEaten = 0;
        for(int i=0; i<numStudents; i++)
            q.add(null);
        while(!q.isEmpty()) {
            baklavasEaten++;
            if(Math.random() < p)
                q.add(q.remove());
            else
                q.remove();
        }
        return baklavasEaten * baklavaCost;
    }

    /* Write a function which takes a string representing an
    arithmetical expression written in postfix notation
    and calculates the result. All numbers are integers
    and only + and * operations are supported. You can
    assume that the sentence has correct syntax.
    Hint: Use stack
    e.g.
    solve(“2 4 +”) = 6
    solve(“2 1 + 1 1 + *”) = (2+1) * (1+1) = 6
    solve(“2 +”) -- (no need to handle) */
    static int solve(String expr) {
        Stack<Integer> st = new Stack<>();
        for(String token: expr.split(" "))
            switch(token) {
                case "+":
                    st.push(st.pop() + st.pop());
                    break;
                case "*":
                    st.push(st.pop() * st.pop());
                    break;
                default:
                    st.push(Integer.valueOf(token));
            }
        return st.pop();
    }


}
