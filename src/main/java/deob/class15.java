package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ar")
public class class15 {

    @ObfuscatedName("ar.az")
    public final int field64;

    @ObfuscatedName("ar.ah")
    public final String field63;

    @ObfuscatedName("ar.af")
    public final ThreadFactory field65;

    @ObfuscatedName("ar.at")
    public final ThreadPoolExecutor field66;

    public class15(String arg0, int arg1, int arg2) {
        this.field63 = arg0;
        this.field64 = arg1;
        this.field65 = new class17(this);
        this.field66 = this.method169(arg2);
    }

    @ObfuscatedName("ar.az(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method169(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field64), this.field65);
    }

    @ObfuscatedName("ar.ah(Las;I)Lap;")
    public class19 method170(class11 arg0) {
        if (this.field66.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field66.getCorePoolSize() + " Queue capacity " + this.field64);
            return new class19("Queue full");
        } else {
            return new class19(this.field66.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("ar.af(I)V")
    public final void method177() {
        try {
            this.field66.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
