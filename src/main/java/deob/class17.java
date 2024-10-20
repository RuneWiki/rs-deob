package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("ay")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("ay.ak")
    public final ThreadGroup field80;

    @ObfuscatedName("ay.al")
    public final AtomicInteger field79;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field79 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field80 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field80, arg0, this.this$0.field69 + "-rest-request-" + this.field79.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
