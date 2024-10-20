package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("h")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("h.c")
    public final ThreadGroup field94;

    @ObfuscatedName("h.v")
    public final AtomicInteger field89;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field89 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field94 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field94, arg0, this.this$0.field78 + "-rest-request-" + this.field89.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
