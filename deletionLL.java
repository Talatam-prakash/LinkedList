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

public class deletionLL {
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

   // delete the head of the linked list
   public static Node deletehead(Node head)
   {
        if(head==null)  return head;
        head=head.next;
        return head;
   }
   // delete the tail of the linked list
   public static Node deletetail(Node head)
   {
        if(head==null || head.next==null)   return head;
        Node tmp=head;
        while(tmp.next.next!=null)
        {
            tmp=tmp.next;
        }
        tmp.next=null;
        return head;
   }
   //delete Kth position in Linked List
   public static Node deleteKthpos(Node head,int k)
   {
        if(head==null)   return head;
        if(k==1)
        {
            head=head.next;
            return head;
        }
        Node tmp=head;
        Node prev=null;
        int count=0;
        while(tmp!=null)
        {
            count++;
            if(count==k)
            {
                prev.next=prev.next.next;
                break;
            }
            prev=tmp;
            tmp=tmp.next;
        }
        return head;
   }
   //delete the particular value of a Node
   public static Node deletevalnode(Node head,int val)
   {
        if(head==null)   return head;
        if(head.data==val)
        {
            head=head.next;
            return head;
        }
        Node tmp=head;
        Node prev=null;
        while(tmp!=null)
        {
            if(tmp.data==val)
            {
                prev.next=prev.next.next;
                break;
            }
            prev=tmp;
            tmp=tmp.next;
        }
        return head;
   }
   public static void main(String[] args) {
    int []arr={1,2,3,4,5};
    Node head=convertArr2LL(arr);
   // head=deletehead(head);
   // deletetail(head);
   // deleteKthpos(head, 2);
   deletevalnode(head, 6);
   traversal(head);
   

    }
}
