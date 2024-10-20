package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("l")
public class class15 {

    @ObfuscatedName("l.i")
    public final int field66;

    @ObfuscatedName("l.w")
    public final String field63;

    @ObfuscatedName("l.s")
    public final ThreadFactory field69;

    @ObfuscatedName("l.a")
    public final ThreadPoolExecutor field65;

    public class15(String arg0, int arg1, int arg2) {
        this.field63 = arg0;
        this.field66 = arg1;
        this.field69 = new class17(this);
        this.field65 = this.method171(arg2);
    }

    @ObfuscatedName("l.i(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method171(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field66), this.field69);
    }

    @ObfuscatedName("l.w(Lx;B)Ld;")
    public class20 method179(class11 arg0) {
        if (this.field65.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field65.getCorePoolSize() + " Queue capacity " + this.field66);
            return new class20("Queue full");
        } else {
            return new class20(this.field65.submit(new class21(this, arg0)));
        }
    }

    @ObfuscatedName("l.s(B)V")
    public final void method173() {
        try {
            this.field65.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
