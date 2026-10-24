package deob;

@ObfuscatedName("sb")
public final class class45 {

	@ObfuscatedName("sb.a")
	public int field619;

	@ObfuscatedName("sb.b")
	public int[] field620 = new int[256];

	@ObfuscatedName("sb.c")
	public int[] field621 = new int[256];

	@ObfuscatedName("sb.d")
	public int field622;

	@ObfuscatedName("sb.e")
	public int field623;

	@ObfuscatedName("sb.f")
	public int field624;

	public class45(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field620[var2] = arg0[var2];
		}

		method223();
	}

	@ObfuscatedName("sb.a()I")
	public final int method221() {
		if (field619-- == 0) {
			method222();
			field619 = 255;
		}

		return field620[field619];
	}

	@ObfuscatedName("sb.a(I)V")
	public final void method222() {
		field623 += ++field624;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field621[var1];

			switch(var1 & 0x3) {
				case 0:
					field622 ^= field622 << 13;
					break;
				case 1:
					field622 ^= field622 >>> 6;
					break;
				case 2:
					field622 ^= field622 << 2;
					break;
				case 3:
					field622 ^= field622 >>> 16;
			}

			field622 += field621[var1 + 128 & 0xFF];
			int var3;
			field621[var1] = var3 = field621[var2 >> 2 & 0xFF] + field622 + field623;
			field620[var1] = field623 = field621[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("sb.b()V")
	public final void method223() {
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
			var8 += field620[var10];
			var7 += field620[var10 + 1];
			var6 += field620[var10 + 2];
			var5 += field620[var10 + 3];
			var4 += field620[var10 + 4];
			var3 += field620[var10 + 5];
			var2 += field620[var10 + 6];
			var1 += field620[var10 + 7];
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
			field621[var10] = var8;
			field621[var10 + 1] = var7;
			field621[var10 + 2] = var6;
			field621[var10 + 3] = var5;
			field621[var10 + 4] = var4;
			field621[var10 + 5] = var3;
			field621[var10 + 6] = var2;
			field621[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field621[var11];
			var7 += field621[var11 + 1];
			var6 += field621[var11 + 2];
			var5 += field621[var11 + 3];
			var4 += field621[var11 + 4];
			var3 += field621[var11 + 5];
			var2 += field621[var11 + 6];
			var1 += field621[var11 + 7];
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
			field621[var11] = var8;
			field621[var11 + 1] = var7;
			field621[var11 + 2] = var6;
			field621[var11 + 3] = var5;
			field621[var11 + 4] = var4;
			field621[var11 + 5] = var3;
			field621[var11 + 6] = var2;
			field621[var11 + 7] = var1;
		}

		method222();
		field619 = 256;
	}
}
