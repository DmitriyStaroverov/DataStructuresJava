package lesson_2;

public class OrderedArray extends ArrayImpl {

    public OrderedArray(int size) {
        super ( size );
    }

    @Override
    public void setElement(int value, int index) {
        throw new UnsupportedOperationException (  );
    }

    @Override
    public void addElement(int value) {
        int index = 0;
        for (index = 0; index < currentSize; index++) {
            if (data[index] >= value) break;
        }
        for (int i = currentSize; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        currentSize++;
    }


}
