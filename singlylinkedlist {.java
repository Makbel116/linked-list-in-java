public class singlylinkedlist {
    /* creating a singular linked list and operations can be done on singular linked list
    operations include inserting at the beginning,at the end and before a number found on the list
                       deleting from the beginning and the last node

     */
    class node {
        node next;
        int data;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public node head = null;

        public void insertatbeg(int data) { //to insert a new node in the beginning
            node newnode = new node(data);
            if (head == null) {  //making the new node a head if it was a null list before
                 head=newnode;
                newnode.next = null;
            } else {

                newnode.next = head;
                head=newnode;
            }
        }
        public void insertatend(int data){//to insert a new node in the end
            node newnode = new node(data);
            if(head==null){//making the new node a head if it was a null list before
                head=newnode;
                newnode.next=null;
            }
            else{
                node temp=head;
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newnode;
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
                   }
               }

        public void deleteatbeg(){//to delete a number from the beginning of the list
            if(head==null){
                System.out.println("nothing to delete");
            }
            else{
                head=head.next;

            }
        }
        public void deleteatend(){//to delete a number from the end of the list
            if(head==null){
                System.out.println("nothing to delete");
            }
            else {
                node temp=head;
                node temp2=null;
                while (temp.next!=null){
                    temp2=temp;
                    temp=temp.next;
                }
                temp2.next=null;
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
        // to work on the list we create an object for the class singlelinkedlist first
        //eg. singlelinkedlist newlist = new singlelinkedlist();
        //and in order to access the methods above, we use the format as the example below
        //newlist.insertatbeg(2);
        //newlist.insertatend(4);
        //newlisdt.insertbeforeanynum(3,4);
        //newlist,deleteatbeg();
        //newlist.deleteatend();
        //newlist.display();
    }
}
