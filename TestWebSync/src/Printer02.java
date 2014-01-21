public class Printer02 {

	public synchronized static void print(String name) {

		for (int i = 0; i < 20; i++) {

			System.out.printf("%s %s\n", name, i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
