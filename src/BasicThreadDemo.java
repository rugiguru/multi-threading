public class BasicThreadDemo {

    public static void main(String[] args){


        System.out.println("main thread");
        Thread1 obj1 = new Thread1();

        Thread t1 = new Thread(obj1);
        t1.start();


    }
    
}


class Thread1 implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(" i -> " + i);
        }

    }
}
