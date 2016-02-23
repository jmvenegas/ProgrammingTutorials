/*
 * Java Native Access Tutorial / Example
 * 
 * Justin.Venegas@gmail.com
 */

// Need to download JNA java library and include it in your project/path
import com.sun.jna.Library;
import com.sun.jna.Native;

public class NativeAccessTutorial {
	
	// Interface to native library
	public interface CLibrary extends Library {
		
		// Native library is mapped to INSTANCE
		CLibrary INSTANCE = (CLibrary)
				Native.loadLibrary("c", CLibrary.class);
		
		// Functions that you want to use from native library
		//		must have a signature that matches the native signature to work properly
		void printf(String format, Object...args);
	}
	
	public static void main(String[] args) {
		CLibrary.INSTANCE.printf("%s World\n", "Hello");
	}

}
