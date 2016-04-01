package XuLiFile;

public class XuLi {

	public static void cutEvenIndex(String str){
		String s = "";
		for(int i = 0 ; i < str.length(); i++){
			if( i%2 == 0 ){
				s += str.charAt(i);
			}
		}
		System.out.println(s+"\n");
	}
	
	public static void cutSNT(String str){
		String s = "";
		for(int i = 0 ; i < str.length(); i++){
			if(checkSNT(i)) {
				s += str.charAt(i);
			}
		}
		System.out.println(s+"\n");
	}
	
	static boolean checkSNT(int num){
		if(num <2 ) return false;
		for(int i = 2 ; i <= Math.sqrt(num) ; i++){
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static void cutThreeIndex(String str){
		String s = "";
		for(int i = 0 ; i < str.length(); i++){
			if( i%3 == 0 || Integer.toString(i).contains("3")){
				s += str.charAt(i);
			}
		}
		System.out.println(s+"\n");
	}
	
}
