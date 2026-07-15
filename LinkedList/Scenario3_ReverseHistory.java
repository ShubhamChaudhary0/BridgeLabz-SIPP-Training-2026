class Node {
    int val; Node next;
    Node(int val){ this.val=val; }
}
class Scenario3_ReverseHistory {
    static Node reverseHistory(Node head){
        Node prev=null,curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}