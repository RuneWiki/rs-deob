package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("KRGHNEZN")
public final class Isaac {

	@ObfuscatedName("KRGHNEZN.c")
	public int[] field945 = new int[256];

	@ObfuscatedName("KRGHNEZN.b")
	public int[] field944 = new int[256];

	@ObfuscatedName("KRGHNEZN.a")
	public int field943;

	@ObfuscatedName("KRGHNEZN.d")
	public int field946;

	@ObfuscatedName("KRGHNEZN.e")
	public int field947;

	@ObfuscatedName("KRGHNEZN.f")
	public int field948;

	public Isaac(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field944[var2] = arg0[var2];
		}

		method331();
	}

	@ObfuscatedName("KRGHNEZN.a()I")
	public final int method329() {
		if (field943-- == 0) {
			method330();
			field943 = 255;
		}

		return field944[field943];
	}

	@ObfuscatedName("KRGHNEZN.b()V")
	public final void method330() {
		field947 += ++field948;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field945[var1];

			if ((var1 & 0x3) == 0) {
				field946 ^= field946 << 13;
			} else if ((var1 & 0x3) == 1) {
				field946 ^= field946 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field946 ^= field946 << 2;
			} else if ((var1 & 0x3) == 3) {
				field946 ^= field946 >>> 16;
			}

			field946 += field945[var1 + 128 & 0xFF];
			int var3;
			field945[var1] = var3 = field945[var2 >> 2 & 0xFF] + field946 + field947;
			field944[var1] = field947 = field945[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("KRGHNEZN.c()V")
	public final void method331() {
		int var1 = 0x9E3779B9;
		int var2 = 0x9E3779B9;
		int var3 = 0x9E3779B9;
		int var4 = 0x9E3779B9;
		int var5 = 0x9E3779B9;
		int var6 = 0x9E3779B9;
		int var7 = 0x9E3779B9;
		int var8 = 0x9E3779B9;
		for (int var9 = 0; var9 < 4; var9++) {
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
		}

		for (int var10 = 0; var10 < 256; var10 += 8) {
			var8 += field944[var10];
			var7 += field944[var10 + 1];
			var6 += field944[var10 + 2];
			var5 += field944[var10 + 3];
			var4 += field944[var10 + 4];
			var3 += field944[var10 + 5];
			var2 += field944[var10 + 6];
			var1 += field944[var10 + 7];
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
			field945[var10] = var8;
			field945[var10 + 1] = var7;
			field945[var10 + 2] = var6;
			field945[var10 + 3] = var5;
			field945[var10 + 4] = var4;
			field945[var10 + 5] = var3;
			field945[var10 + 6] = var2;
			field945[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field945[var11];
			var7 += field945[var11 + 1];
			var6 += field945[var11 + 2];
			var5 += field945[var11 + 3];
			var4 += field945[var11 + 4];
			var3 += field945[var11 + 5];
			var2 += field945[var11 + 6];
			var1 += field945[var11 + 7];
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
			field945[var11] = var8;
			field945[var11 + 1] = var7;
			field945[var11 + 2] = var6;
			field945[var11 + 3] = var5;
			field945[var11 + 4] = var4;
			field945[var11 + 5] = var3;
			field945[var11 + 6] = var2;
			field945[var11 + 7] = var1;
		}

		method330();
		field943 = 256;
	}
}
