public class Stack {
    //will need, push(), pull(), pop(), full(), empty()
    private Integer[] stack;
    private int EOSP=-1;
    private int length;

    public Stack(int length) {
        this.length = length;
        stack = new Integer[length];
    }
    public void push(int newVal) {
        if (!isFull()) {
            stack[EOSP] = newVal;
            EOSP++;
        }
        System.out.println("Stack is full");
    }
    public Integer peek() {
        if (!isEmpty()) {
            return stack[EOSP];
        }
        System.out.println("Stack is empty");
        return null;
    }
    public Integer pop() {
        if (!isEmpty()) {
            int topVal = peek();
            stack[EOSP] = null;
            EOSP--;
            return topVal;
        }
        System.out.println("Stack is empty");
        return null;
    }
    public boolean isFull() {
        return EOSP == length-1;
    }
    public boolean isEmpty() {
        return EOSP == -1;
    }
    public void clear(){
        for(int i=0;i<=EOSP;i++){
            stack[i]=null;
        }
        EOSP=-1;
    }
}
