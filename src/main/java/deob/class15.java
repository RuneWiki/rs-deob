package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ar")
public class class15 {

    @ObfuscatedName("ar.ap")
    public final int field55;

    @ObfuscatedName("ar.aw")
    public final String field51;

    @ObfuscatedName("ar.ak")
    public final ThreadFactory field50;

    @ObfuscatedName("ar.aj")
    public final ThreadPoolExecutor field53;

    public class15(String arg0, int arg1, int arg2) {
        this.field51 = arg0;
        this.field55 = arg1;
        this.field50 = new class17(this);
        this.field53 = this.method164(arg2);
    }

    @ObfuscatedName("ar.ap(IB)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method164(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field55), this.field50);
    }

    @ObfuscatedName("ar.aw(Lau;B)Lad;")
    public class19 method165(class11 arg0) {
        if (this.field53.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field53.getCorePoolSize() + " Queue capacity " + this.field55);
            return new class19("Queue full");
        } else {
            return new class19(this.field53.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("ar.ak(I)V")
    public final void method163() {
        try {
            this.field53.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
