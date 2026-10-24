package deob;

@ObfuscatedName("xb")
public final class class50 {

	@ObfuscatedName("xb.b")
	public int field756;

	@ObfuscatedName("xb.c")
	public int[] field757 = new int[256];

	@ObfuscatedName("xb.d")
	public int[] field758 = new int[256];

	@ObfuscatedName("xb.e")
	public int field759;

	@ObfuscatedName("xb.f")
	public int field760;

	@ObfuscatedName("xb.g")
	public int field761;

	public class50(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field757[var2] = arg0[var2];
		}

		method296();
	}

	@ObfuscatedName("xb.a()I")
	public final int method294() {
		if (field756-- == 0) {
			method295();
			field756 = 255;
		}

		return field757[field756];
	}

	@ObfuscatedName("xb.b()V")
	public final void method295() {
		field760 += ++field761;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field758[var1];

			switch(var1 & 0x3) {
				case 0:
					field759 ^= field759 << 13;
					break;
				case 1:
					field759 ^= field759 >>> 6;
					break;
				case 2:
					field759 ^= field759 << 2;
					break;
				case 3:
					field759 ^= field759 >>> 16;
			}

			field759 += field758[var1 + 128 & 0xFF];
			int var3;
			field758[var1] = var3 = field758[var2 >> 2 & 0xFF] + field759 + field760;
			field757[var1] = field760 = field758[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("xb.c()V")
	public final void method296() {
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
			var8 += field757[var10];
			var7 += field757[var10 + 1];
			var6 += field757[var10 + 2];
			var5 += field757[var10 + 3];
			var4 += field757[var10 + 4];
			var3 += field757[var10 + 5];
			var2 += field757[var10 + 6];
			var1 += field757[var10 + 7];
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
			field758[var10] = var8;
			field758[var10 + 1] = var7;
			field758[var10 + 2] = var6;
			field758[var10 + 3] = var5;
			field758[var10 + 4] = var4;
			field758[var10 + 5] = var3;
			field758[var10 + 6] = var2;
			field758[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field758[var11];
			var7 += field758[var11 + 1];
			var6 += field758[var11 + 2];
			var5 += field758[var11 + 3];
			var4 += field758[var11 + 4];
			var3 += field758[var11 + 5];
			var2 += field758[var11 + 6];
			var1 += field758[var11 + 7];
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
			field758[var11] = var8;
			field758[var11 + 1] = var7;
			field758[var11 + 2] = var6;
			field758[var11 + 3] = var5;
			field758[var11 + 4] = var4;
			field758[var11 + 5] = var3;
			field758[var11 + 6] = var2;
			field758[var11 + 7] = var1;
		}

		method295();
		field756 = 256;
	}
}
