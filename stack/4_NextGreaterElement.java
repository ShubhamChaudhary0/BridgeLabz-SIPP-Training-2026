import java.util.*;class Scenario4_NextGreaterElement{
static int[] nextBusierDay(int[] a){
int[] ans=new int[a.length];Arrays.fill(ans,-1);
Deque<Integer> st=new ArrayDeque<>();
for(int i=0;i<a.length;i++){
while(!st.isEmpty()&&a[i]>a[st.peek()])ans[st.pop()]=a[i];
st.push(i);}return ans;}}