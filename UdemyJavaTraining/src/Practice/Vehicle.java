package Practice;

public interface Vehicle {
	    // Abstract method
	    void start();

	    // Default method
	    default void stop() {
	        System.out.println("Vehicle stopped");
	    }

	    // Static method
	    static void service() {
	        System.out.println("Vehicle serviced");
	    }

	    // Constant
	    int MAX_SPEED = 120;
	}
