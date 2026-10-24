package deob;

@ObfuscatedName("tb")
public final class class46 {

	@ObfuscatedName("tb.c")
	public byte[] field625;

	@ObfuscatedName("tb.d")
	public int field626;

	@ObfuscatedName("tb.e")
	public int[] field627;

	@ObfuscatedName("tb.f")
	public int[] field628;

	@ObfuscatedName("tb.g")
	public int[] field629;

	@ObfuscatedName("tb.h")
	public int[] field630;

	public class46(byte[] arg0) {
		method224(arg0);
	}

	@ObfuscatedName("tb.a(B[B)V")
	public void method224(byte[] arg0) {
		class36 var2 = new class36(arg0);
		int var3 = var2.method189();
		int var4 = var2.method189();
		if (var3 == var4) {
			field625 = arg0;
		} else {
			byte[] var5 = new byte[var3];
			class43.method213(var5, var3, arg0, var4, 6);
			field625 = var5;
			var2 = new class36(field625);
		}

		field626 = var2.method187();
		field627 = new int[field626];
		field628 = new int[field626];
		field629 = new int[field626];
		field630 = new int[field626];
		int var6 = field626 * 10 + var2.field525;
		for (int var7 = 0; var7 < field626; var7++) {
			field627[var7] = var2.method190();
			field628[var7] = var2.method189();
			field629[var7] = var2.method189();
			field630[var7] = var6;
			var6 += field629[var7];
		}
	}

	@ObfuscatedName("tb.a(I[BLjava/lang/String;)[B")
	public byte[] method225(byte[] arg0, String arg1) {
		int var3 = 0;
		arg1 = arg1.toUpperCase();
		for (int var4 = 0; var4 < arg1.length(); var4++) {
			var3 = var3 * 61 + arg1.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field626; var5++) {
			if (field627[var5] == var3) {
				if (arg0 == null) {
					arg0 = new byte[field628[var5]];
				}

				if (field629[var5] == field628[var5]) {
					for (int var6 = 0; var6 < field628[var5]; var6++) {
						arg0[var6] = field625[field630[var5] + var6];
					}
				} else {
					class43.method213(arg0, field628[var5], field625, field629[var5], field630[var5]);
				}

				return arg0;
			}
		}

		return null;
	}
}
