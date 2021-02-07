
public class Hello
{
	public static void main(String[] args)
	{
		//Default is "World"
		//Author: Yash Puneet (yash.puneet02@gmail.com)
		String name = "World";

		if(argv.length != 0)
		{
			name = argv[0];
		}

		System.out.println("Hello, " + name + "!");
	}
}

