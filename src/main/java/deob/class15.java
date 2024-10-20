package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("am")
public class class15 {

    @ObfuscatedName("am.aj")
    public final int field72;

    @ObfuscatedName("am.al")
    public final String field71;

    @ObfuscatedName("am.ac")
    public final ThreadFactory field74;

    @ObfuscatedName("am.ab")
    public final ThreadPoolExecutor field73;

    public class15(String arg0, int arg1, int arg2) {
        this.field71 = arg0;
        this.field72 = arg1;
        this.field74 = new class17(this);
        this.field73 = this.method161(arg2);
    }

    @ObfuscatedName("am.aj(IB)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method161(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field72), this.field74);
    }

    @ObfuscatedName("am.al(Lak;S)Lag;")
    public class19 method159(class11 arg0) {
        if (this.field73.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field73.getCorePoolSize() + " Queue capacity " + this.field72);
            return new class19("Queue full");
        } else {
            return new class19(this.field73.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("am.ac(B)V")
    public final void method170() {
        try {
            this.field73.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
