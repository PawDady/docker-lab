package pl.epoint.dockerlab.signals;

import sun.misc.Signal;

/**
 * Example of signal handling.
 *
 * @author Kamil Murawski
 */
public class SignalHandlingApplication {

    public static void main(String[] args) {
        Signal.handle(new Signal("INT"), sig -> {
            System.out.println(
                    "\nApplication was interrupted!");
        });
        for(int i=0; i<100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.print('.');
        }
    }
}
