package deob;

@ObfuscatedName("fc")
public class class58 implements Runnable {

	@ObfuscatedName("fc.b")
	public client field867;

	@ObfuscatedName("fc.c")
	public boolean field868 = true;

	@ObfuscatedName("fc.d")
	public Object field869 = new Object();

	@ObfuscatedName("fc.e")
	public int field870;

	@ObfuscatedName("fc.f")
	public int[] field871 = new int[500];

	@ObfuscatedName("fc.g")
	public int[] field872 = new int[500];

	public class58(client arg0) {
		field867 = arg0;
	}

	public void run() {
		while (field868) {
			synchronized (field869) {
				if (field870 < 500) {
					field871[field870] = field867.field17;
					field872[field870] = field867.field18;
					field870++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
