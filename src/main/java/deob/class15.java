package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("g")
public class class15 {

    @ObfuscatedName("g.c")
    public final int field81;

    @ObfuscatedName("g.b")
    public final String field80;

    @ObfuscatedName("g.p")
    public final ThreadFactory field82;

    @ObfuscatedName("g.m")
    public final ThreadPoolExecutor field83;

    public class15(String arg0, int arg1, int arg2) {
        this.field80 = arg0;
        this.field81 = arg1;
        this.field82 = new class17(this);
        this.field83 = this.method195(arg2);
    }

    @ObfuscatedName("g.c(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method195(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field81), this.field82);
    }

    @ObfuscatedName("g.b(Lo;I)Lf;")
    public class20 method205(class11 arg0) {
        if (this.field83.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field83.getCorePoolSize() + " Queue capacity " + this.field81);
            return new class20("Queue full");
        } else {
            return new class20(this.field83.submit(new class21(this, arg0)));
        }
    }

    @ObfuscatedName("g.p(I)V")
    public final void method198() {
        try {
            this.field83.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
