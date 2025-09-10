package deob;

@ObfuscatedName("nw")
public class class356 {

	@ObfuscatedName("nw.at")
	public static int[] field4022 = new int[32];

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field4022[var1] = var0 - 1;
			var0 += var0;
		}
	}

	public class356() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("kl.af(II)I")
	public static int method5877(int arg0) {
		class207 var1 = class207.method1861(arg0);
		int var2 = var1.field2261;
		int var3 = var1.field2263;
		int var4 = var1.field2264;
		int var5 = field4022[var4 - var3];
		return Statics.field4023[var2] >> var3 & var5;
	}

	@ObfuscatedName("ir.aw(III)V")
	public static void method4610(int arg0, int arg1) {
		class207 var2 = class207.method1861(arg0);
		int var3 = var2.field2261;
		int var4 = var2.field2263;
		int var5 = var2.field2264;
		int var6 = field4022[var5 - var4];
		if (arg1 < 0 || arg1 > var6) {
			arg1 = 0;
		}
		int var7 = var6 << var4;
		Statics.field4023[var3] = Statics.field4023[var3] & ~var7 | arg1 << var4 & var7;
	}
}
