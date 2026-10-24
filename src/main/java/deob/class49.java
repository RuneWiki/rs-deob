package deob;

@ObfuscatedName("wb")
public final class class49 {

	@ObfuscatedName("wb.a")
	public int field747;

	@ObfuscatedName("wb.b")
	public int[] field748 = new int[256];

	@ObfuscatedName("wb.c")
	public int[] field749 = new int[256];

	@ObfuscatedName("wb.d")
	public int field750;

	@ObfuscatedName("wb.e")
	public int field751;

	@ObfuscatedName("wb.f")
	public int field752;

	public class49(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field748[var2] = arg0[var2];
		}

		method292();
	}

	@ObfuscatedName("wb.a()I")
	public final int method290() {
		if (field747-- == 0) {
			method291();
			field747 = 255;
		}

		return field748[field747];
	}

	@ObfuscatedName("wb.b()V")
	public final void method291() {
		field751 += ++field752;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field749[var1];

			switch(var1 & 0x3) {
				case 0:
					field750 ^= field750 << 13;
					break;
				case 1:
					field750 ^= field750 >>> 6;
					break;
				case 2:
					field750 ^= field750 << 2;
					break;
				case 3:
					field750 ^= field750 >>> 16;
			}

			field750 += field749[var1 + 128 & 0xFF];
			int var3;
			field749[var1] = var3 = field749[var2 >> 2 & 0xFF] + field750 + field751;
			field748[var1] = field751 = field749[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("wb.c()V")
	public final void method292() {
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
			var8 += field748[var10];
			var7 += field748[var10 + 1];
			var6 += field748[var10 + 2];
			var5 += field748[var10 + 3];
			var4 += field748[var10 + 4];
			var3 += field748[var10 + 5];
			var2 += field748[var10 + 6];
			var1 += field748[var10 + 7];
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
			field749[var10] = var8;
			field749[var10 + 1] = var7;
			field749[var10 + 2] = var6;
			field749[var10 + 3] = var5;
			field749[var10 + 4] = var4;
			field749[var10 + 5] = var3;
			field749[var10 + 6] = var2;
			field749[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field749[var11];
			var7 += field749[var11 + 1];
			var6 += field749[var11 + 2];
			var5 += field749[var11 + 3];
			var4 += field749[var11 + 4];
			var3 += field749[var11 + 5];
			var2 += field749[var11 + 6];
			var1 += field749[var11 + 7];
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
			field749[var11] = var8;
			field749[var11 + 1] = var7;
			field749[var11 + 2] = var6;
			field749[var11 + 3] = var5;
			field749[var11 + 4] = var4;
			field749[var11 + 5] = var3;
			field749[var11 + 6] = var2;
			field749[var11 + 7] = var1;
		}

		method291();
		field747 = 256;
	}
}
