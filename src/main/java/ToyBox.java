public class ToyBox {
	private volatile boolean userExec;
	final int WAIT_USER = 2000;

	public void answerToy() {
		try {
			while (!userExec) {
				try {
					Thread.sleep(WAIT_USER);
					System.out.println(Thread.currentThread().getName() + " выключила тумблер");
					userExec = true;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Thread.interrupted();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void userExecuteToy() {
		System.out.println(Thread.currentThread().getName() + " прожал по тумблеру");
		userExec = false;
	}
}
