package deob;

@ObfuscatedName("wb")
public final class class49 {

	@ObfuscatedName("wb.b")
	public int field754;

	@ObfuscatedName("wb.c")
	public int[] field755 = new int[256];

	@ObfuscatedName("wb.d")
	public int[] field756 = new int[256];

	@ObfuscatedName("wb.e")
	public int field757;

	@ObfuscatedName("wb.f")
	public int field758;

	@ObfuscatedName("wb.g")
	public int field759;

	public class49(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field755[var2] = arg0[var2];
		}

		method297();
	}

	@ObfuscatedName("wb.a()I")
	public final int method295() {
		if (field754-- == 0) {
			method296();
			field754 = 255;
		}

		return field755[field754];
	}

	@ObfuscatedName("wb.b()V")
	public final void method296() {
		field758 += ++field759;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field756[var1];

			switch(var1 & 0x3) {
				case 0:
					field757 ^= field757 << 13;
					break;
				case 1:
					field757 ^= field757 >>> 6;
					break;
				case 2:
					field757 ^= field757 << 2;
					break;
				case 3:
					field757 ^= field757 >>> 16;
			}

			field757 += field756[var1 + 128 & 0xFF];
			int var3;
			field756[var1] = var3 = field756[var2 >> 2 & 0xFF] + field757 + field758;
			field755[var1] = field758 = field756[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("wb.c()V")
	public final void method297() {
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
			var8 += field755[var10];
			var7 += field755[var10 + 1];
			var6 += field755[var10 + 2];
			var5 += field755[var10 + 3];
			var4 += field755[var10 + 4];
			var3 += field755[var10 + 5];
			var2 += field755[var10 + 6];
			var1 += field755[var10 + 7];
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
			field756[var10] = var8;
			field756[var10 + 1] = var7;
			field756[var10 + 2] = var6;
			field756[var10 + 3] = var5;
			field756[var10 + 4] = var4;
			field756[var10 + 5] = var3;
			field756[var10 + 6] = var2;
			field756[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field756[var11];
			var7 += field756[var11 + 1];
			var6 += field756[var11 + 2];
			var5 += field756[var11 + 3];
			var4 += field756[var11 + 4];
			var3 += field756[var11 + 5];
			var2 += field756[var11 + 6];
			var1 += field756[var11 + 7];
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
			field756[var11] = var8;
			field756[var11 + 1] = var7;
			field756[var11 + 2] = var6;
			field756[var11 + 3] = var5;
			field756[var11 + 4] = var4;
			field756[var11 + 5] = var3;
			field756[var11 + 6] = var2;
			field756[var11 + 7] = var1;
		}

		method296();
		field754 = 256;
	}
}
