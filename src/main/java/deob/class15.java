package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("d")
public class class15 {

    @ObfuscatedName("d.v")
    public final int field74;

    @ObfuscatedName("d.c")
    public final String field70;

    @ObfuscatedName("d.i")
    public final ThreadFactory field76;

    @ObfuscatedName("d.f")
    public final ThreadPoolExecutor field72;

    public class15(String arg0, int arg1, int arg2) {
        this.field70 = arg0;
        this.field74 = arg1;
        this.field76 = new class17(this);
        this.field72 = this.method160(arg2);
    }

    @ObfuscatedName("d.v(IB)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method160(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field74), this.field76);
    }

    @ObfuscatedName("d.c(Lr;B)Lx;")
    public class20 method161(class11 arg0) {
        if (this.field72.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field72.getCorePoolSize() + " Queue capacity " + this.field74);
            return new class20("Queue full");
        } else {
            return new class20(this.field72.submit(new class21(this, arg0)));
        }
    }

    @ObfuscatedName("d.i(B)V")
    public final void method162() {
        try {
            this.field72.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
