import java.util.*;
public class Singly_Linked_List {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addNode(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void display(Node current){
        if(current==null)
            System.out.print("Empty");
        else{
            System.out.print("The Values:\n");
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
    public void insertbeg(int data){
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertend(int data){
        Node newnode=new Node(data);
        if(tail==null)
        {
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public int length(Node current){
        int len=0;
        while(current!=null){
            len++;
            current=current.next;
        }
        return len;
    }
    public void insertmid(int data,int position){
        int len=length(head);
        if(position<=len+1){
            if(position==1){
                insertbeg(data);
            }
            else if(position==len+1){
                insertend(data);
            }
            else{
                int cp=1;
                Node current=head;
                Node newnode=new Node(data);
                while(cp<position-1){
                    current=current.next;
                    cp++;
                }
                newnode.next=current.next;
                current.next=newnode;
            }
        }
    }
    public void deletebeg(){
        if(head==tail)
        {
            head=null;
            tail=null;
        }
        else{
            head=head.next;
        }
    }
    public void deleteend()
    {
        if(head==tail)
        {
            head=null;
            tail=null;
        }
        else{
            Node current=head;
            while(current.next!=tail)
            current=current.next;
            current.next=null;
            tail=current;
        }
    }
    public void deletemid(int position){
        int len=length(head);
        if(position<=len+1){
            if(position==1){
                deletebeg();
            }
            else if(position==len){
                deleteend();
            }
            else{
                int cp=1;
                Node current=head;
                while(cp<position-1){
                    current=current.next;
                    cp++;
                }
                current.next=current.next.next;
            }
        }
    }
    public static void main(String args[]){
            Scanner in=new Scanner(System.in);
            Singly_Linked_List sl=new Singly_Linked_List();
            int data=1;
            do{
                System.out.print("Enter the Node Value (-1 to End):");
                data=in.nextInt();
                if(data!=-1)
                sl.addNode(data);
            }while(data!=-1);
            sl.display(sl.head);
            int choice=0;
            System.out.print("\nEnter 1 to add at beginning\nEnter 2 to add at End\nEnter 3 to add at Middle\nEnter 4 to Deletebeg\nEnter 5 to Deleteend\nEnter 6 to Deletemid\nEnter 7 to Display\nEnter 8 to End\n");
            do{
                System.out.print("Enter Choice:");
                choice=in.nextInt();
                if(choice==1||choice==2||choice==3){
                    System.out.print("Enter the Node Value:");
                    data=in.nextInt();
                    if(choice==1)
                    sl.insertbeg(data);
                    else if(choice==2)
                    sl.insertend(data);
                    else if(choice==3){
                    System.out.print("Enter the Node Position:");
                    int position=in.nextInt();
                    sl.insertmid(data,position);
                    }
                }
                if(choice==4)
                sl.deletebeg();
                if(choice==5)
                sl.deleteend();
                if(choice==6){
                int position=in.nextInt();
                sl.deletemid(position);
                }
                if(choice==7)
                sl.display(sl.head);
            }while(choice<8);
            sl.display(sl.head);
            in.close();
    }
}