# InterviewPractice




# Need to sort
https://coderbyte.com/algorithm/find-all-string-combinations-consisting-zero-one-wildcard
import java.util.ArrayList;


public class WildString {

	public static void main(String[] args){
		
		System.out.println(wildString("011?0", new ArrayList<String>()));
		System.out.println(wildString("10??", new ArrayList<String>()));
	}
	
	public static ArrayList<String> wildString(String str, ArrayList<String> arr){
		
		if(arr.size() == 0){
			arr.add("");
		}
		
		if(str.length() > 0 ){
			char c = str.charAt(0);
			String set = "";
			if(c == '?'){
				ArrayList<String> temp = new ArrayList<String>();
				for(int i = 0; i < arr.size(); i++){
					temp.add(arr.get(i) + '1');
					arr.set(i, arr.get(i) + '0');
				}
				arr.addAll(temp);
			} else {
				for(int i = 0; i < arr.size(); i++){
					arr.set(i, arr.get(i) + c);
				}
			}
			
			return wildString(str.substring(1), arr);
		} else {
			return arr;
		}
		
	}
}
