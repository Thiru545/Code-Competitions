
import java.util.Scanner;

public class VirusTest {

static String bloodTest(String s,String v) {	
		int flag=0;
		int x=0;
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = x; j < v.length(); j++) {
				if((s.charAt(i)==v.charAt(j))&&(locate!=1)) {
					flag=1;
					x=j;
					count++;
				}
			}
			flag=0;
		}
		if(count==s.length()) {
			return "POSITIVE";
		}else {
			return "NEGATIVE";
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String virus="coronavirus";
		String[] str=new String[n];
		for(int i=0; i<n; i++) {
			str[i]=sc.next();
		}
		for (int j = 0; j < n; j++) {
			System.out.println(bloodTest(str[j], virus));
		}
		sc.close();
	}

}
