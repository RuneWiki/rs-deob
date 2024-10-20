package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("a")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("a.h")
    public final ThreadGroup field93;

    @ObfuscatedName("a.e")
    public final AtomicInteger field92;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field92 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field93 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field93, arg0, this.this$0.field86 + "-rest-request-" + this.field92.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
