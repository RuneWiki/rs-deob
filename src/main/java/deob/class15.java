package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ab")
public class class15 {

    @ObfuscatedName("ab.ac")
    public final int field53;

    @ObfuscatedName("ab.ae")
    public final String field57;

    @ObfuscatedName("ab.ag")
    public final ThreadFactory field51;

    @ObfuscatedName("ab.am")
    public final ThreadPoolExecutor field54;

    public class15(String arg0, int arg1, int arg2) {
        this.field57 = arg0;
        this.field53 = arg1;
        this.field51 = new class17(this);
        this.field54 = this.method155(arg2);
    }

    @ObfuscatedName("ab.ac(II)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method155(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field53), this.field51);
    }

    @ObfuscatedName("ab.ae(Lal;B)Lao;")
    public class19 method156(class11 arg0) {
        if (this.field54.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field54.getCorePoolSize() + " Queue capacity " + this.field53);
            return new class19("Queue full");
        } else {
            return new class19(this.field54.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("ab.ag(I)V")
    public final void method157() {
        try {
            this.field54.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
