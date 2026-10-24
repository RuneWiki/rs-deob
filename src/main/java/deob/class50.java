package deob;

@ObfuscatedName("xb")
public final class class50 {

	@ObfuscatedName("xb.b")
	public byte[] field753;

	@ObfuscatedName("xb.c")
	public int field754;

	@ObfuscatedName("xb.d")
	public int[] field755;

	@ObfuscatedName("xb.e")
	public int[] field756;

	@ObfuscatedName("xb.f")
	public int[] field757;

	@ObfuscatedName("xb.g")
	public int[] field758;

	@ObfuscatedName("xb.h")
	public boolean field759;

	public class50(byte[] arg0) {
		method293(arg0);
	}

	@ObfuscatedName("xb.a(I[B)V")
	public void method293(byte[] arg0) {
		class38 var2 = new class38(arg0);
		int var3 = var2.method228();
		int var4 = var2.method228();
		if (var3 == var4) {
			field753 = arg0;
			field759 = false;
		} else {
			byte[] var5 = new byte[var3];
			class44.method256(var5, var3, arg0, var4, 6);
			field753 = var5;
			var2 = new class38(field753);
			field759 = true;
		}

		field754 = var2.method226();
		field755 = new int[field754];
		field756 = new int[field754];
		field757 = new int[field754];
		field758 = new int[field754];
		int var6 = field754 * 10 + var2.field616;
		for (int var7 = 0; var7 < field754; var7++) {
			field755[var7] = var2.method229();
			field756[var7] = var2.method228();
			field757[var7] = var2.method228();
			field758[var7] = var6;
			var6 += field757[var7];
		}
	}

	@ObfuscatedName("xb.a(Ljava/lang/String;[B)[B")
	public byte[] method294(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field754; var5++) {
			if (field755[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field756[var5]];
				}

				if (field759) {
					for (int var6 = 0; var6 < field756[var5]; var6++) {
						arg1[var6] = field753[field758[var5] + var6];
					}
				} else {
					class44.method256(arg1, field756[var5], field753, field757[var5], field758[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
