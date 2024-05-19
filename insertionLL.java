class Node
{
    int data;
    Node next;
    Node (int data,Node next_val)
    {
        this.data=data;
        this.next=next_val;
    }
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class insertionLL {
     //convert the Array into linked list
   public static Node convertArr2LL(int[] arr)
   {
       Node head=new Node(arr[0]);
       Node mover=head;
       for(int i=1;i<arr.length;i++)
       {
           Node tmp=new Node(arr[i]);
           mover.next=tmp;
           mover=tmp;
       }
       return head;
   }
   //traversal the  linked List
   public static void traversal(Node head)
   {
       Node tmp=head;
       while(tmp!=null)
       {
           System.out.print(tmp.data+" ");
           tmp=tmp.next;
       }  
   }
   //insert value at the head
   public static Node inserthead(Node head,int val)
   {
        Node tmp=new Node(val,head);
        return tmp;
   }
   //insert the node at the tail
   public static Node inserttail(Node head,int val)
   {
        if(head==null)  return head;
        Node tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        Node tmp=new Node(val);
        tail.next=tmp;
        return head;
   }
   public static void main(String[] args) {
    int []arr={1,2,3,4,5};
    Node head=convertArr2LL(arr);
   // head=inserthead(head, 0);
   head=inserttail(head,10); 
   traversal(head);

   }
}
