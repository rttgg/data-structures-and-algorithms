package code401challenges.utilities;

import code401challenges.StacksAndQueues.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void enqueue() {
        AnimalShelter addAnimal = new AnimalShelter();
        addAnimal.enqueue(new Pet("dog"));
        addAnimal.enqueue(new Pet("cat"));
        addAnimal.enqueue(new Pet("rabbit"));

        assertEquals("dog", "dog",addAnimal.front.value.toString());
        assertEquals("cat", "cat", addAnimal.front.next.value.toString());
        assertEquals("rabbit", "rabbit", addAnimal.rear.value.toString());

    }

    @Test
    public void dequeue() {
        AnimalShelter addAnimal = new AnimalShelter();
        addAnimal.enqueue(new Pet("dog"));
        addAnimal.enqueue(new Pet("cat"));
        addAnimal.enqueue(new Pet("rabbit"));
        addAnimal.enqueue(new Pet("fish"));
        addAnimal.enqueue(new Pet("owl"));
        assertEquals("dog", "dog",addAnimal.dequeue("dog").toString());
        assertEquals("owl", "owl", addAnimal.dequeue("owl").toString());

        Node current = addAnimal.front;
        while(current !=null){
            assertTrue("not a dog", current.value.toString() != "dog");
            assertTrue("not an owl", current.value.toString() !="owl");
            current = current.next;
        }

    }

    @Test
    public void peek() {
        AnimalShelter addAnimal = new AnimalShelter();
        addAnimal.enqueue(new Pet("dog"));
        assertTrue("dog", addAnimal.front.value.toString()== "dog");
        addAnimal.enqueue(new Pet("cat"));
        assertTrue("dog", addAnimal.front.value.toString()== "dog");


    }
}