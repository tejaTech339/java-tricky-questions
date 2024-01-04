package tricky_ques;

public class Life {

	public void startLife() {
		System.out.println("plan and start a new life");
	}

	public boolean makeSuccess() {
		System.out.println("working hard for success");
		return true;
	}

	public void tryAgain() {
		System.out.println("failed to make sucess then try again and again");
	}

	public boolean death() {
		System.out.println("Asthala Vistha Baby");
		return false;
	}

	public static void main(String[] args) {

		Life myLife = new Life();

		myLife.startLife();

		if (myLife.makeSuccess()) {
			myLife.tryAgain();
		}else {
			myLife.death();
		}
	}
}
