package deob;

@ObfuscatedName("jb")
public final class class36 extends class32 {

	@ObfuscatedName("jb.x")
	public byte[][] field527 = new byte[94][];

	@ObfuscatedName("jb.y")
	public int[] field528 = new int[94];

	@ObfuscatedName("jb.z")
	public int[] field529 = new int[94];

	@ObfuscatedName("jb.A")
	public int[] field530 = new int[94];

	@ObfuscatedName("jb.B")
	public int[] field531 = new int[94];

	@ObfuscatedName("jb.C")
	public int[] field532 = new int[95];

	@ObfuscatedName("jb.D")
	public int[] field533 = new int[256];

	@ObfuscatedName("jb.E")
	public int field534;

	@ObfuscatedName("jb.F")
	public static int[] field535 = new int[256];

	public class36(class47 arg0, String arg1) {
		class37 var3 = new class37(arg0.method242(null, arg1 + ".dat"));
		class37 var4 = new class37(arg0.method242(null, "index.dat"));
		var4.field537 = var3.method203() + 4;
		int var5 = var4.method201();
		if (var5 > 0) {
			var4.field537 += (var5 - 1) * 3;
		}

		for (int var6 = 0; var6 < 94; var6++) {
			field530[var6] = var4.method201();
			field531[var6] = var4.method201();
			int var7 = field528[var6] = var4.method203();
			int var8 = field529[var6] = var4.method203();
			int var9 = var4.method201();
			int var10 = var7 * var8;
			field527[var6] = new byte[var10];
			if (var9 == 0) {
				for (int var11 = 0; var11 < var10; var11++) {
					field527[var6][var11] = var3.method202();
				}
			} else if (var9 == 1) {
				for (int var12 = 0; var12 < var7; var12++) {
					for (int var13 = 0; var13 < var8; var13++) {
						field527[var6][var7 * var13 + var12] = var3.method202();
					}
				}
			}

			if (var8 > field534) {
				field534 = var8;
			}

			field530[var6] = 1;
			field532[var6] = var7 + 2;
			int var14 = 0;
			for (int var15 = var8 / 7; var15 < var8; var15++) {
				var14 += field527[var6][var7 * var15];
			}

			if (var14 <= var8 / 7) {
				field532[var6]--;
				field530[var6] = 0;
			}

			int var16 = 0;
			for (int var17 = var8 / 7; var17 < var8; var17++) {
				var16 += field527[var6][var7 * var17 + var7 - 1];
			}

			if (var16 <= var8 / 7) {
				field532[var6]--;
			}
		}

		field532[94] = field532[8];
		for (int var18 = 0; var18 < 256; var18++) {
			field533[var18] = field532[field535[var18]];
		}
	}

	@ObfuscatedName("jb.a(ZIIILjava/lang/String;)V")
	public void method182(int arg0, int arg1, int arg2, String arg3) {
		method185(arg3, arg2 - method184(arg3) / 2, arg1, arg0);
	}

	@ObfuscatedName("jb.a(IIILjava/lang/String;IZ)V")
	public void method183(int arg0, int arg1, int arg2, String arg3, boolean arg4) {
		method187(arg4, arg1 - method184(arg3) / 2, arg2, arg0, arg3);
	}

	@ObfuscatedName("jb.a(Ljava/lang/String;Z)I")
	public int method184(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field533[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("jb.a(Ljava/lang/String;IIZI)V")
	public void method185(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg3 -= field534;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				int var6 = field535[arg0.charAt(var5)];
				if (var6 != 94) {
					method188(field527[var6], field530[var6] + arg1, field531[var6] + arg3, field528[var6], field529[var6], arg2);
				}

				arg1 += field532[var6];
			}
		}
	}

	@ObfuscatedName("jb.a(IIILjava/lang/String;II)V")
	public void method186(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg4 -= method184(arg2) / 2;
			arg0 -= field534;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				int var7 = field535[arg2.charAt(var6)];
				if (var7 != 94) {
					method188(field527[var7], field530[var7] + arg4, field531[var7] + arg0 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field528[var7], field529[var7], arg1);
				}

				arg4 += field532[var7];
			}
		}
	}

	@ObfuscatedName("jb.a(IZIIILjava/lang/String;)V")
	public void method187(boolean arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg3 -= field534;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				if (arg4.charAt(var6) == '@' && var6 + 4 < arg4.length() && arg4.charAt(var6 + 4) == '@') {
					String var7 = arg4.substring(var6 + 1, var6 + 4);
					if (var7.equals("red")) {
						arg2 = 0xFF0000;
					}

					if (var7.equals("gre")) {
						arg2 = 0xFF00;
					}

					if (var7.equals("blu")) {
						arg2 = 255;
					}

					if (var7.equals("yel")) {
						arg2 = 0xFFFF00;
					}

					if (var7.equals("cya")) {
						arg2 = 0xFFFF;
					}

					if (var7.equals("mag")) {
						arg2 = 0xFF00FF;
					}

					if (var7.equals("whi")) {
						arg2 = 0xFFFFFF;
					}

					if (var7.equals("bla")) {
						arg2 = 0;
					}

					if (var7.equals("lre")) {
						arg2 = 0xFF9040;
					}

					if (var7.equals("dre")) {
						arg2 = 0x800000;
					}

					if (var7.equals("dbl")) {
						arg2 = 128;
					}

					if (var7.equals("or1")) {
						arg2 = 0xFFB000;
					}

					if (var7.equals("or2")) {
						arg2 = 0xFF7000;
					}

					if (var7.equals("or3")) {
						arg2 = 0xFF3000;
					}

					if (var7.equals("gr1")) {
						arg2 = 0xC0FF00;
					}

					if (var7.equals("gr2")) {
						arg2 = 0x80FF00;
					}

					if (var7.equals("gr3")) {
						arg2 = 0x40FF00;
					}

					var6 += 4;
				} else {
					int var8 = field535[arg4.charAt(var6)];
					if (var8 != 94) {
						if (arg0) {
							method188(field527[var8], field530[var8] + arg1 + 1, field531[var8] + arg3 + 1, field528[var8], field529[var8], 0);
						}

						method188(field527[var8], field530[var8] + arg1, field531[var8] + arg3, field528[var8], field529[var8], arg2);
					}

					arg1 += field532[var8];
				}
			}
		}
	}

	@ObfuscatedName("jb.a([BIIIII)V")
	public void method188(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = class32.field480 * arg2 + arg1;
		int var8 = class32.field480 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class32.field482) {
			int var11 = class32.field482 - arg2;
			arg4 -= var11;
			arg2 = class32.field482;
			var10 += arg3 * var11;
			var7 += class32.field480 * var11;
		}

		if (arg2 + arg4 >= class32.field483) {
			arg4 -= arg2 + arg4 + 1 - class32.field483;
		}

		if (arg1 < class32.field484) {
			int var12 = class32.field484 - arg1;
			arg3 -= var12;
			arg1 = class32.field484;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= class32.field485) {
			int var13 = arg1 + arg3 + 1 - class32.field485;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method189(class32.field479, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("jb.a([I[BIIIIIII)V")
	public void method189(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	static {
		String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = var0.indexOf(var1);
			if (var2 == -1) {
				var2 = 74;
			}

			field535[var1] = var2;
		}
	}
}
