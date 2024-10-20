package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("au")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("au.az")
    public final ThreadGroup field74;

    @ObfuscatedName("au.ah")
    public final AtomicInteger field70;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field70 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field74 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field74, arg0, this.this$0.field63 + "-rest-request-" + this.field70.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
