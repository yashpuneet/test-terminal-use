
public class Hello
{
	public static void main(String[] args)
	{
		//Default is "World"
		//Author: Yash Puneet (yash.puneet02@gmail.com)
		String name = "World";

		if(args.length != 0)
		{
			name = args[0];
		}

		Greeter greeter = new Greeter(name);
		System.out.println(greeter.greet());
	}
}

