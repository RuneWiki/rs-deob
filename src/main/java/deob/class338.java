package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("mt")
public class class338 implements ThreadFactory {

    // $FF: synthetic field
    public final class336 this$0;

    public class338(class336 arg0) {
        this.this$0 = arg0;
    }

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS WAV Load");
    }
}
