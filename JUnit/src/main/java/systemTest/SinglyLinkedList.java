package systemTest;

public class SinglyLinkedList {
    private SinglyListNode head;
    private Person person;

    public boolean isEmpty(){
        return this.head == null;
    }

    public void addList(Person person){
        SinglyListNode newTail = new SinglyListNode(person, null);
        if(isEmpty()){
            this.head = newTail;
            return;
        }else{
            SinglyListNode oldTail = this.head;
            while (oldTail.getNext() != null){
                oldTail = oldTail.getNext();
            }
            oldTail.setNext(newTail);
        }
    }

    public int size(){
        SinglyListNode current = this.head;
        int size = 0;
        while(current != null){
            size++;
            current = current.getNext();
        }
        return size;
    }

    public SinglyListNode search(Person person){
        SinglyListNode current = this.head;
        while(current != null){
            if(current.getPerson().getCpf().equals(person.getCpf())){
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void delete(SinglyListNode nodeDelete){
        SinglyListNode current = this.head;
        if(isEmpty()){
            return;
        }
        if(this.head.getPerson().getCpf().equals(nodeDelete.getPerson().getCpf())){
            this.head = this.head.getNext();
            return;
        }
        while(current != null){
            if(current.getNext().getPerson().getCpf().equals(nodeDelete.getPerson().getCpf())){
                current.setNext(current.getNext().getNext());
                break;
            }
            current = current.getNext();
        }
    }
}
