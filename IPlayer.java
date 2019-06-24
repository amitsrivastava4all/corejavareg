//public abstract interface IPlayer{
public interface IPlayer {
	//int MAX_JUMP = 100;
	public static final int MAX_JUMP = 100;
	void jump();
	void run();
	//public abstract void jump();
}
interface IStarPlayer{
	public static final int MAX_JUMP = 200;
	void powerWithTime();
}
interface HybridPlayer extends IPlayer,IStarPlayer {
	
}