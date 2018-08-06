package captchatest;
import java.util.Random;
public class Captcha {
	public static void main(String ar[]) {
		callCap();
	}
	public static void callCap()
	{
		System.out.println(createCap());
	}
	public static String createCap(){
		Random ran=new Random();
		StringBuffer cap=new StringBuffer();
		int i=7+(Math.abs(ran.nextInt()%3));
		for(int j=0;j<i;j++)
		{
			int bcn=Math.abs(ran.nextInt())%62;
			int cn=0;
			if(bcn<26)
			{
				cn=65+bcn;
			}
			else if(bcn<52)
			{
				cn=97+(bcn-26);
			}
			else
			{
				cn=48+(bcn-52);
			}
			cap.append((char)cn);
		}
		
		return cap.toString();
	}
}
