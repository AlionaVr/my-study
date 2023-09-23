class Stack {
    private char stck[];
    private int top;

    // Создать пустой стек заданного размера
    Stack(int size) {
        stck = new char[size];
        top = 0;
    }
// Создать один стек на основе другого стека
    Stack(Stack ob) {
        top = ob.top;
        stck = new char[ob.stck.length];
        for (int i = 0; i < top; i++)
            stck[i] = ob.stck[i];
    }
// Создать стек с начальными значениями
    Stack( char a []) {
        stck = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }
// Поместить символ в стек
        void push ( char ch) {
            if (top == stck.length) {
                System.out.println(" -- Стек заполнен");
                return;
            }
            stck[top] = ch;
            top++;
            }
// Извлечь символ из стека
        char pop () {
            if (top == 0) {
                System.out.println(" - Стек пуст");
                return (char) 0;
            }
            top--;
            return stck[top];
        }
}
// Демонстрация использования класса Stack
class SDemo {
    public static void main(String args[]) {
        Stack stk1 = new Stack(10);

        char name[] = {'T', 'o', 'm'};
        Stack stk2 = new Stack(name);
        char ch;
        int i;
        for (i = 0; i < 10; i++)
            stk1.push((char) ('A' + i));

        Stack stk3 = new Stack(stk1);

        System.out.print("Содержимое stk1: ");
        for (i = 0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
                    }
                    System.out.println("\n");

                    System.out.print("Содержимое stk2: ");
                    for (i = 0; i < 3; i++) {
                        ch = stk2.pop();
                        System.out.print(ch);
                    }
                    System.out.println("\n");

                    System.out.print("Содержимое stk3: ");
                    for (i = 0; i < 10; i++) {
                        ch = stk3.pop();
                        System.out.print(ch);
                    }
                }
            }


