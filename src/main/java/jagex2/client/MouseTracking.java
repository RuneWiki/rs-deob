package jagex2.client;

import deob.ObfuscatedName;
import deob.client;

@ObfuscatedName("ZIJPRJEC")
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
		while (active) {
			synchronized (lock) {
				if (length < 500) {
					x[length] = app.mouseX;
					y[length] = app.mouseY;
					length++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public MouseTracking(client arg0) {
		app = arg0;
	}
}
