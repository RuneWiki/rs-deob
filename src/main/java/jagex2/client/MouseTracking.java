package jagex2.client;

import deob.ObfuscatedName;
import deob.client;

public class MouseTracking implements Runnable {

	@ObfuscatedName("ZIJPRJEC.b")
	public Object lock = new Object();

	@ObfuscatedName("ZIJPRJEC.c")
	public int[] y = new int[500];

	@ObfuscatedName("ZIJPRJEC.d")
	public boolean active = true;

	@ObfuscatedName("ZIJPRJEC.e")
	public int[] x = new int[500];

	@ObfuscatedName("ZIJPRJEC.a")
	public client app;

	@ObfuscatedName("ZIJPRJEC.f")
	public int length;

	public void run() {
		while (this.active) {
			Object var1 = this.lock;
			synchronized (this.lock) {
				if (this.length < 500) {
					this.x[this.length] = this.app.mouseX;
					this.y[this.length] = this.app.mouseY;
					this.length++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public MouseTracking(client arg0, int arg1) {
		if (arg1 >= 0) {
			throw new NullPointerException();
		}
		this.app = arg0;
	}
}
