package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("gs")
public final class class170 implements ThreadFactory {

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS Maya Anim Load");
    }
}
