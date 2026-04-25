class TablePrinter {

    synchronized void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class Thread1 extends Thread {
    TablePrinter tp;

    Thread1(TablePrinter tp) {
        this.tp = tp;
    }

    public void run() {
        tp.printTable(5);
    }
}

class Thread2 extends Thread {
    TablePrinter tp;

    Thread2(TablePrinter tp) {
        this.tp = tp;
    }

    public void run() {
        tp.printTable(7);
    }
}

public class Main {
    public static void main(String[] args) {
	System.out.println("Enrollment No. 240390107032");
        TablePrinter tp = new TablePrinter();

        Thread1 t1 = new Thread1(tp);
        Thread2 t2 = new Thread2(tp);

        t1.start();
        t2.start();
    }
}