import java.util.Stack;

public class Solution20 {
    public static boolean ifEffective(String s){
        int l = s.length();
        for (int i=0;i<l-1;i++){
            if ("(".equals(s.substring(i,i+1))){
                if("}".equals(s.substring(i+1,i+2))||"]".equals(s.substring(i+1,i+2))){
                    return false;
                }
                if(")".equals(s.substring(i+1,i+2))){
                    if (l==2){return true;}
                    return ifEffective(s.substring(0,i)+s.substring(i+2,l));
                }
            }
            else if ("{".equals(s.substring(i,i+1))){
                if(")".equals(s.substring(i+1,i+2))||"]".equals(s.substring(i+1,i+2))){
                    return false;
                }
                if("}".equals(s.substring(i+1,i+2))){
                    if (l==2){return true;}
                    return ifEffective(s.substring(0,i)+s.substring(i+2,l));
                }
            }
            else if ("[".equals(s.substring(i,i+1))){
                if(")".equals(s.substring(i+1,i+2))||"}".equals(s.substring(i+1,i+2))){
                    return false;
                }
                if("]".equals(s.substring(i+1,i+2))){
                    if (l==2){return true;}
                    return ifEffective(s.substring(0,i)+s.substring(i+2,l));
                }
            }
        }
        return false;
    }


    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        char[] charArray = s.toCharArray();
        if (s.isEmpty()){return false;}
        for (char c : charArray) {
            if (c=='('){ stack.push(')');}
            else if(c=='['){stack.push(']');}
            else if (c=='{'){stack.push('}');}
            else if (stack.isEmpty()||c!=stack.pop()){
                return false;
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        else return false;
    }




    public static void main(String[] args) {
        boolean b = isValid("[()]");
        System.out.println(b);
    }
}
