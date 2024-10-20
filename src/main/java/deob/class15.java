package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ax")
public class class15 {

    @ObfuscatedName("ax.aq")
    public final int field72;

    @ObfuscatedName("ax.aw")
    public final String field67;

    @ObfuscatedName("ax.al")
    public final ThreadFactory field68;

    @ObfuscatedName("ax.ai")
    public final ThreadPoolExecutor field69;

    public class15(String arg0, int arg1, int arg2) {
        this.field67 = arg0;
        this.field72 = arg1;
        this.field68 = new class17(this);
        this.field69 = this.method152(arg2);
    }

    @ObfuscatedName("ax.aq(IB)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method152(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field72), this.field68);
    }

    @ObfuscatedName("ax.aw(Lak;B)Lad;")
    public class19 method153(class11 arg0) {
        if (this.field69.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field69.getCorePoolSize() + " Queue capacity " + this.field72);
            return new class19("Queue full");
        } else {
            return new class19(this.field69.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("ax.al(I)V")
    public final void method161() {
        try {
            this.field69.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
