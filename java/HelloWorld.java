/**
 * The very first program written in a given language is generally 'Hello World.'
 * This program is very simple. It will print the words 'Hello World' to the console.
 * 
 * Understanding the syntax of the comments:
 * 		Each comment block starts with a '/**'
 * 		In this comment block, the first line I will highlight with single quotes
 * 		to inform you which line I am referring to.
 */

/** 'public class HelloWorld {'
 * 		This line is the class declaration. A class is like a template for creating objects.
 * 		Like a mold for cake. The 'public' part says that this class can be observed and used from anywhere.
 * 		The 'class' part indicates that this is a class.
 * 		Also, the name 'HelloWorld' indicates that we are naming our class HelloWorld.
 * 		It is not important what we name our class right now, so long as we follow the appropriate conventions. 
 * 		Finally, the '{' is an open bracket. This allows us to pair it with a closing bracket '}' later and create
 * 		a 'code block.'
 * 		Since everything inside the class is related to the HelloWorld class, it must be inside that classes brackets.
 */
public class HelloWorld {
	
	/** 'public static void main(String args[]) {'
	 * 
	 * 		This is a method. In other languages, it is also known as a subroutine or function.
	 * 		Methods contain coded instructions that are all executed when the method is called.
	 * 
	 * 		We already know what 'public' modifier does.
	 * 		The 'static' modifier is a bit more complicated and we will explain more about it later.
	 * 		For now, think of the static modifier as telling the program we can run that method without an instantiation of a class object.
	 * 		To use an analogy from before, we don't need this cake produced from this mold to run this method. We can run the method from the mold itself.
	 * 		The 'void' modifier means that this 'method' does not return a value. It returns nothing.
	 * 		'Main' is the name of this method.
	 * 		The parentheses following the name of the method contain the 'arguments' passed to the method.
	 * 		The first and only argument passed to this method, is an array of String objects with the variable name 'args.'
	 * 		A few things to note. First, 'String' is capitalized because it is the name of a class, just like 'HelloWorld' is the name of our class.
	 * 		The '[]' following the variable name, indicates that the argument passed in is an array.
	 * 		The 'type' of the array being passed in is of type 'String.'
	 * 		What's a String?
	 * 		Without getting too technical right away, a string is a set of characters. So, a string could be "hello", "1234567", or "this is a string".
	 * 		Each letter/number/value in the string is called a 'character'.
	 * 
	 * 		Recap: This is a method header that is public, can be called without an object of type 'HelloWorld', doesn't return a value,
	 * 			and takes a single argument which is an array of strings(like an array of sentences/words/phrases).
	 */
	public static void main(String args[]) {
		
		/** 'System.out.println("Hello World");'
		 * 
		 *		This is an example of an instruction.
		 *
		 *		'System' is a class. How do I know? I know because it's capitalized! This won't always be the case, as not everyone adheres to the conventions.
		 *		However, if you use good coding practices and follow standards/conventions for the language, it makes it much easier to look at code
		 *		and know what it is doing.
		 *		The '.' following the System is an access 'operator' that allows us to access System's 'out' member. A member can be a class variable or method.
		 *		The 'out' following the decimal is a member of System.
		 *		The next '.' allows us to access a method called 'println()' of the 'out' object.
		 *		This kind of chaining is normal in Object Oriented Programming (OOP). Example : Class.member.member.method
		 *		Finally, we see that "Hello World" is being passed as an argument to the println() method.
		 *		The last character is a semicolon. This tells the compiler that it is the end of this instruction.
		 *		If you guessed that "Hello World" was a string you would be right! But why doesn't it look similar to the String array argument above?
		 *		That is because this string is an example of a 'literal'. Literals are just that, and do not take the form of a variable or object instantiation.
		 *		Another example of a literal would be '123' for an integer instead of 'int myInteger = 123;'.
		 *
		 *		Recap: This is a single instruction that will print the string "Hello World" to the console followed by a 'newline' character and return.
		 */
		System.out.println("Hello World");
	}

}

/**
 * Congrats! You made it through all that reading! 
 * You have finished the initial tutorial and are ready to move onto the first tutorial denoted with the appended number '001'.
 */
