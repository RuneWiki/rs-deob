package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("n")
public class class15 {

    @ObfuscatedName("n.h")
    public final int field82;

    @ObfuscatedName("n.e")
    public final String field86;

    @ObfuscatedName("n.v")
    public final ThreadFactory field83;

    @ObfuscatedName("n.x")
    public final ThreadPoolExecutor field87;

    public class15(String arg0, int arg1, int arg2) {
        this.field86 = arg0;
        this.field82 = arg1;
        this.field83 = new class17(this);
        this.field87 = this.method157(arg2);
    }

    @ObfuscatedName("n.h(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method157(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field82), this.field83);
    }

    @ObfuscatedName("n.e(Lj;B)Lt;")
    public class20 method158(class11 arg0) {
        if (this.field87.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field87.getCorePoolSize() + " Queue capacity " + this.field82);
            return new class20("Queue full");
        } else {
            return new class20(this.field87.submit(new class21(this, arg0)));
        }
    }

    @ObfuscatedName("n.v(I)V")
    public final void method162() {
        try {
            this.field87.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
