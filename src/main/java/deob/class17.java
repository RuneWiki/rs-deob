package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("ag")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("ag.au")
    public final ThreadGroup field82;

    @ObfuscatedName("ag.ae")
    public final AtomicInteger field81;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field81 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field82 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field82, arg0, this.this$0.field73 + "-rest-request-" + this.field81.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
