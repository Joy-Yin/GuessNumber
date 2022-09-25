
public class Method {
	private int difference;
	
	public void getDifference(int d) {
		this.difference = d;
	}
	
	public String computeD() {
		int result = computeResult();
		if(result == -1)
			return "錯誤輸入!請檢查是否有依規則運算!";
		return Integer.toString(result);
	}
	
	private int computeResult() {
		int result = -1;
		if(isDigitsOver())
			return result;
		int sum = computeSum();
		if(sum <= 9)
			result = 9 - sum;
		else if(sum <= 18)
			result = 18 - sum;
		else if(sum <= 27)
			result = 27 - sum;
		else if(sum <= 36)
			result = 36 - sum;
		else
			result = 45 - sum;
		if(result == 0)
			result = 9;
		return result;
	}
	
	private int computeSum() {
		int sum = 0;
		String num = Integer.toString(difference);
		for(int i = 0; i < num.length(); i++)
			sum += num.charAt(i) - 48;
		return sum;
	}
	
	private boolean isDigitsOver() {
		String num = Integer.toString(difference);
		if(num.length() >= 9)
			return true;
		return false;
	}

}
