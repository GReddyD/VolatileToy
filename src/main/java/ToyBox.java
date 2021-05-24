public class ToyBox {

	Tumbler tumbler = new Tumbler(true);
	final int WAIT_USER = 2000;


	public void answerToy() {
		try {
			while (!tumbler.isStatus()) {
				try {
					Thread.sleep(WAIT_USER);
					System.out.println(Thread.currentThread().getName() + " выключила тумблер");
					tumbler.setStatus(true);
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
		while (tumbler.isStatus()) {
			System.out.println(Thread.currentThread().getName() + " прожал по тумблеру");
			tumbler.setStatus(false);
		}
	}
}
