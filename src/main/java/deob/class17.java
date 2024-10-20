package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("d")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("d.n")
    public final ThreadGroup field87;

    @ObfuscatedName("d.c")
    public final AtomicInteger field82;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field82 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field87 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field87, arg0, this.this$0.field68 + "-rest-request-" + this.field82.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
