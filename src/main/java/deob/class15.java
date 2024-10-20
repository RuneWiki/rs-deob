package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ar")
public class class15 {

    @ObfuscatedName("ar.au")
    public final int field77;

    @ObfuscatedName("ar.ae")
    public final String field73;

    @ObfuscatedName("ar.ao")
    public final ThreadFactory field75;

    @ObfuscatedName("ar.at")
    public final ThreadPoolExecutor field74;

    public class15(String arg0, int arg1, int arg2) {
        this.field73 = arg0;
        this.field77 = arg1;
        this.field75 = new class17(this);
        this.field74 = this.method156(arg2);
    }

    @ObfuscatedName("ar.au(IB)Ljava/util/concurrent/ThreadPoolExecutor;")
    public final ThreadPoolExecutor method156(int arg0) {
        return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field77), this.field75);
    }

    @ObfuscatedName("ar.ae(Lad;B)Lax;")
    public class19 method159(class11 arg0) {
        if (this.field74.getQueue().remainingCapacity() <= 0) {
            System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field74.getCorePoolSize() + " Queue capacity " + this.field77);
            return new class19("Queue full");
        } else {
            return new class19(this.field74.submit(new class20(this, arg0)));
        }
    }

    @ObfuscatedName("ar.ao(I)V")
    public final void method167() {
        try {
            this.field74.shutdown();
        } catch (Exception var2) {
            System.err.println("Error shutting down RestRequestService\r\n" + var2);
        }
    }
}
