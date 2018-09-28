

public class MidLinkedList {
 private static Node head;

  public static void main(String[] args){

    LinkedList linkedList = new LinkedList();
    linkedList.initialize();
    head = linkedList.gethead();
    MidLinkedList midLinkedList = new MidLinkedList();
   System.out.println("Mid Element: "+midLinkedList.midLinkedList());
    linkedList.diaplay();

  }

  public int midLinkedList(){

    if(head == null)
      return -1;
    Node slow = head,fast = head;
    while(fast !=null && fast.next!=null){
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow.data;
  }
}
