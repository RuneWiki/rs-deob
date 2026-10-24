package deob;

@ObfuscatedName("ub")
public final class class47 {

	@ObfuscatedName("ub.d")
	public byte[] field644;

	@ObfuscatedName("ub.e")
	public int field645;

	@ObfuscatedName("ub.f")
	public int[] field646;

	@ObfuscatedName("ub.g")
	public int[] field647;

	@ObfuscatedName("ub.h")
	public int[] field648;

	@ObfuscatedName("ub.i")
	public int[] field649;

	@ObfuscatedName("ub.j")
	public boolean field650;

	public class47(byte[] arg0) {
		method256(arg0);
	}

	@ObfuscatedName("ub.a([BI)V")
	public void method256(byte[] arg0) {
		class37 var2 = new class37(arg0);
		int var3 = var2.method220();
		int var4 = var2.method220();
		if (var3 == var4) {
			field644 = arg0;
			field650 = false;
		} else {
			byte[] var5 = new byte[var3];
			class44.method245(var5, var3, arg0, var4, 6);
			field644 = var5;
			var2 = new class37(field644);
			field650 = true;
		}

		field645 = var2.method218();
		field646 = new int[field645];
		field647 = new int[field645];
		field648 = new int[field645];
		field649 = new int[field645];
		int var6 = field645 * 10 + var2.field543;
		for (int var7 = 0; var7 < field645; var7++) {
			field646[var7] = var2.method221();
			field647[var7] = var2.method220();
			field648[var7] = var2.method220();
			field649[var7] = var6;
			var6 += field648[var7];
		}
	}

	@ObfuscatedName("ub.a([BLjava/lang/String;I)[B")
	public byte[] method257(byte[] arg0, String arg1) {
		int var3 = 0;
		arg1 = arg1.toUpperCase();
		for (int var4 = 0; var4 < arg1.length(); var4++) {
			var3 = var3 * 61 + arg1.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field645; var5++) {
			if (field646[var5] == var3) {
				if (arg0 == null) {
					arg0 = new byte[field647[var5]];
				}

				if (field650) {
					for (int var6 = 0; var6 < field647[var5]; var6++) {
						arg0[var6] = field644[field649[var5] + var6];
					}
				} else {
					class44.method245(arg0, field647[var5], field644, field648[var5], field649[var5]);
				}

				return arg0;
			}
		}

		return null;
	}
}
