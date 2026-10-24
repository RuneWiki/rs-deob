package deob;

@ObfuscatedName("yb")
public final class class51 {

	@ObfuscatedName("yb.e")
	public byte[] field745;

	@ObfuscatedName("yb.f")
	public int field746;

	@ObfuscatedName("yb.g")
	public int[] field747;

	@ObfuscatedName("yb.h")
	public int[] field748;

	@ObfuscatedName("yb.i")
	public int[] field749;

	@ObfuscatedName("yb.j")
	public int[] field750;

	@ObfuscatedName("yb.k")
	public boolean field751;

	public class51(byte[] arg0) {
		method298(arg0);
	}

	@ObfuscatedName("yb.a(Z[B)V")
	public void method298(byte[] arg0) {
		class39 var2 = new class39(arg0);
		int var3 = var2.method235();
		int var4 = var2.method235();
		if (var3 == var4) {
			field745 = arg0;
			field751 = false;
		} else {
			byte[] var5 = new byte[var3];
			class45.method263(var5, var3, arg0, var4, 6);
			field745 = var5;
			var2 = new class39(field745);
			field751 = true;
		}

		field746 = var2.method233();
		field747 = new int[field746];
		field748 = new int[field746];
		field749 = new int[field746];
		field750 = new int[field746];
		int var6 = field746 * 10 + var2.field611;
		for (int var7 = 0; var7 < field746; var7++) {
			field747[var7] = var2.method236();
			field748[var7] = var2.method235();
			field749[var7] = var2.method235();
			field750[var7] = var6;
			var6 += field749[var7];
		}
	}

	@ObfuscatedName("yb.a(Ljava/lang/String;[B)[B")
	public byte[] method299(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field746; var5++) {
			if (field747[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field748[var5]];
				}

				if (field751) {
					for (int var6 = 0; var6 < field748[var5]; var6++) {
						arg1[var6] = field745[field750[var5] + var6];
					}
				} else {
					class45.method263(arg1, field748[var5], field745, field749[var5], field750[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
