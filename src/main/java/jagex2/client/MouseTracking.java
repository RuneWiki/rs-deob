package jagex2.client;

import deob.ObfuscatedName;

@ObfuscatedName("BORSVOPG")
public class MouseTracking implements Runnable {

	@ObfuscatedName("BORSVOPG.a")
	public boolean field89 = true;

	@ObfuscatedName("BORSVOPG.b")
	public int[] field90 = new int[500];

	@ObfuscatedName("BORSVOPG.c")
	public Object field91 = new Object();

	@ObfuscatedName("BORSVOPG.g")
	public int[] field94 = new int[500];

	@ObfuscatedName("BORSVOPG.d")
	public Client field92;

	@ObfuscatedName("BORSVOPG.f")
	public int field93;

	public MouseTracking(Client arg0) {
		field92 = arg0;
	}

	public void run() {
		while (field89) {
			synchronized (field91) {
				if (field93 < 500) {
					field94[field93] = field92.field837;
					field90[field93] = field92.field838;
					field93++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
