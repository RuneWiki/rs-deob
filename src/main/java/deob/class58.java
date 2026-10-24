package deob;

@ObfuscatedName("fc")
public class class58 implements Runnable {

	@ObfuscatedName("fc.a")
	public client field868;

	@ObfuscatedName("fc.b")
	public boolean field869 = true;

	@ObfuscatedName("fc.c")
	public Object field870 = new Object();

	@ObfuscatedName("fc.d")
	public int field871;

	@ObfuscatedName("fc.e")
	public int[] field872 = new int[500];

	@ObfuscatedName("fc.f")
	public int[] field873 = new int[500];

	public class58(client arg0) {
		field868 = arg0;
	}

	public void run() {
		while (field869) {
			synchronized (field870) {
				if (field871 < 500) {
					field872[field871] = field868.field17;
					field873[field871] = field868.field18;
					field871++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
