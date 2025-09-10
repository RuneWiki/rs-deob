package deob;

@ObfuscatedName("he")
public class class207 extends class541 {

	@ObfuscatedName("he.af")
	public static final int[] field2262 = new int[32];

	@ObfuscatedName("he.at")
	public static class321 field2259 = new class321(64);

	@ObfuscatedName("he.ac")
	public int field2261;

	@ObfuscatedName("he.ap")
	public int field2263;

	@ObfuscatedName("he.aq")
	public int field2264;

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field2262[var1] = var0 - 1;
			var0 += var0;
		}
	}

	@ObfuscatedName("ea.af(Lpx;B)V")
	public static void method3391(class413 arg0) {
		Statics.field2260 = arg0;
	}

	@ObfuscatedName("bw.aw(II)Lhe;")
	public static class207 method1861(int arg0) {
		class207 var1 = (class207) field2259.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field2260.method7692(14, arg0);
		class207 var3 = new class207();
		if (var2 != null) {
			var3.method4200(new class591(var2));
		}
		field2259.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("he.at(Lwb;I)V")
	public void method4200(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method4201(arg0, var2);
		}
	}

	@ObfuscatedName("he.ac(Lwb;IB)V")
	public void method4201(class591 arg0, int arg1) {
		if (arg1 == 1) {
			this.field2261 = arg0.method10341();
			this.field2263 = arg0.method10339();
			this.field2264 = arg0.method10339();
		}
	}
}
