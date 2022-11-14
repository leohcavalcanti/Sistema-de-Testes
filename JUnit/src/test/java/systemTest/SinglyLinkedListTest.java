package systemTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    private SinglyLinkedList list;
    private Person person;

    @BeforeEach
    public void setUp(){
        this.list = new SinglyLinkedList();
    }

    @Test
    public void test01IsEmptyTrue() {
        SinglyLinkedList list = this.list;
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    public void Test02IsEmptyFalse(){
        person = new Person(123, "Lucas");
        list.addList(person);
        Assertions.assertTrue(!list.isEmpty());
    }

    @Test
    public void test03SizeEmpty() {
        SinglyLinkedList list = this.list;
        int expected = 0;
        int actual = list.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test04SizeCount(){
        SinglyLinkedList list = this.list;
        Integer[] addedValues = {147 ,258 ,369};
        String[] addedNames = {"Lua", "Marcos", "Sofia"};
        int i = 0;
        do{
            int values = addedValues[i];
            String nomes = addedNames[i];
            person = new Person(values, nomes);
            list.addList(person);
            i++;
        }while(i < 3);
        int expected = 3;
        int actual = list.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test05SearchEmpty(){
        SinglyLinkedList list = this.list;
        person = new Person(159, "Max");
        SinglyListNode expected = null;
        SinglyListNode actual = list.search(person);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test06SearchNull(){
        SinglyLinkedList list = this.list;
        Integer[] addedValues = {147 ,258 ,369};
        String[] addedNames = {"Lua", "Marcos", "Sofia"};
        int i = 0;
        do{
            int values = addedValues[i];
            String nomes = addedNames[i];
            person = new Person(values, nomes);
            list.addList(person);
            i++;
        }while(i < 3);
        Person personNotAdded = new Person(159, "Max");
        SinglyListNode expected = null;
        SinglyListNode actual = list.search(personNotAdded);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test07SearchTrue(){
        SinglyLinkedList list = this.list;
        Integer[] addedValues = {147 ,258 ,369};
        String[] addedNames = {"Lua", "Marcos", "Sofia"};
        int i = 0;
        do{
            int values = addedValues[i];
            String nomes = addedNames[i];
            person = new Person(values, nomes);
            list.addList(person);
            i++;
        }while(i < 3);
        Person wantedPerson = new Person(258, "Marcos");
        SinglyListNode expected = new SinglyListNode(wantedPerson, null);
        SinglyListNode actual = list.search(wantedPerson);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test08DeleteThenEmpty(){
        SinglyLinkedList list = this.list;
        Integer[] addedValues = {147 ,258 ,369};
        String[] addedNames = {"Lua", "Marcos", "Sofia"};
        int i = 0;
        do{
            int values = addedValues[i];
            String nomes = addedNames[i];
            person = new Person(values, nomes);
            list.addList(person);
            i++;
        }while(i < 3);

        SinglyListNode nodeDelete;
        Person wantedPerson;

        wantedPerson = new Person(147, "Lua");
        nodeDelete = list.search(wantedPerson);
        list.delete(nodeDelete);

        wantedPerson = new Person(258, "Marcos");
        nodeDelete = list.search(wantedPerson);
        list.delete(nodeDelete);

        wantedPerson = new Person(369, "Sofia");
        nodeDelete = list.search(wantedPerson);
        list.delete(nodeDelete);

        int size = list.size();
        if(size != 0){
            Assertions.fail();
        }
        boolean expected = true;
        boolean actual = list.isEmpty();
        Assertions.assertEquals(expected, actual);
    }


}