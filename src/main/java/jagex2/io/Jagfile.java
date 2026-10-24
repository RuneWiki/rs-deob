package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("yb")
public final class Jagfile {

	@ObfuscatedName("yb.d")
	public byte[] field757;

	@ObfuscatedName("yb.e")
	public int field758;

	@ObfuscatedName("yb.f")
	public int[] field759;

	@ObfuscatedName("yb.g")
	public int[] field760;

	@ObfuscatedName("yb.h")
	public int[] field761;

	@ObfuscatedName("yb.i")
	public int[] field762;

	@ObfuscatedName("yb.j")
	public boolean field763;

	public Jagfile(byte[] arg0) {
		method307(arg0);
	}

	@ObfuscatedName("yb.a([BI)V")
	public void method307(byte[] arg0) {
		Packet var2 = new Packet(arg0);
		int var3 = var2.method242();
		int var4 = var2.method242();
		if (var3 == var4) {
			field757 = arg0;
			field763 = false;
		} else {
			byte[] var5 = new byte[var3];
			BZip2.method270(var5, var3, arg0, var4, 6);
			field757 = var5;
			var2 = new Packet(field757);
			field763 = true;
		}

		field758 = var2.method240();
		field759 = new int[field758];
		field760 = new int[field758];
		field761 = new int[field758];
		field762 = new int[field758];
		int var6 = field758 * 10 + var2.field621;
		for (int var7 = 0; var7 < field758; var7++) {
			field759[var7] = var2.method243();
			field760[var7] = var2.method242();
			field761[var7] = var2.method242();
			field762[var7] = var6;
			var6 += field761[var7];
		}
	}

	@ObfuscatedName("yb.a(Ljava/lang/String;[B)[B")
	public byte[] method308(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field758; var5++) {
			if (field759[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field760[var5]];
				}

				if (field763) {
					for (int var6 = 0; var6 < field760[var5]; var6++) {
						arg1[var6] = field757[field762[var5] + var6];
					}
				} else {
					BZip2.method270(arg1, field760[var5], field757, field761[var5], field762[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
