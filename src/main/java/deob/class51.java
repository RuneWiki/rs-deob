package deob;

@ObfuscatedName("yb")
public final class class51 {

	@ObfuscatedName("yb.e")
	public byte[] field759;

	@ObfuscatedName("yb.f")
	public int field760;

	@ObfuscatedName("yb.g")
	public int[] field761;

	@ObfuscatedName("yb.h")
	public int[] field762;

	@ObfuscatedName("yb.i")
	public int[] field763;

	@ObfuscatedName("yb.j")
	public int[] field764;

	@ObfuscatedName("yb.k")
	public boolean field765;

	public class51(byte[] arg0) {
		method307(arg0);
	}

	@ObfuscatedName("yb.a([BB)V")
	public void method307(byte[] arg0) {
		class39 var2 = new class39(arg0);
		int var3 = var2.method242();
		int var4 = var2.method242();
		if (var3 == var4) {
			field759 = arg0;
			field765 = false;
		} else {
			byte[] var5 = new byte[var3];
			class45.method270(var5, var3, arg0, var4, 6);
			field759 = var5;
			var2 = new class39(field759);
			field765 = true;
		}

		field760 = var2.method240();
		field761 = new int[field760];
		field762 = new int[field760];
		field763 = new int[field760];
		field764 = new int[field760];
		int var6 = field760 * 10 + var2.field623;
		for (int var7 = 0; var7 < field760; var7++) {
			field761[var7] = var2.method243();
			field762[var7] = var2.method242();
			field763[var7] = var2.method242();
			field764[var7] = var6;
			var6 += field763[var7];
		}
	}

	@ObfuscatedName("yb.a(Ljava/lang/String;[B)[B")
	public byte[] method308(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field760; var5++) {
			if (field761[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field762[var5]];
				}

				if (field765) {
					for (int var6 = 0; var6 < field762[var5]; var6++) {
						arg1[var6] = field759[field764[var5] + var6];
					}
				} else {
					class45.method270(arg1, field762[var5], field759, field763[var5], field764[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
