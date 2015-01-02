//Hi this is a comment

public class PongBoard {
    private GameUnit myBall;
    private GameUnit myLPaddle;
    private GameUnit myRPaddle;

    public PongBoard(GameUnit ball, GameUnit lPaddle, GameUnit rPaddle) {
	myBall = ball;
	myLPaddle = lPaddle;
	myRPaddle = rPaddle;
    }

    public class GameUnit {
	int mySize;
	int myXPos;
	int myYPos;
	int  myXVel;
	int  myYVel;
	
	public GameUnit(int size, int xPos, int yPos, int xVel, int yVel) {
	    mySize = size;
	    myXPos = xPos;
	    myYPos = yPos;
	    myXVel = xVel;
	    myYVel = yVel;
	}

	public void updatePosition() {
	    myXPos += myXVel;
	    myYPos += myYVel;
	}

	public void updateVelocity(int newX, int newY) {
	    myXVel = newX;
	    myYVel = newY;
	}
    }   
}