package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface
{
	//my private variable name mycustomstring
	private String mycustomstring;


	@Override
	// The getter function
	public String getString()
	{
		//return null if the string is empty otherwise return mycustomstring
		if (mycustomstring == null)
		{
			return null;
		} else
		{
			return mycustomstring;
		}
	}


	@Override
	//my set function
	public void setString(String string)
	{
		this.mycustomstring = string;
	}
    // my count function
	public int countNumbers()
	{
		//initialize the number of count  to zero
		int numCount = 0;
		// two boolean statements
		boolean currentDigit = false;
		boolean previousDigit = false;
		// set the first number to zero,check the condition and then update the value of initial expression
		for (int i = 0; i < this.mycustomstring.length(); i++)
		{
			// set the built isdigit to know the specified character to digit
			currentDigit = Character.isDigit(this.mycustomstring.charAt(i));
			if (currentDigit == true)
			{
				if (previousDigit == false)
				{
					numCount++;
				}
				previousDigit = true;
			} else
			{
				previousDigit = false;
			}
		}
		return numCount;
	}

	@Override
	// my get all the N characters function
	public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd)
	{
		// if the string is null or less than n return null
		if (this.mycustomstring.equals(null) || mycustomstring.length() < n)
		{
			return "";
		}
		// throw exception if string is equal to null
		if (this.mycustomstring == null )
		{
			throw new NullPointerException();
		}
		// throw below exception if the n is less than 1
		if (n<1)
		{
			throw new IllegalArgumentException();
		}
		// declare and initialize the variable returnString
		String returnString = "";
		// declare and initialize the variables tempString and tempString2
		String tempString = "";
		String tempString2 = "";
		//create char tempChar
		char tempChar;
		//if start from end is true we reverse order to make it easier
		if (startFromEnd == true)
		{
			for (int i = 0; i < this.mycustomstring.length(); i++)
			{
				tempChar = this.mycustomstring.charAt(i);
				tempString = tempChar + tempString;
			}
			this.mycustomstring = tempString;
		}
		//get the nth char and created a new string
		int x = n;
		for(int i = 1;i<=this.mycustomstring.length()/x;i++){
			returnString = returnString + mycustomstring.charAt(n-1);
			n=n+x;

		}
		//reverse the order back to keep characters in the same position they started in
		if (startFromEnd == true)
		{
			for (int i = 0; i < returnString.length(); i++)
			{
				tempChar = returnString.charAt(i);
				tempString2 = tempChar + tempString2;
			}
			returnString = tempString2;

		}

		return returnString;
	}
 	@Override
	// my convert the Digit number of string function
	public void convertDigitsToNamesInSubstring(int startPosition, int endPosition)
	{
		 // check the condition if the start position > then  do the following
		if (endPosition < startPosition) {
			throw new IllegalArgumentException();
		}
		// check the condition if the end position is >  then do the following
		if(endPosition>mycustomstring.length()){
			throw new MyIndexOutOfBoundsException();
		}
		// declare and initialize the variable retString
		String retString = "";
		char Eachnum;
		// set the first number to zero,check the condition and then update the value of initial expression
		for (int i = 0; i <= mycustomstring.length()-1; i++)
		{
			// set the Eachnum to w the specified character
			Eachnum = mycustomstring.charAt(i);
			// check the following condition to convert the digits to corresponding english names
			if(i+1>=startPosition && i+1<= endPosition)
			{
				if (Eachnum == '0')
				{
					retString = retString + "Zero";
				}
				else if (Eachnum == '1')
				{
				retString = retString + "One";
				}
				else if (Eachnum == '2')
				{
					retString = retString + "Two";
				}
				else if (Eachnum == '3')
				{
					retString = retString + "Three";
				}
				else if (Eachnum == '4')
				{
					retString = retString + "Four";
				}
				else if (Eachnum == '5')
				{
					retString = retString + "Five";
				}
				else if (Eachnum == '6')
				{
					retString = retString + "Six";
				}
				else if (Eachnum == '7')
				{
					retString = retString + "Seven";
				}
				else if (Eachnum == '8')
				{
					retString = retString + "Eight";
				}
				else if (Eachnum == '9')
				{
					retString = retString + "Nine";
				}
				else
				{
					retString = retString + Eachnum;
				}
			}else{
				retString = retString + Eachnum;
			}
		}
		mycustomstring = retString;


	}
}

