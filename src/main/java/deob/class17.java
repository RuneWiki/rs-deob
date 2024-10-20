package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("b")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("b.c")
    public final ThreadGroup field90;

    @ObfuscatedName("b.p")
    public final AtomicInteger field88;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field88 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field90 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field90, arg0, this.this$0.field79 + "-rest-request-" + this.field88.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
