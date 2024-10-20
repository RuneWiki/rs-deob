package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("o")
public class class15 {

    @ObfuscatedName("o.a")
    public final int field75;

    @ObfuscatedName("o.f")
    public final String field76;

    @ObfuscatedName("o.c")
    public final ThreadFactory field77;

    @ObfuscatedName("o.x")
    public final ThreadPoolExecutor field78;

    public class15(String arg0, int arg1, int arg2) {
        this.field76 = arg0;
        this.field75 = arg1;
        this.field77 = new class17(this);
        this.field78 = this.method170(arg2);
    }

    @ObfuscatedName("o.a(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method170(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field75), this.field77);
    }

    @ObfuscatedName("o.f(Ll;I)Lm;")
    public class20 method169(class11 arg0) {
        if (this.field78.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field78.getCorePoolSize() + " Queue capacity " + this.field75);
            return new class20("Queue full");
        } else {
            return new class20(this.field78.submit(new class21(this, arg0)));
        }
    }

    @ObfuscatedName("o.c(I)V")
    public final void method168() {
        try {
            this.field78.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
