package jagex2.client;

import deob.ObfuscatedName;

@ObfuscatedName("fc")
public class MouseTracking implements Runnable {

	@ObfuscatedName("fc.a")
	public Client field850;

	@ObfuscatedName("fc.b")
	public boolean field851 = true;

	@ObfuscatedName("fc.c")
	public Object field852 = new Object();

	@ObfuscatedName("fc.d")
	public int field853;

	@ObfuscatedName("fc.e")
	public int[] field854 = new int[500];

	@ObfuscatedName("fc.f")
	public int[] field855 = new int[500];

	public MouseTracking(Client arg0) {
		field850 = arg0;
	}

	public void run() {
		while (field851) {
			synchronized (field852) {
				if (field853 < 500) {
					field854[field853] = field850.field17;
					field855[field853] = field850.field18;
					field853++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
