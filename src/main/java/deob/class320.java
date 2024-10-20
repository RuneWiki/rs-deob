package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("mv")
public class class320 implements ThreadFactory {

    // $FF: synthetic field
    public final class318 this$0;

    public class320(class318 arg0) {
        this.this$0 = arg0;
    }

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS WAV Load");
    }
}
