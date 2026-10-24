package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("tb")
public final class Isaac {

	@ObfuscatedName("tb.a")
	public int count;

	@ObfuscatedName("tb.b")
	public int[] rsl = new int[256];

	@ObfuscatedName("tb.c")
	public int[] mem = new int[256];

	@ObfuscatedName("tb.d")
	public int a;

	@ObfuscatedName("tb.e")
	public int b;

	@ObfuscatedName("tb.f")
	public int c;

	public Isaac(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			rsl[var2] = arg0[var2];
		}

		init();
	}

	@ObfuscatedName("tb.a()I")
	public final int takeNextValue() {
		if (count-- == 0) {
			generate();
			count = 255;
		}

		return rsl[count];
	}

	@ObfuscatedName("tb.b()V")
	public final void generate() {
		b += ++c;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = mem[var1];

			switch(var1 & 0x3) {
				case 0:
					a ^= a << 13;
					break;
				case 1:
					a ^= a >>> 6;
					break;
				case 2:
					a ^= a << 2;
					break;
				case 3:
					a ^= a >>> 16;
			}

			a += mem[var1 + 128 & 0xFF];
			int var3;
			mem[var1] = var3 = mem[var2 >> 2 & 0xFF] + a + b;
			rsl[var1] = b = mem[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("tb.c()V")
	public final void init() {
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
			var8 += rsl[var10];
			var7 += rsl[var10 + 1];
			var6 += rsl[var10 + 2];
			var5 += rsl[var10 + 3];
			var4 += rsl[var10 + 4];
			var3 += rsl[var10 + 5];
			var2 += rsl[var10 + 6];
			var1 += rsl[var10 + 7];
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
			mem[var10] = var8;
			mem[var10 + 1] = var7;
			mem[var10 + 2] = var6;
			mem[var10 + 3] = var5;
			mem[var10 + 4] = var4;
			mem[var10 + 5] = var3;
			mem[var10 + 6] = var2;
			mem[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += mem[var11];
			var7 += mem[var11 + 1];
			var6 += mem[var11 + 2];
			var5 += mem[var11 + 3];
			var4 += mem[var11 + 4];
			var3 += mem[var11 + 5];
			var2 += mem[var11 + 6];
			var1 += mem[var11 + 7];
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
			mem[var11] = var8;
			mem[var11 + 1] = var7;
			mem[var11 + 2] = var6;
			mem[var11 + 3] = var5;
			mem[var11 + 4] = var4;
			mem[var11 + 5] = var3;
			mem[var11 + 6] = var2;
			mem[var11 + 7] = var1;
		}

		generate();
		count = 256;
	}
}
