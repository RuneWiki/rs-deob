package deob;

@ObfuscatedName("xb")
public final class class50 {

	@ObfuscatedName("xb.c")
	public byte[] field760;

	@ObfuscatedName("xb.d")
	public int field761;

	@ObfuscatedName("xb.e")
	public int[] field762;

	@ObfuscatedName("xb.f")
	public int[] field763;

	@ObfuscatedName("xb.g")
	public int[] field764;

	@ObfuscatedName("xb.h")
	public int[] field765;

	@ObfuscatedName("xb.i")
	public boolean field766;

	public class50(byte[] arg0) {
		method298(arg0);
	}

	@ObfuscatedName("xb.a(I[B)V")
	public void method298(byte[] arg0) {
		class38 var2 = new class38(arg0);
		int var3 = var2.method233();
		int var4 = var2.method233();
		if (var3 == var4) {
			field760 = arg0;
			field766 = false;
		} else {
			byte[] var5 = new byte[var3];
			class44.method261(var5, var3, arg0, var4, 6);
			field760 = var5;
			var2 = new class38(field760);
			field766 = true;
		}

		field761 = var2.method231();
		field762 = new int[field761];
		field763 = new int[field761];
		field764 = new int[field761];
		field765 = new int[field761];
		int var6 = field761 * 10 + var2.field622;
		for (int var7 = 0; var7 < field761; var7++) {
			field762[var7] = var2.method234();
			field763[var7] = var2.method233();
			field764[var7] = var2.method233();
			field765[var7] = var6;
			var6 += field764[var7];
		}
	}

	@ObfuscatedName("xb.a(Ljava/lang/String;[B)[B")
	public byte[] method299(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field761; var5++) {
			if (field762[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field763[var5]];
				}

				if (field766) {
					for (int var6 = 0; var6 < field763[var5]; var6++) {
						arg1[var6] = field760[field765[var5] + var6];
					}
				} else {
					class44.method261(arg1, field763[var5], field760, field764[var5], field765[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
