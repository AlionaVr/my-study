package aliona.oldprojects;

import java.sql.SQLOutput;

public class SimpleQ {
    public static void main(String[] args) {
        int i;
        char ch;
        Queue alphabet = new Queue(40);
        Queue smallQ = new Queue(4);
        // вводит в массив алфавит//
        for (i = 0; i < 26; i++) {
            alphabet.put((char) ('A' + i));
        }
        System.out.println("содержимое очереди alphabet:");
        for (i = 0; i < 26; i++) {
            ch = alphabet.get();
            System.out.print(ch);
            if (ch == (char) 0) break;
        }
        System.out.println();

        // вводит в массив small,//
        for (i = 0; i < 5; i++) {
            System.out.print("Вводимая буква:" + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.print("Содержимое smallQ:\n");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            System.out.print(ch);
            if (ch == (char) 0) break;
        }
    }
}

class Queue {
    int putPosition, getPosition;
    char queue[];

    Queue(int size) {
        queue = new char[size];
        putPosition = getPosition = 0;
    }

    void put(char ch) {
        if (putPosition == queue.length) {
            System.out.println("-Очередь заполнена");
            return;
        }
        queue[putPosition] = ch;
        putPosition++;
    }

    char get() {
        if (getPosition == putPosition) {
            System.out.println("-Очередь пуста");
            return (char) 0;
        }
        char el = queue[getPosition];
        getPosition++;
        return el;
    }
}
