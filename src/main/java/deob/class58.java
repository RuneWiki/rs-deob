package deob;

@ObfuscatedName("fc")
public class class58 implements Runnable {

	@ObfuscatedName("fc.a")
	public client field856;

	@ObfuscatedName("fc.b")
	public boolean field857 = true;

	@ObfuscatedName("fc.c")
	public Object field858 = new Object();

	@ObfuscatedName("fc.d")
	public int field859;

	@ObfuscatedName("fc.e")
	public int[] field860 = new int[500];

	@ObfuscatedName("fc.f")
	public int[] field861 = new int[500];

	public class58(client arg0) {
		field856 = arg0;
	}

	public void run() {
		while (field857) {
			synchronized (field858) {
				if (field859 < 500) {
					field860[field859] = field856.field17;
					field861[field859] = field856.field18;
					field859++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
