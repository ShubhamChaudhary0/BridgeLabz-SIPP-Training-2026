class CallStack{
static class Frame{String functionName;Frame next;Frame(String n,Frame x){functionName=n;next=x;}}
private Frame top=null;
void push(String f){top=new Frame(f,top);}
String pop(){if(isEmpty())throw new RuntimeException("No active call");String n=top.functionName;top=top.next;return n;}
String peek(){if(isEmpty())throw new RuntimeException("No active call");return top.functionName;}
boolean isEmpty(){return top==null;}
}