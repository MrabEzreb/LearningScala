import java.io.IOException;
import java.io.InputStreamReader;


public class SysInReader {

	public String readLine() throws IOException, InterruptedException {
		InputStreamReader isr = new InputStreamReader(System.in);
		while (isr.ready() == false) {
			Thread.sleep(100);
		}
		char[] fullMessage = new char[0];
		char[] currentChar = new char[1];
		while(isr.ready()) {
			int num = isr.read(currentChar);
			if(num != -1) {
				char[] fullMessage2 = new char[fullMessage.length + 1];
				System.arraycopy(fullMessage, 0, fullMessage2, 0,
						fullMessage.length);
				fullMessage2[fullMessage.length] = currentChar[0];
				fullMessage = fullMessage2;
				currentChar = new char[1];
			}
		}
//		if(fullMessage[fullMessage.length-1] == "\n") {
//			char[] fullMessage2 = new char[fullMessage.length-1];
//			System.arraycopy(fullMessage, 0, fullMessage2, 0, fullMessage2.length);
//			fullMessage = fullMessage2;
//		}
		return new String(fullMessage).substring(0, new String(fullMessage).indexOf("\n")-1);
	}
}
