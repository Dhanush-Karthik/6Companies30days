package microsoft;

import java.util.*;
public class Problem1 {
    public static List<String> perform(List<String> a){
        int n = Integer.parseInt(a.get(a.size()-3));
        int m = Integer.parseInt(a.get(a.size()-2));
        String op = a.get(a.size()-1);
        a.remove(a.size()-3);
        a.remove(a.size()-2);
        a.remove(a.size()-1);
        switch(op){
            case "+":
                a.add(Integer.toString(n+m));
                break;
            case "-":
                a.add(Integer.toString(n-m));
                break;
            case "*":
                a.add(Integer.toString(n*m));
                break;
            case "/":
                a.add(Integer.toString(n/m));
                break;
        }
        return a;
    }
    public static int evalRPN(String[] tokens) {
        List<String> a = new ArrayList<String>();
        String operators = "+-*/";
        for(int i = 0 ; i< tokens.length ; i++){
            a.add(tokens[i]);
            if(operators.contains(tokens[i])){
                perform(a);
            }
        }
        return Integer.parseInt(a.get(0));
    }

    public static void main(String[] args) {
        String q[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(q));
    }
}