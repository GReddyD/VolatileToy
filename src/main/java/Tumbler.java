public class Tumbler {
	private volatile boolean status;

	public Tumbler(boolean status){
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
