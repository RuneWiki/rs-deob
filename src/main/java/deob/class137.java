package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("fb")
public final class class137 implements ThreadFactory {

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS Maya Anim Load");
    }
}
