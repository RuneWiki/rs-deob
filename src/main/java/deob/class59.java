package deob;

@ObfuscatedName("gc")
public class class59 implements Runnable {

	@ObfuscatedName("gc.b")
	public client field865;

	@ObfuscatedName("gc.c")
	public boolean field866 = true;

	@ObfuscatedName("gc.d")
	public Object field867 = new Object();

	@ObfuscatedName("gc.e")
	public int field868;

	@ObfuscatedName("gc.f")
	public int[] field869 = new int[500];

	@ObfuscatedName("gc.g")
	public int[] field870 = new int[500];

	public class59(client arg0) {
		field865 = arg0;
	}

	public void run() {
		while (field866) {
			synchronized (field867) {
				if (field868 < 500) {
					field869[field868] = field865.field17;
					field870[field868] = field865.field18;
					field868++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
