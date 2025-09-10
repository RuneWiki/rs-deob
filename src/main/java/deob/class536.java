package deob;

@ObfuscatedName("uw")
public class class536 {

	@ObfuscatedName("uw.ac")
	public static final int[] field5564 = new int[16384];

	@ObfuscatedName("uw.ap")
	public static final int[] field5565 = new int[16384];

	static {
		double var0 = 3.834951969714103E-4D;
		for (int var2 = 0; var2 < 16384; var2++) {
			field5564[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
			field5565[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
		}
	}

	public class536() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ns.af(IIB)I")
	public static int method6883(int arg0, int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("ax.aw(II)I")
	public static int method327(int arg0) {
		return field5564[arg0 & 0x3FFF];
	}

	@ObfuscatedName("au.at(IB)I")
	public static int method69(int arg0) {
		return field5565[arg0 & 0x3FFF];
	}
}
