package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("x")
public class class15 {

    @ObfuscatedName("x.c")
    public final int field86;

    @ObfuscatedName("x.l")
    public final String field84;

    @ObfuscatedName("x.s")
    public final ThreadFactory field85;

    @ObfuscatedName("x.e")
    public final ThreadPoolExecutor field83;

    public class15(String arg0, int arg1, int arg2) {
        this.field84 = arg0;
        this.field86 = arg1;
        this.field85 = new class17(this);
        this.field83 = this.method163(arg2);
    }

    @ObfuscatedName("x.c(IB)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method163(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field86), this.field85);
    }

    @ObfuscatedName("x.l(Ly;I)Lj;")
    public class20 method170(class11 arg0) {
        if (this.field83.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field83.getCorePoolSize() + " Queue capacity " + this.field86);
            return new class20("Queue full");
        } else {
            return new class20(this.field83.submit(new class21(this, arg0)));
        }
    }

    @ObfuscatedName("x.s(I)V")
    public final void method165() {
        try {
            this.field83.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
