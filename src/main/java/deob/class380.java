package deob;

@ObfuscatedName("of")
public class class380 {

	@ObfuscatedName("of.aw")
	public static final boolean[] field4369 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@ObfuscatedName("of.at")
	public static int[] field4370 = new int[99];

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			field4370[var1] = var0 / 4;
		}
	}

	public class380() throws Throwable {
		throw new Error();
	}
}
