package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("u")
public class class15 {

    @ObfuscatedName("u.c")
    public final int field82;

    @ObfuscatedName("u.p")
    public final String field79;

    @ObfuscatedName("u.f")
    public final ThreadFactory field78;

    @ObfuscatedName("u.n")
    public final ThreadPoolExecutor field80;

    public class15(String arg0, int arg1, int arg2) {
        this.field79 = arg0;
        this.field82 = arg1;
        this.field78 = new class17(this);
        this.field80 = this.method180(arg2);
    }

    @ObfuscatedName("u.c(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method180(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field82), this.field78);
    }

    @ObfuscatedName("u.p(Lj;I)Le;")
    public class20 method182(class11 arg0) {
        if (this.field80.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field80.getCorePoolSize() + " Queue capacity " + this.field82);
            return new class20("Queue full");
        } else {
            return new class20(this.field80.submit(new class21(this, arg0)));
        }
    }

    @ObfuscatedName("u.f(I)V")
    public final void method186() {
        try {
            this.field80.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
