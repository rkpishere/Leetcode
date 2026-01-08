class MyLinkedList {
    class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }}
    public MyLinkedList() {
}
        Node head=null;

    
    
    public int get(int index) {
        Node curr=head;
        int i=0;
        while(curr!=null){
            if(index==i){
                return curr.val;
            }
            curr=curr.next;
            i++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }
        else{
        newNode.next=head;
        head=newNode;
        }
    }
    
    public void addAtTail(int val) {
         Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    
    public void addAtIndex(int index, int val) {
         Node prev=head;
         if(index==0){
            addAtHead(val);
            return;
         }
        Node newNode=new Node(val);
        int i=1;
        while(prev!=null){
            if(index==i){
                newNode.next=prev.next;
                prev.next=newNode;
                return;
                
            }
            i++;
            prev=prev.next;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(head==null){
            return;
        }
        Node curr=head.next;
        Node prev=head;
        if(index==0){
            head=head.next;
            return;
        }
        int i=1;
        while(curr!=null){
            if(i==index){
                prev.next=curr.next;
                return;
            }
            i++;
            curr=curr.next;
            prev=prev.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */