package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("az")
public class class17 implements ThreadFactory {

    // $FF: synthetic field
    public final class15 this$0;

    @ObfuscatedName("az.ap")
    public final ThreadGroup field62;

    @ObfuscatedName("az.aw")
    public final AtomicInteger field61;

    public class17(class15 arg0) {
        this.this$0 = arg0;
        this.field61 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field62 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
    }

    public Thread newThread(Runnable arg0) {
        Thread var2 = new Thread(this.field62, arg0, this.this$0.field51 + "-rest-request-" + this.field61.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }
}
