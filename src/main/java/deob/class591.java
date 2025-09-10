package deob;

import java.math.BigInteger;

@ObfuscatedName("wb")
public class class591 extends class545 {

	@ObfuscatedName("wb.au")
	public static long[] field5918 = new long[256];

	@ObfuscatedName("wb.ai")
	public static int[] field5919 = new int[256];

	@ObfuscatedName("wb.aa")
	public byte[] field5917;

	@ObfuscatedName("wb.am")
	public int field5920;

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 0x1;
				}
			}
			field5919[var0] = var1;
		}
		for (int var3 = 0; var3 < 256; var3++) {
			long var4 = (long) var3;
			for (int var6 = 0; var6 < 8; var6++) {
				if ((var4 & 0x1L) == 1L) {
					var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					var4 >>>= 0x1;
				}
			}
			field5918[var3] = var4;
		}
	}

	public class591(int arg0) {
		this.field5917 = class483.method3520(arg0);
		this.field5920 = 0;
	}

	public class591(int arg0, boolean arg1) {
		this.method10319(arg0, arg1);
	}

	public class591(byte[] arg0) {
		this.field5917 = arg0;
		this.field5920 = 0;
	}

	@ObfuscatedName("wb.bx(IZI)V")
	public void method10319(int arg0, boolean arg1) {
		this.method10292();
		this.field5917 = class483.method7629(arg0, arg1);
		this.field5920 = 0;
	}

	@ObfuscatedName("nj.bq([BIII)I")
	public static int method6753(byte[] arg0, int arg1, int arg2) {
		int var3 = -1;
		for (int var4 = arg1; var4 < arg2; var4++) {
			var3 = var3 >>> 8 ^ field5919[(var3 ^ arg0[var4]) & 0xFF];
		}
		return ~var3;
	}

	@ObfuscatedName("sl.bz([BIB)I")
	public static int method9122(byte[] arg0, int arg1) {
		return method6753(arg0, 0, arg1);
	}

	@ObfuscatedName("la.bn(Ljava/lang/String;I)I")
	public static int method5971(String arg0) {
		return arg0.length() + 1;
	}

	@ObfuscatedName("tx.be(Ljava/lang/String;I)I")
	public static int method9489(String arg0) {
		return arg0.length() + 2;
	}

	@ObfuscatedName("wb.af(B)V")
	public void method10292() {
		if (this.field5917 != null) {
			class483.method6335(this.field5917);
		}
		this.field5917 = null;
	}

	@ObfuscatedName("wb.bh(IB)V")
	public void method10320(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) arg0;
	}

	@ObfuscatedName("wb.bk(II)V")
	public void method10321(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 8);
		this.field5917[++this.field5920 - 1] = (byte) arg0;
	}

	@ObfuscatedName("wb.bp(II)V")
	public void method10322(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 16);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 8);
		this.field5917[++this.field5920 - 1] = (byte) arg0;
	}

	@ObfuscatedName("wb.br(II)V")
	public void method10547(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 24);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 16);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 8);
		this.field5917[++this.field5920 - 1] = (byte) arg0;
	}

	@ObfuscatedName("wb.bv(J)V")
	public void method10427(long arg0) {
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 40);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 32);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 24);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 16);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 8);
		this.field5917[++this.field5920 - 1] = (byte) arg0;
	}

	@ObfuscatedName("wb.bj(J)V")
	public void method10325(long arg0) {
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 56);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 48);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 40);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 32);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 24);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 16);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 8);
		this.field5917[++this.field5920 - 1] = (byte) arg0;
	}

	@ObfuscatedName("wb.bm(ZI)V")
	public void method10405(boolean arg0) {
		this.method10320(arg0 ? 1 : 0);
	}

	@ObfuscatedName("wb.bf(Ljava/lang/String;B)V")
	public void method10504(String arg0) {
		int var2 = arg0.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.field5920 += class444.method5685(arg0, 0, arg0.length(), this.field5917, this.field5920);
		this.field5917[++this.field5920 - 1] = 0;
	}

	@ObfuscatedName("wb.bw(Ljava/lang/String;B)V")
	public void method10471(String arg0) {
		int var2 = arg0.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.field5917[++this.field5920 - 1] = 0;
		this.field5920 += class444.method5685(arg0, 0, arg0.length(), this.field5917, this.field5920);
		this.field5917[++this.field5920 - 1] = 0;
	}

	@ObfuscatedName("wb.bc(Ljava/lang/CharSequence;B)V")
	public void method10538(CharSequence arg0) {
		int var2 = class577.method4218(arg0);
		this.field5917[++this.field5920 - 1] = 0;
		this.method10336(var2);
		int var3 = this.field5920;
		byte[] var4 = this.field5917;
		int var5 = this.field5920;
		int var6 = arg0.length();
		int var7 = var5;
		for (int var8 = 0; var8 < var6; var8++) {
			char var9 = arg0.charAt(var8);
			if (var9 <= 127) {
				var4[var7++] = (byte) var9;
			} else if (var9 <= 2047) {
				var4[var7++] = (byte) (var9 >> 6 | 0xC0);
				var4[var7++] = (byte) (var9 & 0x3F | 0x80);
			} else {
				var4[var7++] = (byte) (var9 >> 12 | 0xE0);
				var4[var7++] = (byte) (var9 >> 6 & 0x3F | 0x80);
				var4[var7++] = (byte) (var9 & 0x3F | 0x80);
			}
		}
		int var10 = var7 - var5;
		this.field5920 = var10 + var3;
	}

	@ObfuscatedName("wb.cw([BIII)V")
	public void method10330(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			this.field5917[++this.field5920 - 1] = arg0[var4];
		}
	}

	@ObfuscatedName("wb.cz(Lwb;I)V")
	public void method10331(class591 arg0) {
		this.method10330(arg0.field5917, 0, arg0.field5920);
	}

	@ObfuscatedName("wb.cf(II)V")
	public void method10332(int arg0) {
		if (arg0 < 0) {
			throw new IllegalArgumentException();
		}
		this.field5917[this.field5920 - arg0 - 4] = (byte) (arg0 >> 24);
		this.field5917[this.field5920 - arg0 - 3] = (byte) (arg0 >> 16);
		this.field5917[this.field5920 - arg0 - 2] = (byte) (arg0 >> 8);
		this.field5917[this.field5920 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("wb.cg(II)V")
	public void method10333(int arg0) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.field5917[this.field5920 - arg0 - 2] = (byte) (arg0 >> 8);
		this.field5917[this.field5920 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("wb.ci(IB)V")
	public void method10334(int arg0) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.field5917[this.field5920 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("wb.cp(IB)V")
	public void method10335(int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method10320(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method10321(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("wb.cm(II)V")
	public void method10336(int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method10320(arg0 >>> 28 | 0x80);
					}
					this.method10320(arg0 >>> 21 | 0x80);
				}
				this.method10320(arg0 >>> 14 | 0x80);
			}
			this.method10320(arg0 >>> 7 | 0x80);
		}
		this.method10320(arg0 & 0x7F);
	}

	@ObfuscatedName("wb.cc(II)V")
	public void method10337(int arg0) {
		while (arg0 < 0 || arg0 > 127) {
			this.method10320(arg0 & 0x7F | 0x80);
			arg0 >>>= 0x7;
		}
		this.method10320(arg0);
	}

	@ObfuscatedName("wb.cj(II)V")
	public void method10584(int arg0) {
		int var2 = arg0 << 1 ^ arg0 >> 31;
		this.method10337(var2);
	}

	@ObfuscatedName("wb.ce(B)I")
	public int method10339() {
		return this.field5917[++this.field5920 - 1] & 0xFF;
	}

	@ObfuscatedName("wb.cr(I)B")
	public byte method10340() {
		return this.field5917[++this.field5920 - 1];
	}

	@ObfuscatedName("wb.cb(I)I")
	public int method10341() {
		this.field5920 += 2;
		return ((this.field5917[this.field5920 - 2] & 0xFF) << 8) + (this.field5917[this.field5920 - 1] & 0xFF);
	}

	@ObfuscatedName("wb.cu(B)I")
	public int method10593() {
		this.field5920 += 2;
		int var1 = ((this.field5917[this.field5920 - 2] & 0xFF) << 8) + (this.field5917[this.field5920 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("wb.cq(I)I")
	public int method10419() {
		this.field5920 += 3;
		return (this.field5917[this.field5920 - 1] & 0xFF) + ((this.field5917[this.field5920 - 3] & 0xFF) << 16) + ((this.field5917[this.field5920 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("wb.cn(I)I")
	public int method10432() {
		this.field5920 += 3;
		int var1 = (this.field5917[this.field5920 - 1] & 0xFF) + ((this.field5917[this.field5920 - 2] & 0xFF) << 8) + ((this.field5917[this.field5920 - 3] & 0xFF) << 16);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}
		return var1;
	}

	@ObfuscatedName("wb.cl(I)I")
	public int method10345() {
		this.field5920 += 4;
		return (this.field5917[this.field5920 - 1] & 0xFF) + ((this.field5917[this.field5920 - 2] & 0xFF) << 8) + ((this.field5917[this.field5920 - 4] & 0xFF) << 24) + ((this.field5917[this.field5920 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("wb.cx(B)J")
	public long method10346() {
		long var1 = (long) this.method10345() & 0xFFFFFFFFL;
		long var3 = (long) this.method10345() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("wb.ca(I)F")
	public float method10503() {
		return Float.intBitsToFloat(this.method10345());
	}

	@ObfuscatedName("wb.cy(B)Z")
	public boolean method10553() {
		return (this.method10339() & 0x1) == 1;
	}

	@ObfuscatedName("wb.cd(I)Ljava/lang/String;")
	public String method10349() {
		if (this.field5917[this.field5920] == 0) {
			this.field5920++;
			return null;
		} else {
			return this.method10350();
		}
	}

	@ObfuscatedName("wb.co(B)Ljava/lang/String;")
	public String method10350() {
		int var1 = this.field5920;
		while (this.field5917[++this.field5920 - 1] != 0) {
		}
		int var2 = this.field5920 - var1 - 1;
		return var2 == 0 ? "" : class444.method4456(this.field5917, var1, var2);
	}

	@ObfuscatedName("wb.ck(B)Ljava/lang/String;")
	public String method10502() {
		byte var1 = this.field5917[++this.field5920 - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		}
		int var2 = this.field5920;
		while (this.field5917[++this.field5920 - 1] != 0) {
		}
		int var3 = this.field5920 - var2 - 1;
		return var3 == 0 ? "" : class444.method4456(this.field5917, var2, var3);
	}

	@ObfuscatedName("wb.ct(B)Ljava/lang/String;")
	public String method10352() {
		byte var1 = this.field5917[++this.field5920 - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		}
		int var2 = this.method10360();
		if (this.field5920 + var2 > this.field5917.length) {
			throw new IllegalStateException("");
		}
		byte[] var3 = this.field5917;
		int var4 = this.field5920;
		char[] var5 = new char[var2];
		int var6 = 0;
		int var7 = var4;
		int var8 = var2 + var4;
		while (var7 < var8) {
			int var9 = var3[var7++] & 0xFF;
			int var10;
			if (var9 < 128) {
				if (var9 == 0) {
					var10 = 65533;
				} else {
					var10 = var9;
				}
			} else if (var9 < 192) {
				var10 = 65533;
			} else if (var9 < 224) {
				if (var7 < var8 && (var3[var7] & 0xC0) == 128) {
					var10 = (var9 & 0x1F) << 6 | var3[var7++] & 0x3F;
					if (var10 < 128) {
						var10 = 65533;
					}
				} else {
					var10 = 65533;
				}
			} else if (var9 < 240) {
				if (var7 + 1 < var8 && (var3[var7] & 0xC0) == 128 && (var3[var7 + 1] & 0xC0) == 128) {
					var10 = (var9 & 0xF) << 12 | (var3[var7++] & 0x3F) << 6 | var3[var7++] & 0x3F;
					if (var10 < 2048) {
						var10 = 65533;
					}
				} else {
					var10 = 65533;
				}
			} else if (var9 >= 248) {
				var10 = 65533;
			} else if (var7 + 2 < var8 && (var3[var7] & 0xC0) == 128 && (var3[var7 + 1] & 0xC0) == 128 && (var3[var7 + 2] & 0xC0) == 128) {
				int var11 = (var9 & 0x7) << 18 | (var3[var7++] & 0x3F) << 12 | (var3[var7++] & 0x3F) << 6 | var3[var7++] & 0x3F;
				if (var11 >= 65536 && var11 <= 1114111) {
					var10 = 65533;
				} else {
					var10 = 65533;
				}
			} else {
				var10 = 65533;
			}
			var5[var6++] = (char) var10;
		}
		String var12 = new String(var5, 0, var6);
		this.field5920 += var2;
		return var12;
	}

	@ObfuscatedName("wb.ch([BIII)V")
	public void method10407(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = this.field5917[++this.field5920 - 1];
		}
	}

	@ObfuscatedName("wb.cs(I)I")
	public int method10354() {
		int var1 = this.field5917[this.field5920] & 0xFF;
		return var1 < 128 ? this.method10339() - 64 : this.method10341() - 49152;
	}

	@ObfuscatedName("wb.dd(B)I")
	public int method10355() {
		int var1 = this.field5917[this.field5920] & 0xFF;
		return var1 < 128 ? this.method10339() : this.method10341() - 32768;
	}

	@ObfuscatedName("wb.dr(I)I")
	public int method10356() {
		int var1 = this.field5917[this.field5920] & 0xFF;
		return var1 < 128 ? this.method10339() - 1 : this.method10341() - 32769;
	}

	@ObfuscatedName("wb.ds(I)I")
	public int method10357() {
		int var1 = 0;
		int var2;
		for (var2 = this.method10355(); var2 == 32767; var2 = this.method10355()) {
			var1 += 32767;
		}
		return var1 + var2;
	}

	@ObfuscatedName("wb.dt(I)I")
	public int method10358() {
		return this.field5917[this.field5920] < 0 ? this.method10345() & Integer.MAX_VALUE : this.method10341();
	}

	@ObfuscatedName("wb.da(B)I")
	public int method10365() {
		if (this.field5917[this.field5920] < 0) {
			return this.method10345() & Integer.MAX_VALUE;
		} else {
			int var1 = this.method10341();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("wb.dc(B)I")
	public int method10360() {
		byte var1 = this.field5917[++this.field5920 - 1];
		int var2 = 0;
		while (var1 < 0) {
			var2 = (var2 | var1 & 0x7F) << 7;
			var1 = this.field5917[++this.field5920 - 1];
		}
		return var2 | var1;
	}

	@ObfuscatedName("wb.dp(I)I")
	public int method10361() {
		int var1 = 0;
		int var2 = 0;
		int var3;
		do {
			var3 = this.method10339();
			var1 |= (var3 & 0x7F) << var2;
			var2 += 7;
		} while (var3 > 127);
		return var1;
	}

	@ObfuscatedName("wb.dw(I)I")
	public int method10374() {
		int var1 = this.method10361();
		return var1 >>> 1 ^ -(var1 & 0x1);
	}

	@ObfuscatedName("wb.db([II)V")
	public void method10363(int[] arg0) {
		int var2 = this.field5920 / 8;
		this.field5920 = 0;
		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = this.method10345();
			int var5 = this.method10345();
			int var6 = 0;
			int var7 = -1640531527;
			int var8 = 32;
			while (var8-- > 0) {
				var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
				var6 += var7;
				var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
			}
			this.field5920 -= 8;
			this.method10547(var4);
			this.method10547(var5);
		}
	}

	@ObfuscatedName("wb.dq([IS)V")
	public void method10446(int[] arg0) {
		int var2 = this.field5920 / 8;
		this.field5920 = 0;
		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = this.method10345();
			int var5 = this.method10345();
			int var6 = -957401312;
			int var7 = -1640531527;
			int var8 = 32;
			while (var8-- > 0) {
				var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
				var6 -= var7;
				var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
			}
			this.field5920 -= 8;
			this.method10547(var4);
			this.method10547(var5);
		}
	}

	@ObfuscatedName("wb.dh([IIII)V")
	public void method10338(int[] arg0, int arg1, int arg2) {
		int var4 = this.field5920;
		this.field5920 = arg1;
		int var5 = (arg2 - arg1) / 8;
		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.method10345();
			int var8 = this.method10345();
			int var9 = 0;
			int var10 = -1640531527;
			int var11 = 32;
			while (var11-- > 0) {
				var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
				var9 += var10;
				var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
			}
			this.field5920 -= 8;
			this.method10547(var7);
			this.method10547(var8);
		}
		this.field5920 = var4;
	}

	@ObfuscatedName("wb.de([IIII)V")
	public void method10366(int[] arg0, int arg1, int arg2) {
		int var4 = this.field5920;
		this.field5920 = arg1;
		int var5 = (arg2 - arg1) / 8;
		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.method10345();
			int var8 = this.method10345();
			int var9 = -957401312;
			int var10 = -1640531527;
			int var11 = 32;
			while (var11-- > 0) {
				var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
				var9 -= var10;
				var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
			}
			this.field5920 -= 8;
			this.method10547(var7);
			this.method10547(var8);
		}
		this.field5920 = var4;
	}

	@ObfuscatedName("wb.dy(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method10367(BigInteger arg0, BigInteger arg1) {
		int var3 = this.field5920;
		this.field5920 = 0;
		byte[] var4 = new byte[var3];
		this.method10407(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		this.field5920 = 0;
		this.method10321(var7.length);
		this.method10330(var7, 0, var7.length);
	}

	@ObfuscatedName("wb.dm(II)I")
	public int method10368(int arg0) {
		int var2 = method6753(this.field5917, arg0, this.field5920);
		this.method10547(var2);
		return var2;
	}

	@ObfuscatedName("wb.dz(I)Z")
	public boolean method10385() {
		this.field5920 -= 4;
		int var1 = method6753(this.field5917, 0, this.field5920);
		int var2 = this.method10345();
		return var1 == var2;
	}

	@ObfuscatedName("wb.dg(IB)V")
	public void method10370(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("wb.dl(II)V")
	public void method10371(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) -arg0;
	}

	@ObfuscatedName("wb.dv(II)V")
	public void method10372(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) (128 - arg0);
	}

	@ObfuscatedName("wb.dk(I)I")
	public int method10373() {
		return this.field5917[++this.field5920 - 1] - 128 & 0xFF;
	}

	@ObfuscatedName("wb.dn(I)I")
	public int method10422() {
		return -this.field5917[++this.field5920 - 1] & 0xFF;
	}

	@ObfuscatedName("wb.di(I)I")
	public int method10375() {
		return 128 - this.field5917[++this.field5920 - 1] & 0xFF;
	}

	@ObfuscatedName("wb.dj(B)B")
	public byte method10376() {
		return (byte) (this.field5917[++this.field5920 - 1] - 128);
	}

	@ObfuscatedName("wb.du(I)B")
	public byte method10400() {
		return (byte) -this.field5917[++this.field5920 - 1];
	}

	@ObfuscatedName("wb.do(I)B")
	public byte method10378() {
		return (byte) (128 - this.field5917[++this.field5920 - 1]);
	}

	@ObfuscatedName("wb.ef(II)V")
	public void method10379(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) arg0;
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("wb.ez(II)V")
	public void method10466(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 8);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("wb.er(II)V")
	public void method10381(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) (arg0 + 128);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("wb.eb(I)I")
	public int method10563() {
		this.field5920 += 2;
		return ((this.field5917[this.field5920 - 1] & 0xFF) << 8) + (this.field5917[this.field5920 - 2] & 0xFF);
	}

	@ObfuscatedName("wb.ec(I)I")
	public int method10324() {
		this.field5920 += 2;
		return ((this.field5917[this.field5920 - 2] & 0xFF) << 8) + (this.field5917[this.field5920 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("wb.ew(I)I")
	public int method10384() {
		this.field5920 += 2;
		return ((this.field5917[this.field5920 - 1] & 0xFF) << 8) + (this.field5917[this.field5920 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("wb.eo(I)I")
	public int method10586() {
		this.field5920 += 2;
		int var1 = ((this.field5917[this.field5920 - 1] & 0xFF) << 8) + (this.field5917[this.field5920 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("wb.eg(I)I")
	public int method10386() {
		this.field5920 += 2;
		int var1 = ((this.field5917[this.field5920 - 2] & 0xFF) << 8) + (this.field5917[this.field5920 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("wb.en(I)I")
	public int method10387() {
		this.field5920 += 2;
		int var1 = ((this.field5917[this.field5920 - 1] & 0xFF) << 8) + (this.field5917[this.field5920 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("wb.ek(II)V")
	public void method10388(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) arg0;
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 8);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("wb.es(I)I")
	public int method10562() {
		this.field5920 += 3;
		return (this.field5917[this.field5920 - 1] & 0xFF) + ((this.field5917[this.field5920 - 3] & 0xFF) << 8) + ((this.field5917[this.field5920 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("wb.ed(I)I")
	public int method10390() {
		this.field5920 += 3;
		int var1 = (this.field5917[this.field5920 - 2] & 0xFF) + ((this.field5917[this.field5920 - 3] & 0xFF) << 16) + ((this.field5917[this.field5920 - 1] & 0xFF) << 8);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}
		return var1;
	}

	@ObfuscatedName("wb.ep(B)I")
	public int method10391() {
		this.field5920 += 3;
		int var1 = (this.field5917[this.field5920 - 1] & 0xFF) + ((this.field5917[this.field5920 - 2] & 0xFF) << 16) + ((this.field5917[this.field5920 - 3] & 0xFF) << 8);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}
		return var1;
	}

	@ObfuscatedName("wb.eq(II)V")
	public void method10392(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) arg0;
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 8);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 16);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("wb.eu(II)V")
	public void method10393(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 8);
		this.field5917[++this.field5920 - 1] = (byte) arg0;
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 24);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("wb.el(II)V")
	public void method10377(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 16);
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 24);
		this.field5917[++this.field5920 - 1] = (byte) arg0;
		this.field5917[++this.field5920 - 1] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("wb.ey(B)I")
	public int method10395() {
		this.field5920 += 4;
		return (this.field5917[this.field5920 - 4] & 0xFF) + ((this.field5917[this.field5920 - 3] & 0xFF) << 8) + ((this.field5917[this.field5920 - 1] & 0xFF) << 24) + ((this.field5917[this.field5920 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("wb.ea(B)I")
	public int method10436() {
		this.field5920 += 4;
		return (this.field5917[this.field5920 - 3] & 0xFF) + ((this.field5917[this.field5920 - 4] & 0xFF) << 8) + ((this.field5917[this.field5920 - 2] & 0xFF) << 24) + ((this.field5917[this.field5920 - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("wb.ej(I)I")
	public int method10397() {
		this.field5920 += 4;
		return (this.field5917[this.field5920 - 2] & 0xFF) + ((this.field5917[this.field5920 - 1] & 0xFF) << 8) + ((this.field5917[this.field5920 - 4] & 0xFF) << 16) + ((this.field5917[this.field5920 - 3] & 0xFF) << 24);
	}

	@ObfuscatedName("wb.ei([BIII)V")
	public void method10398(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = (byte) (this.field5917[++this.field5920 - 1] - 128);
		}
	}
}
