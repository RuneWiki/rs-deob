package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("lv")
public final class class306 implements ThreadFactory {

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS WAV Load");
    }
}
