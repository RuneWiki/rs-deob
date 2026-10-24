package deob;

@ObfuscatedName("fc")
public class class58 implements Runnable {

	@ObfuscatedName("fc.a")
	public client field854;

	@ObfuscatedName("fc.b")
	public boolean field855 = true;

	@ObfuscatedName("fc.c")
	public Object field856 = new Object();

	@ObfuscatedName("fc.d")
	public int field857;

	@ObfuscatedName("fc.e")
	public int[] field858 = new int[500];

	@ObfuscatedName("fc.f")
	public int[] field859 = new int[500];

	public class58(client arg0) {
		field854 = arg0;
	}

	public void run() {
		while (field855) {
			synchronized (field856) {
				if (field857 < 500) {
					field858[field857] = field854.field17;
					field859[field857] = field854.field18;
					field857++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
