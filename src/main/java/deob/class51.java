package deob;

@ObfuscatedName("yb")
public final class class51 {

	@ObfuscatedName("yb.e")
	public byte[] field762;

	@ObfuscatedName("yb.f")
	public int field763;

	@ObfuscatedName("yb.g")
	public int[] field764;

	@ObfuscatedName("yb.h")
	public int[] field765;

	@ObfuscatedName("yb.i")
	public int[] field766;

	@ObfuscatedName("yb.j")
	public int[] field767;

	@ObfuscatedName("yb.k")
	public boolean field768;

	public class51(byte[] arg0) {
		method297(arg0);
	}

	@ObfuscatedName("yb.a(I[B)V")
	public void method297(byte[] arg0) {
		class39 var2 = new class39(arg0);
		int var3 = var2.method232();
		int var4 = var2.method232();
		if (var3 == var4) {
			field762 = arg0;
			field768 = false;
		} else {
			byte[] var5 = new byte[var3];
			class45.method260(var5, var3, arg0, var4, 6);
			field762 = var5;
			var2 = new class39(field762);
			field768 = true;
		}

		field763 = var2.method230();
		field764 = new int[field763];
		field765 = new int[field763];
		field766 = new int[field763];
		field767 = new int[field763];
		int var6 = field763 * 10 + var2.field625;
		for (int var7 = 0; var7 < field763; var7++) {
			field764[var7] = var2.method233();
			field765[var7] = var2.method232();
			field766[var7] = var2.method232();
			field767[var7] = var6;
			var6 += field766[var7];
		}
	}

	@ObfuscatedName("yb.a(Ljava/lang/String;[B)[B")
	public byte[] method298(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field763; var5++) {
			if (field764[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field765[var5]];
				}

				if (field768) {
					for (int var6 = 0; var6 < field765[var5]; var6++) {
						arg1[var6] = field762[field767[var5] + var6];
					}
				} else {
					class45.method260(arg1, field765[var5], field762, field766[var5], field767[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
