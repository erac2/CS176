
public class Quiz implements Measurable{

	private int score;
	
	public Quiz(int score)
	{
		this.score = score;
	}

	@Override
	public double getMeasure() 
	{
		return score;
	}
	
	
	
	
}

