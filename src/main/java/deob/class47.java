package deob;

@ObfuscatedName("ub")
public final class class47 {

	@ObfuscatedName("ub.e")
	public byte[] field640;

	@ObfuscatedName("ub.f")
	public int field641;

	@ObfuscatedName("ub.g")
	public int[] field642;

	@ObfuscatedName("ub.h")
	public int[] field643;

	@ObfuscatedName("ub.i")
	public int[] field644;

	@ObfuscatedName("ub.j")
	public int[] field645;

	@ObfuscatedName("ub.k")
	public boolean field646;

	public class47(byte[] arg0) {
		method248(arg0);
	}

	@ObfuscatedName("ub.a([BI)V")
	public void method248(byte[] arg0) {
		class37 var2 = new class37(arg0);
		int var3 = var2.method212();
		int var4 = var2.method212();
		if (var3 == var4) {
			field640 = arg0;
			field646 = false;
		} else {
			byte[] var5 = new byte[var3];
			class44.method237(var5, var3, arg0, var4, 6);
			field640 = var5;
			var2 = new class37(field640);
			field646 = true;
		}

		field641 = var2.method210();
		field642 = new int[field641];
		field643 = new int[field641];
		field644 = new int[field641];
		field645 = new int[field641];
		int var6 = field641 * 10 + var2.field540;
		for (int var7 = 0; var7 < field641; var7++) {
			field642[var7] = var2.method213();
			field643[var7] = var2.method212();
			field644[var7] = var2.method212();
			field645[var7] = var6;
			var6 += field644[var7];
		}
	}

	@ObfuscatedName("ub.a(Ljava/lang/String;Z[B)[B")
	public byte[] method249(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field641; var5++) {
			if (field642[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field643[var5]];
				}

				if (field646) {
					for (int var6 = 0; var6 < field643[var5]; var6++) {
						arg1[var6] = field640[field645[var5] + var6];
					}
				} else {
					class44.method237(arg1, field643[var5], field640, field644[var5], field645[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
