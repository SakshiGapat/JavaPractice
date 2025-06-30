class WideningConceptEx
{
	public static void main(String args[])
	{
		byte b = 20;

		short s = b;
		int i = b;
		// char ch = b;  // CTE --> possible lossy conversion byte to char
		long l = b;
		float f = b;
		double d = b;

		System.out.println(b);            // 20 
		System.out.println(s);            // 20
		System.out.println(i);            // 20
		// System.out.println(ch);        // CTE
		System.out.println(l);            // 20
		System.out.println(f);            // 20.0
		System.out.println(d);            // 20.0
	}
}