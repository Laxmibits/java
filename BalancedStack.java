package day9;
import java.util.*;


public class BalancedStack {
    public static boolean isBalanced(String s){
        Stack<Character> stack=new Stack<>();
        char[] ch=s.toCharArray();
        for(char c:ch){
            // push logic
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            }
            //pop logic
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top=stack.pop();
                    if(top=='[' && c!=']' || top=='(' && c!=')' || top=='{' && c!='}'){
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s="][]()";
        System.out.println(isBalanced(s));
    }
   
    }


 

    
    

