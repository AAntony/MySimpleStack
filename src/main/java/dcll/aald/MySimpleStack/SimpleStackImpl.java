package dcll.aald.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Objects;

/**
 * Created by 20900325 on 12/03/2015.
 */
public class SimpleStackImpl implements SimpleStack {
    Stack<Object> wrappedStack = new Stack<Object>();

    public boolean isEmpty(){
        return wrappedStack.isEmpty();
    }

    public int getSize() {
        return wrappedStack.size();
    }

    public void push(Item item) {
        wrappedStack.push(item);
    }

    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }
}
