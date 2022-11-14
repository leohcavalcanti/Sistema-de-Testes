package systemTest;

public class SinglyListNode {
    private Person person;
    private SinglyListNode next;

    public SinglyListNode(Person person, SinglyListNode next) {
        this.person = person;
        this.next = next;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public SinglyListNode getNext() {
        return next;
    }

    public void setNext(SinglyListNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof SinglyListNode){
            SinglyListNode other = (SinglyListNode) obj;
            return this.person.getCpf().equals(other.person.getCpf());
        }
        return false;
    }
}
