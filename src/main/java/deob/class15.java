package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ay")
public class class15 {

    @ObfuscatedName("ay.at")
    public final int field66;

    @ObfuscatedName("ay.ah")
    public final String field64;

    @ObfuscatedName("ay.ar")
    public final ThreadFactory field63;

    @ObfuscatedName("ay.ao")
    public final ThreadPoolExecutor field61;

    public class15(String arg0, int arg1, int arg2) {
        this.field64 = arg0;
        this.field66 = arg1;
        this.field63 = new class17(this);
        this.field61 = this.method178(arg2);
    }

    @ObfuscatedName("ay.at(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method178(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field66), this.field63);
    }

    @ObfuscatedName("ay.ah(Lap;I)Laq;")
    public class19 method175(class11 arg0) {
        if (this.field61.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field61.getCorePoolSize() + " Queue capacity " + this.field66);
            return new class19("Queue full");
        } else {
            return new class19(this.field61.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("ay.ar(I)V")
    public final void method173() {
        try {
            this.field61.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
