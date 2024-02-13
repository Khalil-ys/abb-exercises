package abb.exercises.exercise6;


public class CustomStorage<T> {

    private Object[] items;
    private int nextId;
    private static final int INITIAL_CAPACITY = 10;
    private int size;

    public CustomStorage() {
        items = new Object[INITIAL_CAPACITY];
        nextId = 1;
        size = 0;
    }

    public void addItem(T item) {
        ensureCapacity();
        items[size++] = item;
        nextId++;
    }

    public void removeItem(T item) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                size--;
                return;
            }
        }
    }

    public T searchItem(int id) {
        for (int i = 0; i < size; i++) {
            if (items[i] instanceof HasId && ((HasId) items[i]).getId() == id) {
                return (T) items[i];
            }
        }
        return null;
    }

    public void displayAllItems() {
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }

    private void ensureCapacity() {
        if (size == items.length) {
            Object[] newArray = new Object[items.length * 2];
            System.arraycopy(items, 0, newArray, 0, items.length);
            items = newArray;
        }
    }

}
