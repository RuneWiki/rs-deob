package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("ar")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("ar.at")
    public final ThreadGroup field82;

    @ObfuscatedName("ar.an")
    public final AtomicInteger field80;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field80 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field82 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field82, arg0, this.this$0.field70 + "-rest-request-" + this.field80.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
