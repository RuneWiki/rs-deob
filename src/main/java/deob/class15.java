package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("aw")
public class class15 {

    @ObfuscatedName("aw.am")
    public final int field58;

    @ObfuscatedName("aw.ap")
    public final String field56;

    @ObfuscatedName("aw.af")
    public final ThreadFactory field57;

    @ObfuscatedName("aw.aj")
    public final ThreadPoolExecutor field59;

    public class15(String arg0, int arg1, int arg2) {
        this.field56 = arg0;
        this.field58 = arg1;
        this.field57 = new class17(this);
        this.field59 = this.method182(arg2);
    }

    @ObfuscatedName("aw.am(IS)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method182(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field58), this.field57);
    }

    @ObfuscatedName("aw.ap(Lau;B)Lay;")
    public class19 method175(class11 arg0) {
        if (this.field59.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field59.getCorePoolSize() + " Queue capacity " + this.field58);
            return new class19("Queue full");
        } else {
            return new class19(this.field59.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("aw.af(S)V")
    public final void method176() {
        try {
            this.field59.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
