package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("as")
public class class15 {

    @ObfuscatedName("as.ac")
    public final int field74;

    @ObfuscatedName("as.al")
    public final String field82;

    @ObfuscatedName("as.ak")
    public final ThreadFactory field73;

    @ObfuscatedName("as.ax")
    public final ThreadPoolExecutor field76;

    public class15(String arg0, int arg1, int arg2) {
        this.field82 = arg0;
        this.field74 = arg1;
        this.field73 = new class17(this);
        this.field76 = this.method170(arg2);
    }

    @ObfuscatedName("as.ac(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method170(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field74), this.field73);
    }

    @ObfuscatedName("as.al(Lag;B)Lai;")
    public class19 method165(class11 arg0) {
        if (this.field76.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field76.getCorePoolSize() + " Queue capacity " + this.field74);
            return new class19("Queue full");
        } else {
            return new class19(this.field76.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("as.ak(I)V")
    public final void method166() {
        try {
            this.field76.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
