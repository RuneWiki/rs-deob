package deob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ObfuscatedName("ay")
public class class17 implements ThreadFactory {

	// $FF: synthetic field
	public final class15 this$0;

	@ObfuscatedName("ay.af")
	public final ThreadGroup field68;

	@ObfuscatedName("ay.aw")
	public final AtomicInteger field64;

	public class17(class15 arg0) {
		this.this$0 = arg0;
		this.field64 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field68 = var2 == null ? Thread.currentThread().getThreadGroup() : var2.getThreadGroup();
	}

	public Thread newThread(Runnable arg0) {
		Thread var2 = new Thread(this.field68, arg0, this.this$0.field56 + "-rest-request-" + this.field64.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}
}
