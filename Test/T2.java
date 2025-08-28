class T2{

    static class Node{
     int data;
     Node next;

     //Contuctor bnale bhai

     Node(int data){
        this.data = data;
        this.next = null;

     }
    }

  

    Node head;
    public void  add(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        else{
            Node currNode = head;
            while (currNode.next != null) {
                currNode.next = newNode;
            }
        }
    }


    public void printlist(){
       
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
        }

        current = current.next;
    }
   
    public static void main(String[] args) {
     T2 list = new T2();
     list.add(12);
     list.add(12);
     list.add(12);
     list.add(12);
     list.add(12);
     list.add(12);
     list.add(12);
     list.add(12);
     list.add(12);
     list.add(12);


    list.printlist();


    }
}