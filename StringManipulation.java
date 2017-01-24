public class StringManipulation{
	int counter;
	
	StringManipulation(int counter){
		this.counter = counter;
	}
	public String speech(){
		String begin = "Man: When I was a young man I worked my way from nothing!\n";
		String middle = "Then I created my finest work, a energy solution.\n";
		String end = "It was stolen from me and now I'm left with nothing.";
		String finalSpeech = begin + middle + end;
		//System.out.println(counter);
		return finalSpeech;
			
	}
	public String exclamation(){
		String mad = "Man: I will not stand her and be insulted.";
		mad = mad.toUpperCase();
		return mad;
	}
	public String openingStatement(){
		String sassy = "Woman: You never created that, you are hopeless.";
		return sassy;
	}
	public String curtResponse(){
		String leaving = "Woman: You don't have to stand her I was just leaving.";
		//System.out.println(counter);
		return leaving;
	}
	public String finalComment(){
		String opening = "Man: ";
		String crying = "Fine! (crying in the background)";
		int x = crying.indexOf(' ');
		String words = crying.substring(0,x);
		return opening + words;
	}
}