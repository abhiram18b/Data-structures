class SingleLinkedList
{
    
    Node head;
    public class Node
    {
        int value;
        Node next;
        Node(int val)
        {
            this.value=val;
        }

    }
    public void addFirst(int ele)
    {
        Node newNode = new Node(ele);
        if(head==null)
        {
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int ele)
    {
        Node newNode = new Node(ele);
       
        if(head==null)
        {
            head = newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;

    }
    public void add_after_value(int ele,int add)
    {
        Node toAdd = new Node(add);
        if(head==null)
        {
            System.out.println("List is empty");
            return ;
        }
        Node curr_node=head;
      
        if(curr_node.value==ele)
        {
            //when only one node exsist
            toAdd.next=curr_node.next;
            curr_node.next=toAdd;
            return ;
        }
       
        while(curr_node.next!=null)
        {
            curr_node=curr_node.next;
            if(curr_node.value==ele)
                break;
        }
        toAdd.next=curr_node.next;
        curr_node.next=toAdd;
    }
    public void Addatpos(int ele,int pos)
    {
        Node newNode = new Node(ele);
        Node currnode = head;
        for(int i=1;i<pos-1;i++)
        {
            currnode=currnode.next;
        }
        newNode.next=currnode.next;
        currnode.next=newNode;
    }
    public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    public void removeLast()
    {
        
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
         
        if(head.next==null)
        {
          //when only one node exsist
            head=null;
            return;
        }
        Node last=head.next;
        Node second_last=head;
        while(last.next!=null)
        {
            last=last.next;
            second_last=second_last.next;
        }
        second_last.next=null;

    }
    public void print()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        while(temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        SingleLinkedList obj = new SingleLinkedList();
        obj.addFirst(23);
        obj.print();
        obj.addLast(21);
        obj.print();
        obj.addFirst(1);
        obj.print();
        obj.removeFirst();
        obj.print();
        obj.removeLast();
        obj.print();
        obj.add_after_value(23,21);
        obj.print();
        obj.add_after_value(21,20);
        obj.print();
        obj.add_after_value(21,19);
        obj.print();
        obj.add_after_value(20,18);
        obj.print();
        obj.Addatpos(12, 3);
        obj.print();


    }
}
