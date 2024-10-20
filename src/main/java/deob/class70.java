package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("cx")
public final class class70 implements ThreadFactory {

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS Maya Anim Load");
    }
}
