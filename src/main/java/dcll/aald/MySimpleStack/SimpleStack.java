package dcll.aald.MySimpleStack;

import java.util.EmptyStackException;
/**
 * Created by 20900325 on 12/03/2015.
 */
public class SimpleStack {
    public boolean isEmpty();
    public int getSize();
    public void push(Item item);
    public Item peek() throws EmptyStackException;
    public Item pop() throws EmptyStack Exception;
}
