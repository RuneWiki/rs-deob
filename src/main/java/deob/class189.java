package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("ha")
public final class class189 implements ThreadFactory {

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS Maya Anim Load");
    }
}
