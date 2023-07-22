public class Queue {
    char queue[];
    int positionToPut, positionToGet;

    Queue(int size) {
        queue = new char[size];
        positionToPut = positionToGet = 0;
    }

    // Помещение символа в очередь
    void put(char ch) {
        if (positionToPut == queue.length) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        queue[positionToPut] = ch;
        positionToPut = positionToPut + 1;
    }

    // Извлечение символа из очереди
    char get() {
        if (positionToGet == positionToPut) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        char el = queue[positionToGet];
        ++positionToGet;
        return el;

    }
}

class SimpleQ {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        // Помещение и Извлечение буквенных символов в очередь bigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));
        System.out.print("Содержимое очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println();

// Использование очереди smallQ для генерации ошибок
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        System.out.print("Содержимое очереди smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}