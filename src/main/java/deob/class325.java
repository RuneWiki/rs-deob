package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("mk")
public class class325 implements ThreadFactory {

    // $FF: synthetic field
    public final class323 this$0;

    public class325(class323 arg0) {
        this.this$0 = arg0;
    }

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS WAV Load");
    }
}
