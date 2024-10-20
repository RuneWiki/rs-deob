package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("mw")
public class class334 implements ThreadFactory {

    // $FF: synthetic field
    public final class332 this$0;

    public class334(class332 arg0) {
        this.this$0 = arg0;
    }

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS WAV Load");
    }
}
