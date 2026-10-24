package deob;

@ObfuscatedName("tb")
public final class class46 {

	@ObfuscatedName("tb.a")
	public int field631;

	@ObfuscatedName("tb.b")
	public int[] field632 = new int[256];

	@ObfuscatedName("tb.c")
	public int[] field633 = new int[256];

	@ObfuscatedName("tb.d")
	public int field634;

	@ObfuscatedName("tb.e")
	public int field635;

	@ObfuscatedName("tb.f")
	public int field636;

	public class46(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field632[var2] = arg0[var2];
		}

		method240();
	}

	@ObfuscatedName("tb.a()I")
	public final int method238() {
		if (field631-- == 0) {
			method239();
			field631 = 255;
		}

		return field632[field631];
	}

	@ObfuscatedName("tb.a(I)V")
	public final void method239() {
		field635 += ++field636;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field633[var1];

			switch(var1 & 0x3) {
				case 0:
					field634 ^= field634 << 13;
					break;
				case 1:
					field634 ^= field634 >>> 6;
					break;
				case 2:
					field634 ^= field634 << 2;
					break;
				case 3:
					field634 ^= field634 >>> 16;
			}

			field634 += field633[var1 + 128 & 0xFF];
			int var3;
			field633[var1] = var3 = field633[var2 >> 2 & 0xFF] + field634 + field635;
			field632[var1] = field635 = field633[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("tb.b()V")
	public final void method240() {
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
			var8 += field632[var10];
			var7 += field632[var10 + 1];
			var6 += field632[var10 + 2];
			var5 += field632[var10 + 3];
			var4 += field632[var10 + 4];
			var3 += field632[var10 + 5];
			var2 += field632[var10 + 6];
			var1 += field632[var10 + 7];
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
			field633[var10] = var8;
			field633[var10 + 1] = var7;
			field633[var10 + 2] = var6;
			field633[var10 + 3] = var5;
			field633[var10 + 4] = var4;
			field633[var10 + 5] = var3;
			field633[var10 + 6] = var2;
			field633[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field633[var11];
			var7 += field633[var11 + 1];
			var6 += field633[var11 + 2];
			var5 += field633[var11 + 3];
			var4 += field633[var11 + 4];
			var3 += field633[var11 + 5];
			var2 += field633[var11 + 6];
			var1 += field633[var11 + 7];
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
			field633[var11] = var8;
			field633[var11 + 1] = var7;
			field633[var11 + 2] = var6;
			field633[var11 + 3] = var5;
			field633[var11 + 4] = var4;
			field633[var11 + 5] = var3;
			field633[var11 + 6] = var2;
			field633[var11 + 7] = var1;
		}

		method239();
		field631 = 256;
	}
}
