package view;

import java.util.LinkedList;
import java.util.Queue;

public class Fila<T> {
    private Queue<T> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    public void insert(T elemento) {
        fila.offer(elemento);
    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }
        return fila.poll();
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public int size() {
        return fila.size();
    }

    @Override
    public String toString() {
        return fila.toString();
    }

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        for (int i = 100; i < 115; i++) {
            if (fila.isEmpty()) {
                fila.insert(i + 100);
            } else {
                if (fila.size() <= 4) {
                    fila.insert(i + 50);
                } else {
                    fila.remove();
                }
            }
            System.out.println("Fila: " + fila);
        }

        System.out.println("Tamanho da fila: " + fila.size());
    }

}
