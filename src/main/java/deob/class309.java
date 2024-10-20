package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("lh")
public class class309 implements ThreadFactory {

    // $FF: synthetic field
    public final class307 this$0;

    public class309(class307 arg0) {
        this.this$0 = arg0;
    }

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS WAV Load");
    }
}
