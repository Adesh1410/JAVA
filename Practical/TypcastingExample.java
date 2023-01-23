class TypcastingExample{
	
	public static void main(String args[]){
		int x = 890;
		long z = x;
		System.out.println(x);
		System.out.println(z);
		double y = x;
		System.out.println(y);

		double a = 879776.45;
		int b = (int)a;
		System.out.println(a);
		System.out.println(b);
	}
}