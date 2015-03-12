package dcll.aald.MySimpleStack;

import java.util.Objects;

/**
 * Created by 20900325 on 12/03/2015.
 */
public class Item {
    private Object value;

    Item(Object value) {
        setValue(value);
    }

    public Object getvalue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
