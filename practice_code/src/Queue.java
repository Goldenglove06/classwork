public class Queue {
    int FOQP = 0;
    int EOQP = -1;
    int Size;
    char[] Items = new char[Size];

    public Queue {
        int FOQP = 0;
        int EOQP = -1;
        int Size;
        char[] Items = new char[Size];
        public void Enqueue ( char c){
            Items[EOQP] = c;
            EOQP++;
            Size++;
        }
        public char Dequeue () {
            char item = Items[FOQP];
            FOQP++;
            Size--;
            return item;
        }
        public boolean IsFull () {
            if ()
        }
        public boolean IsEmpty () {
            if (FOQP == -1) {
                return true;
            } else {
                return false;
            }
        }
    }
}

