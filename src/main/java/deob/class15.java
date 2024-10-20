package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("aa")
public class class15 {

    @ObfuscatedName("aa.aw")
    public final int field83;

    @ObfuscatedName("aa.ay")
    public final String field75;

    @ObfuscatedName("aa.ar")
    public final ThreadFactory field76;

    @ObfuscatedName("aa.am")
    public final ThreadPoolExecutor field77;

    public class15(String arg0, int arg1, int arg2) {
        this.field75 = arg0;
        this.field83 = arg1;
        this.field76 = new class17(this);
        this.field77 = this.method176(arg2);
    }

    @ObfuscatedName("aa.aw(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method176(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field83), this.field76);
    }

    @ObfuscatedName("aa.ay(Laq;I)Lad;")
    public class19 method175(class11 arg0) {
        if (this.field77.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field77.getCorePoolSize() + " Queue capacity " + this.field83);
            return new class19("Queue full");
        } else {
            return new class19(this.field77.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("aa.ar(I)V")
    public final void method177() {
        try {
            this.field77.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
