class Narrowing
{
	public static void main(String[]args)
	{
		double d = 20.5;

		float f = (float) d;
		long l = (long) d;
		int i = (int) d;
		char ch = (char) d;
		short s = (short) d;
		byte b = (byte) d;
		
		System.out.println (d);            // 20.5
		System.out.println (f);            // 20.5
		System.out.println (l);            // 20
		System.out.println (i);            // 20
		System.out.println (ch);           // empty space
		System.out.println (s);            // 20
		System.out.println (b);            // 20 
	}
}