package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("ATJMVOZR")
public final class Jagfile {

	@ObfuscatedName("ATJMVOZR.d")
	public int field50;

	@ObfuscatedName("ATJMVOZR.i")
	public boolean field55;

	@ObfuscatedName("ATJMVOZR.c")
	public byte[] field49;

	@ObfuscatedName("ATJMVOZR.e")
	public int[] field51;

	@ObfuscatedName("ATJMVOZR.f")
	public int[] field52;

	@ObfuscatedName("ATJMVOZR.g")
	public int[] field53;

	@ObfuscatedName("ATJMVOZR.h")
	public int[] field54;

	public Jagfile(byte[] arg0) {
		method1(arg0);
	}

	@ObfuscatedName("ATJMVOZR.a(I[B)V")
	public void method1(byte[] arg0) {
		Packet var2 = new Packet(arg0);
		int var3 = var2.g3();
		int var4 = var2.g3();
		if (var3 == var4) {
			field49 = arg0;
			field55 = false;
		} else {
			byte[] var5 = new byte[var3];
			BZip2.method445(var5, var3, arg0, var4, 6);
			field49 = var5;
			var2 = new Packet(field49);
			field55 = true;
		}

		field50 = var2.g2();
		field51 = new int[field50];
		field52 = new int[field50];
		field53 = new int[field50];
		field54 = new int[field50];
		int var6 = field50 * 10 + var2.pos;
		for (int var7 = 0; var7 < field50; var7++) {
			field51[var7] = var2.g4();
			field52[var7] = var2.g3();
			field53[var7] = var2.g3();
			field54[var7] = var6;
			var6 += field53[var7];
		}
	}

	@ObfuscatedName("ATJMVOZR.a(Ljava/lang/String;[B)[B")
	public byte[] method2(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field50; var5++) {
			if (field51[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field52[var5]];
				}

				if (field55) {
					for (int var6 = 0; var6 < field52[var5]; var6++) {
						arg1[var6] = field49[field54[var5] + var6];
					}
				} else {
					BZip2.method445(arg1, field52[var5], field49, field53[var5], field54[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
