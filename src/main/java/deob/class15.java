package deob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ar")
public class class15 {

	@ObfuscatedName("ar.af")
	public final String field56;

	@ObfuscatedName("ar.aw")
	public final ThreadFactory field55;

	@ObfuscatedName("ar.at")
	public final ThreadPoolExecutor field59;

	@ObfuscatedName("ar.ac")
	public final int field57;

	public class15(String arg0, int arg1, int arg2) {
		this.field56 = arg0;
		this.field57 = arg1;
		this.field55 = new class17(this);
		this.field59 = this.method170(arg2);
	}

	@ObfuscatedName("ar.af(IB)Ljava/util/concurrent/ThreadPoolExecutor;")
	public final ThreadPoolExecutor method170(int arg0) {
		return new ThreadPoolExecutor(arg0, arg0, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field57), this.field55);
	}

	@ObfuscatedName("ar.aw(Lai;I)Lag;")
	public class19 method177(class11 arg0) {
		if (this.field59.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field59.getCorePoolSize() + " Queue capacity " + this.field57);
			return new class19("Queue full");
		} else {
			return new class19(this.field59.submit(new class20(this, arg0)));
		}
	}

	@ObfuscatedName("ar.at(B)V")
	public final void method172() {
		try {
			this.field59.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}
	}
}
