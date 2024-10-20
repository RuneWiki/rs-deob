package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("u")
public class class15 {

    @ObfuscatedName("u.c")
    public final int field82;

    @ObfuscatedName("u.v")
    public final String field78;

    @ObfuscatedName("u.q")
    public final ThreadFactory field79;

    @ObfuscatedName("u.f")
    public final ThreadPoolExecutor field85;

    public class15(String arg0, int arg1, int arg2) {
        this.field78 = arg0;
        this.field82 = arg1;
        this.field79 = new class17(this);
        this.field85 = this.method144(arg2);
    }

    @ObfuscatedName("u.c(IS)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method144(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field82), this.field79);
    }

    @ObfuscatedName("u.v(Ls;I)La;")
    public class20 method145(class11 arg0) {
        if (this.field85.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field85.getCorePoolSize() + " Queue capacity " + this.field82);
            return new class20("Queue full");
        } else {
            return new class20(this.field85.submit(new class21(this, arg0)));
        }
    }

    @ObfuscatedName("u.q(I)V")
    public final void method146() {
        try {
            this.field85.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
