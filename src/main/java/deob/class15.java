package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("s")
public class class15 {

    @ObfuscatedName("s.l")
    public final int field83;

    @ObfuscatedName("s.q")
    public final String field80;

    @ObfuscatedName("s.f")
    public final ThreadFactory field85;

    @ObfuscatedName("s.j")
    public final ThreadPoolExecutor field82;

    public class15(String arg0, int arg1, int arg2) {
        this.field80 = arg0;
        this.field83 = arg1;
        this.field85 = new class17(this);
        this.field82 = this.method162(arg2);
    }

    @ObfuscatedName("s.l(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method162(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field83), this.field85);
    }

    @ObfuscatedName("s.q(Ly;I)Lz;")
    public class20 method171(class11 arg0) {
        if (this.field82.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field82.getCorePoolSize() + " Queue capacity " + this.field83);
            return new class20("Queue full");
        } else {
            return new class20(this.field82.submit(new class21(this, arg0)));
        }
    }

    @ObfuscatedName("s.f(I)V")
    public final void method165() {
        try {
            this.field82.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
