package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("n")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("n.i")
    public final ThreadGroup field75;

    @ObfuscatedName("n.w")
    public final AtomicInteger field76;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field76 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field75 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field75, arg0, this.this$0.field63 + "-rest-request-" + this.field76.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
