package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("s")
public class class15 {

    @ObfuscatedName("s.n")
    public final int field72;

    @ObfuscatedName("s.c")
    public final String field68;

    @ObfuscatedName("s.m")
    public final ThreadFactory field69;

    @ObfuscatedName("s.k")
    public final ThreadPoolExecutor field71;

    public class15(String arg0, int arg1, int arg2) {
        this.field68 = arg0;
        this.field72 = arg1;
        this.field69 = new class17(this);
        this.field71 = this.method177(arg2);
    }

    @ObfuscatedName("s.n(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method177(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field72), this.field69);
    }

    @ObfuscatedName("s.c(Ll;I)Lx;")
    public class20 method181(class11 arg0) {
        if (this.field71.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field71.getCorePoolSize() + " Queue capacity " + this.field72);
            return new class20("Queue full");
        } else {
            return new class20(this.field71.submit(new class21(this, arg0)));
        }
    }

    @ObfuscatedName("s.m(I)V")
    public final void method186() {
        try {
            this.field71.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
