package edu.nyu.cs9053.homework7;
import java.util.concurrent.atomic.AtomicReference;

public class Repository<T> {

    private final AtomicReference<T[]> repositoryItem;
    private final ArrayCreator<T> arrayCreator;

    public Repository (ArrayCreator<T> arrayCreator) {
        this.repositoryItem = new AtomicReference<T[]>(arrayCreator.create(0));
        this.arrayCreator = arrayCreator;
    }

    public T get(int index) {
        if (index >= repositoryItem.get().length || index < 0) {
            return null;
        }
        return repositoryItem.get()[index];
    }

    // find a certain item, if exists return index, otherwise -1
    public int find(T item) {
        if (item == null) {
            return -1;
        }

        for (int i=0; i<repositoryItem.get().length; i++) {
            if (item.equals(repositoryItem.get()[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(T item) {
        int index = find(item);
        if (index == -1) {
            return false;
        }

        T[] list = arrayCreator.create(repositoryItem.get().length-1);
        for (int i=0; i<index; i++) {
            list[i] = repositoryItem.get()[i];
        }
        for (int i=index+1; i<repositoryItem.get().length; i++) {
            list[i-1] = repositoryItem.get()[i];
        }
        repositoryItem.set(list);
        return true;
    }

    public boolean add(T item) {
        int index = find(item);
        if (index != -1) {
            return false;
        }



        T[] list = arrayCreator.create(repositoryItem.get().length+1);
        for (int i=0; i<repositoryItem.get().length; i++) {
            list[i] = repositoryItem.get()[i];
        }
        list[repositoryItem.get().length] = item;
        repositoryItem.set(list);
        return true;
    }

    public boolean contains(T item) {
        int index = find(item);
        return (index != -1);
    }

    public int size() {
        return repositoryItem.get().length;
    }
}
