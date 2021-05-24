public class Main {
	public static void main(String[] args) throws InterruptedException {
		final int ITERATION_GAME = 5;

		ToyBox toyBox = new ToyBox();

		Runnable executeToy = toyBox::userExecuteToy;
		Runnable answerToy = toyBox::answerToy;

		int i = 0;
		while (i < ITERATION_GAME) {
			Thread th1 = new Thread(null, executeToy, "Пользователь");
			Thread th2 = new Thread(null, answerToy, "Игрушка");

			th1.start();
			th2.start();

			th2.join();
			th1.join();
			i++;
		}
	}
}
