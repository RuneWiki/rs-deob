package jagex2.client;

import deob.ObfuscatedName;

@ObfuscatedName("fc")
public class MouseTracking implements Runnable {

	@ObfuscatedName("fc.a")
	public Client app;

	@ObfuscatedName("fc.b")
	public boolean active = true;

	@ObfuscatedName("fc.c")
	public Object lock = new Object();

	@ObfuscatedName("fc.d")
	public int length;

	@ObfuscatedName("fc.e")
	public int[] x = new int[500];

	@ObfuscatedName("fc.f")
	public int[] y = new int[500];

	public MouseTracking(Client arg0) {
		app = arg0;
	}

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
}
