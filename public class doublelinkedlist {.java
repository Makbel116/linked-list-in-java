public class doublelinkedlist {
    /* creating a double linked list and operations can be done on double linked list
    operations include inserting at the beginning,at the end and before a number found on the list
                       deleting from the beginning and the last node

     */
    class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }}
        node head =null;
        node tail =null;

        public void insertatbeg(int data) {//to insert a new node in the beginning
            node newnode=new node(data);
            if (head == null) {//making the new node a head if it was a null list before
                head=newnode;
                tail=newnode;
                newnode.next = null;
                newnode.prev=null;
            } else {

                newnode.next=head;
                head.prev=newnode;
                newnode.prev=null;
                head=newnode;

            }
        }
        public void insertatend(int data){//to insert a new node in the end
         node newnode = new node(data);
        if(head==null){//making the new node a head if it was a null list before
            head=newnode;
            tail=newnode;
            newnode.prev=null;
            newnode.next=null;

        }
        else{
           tail.next=newnode;
           newnode.prev=tail;
            tail=newnode;
           newnode.next=null;

        }
    }
    public void insertbeforeanynum(int data,int num){//this is if we already have numbers in the list and we want to put another number in the list before a given number in our case "num"
       node newnode=new node(data);
        if(head==null){
            System.out.println("there is no data there");
        }
        else{
            node temp=head;
            node temp2 = null;

            while (temp.data!=num){
                temp2=temp;
                temp=temp.next;
            }
            newnode.next=temp;
            temp2.next=newnode;
            newnode.prev=temp2;
            temp.prev=newnode;
        }
    }
    public void deleteatbeg(){//to delete a number from the beginning of the list
        if(head==null){
            System.out.println("nothing to delete");
        }
        else{
           node temp=head.next;
           head=temp;
            temp.prev=null;
        }
    }
    public void deleteatend(){//to delete a number from the end of the list
        if(head==null){
            System.out.println("nothing to delete");
        }
        else {
           node temp=tail.prev;
           temp.next=null;
           tail=temp;
        }
    }
    public void display() {//to display our content
        node temp = head;
        if (head == null) {
            System.out.println("there is no data");

        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
            // to work on the list we create an object for the class doublelinkedlist first
        //eg. doublelinkedlist newlist=new doublelinkedlist();
        //and in order to access the methods above, we use the format as the example below
        //newlist.insertatebeg(5);
        //newlist.insertatend(4);
        //newlist.insertbeforeanynum(4,3);
       // newlist.deleteatbeg();
        //newlist.deleteatend();
        //newlist.display();
    }
    }

