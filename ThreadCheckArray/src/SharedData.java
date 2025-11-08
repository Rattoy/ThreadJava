
/**
 * @author [Ester Peretz]
 */
/**
 * 
 */
public class SharedData 
{
	
	private int [] array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * 
	 * @param array hgjhgj
	 * @param b dfgdgffd
	 * 
	 * 
	 * **/
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.b = b;
	}
	/**
	 * 
	 * @return sgfdgfd
	 * 
	 * 
	 * **/

	public boolean[] getWinArray() 
	{
		return winArray;
	}
	/**
	 * 
	 * 
	 * @param winArray vjhvjhvj
	 * 
	 * **/

	public void setWinArray(boolean [] winArray) 
	{	
		System.out.println("hello");
		this.winArray = winArray;
	}

	/**
	 * @return array
	 */
	public int[] getArray() 
	{
		System.out.println("testing");
		return array;
	}
	/**
	 * 
	 * @return dgfdgfd
	 * 
	 * 
	 * **/

	public int getB() 
	{
		return b;
	}
	/**
	 * 
	 * @return fgfdgfd
	 * 
	 * 
	 * **/

	public boolean getFlag() 
	{
		return flag;
	}
	/**
	 * 
	 * @param flag    gjfgf 
	 * 
	 * 
	 * **/

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
