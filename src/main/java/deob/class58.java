package deob;

@ObfuscatedName("fc")
public class class58 implements Runnable {

	@ObfuscatedName("fc.b")
	public client field858;

	@ObfuscatedName("fc.c")
	public boolean field859 = true;

	@ObfuscatedName("fc.d")
	public Object field860 = new Object();

	@ObfuscatedName("fc.e")
	public int field861;

	@ObfuscatedName("fc.f")
	public int[] field862 = new int[500];

	@ObfuscatedName("fc.g")
	public int[] field863 = new int[500];

	public class58(client arg0) {
		field858 = arg0;
	}

	public void run() {
		while (field859) {
			synchronized (field860) {
				if (field861 < 500) {
					field862[field861] = field858.field17;
					field863[field861] = field858.field18;
					field861++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
