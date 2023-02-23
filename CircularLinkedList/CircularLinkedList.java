class CircularLinkedList
{
    Node head;
    class Node
    {
        int value;
        Node next;
        Node(int value)
        {
            this.value=value;
        }
    }
    public void addFirst(int ele)
    {
        Node newNode = new Node(ele);
        if(head==null)
        {
            head=newNode;
            head.next=newNode;
            return;
        }
        newNode.next=head;
        head.next=newNode;
        head=newNode;
    }
    public void addLast(int ele)
    {
        Node newNode= new Node(ele);
        if(head==null)
        {
            newNode.next=head;
            head.next=newNode;
            return ;
        }
        Node curr_node=head.next;
        if(curr_node==head)
        {
            curr_node.next=newNode;
            newNode.next=head;
            return ;
        }
        while(curr_node.next!=head)
        {
            curr_node=curr_node.next;
        }
        curr_node.next=newNode;
        newNode.next=head;
    }
    public void Addatpos(int ele,int pos)
    {
        Node newNode = new Node(ele);
        Node curr_node = head;
        for(int i=1;i<pos-1;i++)
        {
            curr_node=curr_node.next;
        }
        if(curr_node.next==head)
        {
            curr_node.next=newNode;
            newNode.next=head;
            return ;
        }
        newNode.next=curr_node.next;
        curr_node.next=newNode;
    }
    public void deleteFisrt()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==head)
        {
            //only when one element exsist
            head=null;
            return;
        }
       
        // System.out.println("head value:"+head.value);
        Node curr_node=head.next;
        while(curr_node.next!=head)
        {
            // System.out.println("Curr Node :"+curr_node.value);
            curr_node=curr_node.next;
        }
        head=head.next;
        curr_node.next=head;
    }
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==head)
        {
            //only if one element exsist
            head=null;
        }
        Node last=head.next.next;
        Node second_last=head.next;
        while(last.next!=head)
        {
            last=last.next;
            second_last=second_last.next;
        }
        second_last.next=head;

    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return ;
        }
        Node curr_node=head;
        if(curr_node.next==head)
        {
            // only when one element present in Circular linked List
            System.out.print(curr_node.value+"->");
            System.out.print(curr_node.next.value);
            System.out.println();
            return ;
        }
        System.out.print(curr_node.value+"->");
        curr_node=curr_node.next;
        while(curr_node!=head)
        {
            System.out.print(curr_node.value+"->");
            curr_node=curr_node.next;
        }
        System.out.print(curr_node.value);
        System.out.println();
    }
    public static void main(String[] args) {
        CircularLinkedList obj = new CircularLinkedList();
        obj.addFirst(1);
        obj.print();
        obj.addFirst(0);
        obj.print();
        obj.addLast(2);
        obj.print();
        obj.Addatpos(3, 4);
        obj.print();
        obj.Addatpos(10,3 );
        obj.print();
        obj.deleteFisrt();
        obj.print();
        obj.deleteLast();
        obj.print();
 
    }
}
