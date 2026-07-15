class Node {
    int val; Node next;
    Node(int val){ this.val=val; }
}
class Scenario5_CycleDetection {
    static boolean hasRedirectLoop(Node head){
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}