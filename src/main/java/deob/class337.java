package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("mk")
public class class337 implements ThreadFactory {

    // $FF: synthetic field
    public final class335 this$0;

    public class337(class335 arg0) {
        this.this$0 = arg0;
    }

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS WAV Load");
    }
}
