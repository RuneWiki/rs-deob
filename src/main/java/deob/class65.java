package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("ck")
public class class65 implements ThreadFactory {

    // $FF: synthetic field
    public final client this$0;

    public class65(client arg0) {
        this.this$0 = arg0;
    }

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS Maya Anim Load");
    }
}
