package deob;

@ObfuscatedName("ub")
public final class class47 {

	@ObfuscatedName("ub.d")
	public byte[] field642;

	@ObfuscatedName("ub.e")
	public int field643;

	@ObfuscatedName("ub.f")
	public int[] field644;

	@ObfuscatedName("ub.g")
	public int[] field645;

	@ObfuscatedName("ub.h")
	public int[] field646;

	@ObfuscatedName("ub.i")
	public int[] field647;

	@ObfuscatedName("ub.j")
	public boolean field648;

	public class47(byte[] arg0) {
		method249(arg0);
	}

	@ObfuscatedName("ub.a(B[B)V")
	public void method249(byte[] arg0) {
		class37 var2 = new class37(arg0);
		int var3 = var2.method213();
		int var4 = var2.method213();
		if (var3 == var4) {
			field642 = arg0;
			field648 = false;
		} else {
			byte[] var5 = new byte[var3];
			class44.method238(var5, var3, arg0, var4, 6);
			field642 = var5;
			var2 = new class37(field642);
			field648 = true;
		}

		field643 = var2.method211();
		field644 = new int[field643];
		field645 = new int[field643];
		field646 = new int[field643];
		field647 = new int[field643];
		int var6 = field643 * 10 + var2.field541;
		for (int var7 = 0; var7 < field643; var7++) {
			field644[var7] = var2.method214();
			field645[var7] = var2.method213();
			field646[var7] = var2.method213();
			field647[var7] = var6;
			var6 += field646[var7];
		}
	}

	@ObfuscatedName("ub.a([BLjava/lang/String;I)[B")
	public byte[] method250(byte[] arg0, String arg1) {
		int var3 = 0;
		arg1 = arg1.toUpperCase();
		for (int var4 = 0; var4 < arg1.length(); var4++) {
			var3 = var3 * 61 + arg1.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field643; var5++) {
			if (field644[var5] == var3) {
				if (arg0 == null) {
					arg0 = new byte[field645[var5]];
				}

				if (field648) {
					for (int var6 = 0; var6 < field645[var5]; var6++) {
						arg0[var6] = field642[field647[var5] + var6];
					}
				} else {
					class44.method238(arg0, field645[var5], field642, field646[var5], field647[var5]);
				}

				return arg0;
			}
		}

		return null;
	}
}
