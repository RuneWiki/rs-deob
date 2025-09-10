package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("nu")
public class class343 implements ThreadFactory {

	// $FF: synthetic field
	public final class341 this$0;

	public class343(class341 arg0) {
		this.this$0 = arg0;
	}

	public Thread newThread(Runnable arg0) {
		return new Thread(arg0, "OSRS WAV Load");
	}
}
