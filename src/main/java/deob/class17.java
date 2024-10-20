package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("ag")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("ag.aq")
    public final ThreadGroup field78;

    @ObfuscatedName("ag.aw")
    public final AtomicInteger field77;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field77 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field78 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field78, arg0, this.this$0.field67 + "-rest-request-" + this.field77.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
