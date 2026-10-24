package deob;

@ObfuscatedName("ub")
public final class class47 {

	@ObfuscatedName("ub.d")
	public byte[] field641;

	@ObfuscatedName("ub.e")
	public int field642;

	@ObfuscatedName("ub.f")
	public int[] field643;

	@ObfuscatedName("ub.g")
	public int[] field644;

	@ObfuscatedName("ub.h")
	public int[] field645;

	@ObfuscatedName("ub.i")
	public int[] field646;

	@ObfuscatedName("ub.j")
	public boolean field647;

	public class47(byte[] arg0) {
		method249(arg0);
	}

	@ObfuscatedName("ub.a([BI)V")
	public void method249(byte[] arg0) {
		class37 var2 = new class37(arg0);
		int var3 = var2.method213();
		int var4 = var2.method213();
		if (var3 == var4) {
			field641 = arg0;
			field647 = false;
		} else {
			byte[] var5 = new byte[var3];
			class44.method238(var5, var3, arg0, var4, 6);
			field641 = var5;
			var2 = new class37(field641);
			field647 = true;
		}

		field642 = var2.method211();
		field643 = new int[field642];
		field644 = new int[field642];
		field645 = new int[field642];
		field646 = new int[field642];
		int var6 = field642 * 10 + var2.field540;
		for (int var7 = 0; var7 < field642; var7++) {
			field643[var7] = var2.method214();
			field644[var7] = var2.method213();
			field645[var7] = var2.method213();
			field646[var7] = var6;
			var6 += field645[var7];
		}
	}

	@ObfuscatedName("ub.a(BLjava/lang/String;[B)[B")
	public byte[] method250(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field642; var5++) {
			if (field643[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field644[var5]];
				}

				if (field647) {
					for (int var6 = 0; var6 < field644[var5]; var6++) {
						arg1[var6] = field641[field646[var5] + var6];
					}
				} else {
					class44.method238(arg1, field644[var5], field641, field645[var5], field646[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
