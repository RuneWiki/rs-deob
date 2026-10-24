package deob;

@ObfuscatedName("xb")
public final class class50 {

	@ObfuscatedName("xb.c")
	public byte[] field755;

	@ObfuscatedName("xb.d")
	public int field756;

	@ObfuscatedName("xb.e")
	public int[] field757;

	@ObfuscatedName("xb.f")
	public int[] field758;

	@ObfuscatedName("xb.g")
	public int[] field759;

	@ObfuscatedName("xb.h")
	public int[] field760;

	@ObfuscatedName("xb.i")
	public boolean field761;

	public class50(byte[] arg0) {
		method294(arg0);
	}

	@ObfuscatedName("xb.a(I[B)V")
	public void method294(byte[] arg0) {
		class38 var2 = new class38(arg0);
		int var3 = var2.method229();
		int var4 = var2.method229();
		if (var3 == var4) {
			field755 = arg0;
			field761 = false;
		} else {
			byte[] var5 = new byte[var3];
			class44.method257(var5, var3, arg0, var4, 6);
			field755 = var5;
			var2 = new class38(field755);
			field761 = true;
		}

		field756 = var2.method227();
		field757 = new int[field756];
		field758 = new int[field756];
		field759 = new int[field756];
		field760 = new int[field756];
		int var6 = field756 * 10 + var2.field617;
		for (int var7 = 0; var7 < field756; var7++) {
			field757[var7] = var2.method230();
			field758[var7] = var2.method229();
			field759[var7] = var2.method229();
			field760[var7] = var6;
			var6 += field759[var7];
		}
	}

	@ObfuscatedName("xb.a(Ljava/lang/String;[B)[B")
	public byte[] method295(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field756; var5++) {
			if (field757[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field758[var5]];
				}

				if (field761) {
					for (int var6 = 0; var6 < field758[var5]; var6++) {
						arg1[var6] = field755[field760[var5] + var6];
					}
				} else {
					class44.method257(arg1, field758[var5], field755, field759[var5], field760[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
