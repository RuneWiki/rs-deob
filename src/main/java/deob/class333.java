package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("ma")
public class class333 implements ThreadFactory {

    // $FF: synthetic field
    public final class331 this$0;

    public class333(class331 arg0) {
        this.this$0 = arg0;
    }

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS WAV Load");
    }
}
