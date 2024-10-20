package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ae")
public class class15 {

    @ObfuscatedName("ae.ak")
    public final int field72;

    @ObfuscatedName("ae.al")
    public final String field69;

    @ObfuscatedName("ae.aj")
    public final ThreadFactory field71;

    @ObfuscatedName("ae.az")
    public final ThreadPoolExecutor field74;

    public class15(String arg0, int arg1, int arg2) {
        this.field69 = arg0;
        this.field72 = arg1;
        this.field71 = new class17(this);
        this.field74 = this.method172(arg2);
    }

    @ObfuscatedName("ae.ak(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method172(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field72), this.field71);
    }

    @ObfuscatedName("ae.al(Lah;I)Las;")
    public class19 method165(class11 arg0) {
        if (this.field74.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field74.getCorePoolSize() + " Queue capacity " + this.field72);
            return new class19("Queue full");
        } else {
            return new class19(this.field74.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("ae.aj(B)V")
    public final void method168() {
        try {
            this.field74.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
