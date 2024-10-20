package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("t")
public class class15 {

    @ObfuscatedName("t.f")
    public final int field83;

    @ObfuscatedName("t.w")
    public final String field74;

    @ObfuscatedName("t.v")
    public final ThreadFactory field75;

    @ObfuscatedName("t.s")
    public final ThreadPoolExecutor field77;

    public class15(String arg0, int arg1, int arg2) {
        this.field74 = arg0;
        this.field83 = arg1;
        this.field75 = new class17(this);
        this.field77 = this.method174(arg2);
    }

    @ObfuscatedName("t.f(IB)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method174(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field83), this.field75);
    }

    @ObfuscatedName("t.w(Lc;B)Lu;")
    public class19 method180(class11 arg0) {
        if (this.field77.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field77.getCorePoolSize() + " Queue capacity " + this.field83);
            return new class19("Queue full");
        } else {
            return new class19(this.field77.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("t.v(I)V")
    public final void method176() {
        try {
            this.field77.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
