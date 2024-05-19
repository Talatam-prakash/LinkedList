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

class LinkedList
{
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
    // length of the linked list
    public static int lengthLL(Node head)
    {
        int count=0;
        Node tmp=head;
        while(tmp!=null)
        {
            count++;
            tmp=tmp.next;
        }
        return count;
    }
    public static boolean searchLL(Node head,int val)
    {
        Node tmp=head;
        while(tmp!=null)
        {
            if(tmp.data==val)
            {
                return true;
            }
            tmp=tmp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        Node head=convertArr2LL(arr);
        // System.out.println(head.data);
        // traversal(head);
        // System.out.println();
        // System.out.println(lengthLL(head));
        System.out.println(searchLL(head, 6));
    }
}

