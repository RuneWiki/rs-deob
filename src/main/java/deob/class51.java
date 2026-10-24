package deob;

@ObfuscatedName("yb")
public final class class51 {

	@ObfuscatedName("yb.c")
	public byte[] field761;

	@ObfuscatedName("yb.d")
	public int field762;

	@ObfuscatedName("yb.e")
	public int[] field763;

	@ObfuscatedName("yb.f")
	public int[] field764;

	@ObfuscatedName("yb.g")
	public int[] field765;

	@ObfuscatedName("yb.h")
	public int[] field766;

	@ObfuscatedName("yb.i")
	public boolean field767;

	public class51(byte[] arg0) {
		method308(arg0);
	}

	@ObfuscatedName("yb.a(Z[B)V")
	public void method308(byte[] arg0) {
		class39 var2 = new class39(arg0);
		int var3 = var2.method243();
		int var4 = var2.method243();
		if (var3 == var4) {
			field761 = arg0;
			field767 = false;
		} else {
			byte[] var5 = new byte[var3];
			class45.method271(var5, var3, arg0, var4, 6);
			field761 = var5;
			var2 = new class39(field761);
			field767 = true;
		}

		field762 = var2.method241();
		field763 = new int[field762];
		field764 = new int[field762];
		field765 = new int[field762];
		field766 = new int[field762];
		int var6 = field762 * 10 + var2.field624;
		for (int var7 = 0; var7 < field762; var7++) {
			field763[var7] = var2.method244();
			field764[var7] = var2.method243();
			field765[var7] = var2.method243();
			field766[var7] = var6;
			var6 += field765[var7];
		}
	}

	@ObfuscatedName("yb.a(Ljava/lang/String;[B)[B")
	public byte[] method309(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field762; var5++) {
			if (field763[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field764[var5]];
				}

				if (field767) {
					for (int var6 = 0; var6 < field764[var5]; var6++) {
						arg1[var6] = field761[field766[var5] + var6];
					}
				} else {
					class45.method271(arg1, field764[var5], field761, field765[var5], field766[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
