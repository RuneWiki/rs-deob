package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("aa")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("aa.ac")
    public final ThreadGroup field61;

    @ObfuscatedName("aa.ae")
    public final AtomicInteger field62;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field62 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field61 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field61, arg0, this.this$0.field57 + "-rest-request-" + this.field62.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
