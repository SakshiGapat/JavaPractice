class Increment1
{
	public static void main (String[]args)
{
	int a = 100,b = 87,c = 1;
	a = b + c-- + a++ - --b + ++c;
	b = a + b - --a + ++b - --a;
	c = a + b + c++;

	System.out.println(a); 
	System.out.println(b);
	System.out.println(c);
}
}

			