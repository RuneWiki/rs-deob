package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ag")
public class class15 {

    @ObfuscatedName("ag.af")
    public final int field76;

    @ObfuscatedName("ag.an")
    public final String field77;

    @ObfuscatedName("ag.aw")
    public final ThreadFactory field82;

    @ObfuscatedName("ag.ac")
    public final ThreadPoolExecutor field81;

    public class15(String arg0, int arg1, int arg2) {
        this.field77 = arg0;
        this.field76 = arg1;
        this.field82 = new class17(this);
        this.field81 = this.method171(arg2);
    }

    @ObfuscatedName("ag.af(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method171(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field76), this.field82);
    }

    @ObfuscatedName("ag.an(Lay;B)Lam;")
    public class19 method172(class11 arg0) {
        if (this.field81.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field81.getCorePoolSize() + " Queue capacity " + this.field76);
            return new class19("Queue full");
        } else {
            return new class19(this.field81.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("ag.aw(I)V")
    public final void method174() {
        try {
            this.field81.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
