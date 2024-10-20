package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("n")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("n.c")
    public final ThreadGroup field94;

    @ObfuscatedName("n.l")
    public final AtomicInteger field91;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field91 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field94 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field94, arg0, this.this$0.field84 + "-rest-request-" + this.field91.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
