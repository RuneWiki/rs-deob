package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ac")
public class class15 {

    @ObfuscatedName("ac.at")
    public final int field73;

    @ObfuscatedName("ac.an")
    public final String field70;

    @ObfuscatedName("ac.av")
    public final ThreadFactory field72;

    @ObfuscatedName("ac.as")
    public final ThreadPoolExecutor field71;

    public class15(String arg0, int arg1, int arg2) {
        this.field70 = arg0;
        this.field73 = arg1;
        this.field72 = new class17(this);
        this.field71 = this.method165(arg2);
    }

    @ObfuscatedName("ac.at(IB)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method165(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field73), this.field72);
    }

    @ObfuscatedName("ac.an(Lao;S)Laz;")
    public class19 method166(class11 arg0) {
        if (this.field71.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field71.getCorePoolSize() + " Queue capacity " + this.field73);
            return new class19("Queue full");
        } else {
            return new class19(this.field71.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("ac.av(I)V")
    public final void method167() {
        try {
            this.field71.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
