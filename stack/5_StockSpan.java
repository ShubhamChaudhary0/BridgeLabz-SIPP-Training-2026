import java.util.*;class Scenario5_StockSpan{
static int[] loadSpan(int[] load){
int n=load.length;int[] span=new int[n];Deque<Integer> st=new ArrayDeque<>();
for(int i=0;i<n;i++){
while(!st.isEmpty()&&load[st.peek()]<=load[i])st.pop();
span[i]=st.isEmpty()?i+1:i-st.peek();st.push(i);}return span;}}