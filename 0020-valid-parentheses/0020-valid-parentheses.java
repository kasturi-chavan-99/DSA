class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack <>();
        for ( char val:s.toCharArray())
        {
            if(val=='['|| val == '{' || val == '(')
            {
                st.push(val);
            }
            else 
            {
                if(st.isEmpty())
                return false ;
                
                else if( (val=='}' && st.peek()=='{') || (val==']' && st.peek()=='[')|| (val==')' && st.peek()=='('))
                    st.pop();

                else 
                return false;
            }
            

            }
            return st.isEmpty();
        }
        
    }
