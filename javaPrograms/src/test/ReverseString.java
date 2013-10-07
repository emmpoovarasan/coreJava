package test;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Subbiah is having 7+ years' experience in software development primarily using Java and J2EE technologies and support for implementations using AGILE methodlogy. Good exposure to web based applications coupled with extensive database implementation. Well-versed in full-lifecycle skills of Analysis, Design, Development, Testing, Debugging, Implementing and Maintenance of software projects. Skilled at handling multiple tasks, performance tuning  and projects simultaneously I have experience in Telecom and Insurance Domain.";
		String finalStr = new StringBuilder(str).reverse().toString();
		System.out.println(finalStr);
		
		String reve = null;
		for(int i = str.length()-1;i>-0;i--){
			reve += str.charAt(i);
		}
		System.out.println("New format: \n"+reve);
		
		StringBuffer br = new StringBuffer("Testing sdsd sd");
		System.out.println("String buffer reverse : "+br.reverse());
		
	}

}
