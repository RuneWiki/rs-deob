package deob;

@ObfuscatedName("ub")
public final class class47 {

	@ObfuscatedName("ub.d")
	public byte[] field645;

	@ObfuscatedName("ub.e")
	public int field646;

	@ObfuscatedName("ub.f")
	public int[] field647;

	@ObfuscatedName("ub.g")
	public int[] field648;

	@ObfuscatedName("ub.h")
	public int[] field649;

	@ObfuscatedName("ub.i")
	public int[] field650;

	@ObfuscatedName("ub.j")
	public boolean field651;

	public class47(byte[] arg0) {
		method249(arg0);
	}

	@ObfuscatedName("ub.a(I[B)V")
	public void method249(byte[] arg0) {
		class37 var2 = new class37(arg0);
		int var3 = var2.method213();
		int var4 = var2.method213();
		if (var3 == var4) {
			field645 = arg0;
			field651 = false;
		} else {
			byte[] var5 = new byte[var3];
			class44.method238(var5, var3, arg0, var4, 6);
			field645 = var5;
			var2 = new class37(field645);
			field651 = true;
		}

		field646 = var2.method211();
		field647 = new int[field646];
		field648 = new int[field646];
		field649 = new int[field646];
		field650 = new int[field646];
		int var6 = field646 * 10 + var2.field542;
		for (int var7 = 0; var7 < field646; var7++) {
			field647[var7] = var2.method214();
			field648[var7] = var2.method213();
			field649[var7] = var2.method213();
			field650[var7] = var6;
			var6 += field649[var7];
		}
	}

	@ObfuscatedName("ub.a(Ljava/lang/String;[BI)[B")
	public byte[] method250(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field646; var5++) {
			if (field647[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field648[var5]];
				}

				if (field651) {
					for (int var6 = 0; var6 < field648[var5]; var6++) {
						arg1[var6] = field645[field650[var5] + var6];
					}
				} else {
					class44.method238(arg1, field648[var5], field645, field649[var5], field650[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
