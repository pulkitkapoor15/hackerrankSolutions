/*****************************************************************************************************************************/
/************************* This solution returns true if the string is balanced else it returns false ************************/
/*****************************************************************************************************************************/
/*******************************STRING BALANCING PARENTHESIS *****************************************************************/

import java.util.*;
public class StringBalancing{
    public static Character isPair(Character ch1){
        if(ch1=='}')
            return '{';
        if(ch1==')')
            return '(';
        if(ch1==']')
            return '[';
        return ' ';
    }
   public static boolean check(String s){
       int flag=0;
       Stack<Character> st=new Stack<Character>();
       for(int i=0;i<s.length();i++)
       {
           if(st.size()==0  || s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[')
           {
               st.push(s.charAt(i));
               
           }
           else
           {
               if(s.charAt(i)=='}' || s.charAt(i)==')' || s.charAt(i)==']')
               {
                   Character is=isPair(s.charAt(i));
                   if(!st.contains(is))
                   {
                       
                       flag=1;
                       break;
                   }
                   else
                   {
                       st.remove(is);
                   }
               }
           }
       }
       if(flag==1 || !st.isEmpty()){
           return false;
       }
       return true;
       
   }
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
         System.out.println(check(input));
            //Complete the code
      }
      
   }
}
