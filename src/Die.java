public class Die
{
private final int MAX = 6; // maximum face value
private int faceValue; // current value showing on the die
//-----------------------------------------------------------------
// Constructor: Sets the initial face value.
//-----------------------------------------------------------------
public Die()
{
faceValue = 1;
}
//-----------------------------------------------------------------
// Rolls the die and returns the result.
//-----------------------------------------------------------------
public int roll()
{
faceValue = (int)(Math.random() * MAX) + 1;
return faceValue;
}
//-----------------------------------------------------------------
// check whether the dice is rolled or not
//-----------------------------------------------------------------
public boolean chekRoll(int x){
	return true;
}
}