public class CustomArrayList {
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        elements= new Object[10];
        size = 0;
    }

    public CustomArrayList(int initialSize) {
        elements = new Object[initialSize];
        size = 0;
    }

    public void add(Object obj) {
        ensureCapacity();
        elements[size++] = obj;
    }

    public void add(int index, Object x) {
        ensureCapacity();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = x;
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isIn(Object x) {
        return find(x) != -1;
    }

    public int find(Object x) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Object x) {
        int index = find(x);
        if (index != -1) {
            // Shift elements to remove the found element
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            elements[--size] = null; // Set the last element to null
        }
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = java.util.Arrays.copyOf(elements, newCapacity);
        }
    }
}
