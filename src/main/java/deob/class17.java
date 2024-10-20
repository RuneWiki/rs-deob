package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("aj")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("aj.at")
    public final ThreadGroup field71;

    @ObfuscatedName("aj.ah")
    public final AtomicInteger field73;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field73 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field71 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field71, arg0, this.this$0.field64 + "-rest-request-" + this.field73.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
