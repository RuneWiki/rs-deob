package jagex2.client;

import deob.ObfuscatedName;

@ObfuscatedName("fc")
public class MouseTracking implements Runnable {

	@ObfuscatedName("fc.b")
	public Client app;

	@ObfuscatedName("fc.c")
	public boolean active = true;

	@ObfuscatedName("fc.d")
	public Object lock = new Object();

	@ObfuscatedName("fc.e")
	public int length;

	@ObfuscatedName("fc.f")
	public int[] x = new int[500];

	@ObfuscatedName("fc.g")
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
