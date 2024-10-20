package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("aw")
public class class15 {

    @ObfuscatedName("aw.ab")
    public final int field57;

    @ObfuscatedName("aw.ay")
    public final String field55;

    @ObfuscatedName("aw.an")
    public final ThreadFactory field51;

    @ObfuscatedName("aw.au")
    public final ThreadPoolExecutor field53;

    public class15(String arg0, int arg1, int arg2) {
        this.field55 = arg0;
        this.field57 = arg1;
        this.field51 = new class17(this);
        this.field53 = this.method162(arg2);
    }

    @ObfuscatedName("aw.ab(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method162(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field57), this.field51);
    }

    @ObfuscatedName("aw.ay(Laq;I)Lag;")
    public class19 method154(class11 arg0) {
        if (this.field53.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field53.getCorePoolSize() + " Queue capacity " + this.field57);
            return new class19("Queue full");
        } else {
            return new class19(this.field53.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("aw.an(I)V")
    public final void method157() {
        try {
            this.field53.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
