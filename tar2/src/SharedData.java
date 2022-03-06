public class SharedData 
{
	private int [] arraylist;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(int[] array, int b) {
		
		this.arraylist = array;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public int[] getArray() 
	{
		return arraylist;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
