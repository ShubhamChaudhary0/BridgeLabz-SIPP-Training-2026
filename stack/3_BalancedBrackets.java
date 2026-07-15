import java.util.*;class Scenario3_BalancedBrackets{
static boolean isValidConfig(String s){
Deque<Character> st=new ArrayDeque<>();
Map<Character,Character> m=Map.of(')','(',']','[','}','{');
for(char c:s.toCharArray()){
if(c=='('||c=='['||c=='{')st.push(c);
else if(st.isEmpty()||st.pop()!=m.get(c))return false;}
return st.isEmpty();}}