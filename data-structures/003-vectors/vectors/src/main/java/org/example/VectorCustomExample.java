package org.example;

public class VectorCustomExample {

    public static void main(String...a) throws InterruptedException {
        final VectorCustom<Integer> list = new VectorCustom<Integer>();

        //Thread-1 will add element in list.
        new Thread() {
            public void run() {
                list.add(54);
            }
        }.start();

        //Below sleep ensures Thread-2 starts after Thread-1
        Thread.sleep(10);

        //Thread-2 will get element from list.
        new Thread() {
            public void run() {
                System.out.println("element at index " + 0 + " = "
                        + list.get(0));
            }
        }.start();

    }

}
/*Output
 
element at index 0 = 54
 
*/