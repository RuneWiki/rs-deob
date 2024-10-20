package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("cd")
public final class class74 implements ThreadFactory {

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS Maya Anim Load");
    }
}
