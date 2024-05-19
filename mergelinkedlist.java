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
class mergelinkedlist
{
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
    public static Node merge(Node list1,Node list2,int a,int b)
    {
        Node tmp1=list1;
        Node tmp2=list2;
        Node tail2=null;
        while(tmp2!=null)
        {
            tail2=tmp2;
            tmp2=tmp2.next;
        }
        System.out.println(tail2.data);
        int count=0;
        Node preva=null;
        Node nextb=null;
        while(tmp1!=null)
        {
            if(count+1==a)
            {
                preva=tmp1;
            }
            if(count==b)
            {
                nextb=tmp1.next;
            }
            count++;
            tmp1=tmp1.next;
        }
        if(preva.next== null)
        {
            preva.next=list2;
            return list1;
        }
        preva.next=null;
        preva.next=list2;
        tail2.next=nextb;
        
        return list1;
    }

    public static void main(String[] args) {
        //int []arr={1,2,3,4,5};
        int[] arr={10,1,13,6,9,5};
        int[] arr2={0,1,2,3,4,5,6};
        int[] nums2={1000000,1000001,1000002,1000003,1000004};
        //int[] nums={100,101,102};
        int[] nums={1000000,1000001,1000002};
        Node list1=convertArr2LL(arr2);
        Node list2=convertArr2LL(nums2);
        Node ans=merge(list1,list2,2,5);
        traversal(ans);
    }    
}