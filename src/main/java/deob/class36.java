package deob;

import java.util.Random;

@ObfuscatedName("jb")
public final class class36 extends class32 {

	@ObfuscatedName("jb.z")
	public byte[][] field532 = new byte[94][];

	@ObfuscatedName("jb.A")
	public int[] field533 = new int[94];

	@ObfuscatedName("jb.B")
	public int[] field534 = new int[94];

	@ObfuscatedName("jb.C")
	public int[] field535 = new int[94];

	@ObfuscatedName("jb.D")
	public int[] field536 = new int[94];

	@ObfuscatedName("jb.E")
	public int[] field537 = new int[95];

	@ObfuscatedName("jb.F")
	public int[] field538 = new int[256];

	@ObfuscatedName("jb.H")
	public Random field540 = new Random();

	@ObfuscatedName("jb.G")
	public int field539;

	@ObfuscatedName("jb.I")
	public static int[] field541 = new int[256];

	public class36(class47 arg0, String arg1) {
		class37 var3 = new class37(arg0.method257(null, arg1 + ".dat"));
		class37 var4 = new class37(arg0.method257(null, "index.dat"));
		var4.field543 = var3.method218() + 4;
		int var5 = var4.method216();
		if (var5 > 0) {
			var4.field543 += (var5 - 1) * 3;
		}

		for (int var6 = 0; var6 < 94; var6++) {
			field535[var6] = var4.method216();
			field536[var6] = var4.method216();
			int var7 = field533[var6] = var4.method218();
			int var8 = field534[var6] = var4.method218();
			int var9 = var4.method216();
			int var10 = var7 * var8;
			field532[var6] = new byte[var10];
			if (var9 == 0) {
				for (int var11 = 0; var11 < var10; var11++) {
					field532[var6][var11] = var3.method217();
				}
			} else if (var9 == 1) {
				for (int var12 = 0; var12 < var7; var12++) {
					for (int var13 = 0; var13 < var8; var13++) {
						field532[var6][var7 * var13 + var12] = var3.method217();
					}
				}
			}

			if (var8 > field539) {
				field539 = var8;
			}

			field535[var6] = 1;
			field537[var6] = var7 + 2;
			int var14 = 0;
			for (int var15 = var8 / 7; var15 < var8; var15++) {
				var14 += field532[var6][var7 * var15];
			}

			if (var14 <= var8 / 7) {
				field537[var6]--;
				field535[var6] = 0;
			}

			int var16 = 0;
			for (int var17 = var8 / 7; var17 < var8; var17++) {
				var16 += field532[var6][var7 * var17 + var7 - 1];
			}

			if (var16 <= var8 / 7) {
				field537[var6]--;
			}
		}

		field537[94] = field537[8];
		for (int var18 = 0; var18 < 256; var18++) {
			field538[var18] = field537[field541[var18]];
		}
	}

	@ObfuscatedName("jb.a(IIILjava/lang/String;I)V")
	public void method191(int arg0, int arg1, String arg2, int arg3) {
		method194(arg1, arg2, arg3, arg0 - method193(arg2) / 2);
	}

	@ObfuscatedName("jb.a(Ljava/lang/String;ZIIBI)V")
	public void method192(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
		method196(arg4, arg3 - method193(arg0) / 2, arg1, arg2, arg0);
	}

	@ObfuscatedName("jb.a(ILjava/lang/String;)I")
	public int method193(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field538[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("jb.a(ILjava/lang/String;III)V")
	public void method194(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg0 -= field539;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				int var6 = field541[arg1.charAt(var5)];
				if (var6 != 94) {
					method199(field532[var6], field535[var6] + arg3, field536[var6] + arg0, field533[var6], field534[var6], arg2);
				}

				arg3 += field537[var6];
			}
		}
	}

	@ObfuscatedName("jb.a(IILjava/lang/String;IIZ)V")
	public void method195(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg1 -= method193(arg2) / 2;
			arg0 -= field539;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				int var7 = field541[arg2.charAt(var6)];
				if (var7 != 94) {
					method199(field532[var7], field535[var7] + arg1, field536[var7] + arg0 + (int) (Math.sin(arg4 / 5.0D + var6 / 2.0D) * 5.0D), field533[var7], field534[var7], arg3);
				}

				arg1 += field537[var7];
			}
		}
	}

	@ObfuscatedName("jb.a(IIIZILjava/lang/String;)V")
	public void method196(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg0 -= field539;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				if (arg4.charAt(var6) == '@' && var6 + 4 < arg4.length() && arg4.charAt(var6 + 4) == '@') {
					arg3 = method198(arg4.substring(var6 + 1, var6 + 4));
					var6 += 4;
				} else {
					int var7 = field541[arg4.charAt(var6)];
					if (var7 != 94) {
						if (arg2) {
							method199(field532[var7], field535[var7] + arg1 + 1, field536[var7] + arg0 + 1, field533[var7], field534[var7], 0);
						}

						method199(field532[var7], field535[var7] + arg1, field536[var7] + arg0, field533[var7], field534[var7], arg3);
					}

					arg1 += field537[var7];
				}
			}
		}
	}

	@ObfuscatedName("jb.a(IIILjava/lang/String;IZI)V")
	public void method197(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5) {
		if (arg2 != null) {
			field540.setSeed(arg3);
			int var7 = (field540.nextInt() & 0x1F) + 192;
			arg0 -= field539;
			for (int var8 = 0; var8 < arg2.length(); var8++) {
				if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
					arg1 = method198(arg2.substring(var8 + 1, var8 + 4));
					var8 += 4;
				} else {
					int var9 = field541[arg2.charAt(var8)];
					if (var9 != 94) {
						if (arg4) {
							method201(192, field536[var9] + arg0 + 1, field533[var9], field535[var9] + arg5 + 1, 0, field534[var9], field532[var9]);
						}

						method201(var7, field536[var9] + arg0, field533[var9], field535[var9] + arg5, arg1, field534[var9], field532[var9]);
					}

					arg5 += field537[var9];
					if ((field540.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("jb.a(Ljava/lang/String;B)I")
	public int method198(String arg0) {
		if (arg0.equals("red")) {
			return 0xFF0000;
		}

		if (arg0.equals("gre")) {
			return 0xFF00;
		}

		if (arg0.equals("blu")) {
			return 255;
		}

		if (arg0.equals("yel")) {
			return 0xFFFF00;
		}

		if (arg0.equals("cya")) {
			return 0xFFFF;
		}

		if (arg0.equals("mag")) {
			return 0xFF00FF;
		}

		if (arg0.equals("whi")) {
			return 0xFFFFFF;
		}

		if (arg0.equals("bla")) {
			return 0;
		}

		if (arg0.equals("lre")) {
			return 0xFF9040;
		}

		if (arg0.equals("dre")) {
			return 0x800000;
		}

		if (arg0.equals("dbl")) {
			return 128;
		}

		if (arg0.equals("or1")) {
			return 0xFFB000;
		}

		if (arg0.equals("or2")) {
			return 0xFF7000;
		}

		if (arg0.equals("or3")) {
			return 0xFF3000;
		}

		if (arg0.equals("gr1")) {
			return 0xC0FF00;
		}

		if (arg0.equals("gr2")) {
			return 0x80FF00;
		}

		if (arg0.equals("gr3")) {
			return 0x40FF00;
		}

		return 0;
	}

	@ObfuscatedName("jb.a([BIIIII)V")
	public void method199(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = class32.field485 * arg2 + arg1;
		int var8 = class32.field485 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class32.field487) {
			int var11 = class32.field487 - arg2;
			arg4 -= var11;
			arg2 = class32.field487;
			var10 += arg3 * var11;
			var7 += class32.field485 * var11;
		}

		if (arg2 + arg4 >= class32.field488) {
			arg4 -= arg2 + arg4 + 1 - class32.field488;
		}

		if (arg1 < class32.field489) {
			int var12 = class32.field489 - arg1;
			arg3 -= var12;
			arg1 = class32.field489;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= class32.field490) {
			int var13 = arg1 + arg3 + 1 - class32.field490;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method200(class32.field484, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("jb.a([I[BIIIIIII)V")
	public void method200(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}

				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}

				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}

				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}

			for (int var13 = arg5; var13 < 0; var13++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}

			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("jb.a(IIIIIII[B)V")
	public void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
		int var8 = class32.field485 * arg1 + arg3;
		int var9 = class32.field485 - arg2;
		int var10 = 0;
		int var11 = 0;
		if (arg1 < class32.field487) {
			int var12 = class32.field487 - arg1;
			arg5 -= var12;
			arg1 = class32.field487;
			var11 += arg2 * var12;
			var8 += class32.field485 * var12;
		}

		if (arg1 + arg5 >= class32.field488) {
			arg5 -= arg1 + arg5 + 1 - class32.field488;
		}

		if (arg3 < class32.field489) {
			int var13 = class32.field489 - arg3;
			arg2 -= var13;
			arg3 = class32.field489;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg3 >= class32.field490) {
			int var14 = arg2 + arg3 + 1 - class32.field490;
			arg2 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg2 > 0 && arg5 > 0) {
			method202(arg2, var10, arg4, var9, arg5, var11, class32.field484, var8, arg6, arg0);
		}
	}

	@ObfuscatedName("jb.a(IIIIII[IIZ[BI)V")
	public void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, byte[] arg8, int arg9) {
		arg2 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		arg9 = 256 - arg9;
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = -arg0; var12 < 0; var12++) {
				if (arg8[arg5++] == 0) {
					arg7++;
				} else {
					int var13 = arg6[arg7];
					arg6[arg7++] = (((var13 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 & 0xFF0000) >> 8) + arg2;
				}
			}

			arg7 += arg3;
			arg5 += arg1;
		}
	}

	static {
		String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = var0.indexOf(var1);
			if (var2 == -1) {
				var2 = 74;
			}

			field541[var1] = var2;
		}
	}
}
