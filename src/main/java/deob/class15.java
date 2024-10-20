package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ax")
public class class15 {

    @ObfuscatedName("ax.aq")
    public final int field66;

    @ObfuscatedName("ax.ad")
    public final String field65;

    @ObfuscatedName("ax.ag")
    public final ThreadFactory field67;

    @ObfuscatedName("ax.ak")
    public final ThreadPoolExecutor field64;

    public class15(String arg0, int arg1, int arg2) {
        this.field65 = arg0;
        this.field66 = arg1;
        this.field67 = new class17(this);
        this.field64 = this.method160(arg2);
    }

    @ObfuscatedName("ax.aq(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method160(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field66), this.field67);
    }

    @ObfuscatedName("ax.ad(Lae;I)Lao;")
    public class19 method167(class11 arg0) {
        if (this.field64.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field64.getCorePoolSize() + " Queue capacity " + this.field66);
            return new class19("Queue full");
        } else {
            return new class19(this.field64.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("ax.ag(I)V")
    public final void method162() {
        try {
            this.field64.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
