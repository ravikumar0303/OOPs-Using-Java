public class test1 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int s=0;
		for(int i=0;i<args.length;i++) {
			s+=Integer.parseInt(args[i]);
			
		}
		System.out.println("Addition:"+s);

	}

}
