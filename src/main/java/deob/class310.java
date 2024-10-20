package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("lg")
public class class310 implements ThreadFactory {

    // $FF: synthetic field
    public final class308 this$0;

    public class310(class308 arg0) {
        this.this$0 = arg0;
    }

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS WAV Load");
    }
}
