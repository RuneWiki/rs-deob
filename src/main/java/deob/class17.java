package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("p")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("p.f")
    public final ThreadGroup field91;

    @ObfuscatedName("p.w")
    public final AtomicInteger field87;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field87 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field91 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field91, arg0, this.this$0.field74 + "-rest-request-" + this.field87.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
