public class Queue {

/*initialising variables that will be used later*/

private int FOQP = 0;
private int EOQP = -1;
private int Size=0;
private int length;
private char[] Items;

public Queue(int Length) {

/*this creates the empty que, asking the user to input how many positions
they want the array to have */

    this.length=Length;
    Items = new char[length];

}
    public void Enqueue ( char c){

/*sets position indicated by the end of que pointer as the users char input
then increments the end of que pointer and the size as they both increase
by 1*/

        Items[EOQP] = c;
        EOQP++;
        Size++;
    }
    public char Dequeue () {

/*creates a variable called item to store the value that's in the array at
the front of the que ie; the first value in the array, it then increments the
the front of que pointer by one making that value inaccessible, reduces size by
1 and returns the dequeued character to the user */

        char item = Items[FOQP];
        FOQP++;
        Size--;
        return item;
    }
    public boolean IsFull () {

/*if the length length of the array is the same as the end of que pointer + 1 then
return que is full, else false, we add one as the array starts at a value of 0*/

    return length==EOQP+1;
    }
    public boolean IsEmpty() {

/*if front of que pointer hasnt incremented then there cant be any values in the que
so que is empty*/

        return FOQP == -1;

    }
    public int length(){
/*returns the number of values in the que at this moment*/
return Size;
    }
}

