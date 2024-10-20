package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("l")
public class class15 {

    @ObfuscatedName("l.s")
    public final int field74;

    @ObfuscatedName("l.h")
    public final String field79;

    @ObfuscatedName("l.w")
    public final ThreadFactory field75;

    @ObfuscatedName("l.v")
    public final ThreadPoolExecutor field80;

    public class15(String arg0, int arg1, int arg2) {
        this.field79 = arg0;
        this.field74 = arg1;
        this.field75 = new class17(this);
        this.field80 = this.method162(arg2);
    }

    @ObfuscatedName("l.s(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method162(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field74), this.field75);
    }

    @ObfuscatedName("l.h(Ld;B)Le;")
    public class20 method163(class11 arg0) {
        if (this.field80.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field80.getCorePoolSize() + " Queue capacity " + this.field74);
            return new class20("Queue full");
        } else {
            return new class20(this.field80.submit(new class21(this, arg0)));
        }
    }

    @ObfuscatedName("l.w(I)V")
    public final void method164() {
        try {
            this.field80.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
