package deob;

@ObfuscatedName("fc")
public class class58 implements Runnable {

	@ObfuscatedName("fc.a")
	public client field853;

	@ObfuscatedName("fc.b")
	public boolean field854 = true;

	@ObfuscatedName("fc.c")
	public Object field855 = new Object();

	@ObfuscatedName("fc.d")
	public int field856;

	@ObfuscatedName("fc.e")
	public int[] field857 = new int[500];

	@ObfuscatedName("fc.f")
	public int[] field858 = new int[500];

	public class58(client arg0) {
		field853 = arg0;
	}

	public void run() {
		while (field854) {
			synchronized (field855) {
				if (field856 < 500) {
					field857[field856] = field853.field17;
					field858[field856] = field853.field18;
					field856++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
