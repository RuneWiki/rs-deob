package deob;

@ObfuscatedName("tb")
public final class class46 {

	@ObfuscatedName("tb.b")
	public int field635;

	@ObfuscatedName("tb.c")
	public int[] field636 = new int[256];

	@ObfuscatedName("tb.d")
	public int[] field637 = new int[256];

	@ObfuscatedName("tb.e")
	public int field638;

	@ObfuscatedName("tb.f")
	public int field639;

	@ObfuscatedName("tb.g")
	public int field640;

	public class46(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field636[var2] = arg0[var2];
		}

		method248();
	}

	@ObfuscatedName("tb.a()I")
	public final int method246() {
		if (field635-- == 0) {
			method247();
			field635 = 255;
		}

		return field636[field635];
	}

	@ObfuscatedName("tb.b()V")
	public final void method247() {
		field639 += ++field640;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field637[var1];

			switch(var1 & 0x3) {
				case 0:
					field638 ^= field638 << 13;
					break;
				case 1:
					field638 ^= field638 >>> 6;
					break;
				case 2:
					field638 ^= field638 << 2;
					break;
				case 3:
					field638 ^= field638 >>> 16;
			}

			field638 += field637[var1 + 128 & 0xFF];
			int var3;
			field637[var1] = var3 = field637[var2 >> 2 & 0xFF] + field638 + field639;
			field636[var1] = field639 = field637[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("tb.c()V")
	public final void method248() {
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
			var8 += field636[var10];
			var7 += field636[var10 + 1];
			var6 += field636[var10 + 2];
			var5 += field636[var10 + 3];
			var4 += field636[var10 + 4];
			var3 += field636[var10 + 5];
			var2 += field636[var10 + 6];
			var1 += field636[var10 + 7];
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
			field637[var10] = var8;
			field637[var10 + 1] = var7;
			field637[var10 + 2] = var6;
			field637[var10 + 3] = var5;
			field637[var10 + 4] = var4;
			field637[var10 + 5] = var3;
			field637[var10 + 6] = var2;
			field637[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field637[var11];
			var7 += field637[var11 + 1];
			var6 += field637[var11 + 2];
			var5 += field637[var11 + 3];
			var4 += field637[var11 + 4];
			var3 += field637[var11 + 5];
			var2 += field637[var11 + 6];
			var1 += field637[var11 + 7];
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
			field637[var11] = var8;
			field637[var11 + 1] = var7;
			field637[var11 + 2] = var6;
			field637[var11 + 3] = var5;
			field637[var11 + 4] = var4;
			field637[var11 + 5] = var3;
			field637[var11 + 6] = var2;
			field637[var11 + 7] = var1;
		}

		method247();
		field635 = 256;
	}
}
