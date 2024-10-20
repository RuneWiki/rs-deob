package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("ms")
public class class323 implements ThreadFactory {

    // $FF: synthetic field
    public final class321 this$0;

    public class323(class321 arg0) {
        this.this$0 = arg0;
    }

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS WAV Load");
    }
}
