    package linkedList;


    import org.junit.Test;

    import static org.junit.Assert.*;

    public class LinkedListTest {


        @Test
        public void insert() {
            LinkedList any = new LinkedList();
            any.insert( "hello");
            any.insert( "d");
            assertTrue(any.head.next.value == "hello");
        }

        @Test
        public void append () {
            LinkedList any = new LinkedList();
            any.insert( "head, 1, 3, 2, x");
            //any.insert("head, x");
            assertTrue(any.head.value == "head, 1, 3, 2, x");
           // assertTrue(any.head.value == "head, x");
        }


        @Test
        public void insertBefore() {
            LinkedList any = new LinkedList();
            any.insert(3);
            any.insertBefore(3,5);
            assertEquals("before the target", "List: 5, 3", any.toString());
            }

        @Test
        public void insertAfter() {
            LinkedList any = new LinkedList();
            any.insert(3);
            any.insertBefore(3,5);
            assertEquals("before the target", "List: 5, 3", any.toString());
        }

        @Test
        public void includes() {
            LinkedList any = new LinkedList();
            any.insert( "hello");
            assertEquals("return true", true, any.includes("hello"));
        }


        @Test
        public void kthFrontEndTest(){
               // public static void main(String[] args){
                LinkedList ll = new LinkedList();
                ll.insert(1);
                ll.insert(3);
                ll.insert(8);
                ll.insert(2);
                assertEquals("From the same length ",1, ll.kthFrontEnd(0));
                assertEquals("Greater than the length of the ll ","Exception", ll.kthFrontEnd(6));
                assertEquals("The same length of the ll ","Exception", ll.kthFrontEnd(4));
                //you can not find a thing a negative amount before the end
                //assertEquals("k not a positive integer ","Exception", ll.kthFrontEnd(-1));
                assertEquals("ll is of a size 1 ",1, ll.kthFrontEnd(0));
                assertEquals("Happy path k is not at the end but in the middle of the ll ",8, ll.kthFrontEnd(2));

            }



        @Test
        public void testToString() {
            LinkedList any = new LinkedList();
            any.insert( "preK");
            any.insert("first grade");
            any.insert( "2nd");
            assertEquals("List: 2nd, first grade, preK",  any.toString());
        }



        @Test
        public void testMergeListsEqualValue(){
            LinkedList list1 = new LinkedList();

            list1.append(1);
            list1.append(3);
            list1.append(2);

            LinkedList list2 = new LinkedList();
            list2.append(5);
            list2.append(9);
            list2.append(4);
            LinkedList.mergeLists(list1, list2);
            String toString = list1.toString();
            assertEquals("List: 1, 5, 3, 9, 2, 4", toString);

        }
        @Test
        public void testMergeListsList1BigValue(){
            LinkedList list1 = new LinkedList();

            list1.append(1);
            list1.append(3);
            list1.append(2);

            LinkedList list2 = new LinkedList();
            list2.append(5);
            list2.append(9);
            //list2.insert(4);
            LinkedList.mergeLists(list1, list2);
            String toString = list1.toString();
            assertEquals("List: 1, 5, 3, 9, 2", toString);

        }

        @Test
        public void testMergeListsList1SmallValue(){
            LinkedList list1 = new LinkedList();

            list1.append(1);
            list1.append(3);
            //list1.insert(2);

            LinkedList list2 = new LinkedList();
            list2.append(5);
            list2.append(9);
            list2.append(4);
            LinkedList.mergeLists(list1, list2);
            String toString = list1.toString();
            assertEquals("List: 1, 5, 3, 9, 4", toString);

        }

    }

