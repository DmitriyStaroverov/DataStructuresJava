package lesson_2;

public class OrderedArray extends ArrayImpl {

    public OrderedArray(int size) {
        super ( size );
    }

    @Override
    public void setElement(String value, int index) {
        throw new UnsupportedOperationException (  );
    }

    @Override
    public void addElement(String value) {
        int index;
        for (index = 0; index < currentSize; index++) {
            if (data[index].compareTo ( value) >= 0) break;
        }
        for (int i = currentSize; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        currentSize++;
    }

    @Override
    public int find(String value) {
        int low = 0; // нижняя граница
        int high = currentSize - 1 ; // верхняя граница диапазона
        int mid;
        while (low < high){
            mid = (low + high) / 2;
            if (data[mid].equals ( value ) ){
                return mid;
            }
            if (data[mid].compareTo(value) < 0){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return -1;

    }
}
