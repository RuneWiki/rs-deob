package deob;

@ObfuscatedName("fc")
public class class58 implements Runnable {

	@ObfuscatedName("fc.b")
	public client field868;

	@ObfuscatedName("fc.c")
	public boolean field869 = true;

	@ObfuscatedName("fc.d")
	public Object field870 = new Object();

	@ObfuscatedName("fc.e")
	public int field871;

	@ObfuscatedName("fc.f")
	public int[] field872 = new int[500];

	@ObfuscatedName("fc.g")
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
