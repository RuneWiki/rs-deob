package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("t")
public class class15 {

    @ObfuscatedName("t.o")
    public final int field77;

    @ObfuscatedName("t.q")
    public final String field75;

    @ObfuscatedName("t.l")
    public final ThreadFactory field74;

    @ObfuscatedName("t.k")
    public final ThreadPoolExecutor field78;

    public class15(String arg0, int arg1, int arg2) {
        this.field75 = arg0;
        this.field77 = arg1;
        this.field74 = new class17(this);
        this.field78 = this.method157(arg2);
    }

    @ObfuscatedName("t.o(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method157(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field77), this.field74);
    }

    @ObfuscatedName("t.q(Ly;I)Lh;")
    public class20 method153(class11 arg0) {
        if (this.field78.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field78.getCorePoolSize() + " Queue capacity " + this.field77);
            return new class20("Queue full");
        } else {
            return new class20(this.field78.submit(new class21(this, arg0)));
        }
    }

    @ObfuscatedName("t.l(I)V")
    public final void method154() {
        try {
            this.field78.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
