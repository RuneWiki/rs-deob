package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("fs")
public final class class140 implements ThreadFactory {

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS Maya Anim Load");
    }
}
