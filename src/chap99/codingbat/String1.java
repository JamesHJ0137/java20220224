package chap99.codingbat;

public class String1 {

	
	public String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		}
		return str.substring(0, 2);
	}

	//nTwice
	public String nTwice(String str, int n) {
		String front = str.substring(0, n);
		String end = str.substring(str.length() - n);

		return front + end;
	}
	//middleThree
	public String middleThree(String str) {
		  int middle = str.length() / 2;
		  
		  return str.substring(middle-1, middle+2);
		}
	//hasBad
	public boolean hasBad(String str) {
		  int i = str.indexOf("bad");
		  return (i == 0) || (i == 1);
		}
	//seeColor
	public String seeColor(String str) {
		 
		  if (str.indexOf("red") == 0) {
		    return "red";
		  }
		  if (str.indexOf("blue") == 0) {
		    return "blue";
		  }
		  return "";
		}
}