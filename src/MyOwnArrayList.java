import java.util.Arrays;

public class MyOwnArrayList <T>{
    private final static int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyOwnArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void add(T element) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return (T) elements[index];
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(T element) {
        int index = indexOf(element);
        if (index >= 0) {
            removeAtIndex(index);
            return true;
        }
        return false;
    }

    public boolean contains(T element) {
        return indexOf(element) >= 0;
    }

    public Object[] toArray() {
//        return Arrays.copyOf(elements, size);
        @SuppressWarnings("unchecked")
        T[] array = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = (T) elements[i];
        }
        return array;
    }

    private void removeAtIndex(int index) {
        int numShift = size - index - 1;
        if (numShift > 0) {
            System.arraycopy(elements, index + 1, elements, index, numShift);
        }
        elements[size - 1] = null;
        size--;
    }

    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

}
