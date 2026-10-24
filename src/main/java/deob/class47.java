package deob;

@ObfuscatedName("ub")
public final class class47 {

	@ObfuscatedName("ub.c")
	public byte[] field637;

	@ObfuscatedName("ub.d")
	public int field638;

	@ObfuscatedName("ub.e")
	public int[] field639;

	@ObfuscatedName("ub.f")
	public int[] field640;

	@ObfuscatedName("ub.g")
	public int[] field641;

	@ObfuscatedName("ub.h")
	public int[] field642;

	public class47(byte[] arg0) {
		method241(arg0);
	}

	@ObfuscatedName("ub.a([BB)V")
	public void method241(byte[] arg0) {
		class37 var2 = new class37(arg0);
		int var3 = var2.method205();
		int var4 = var2.method205();
		if (var3 == var4) {
			field637 = arg0;
		} else {
			byte[] var5 = new byte[var3];
			class44.method230(var5, var3, arg0, var4, 6);
			field637 = var5;
			var2 = new class37(field637);
		}

		field638 = var2.method203();
		field639 = new int[field638];
		field640 = new int[field638];
		field641 = new int[field638];
		field642 = new int[field638];
		int var6 = field638 * 10 + var2.field537;
		for (int var7 = 0; var7 < field638; var7++) {
			field639[var7] = var2.method206();
			field640[var7] = var2.method205();
			field641[var7] = var2.method205();
			field642[var7] = var6;
			var6 += field641[var7];
		}
	}

	@ObfuscatedName("ub.a(B[BLjava/lang/String;)[B")
	public byte[] method242(byte[] arg0, String arg1) {
		int var3 = 0;
		arg1 = arg1.toUpperCase();
		for (int var4 = 0; var4 < arg1.length(); var4++) {
			var3 = var3 * 61 + arg1.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field638; var5++) {
			if (field639[var5] == var3) {
				if (arg0 == null) {
					arg0 = new byte[field640[var5]];
				}

				if (field641[var5] == field640[var5]) {
					for (int var6 = 0; var6 < field640[var5]; var6++) {
						arg0[var6] = field637[field642[var5] + var6];
					}
				} else {
					class44.method230(arg0, field640[var5], field637, field641[var5], field642[var5]);
				}

				return arg0;
			}
		}

		return null;
	}
}
