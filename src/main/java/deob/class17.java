package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("av")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("av.am")
    public final ThreadGroup field73;

    @ObfuscatedName("av.ap")
    public final AtomicInteger field70;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field70 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field73 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field73, arg0, this.this$0.field56 + "-rest-request-" + this.field70.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
