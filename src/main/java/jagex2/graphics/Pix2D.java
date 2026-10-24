package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

@ObfuscatedName("LFYNQWSZ")
public class Pix2D extends DoublyLinkable {

	@ObfuscatedName("LFYNQWSZ.m")
	public static int field950;

	@ObfuscatedName("LFYNQWSZ.n")
	public static int field951;

	@ObfuscatedName("LFYNQWSZ.o")
	public static int field952;

	@ObfuscatedName("LFYNQWSZ.p")
	public static int field953;

	@ObfuscatedName("LFYNQWSZ.q")
	public static int field954;

	@ObfuscatedName("LFYNQWSZ.r")
	public static int field955;

	@ObfuscatedName("LFYNQWSZ.s")
	public static int field956;

	@ObfuscatedName("LFYNQWSZ.t")
	public static int field957;

	@ObfuscatedName("LFYNQWSZ.u")
	public static int field958;

	@ObfuscatedName("LFYNQWSZ.l")
	public static int[] field949;

	@ObfuscatedName("LFYNQWSZ.a(ZII[I)V")
	public static void method332(int arg0, int arg1, int[] arg2) {
		field949 = arg2;
		field950 = arg0;
		field951 = arg1;
		method334(0, 0, arg1, arg0);
	}

	@ObfuscatedName("LFYNQWSZ.a(B)V")
	public static void method333() {
		field954 = 0;
		field952 = 0;
		field955 = field950;
		field953 = field951;
		field956 = field955 - 1;
		field957 = field955 / 2;
	}

	@ObfuscatedName("LFYNQWSZ.a(IIIIZ)V")
	public static void method334(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg3 > field950) {
			arg3 = field950;
		}

		if (arg2 > field951) {
			arg2 = field951;
		}

		field954 = arg1;
		field952 = arg0;
		field955 = arg3;
		field953 = arg2;
		field956 = field955 - 1;
		field957 = field955 / 2;
		field958 = field953 / 2;
	}

	@ObfuscatedName("LFYNQWSZ.a(I)V")
	public static void method335() {
		int var0 = field951 * field950;
		for (int var1 = 0; var1 < var0; var1++) {
			field949[var1] = 0;
		}
	}

	@ObfuscatedName("LFYNQWSZ.a(ZIIIIII)V")
	public static void method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 < field954) {
			arg2 -= field954 - arg5;
			arg5 = field954;
		}

		if (arg1 < field952) {
			arg3 -= field952 - arg1;
			arg1 = field952;
		}

		if (arg2 + arg5 > field955) {
			arg2 = field955 - arg5;
		}

		if (arg1 + arg3 > field953) {
			arg3 = field953 - arg1;
		}

		int var6 = 256 - arg4;
		int var7 = (arg0 >> 16 & 0xFF) * arg4;
		int var8 = (arg0 >> 8 & 0xFF) * arg4;
		int var9 = (arg0 & 0xFF) * arg4;
		int var10 = field950 - arg2;
		int var11 = field950 * arg1 + arg5;
		for (int var12 = 0; var12 < arg3; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = (field949[var11] >> 16 & 0xFF) * var6;
				int var15 = (field949[var11] >> 8 & 0xFF) * var6;
				int var16 = (field949[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field949[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("LFYNQWSZ.a(IIIBII)V")
	public static void method337(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < field954) {
			arg3 -= field954 - arg4;
			arg4 = field954;
		}

		if (arg1 < field952) {
			arg0 -= field952 - arg1;
			arg1 = field952;
		}

		if (arg3 + arg4 > field955) {
			arg3 = field955 - arg4;
		}

		if (arg0 + arg1 > field953) {
			arg0 = field953 - arg1;
		}

		int var5 = field950 - arg3;
		int var6 = field950 * arg1 + arg4;
		for (int var7 = -arg0; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field949[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("LFYNQWSZ.a(IIIIII)V")
	public static void method338(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method340(arg3, arg2, arg0, arg4);
		method340(arg3, arg2, arg0 + arg1 - 1, arg4);
		method342(arg3, arg2, arg1, arg0);
		method342(arg3 + arg4 - 1, arg2, arg1, arg0);
	}

	@ObfuscatedName("LFYNQWSZ.a(IIIIIIB)V")
	public static void method339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method341(arg4, arg0, arg1, arg5, arg2);
		method341(arg3 + arg4 - 1, arg0, arg1, arg5, arg2);

		if (arg3 >= 3) {
			method343(arg4 + 1, arg0, arg2, arg3 - 2, arg5);
			method343(arg4 + 1, arg0 + arg1 - 1, arg2, arg3 - 2, arg5);
		}
	}

	@ObfuscatedName("LFYNQWSZ.b(IIIIZ)V")
	public static void method340(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field952 && arg2 < field953) {
			if (arg0 < field954) {
				arg3 -= field954 - arg0;
				arg0 = field954;
			}

			if (arg0 + arg3 > field955) {
				arg3 = field955 - arg0;
			}

			int var4 = field950 * arg2 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field949[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("LFYNQWSZ.b(IIIIII)V")
	public static void method341(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field952 && arg0 < field953) {
			if (arg1 < field954) {
				arg2 -= field954 - arg1;
				arg1 = field954;
			}

			if (arg1 + arg2 > field955) {
				arg2 = field955 - arg1;
			}

			int var5 = 256 - arg3;
			int var6 = (arg4 >> 16 & 0xFF) * arg3;
			int var7 = (arg4 >> 8 & 0xFF) * arg3;
			int var8 = (arg4 & 0xFF) * arg3;
			int var9 = field950 * arg0 + arg1;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field949[var9] >> 16 & 0xFF) * var5;
				int var12 = (field949[var9] >> 8 & 0xFF) * var5;
				int var13 = (field949[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field949[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("LFYNQWSZ.a(IIIZI)V")
	public static void method342(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field954 && arg0 < field955) {
			if (arg3 < field952) {
				arg2 -= field952 - arg3;
				arg3 = field952;
			}

			if (arg2 + arg3 > field953) {
				arg2 = field953 - arg3;
			}

			int var4 = field950 * arg3 + arg0;
			for (int var5 = 0; var5 < arg2; var5++) {
				field949[field950 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("LFYNQWSZ.c(IIIIII)V")
	public static void method343(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field954 && arg1 < field955) {
			if (arg0 < field952) {
				arg3 -= field952 - arg0;
				arg0 = field952;
			}

			if (arg0 + arg3 > field953) {
				arg3 = field953 - arg0;
			}

			int var5 = 256 - arg4;
			int var6 = (arg2 >> 16 & 0xFF) * arg4;
			int var7 = (arg2 >> 8 & 0xFF) * arg4;
			int var8 = (arg2 & 0xFF) * arg4;
			int var9 = field950 * arg0 + arg1;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field949[var9] >> 16 & 0xFF) * var5;
				int var12 = (field949[var9] >> 8 & 0xFF) * var5;
				int var13 = (field949[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field949[var9] = var14;
				var9 += field950;
			}
		}
	}
}
