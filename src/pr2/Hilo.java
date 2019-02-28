package pr2;

public class Hilo implements Runnable {

	private Ball ball;
	private Board board;
	
	
	public Hilo(Ball ball, Board board) {
		
		this.ball = ball;
		this.board = board;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(!Thread.currentThread().isInterrupted()) {
				ball.move();
				board.repaint();
				Thread.sleep(10);
			}
		} catch( InterruptedException e) {
			System.err.println("El hilo se ha parado");
		}
	}

	
}
