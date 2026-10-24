package deob;

@ObfuscatedName("jb")
public final class class36 extends class32 {

	@ObfuscatedName("jb.A")
	public int field530 = -17780;

	@ObfuscatedName("jb.C")
	public byte[][] field531 = new byte[94][];

	@ObfuscatedName("jb.D")
	public int[] field532 = new int[94];

	@ObfuscatedName("jb.E")
	public int[] field533 = new int[94];

	@ObfuscatedName("jb.F")
	public int[] field534 = new int[94];

	@ObfuscatedName("jb.G")
	public int[] field535 = new int[94];

	@ObfuscatedName("jb.H")
	public int[] field536 = new int[95];

	@ObfuscatedName("jb.I")
	public int[] field537 = new int[256];

	@ObfuscatedName("jb.J")
	public int field538;

	@ObfuscatedName("jb.K")
	public static int[] field539 = new int[256];

	public class36(class47 arg0, String arg1, int arg2) {
		class37 var4 = new class37(arg0.method250(null, arg1 + ".dat"));
		class37 var5 = new class37(arg0.method250(null, "index.dat"));
		var5.field541 = var4.method211() + 4;
		int var6 = var5.method209();
		if (var6 > 0) {
			var5.field541 += (var6 - 1) * 3;
		}

		for (int var7 = 0; var7 < 94; var7++) {
			field534[var7] = var5.method209();
			field535[var7] = var5.method209();
			int var8 = field532[var7] = var5.method211();
			int var9 = field533[var7] = var5.method211();
			int var10 = var5.method209();
			int var11 = var8 * var9;
			field531[var7] = new byte[var11];
			if (var10 == 0) {
				for (int var12 = 0; var12 < var11; var12++) {
					field531[var7][var12] = var4.method210();
				}
			} else if (var10 == 1) {
				for (int var13 = 0; var13 < var8; var13++) {
					for (int var14 = 0; var14 < var9; var14++) {
						field531[var7][var8 * var14 + var13] = var4.method210();
					}
				}
			}

			if (var9 > field538) {
				field538 = var9;
			}

			field534[var7] = 1;
			field536[var7] = var8 + 2;
			int var15 = 0;
			for (int var16 = var9 / 7; var16 < var9; var16++) {
				var15 += field531[var7][var8 * var16];
			}

			if (var15 <= var9 / 7) {
				field536[var7]--;
				field534[var7] = 0;
			}

			int var17 = 0;
			for (int var18 = var9 / 7; var18 < var9; var18++) {
				var17 += field531[var7][var8 * var18 + var8 - 1];
			}

			if (var17 <= var9 / 7) {
				field536[var7]--;
			}
		}

		field536[94] = field536[8];

		if (field530 != arg2) {
			field530 = -126;
		}

		for (int var19 = 0; var19 < 256; var19++) {
			field537[var19] = field536[field539[var19]];
		}
	}

	@ObfuscatedName("jb.a(ILjava/lang/String;III)V")
	public void method188(int arg0, String arg1, int arg2, int arg3) {
		method191(arg3 - method190(arg1) / 2, arg2, arg1, arg0);
	}

	@ObfuscatedName("jb.a(IIIILjava/lang/String;Z)V")
	public void method189(int arg0, int arg1, int arg2, String arg3, boolean arg4) {
		method193(arg1, arg0, arg4, arg3, arg2 - method190(arg3) / 2);
	}

	@ObfuscatedName("jb.a(ILjava/lang/String;)I")
	public int method190(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field537[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("jb.a(IIILjava/lang/String;I)V")
	public void method191(int arg0, int arg1, String arg2, int arg3) {
		if (arg2 != null) {
			arg1 -= field538;
			for (int var5 = 0; var5 < arg2.length(); var5++) {
				int var6 = field539[arg2.charAt(var5)];
				if (var6 != 94) {
					method194(field531[var6], field534[var6] + arg0, field535[var6] + arg1, field532[var6], field533[var6], arg3);
				}

				arg0 += field536[var6];
			}
		}
	}

	@ObfuscatedName("jb.a(IIIZLjava/lang/String;I)V")
	public void method192(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg1 -= method190(arg3) / 2;
			arg0 -= field538;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				int var7 = field539[arg3.charAt(var6)];
				if (var7 != 94) {
					method194(field531[var7], field534[var7] + arg1, field535[var7] + arg0 + (int) (Math.sin(arg4 / 5.0D + var6 / 2.0D) * 5.0D), field532[var7], field533[var7], arg2);
				}

				arg1 += field536[var7];
			}
		}
	}

	@ObfuscatedName("jb.a(IIZLjava/lang/String;IZ)V")
	public void method193(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg1 -= field538;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				if (arg3.charAt(var6) == '@' && var6 + 4 < arg3.length() && arg3.charAt(var6 + 4) == '@') {
					String var7 = arg3.substring(var6 + 1, var6 + 4);
					if (var7.equals("red")) {
						arg0 = 0xFF0000;
					}

					if (var7.equals("gre")) {
						arg0 = 0xFF00;
					}

					if (var7.equals("blu")) {
						arg0 = 255;
					}

					if (var7.equals("yel")) {
						arg0 = 0xFFFF00;
					}

					if (var7.equals("cya")) {
						arg0 = 0xFFFF;
					}

					if (var7.equals("mag")) {
						arg0 = 0xFF00FF;
					}

					if (var7.equals("whi")) {
						arg0 = 0xFFFFFF;
					}

					if (var7.equals("bla")) {
						arg0 = 0;
					}

					if (var7.equals("lre")) {
						arg0 = 0xFF9040;
					}

					if (var7.equals("dre")) {
						arg0 = 0x800000;
					}

					if (var7.equals("dbl")) {
						arg0 = 128;
					}

					if (var7.equals("or1")) {
						arg0 = 0xFFB000;
					}

					if (var7.equals("or2")) {
						arg0 = 0xFF7000;
					}

					if (var7.equals("or3")) {
						arg0 = 0xFF3000;
					}

					if (var7.equals("gr1")) {
						arg0 = 0xC0FF00;
					}

					if (var7.equals("gr2")) {
						arg0 = 0x80FF00;
					}

					if (var7.equals("gr3")) {
						arg0 = 0x40FF00;
					}

					var6 += 4;
				} else {
					int var8 = field539[arg3.charAt(var6)];
					if (var8 != 94) {
						if (arg2) {
							method194(field531[var8], field534[var8] + arg4 + 1, field535[var8] + arg1 + 1, field532[var8], field533[var8], 0);
						}

						method194(field531[var8], field534[var8] + arg4, field535[var8] + arg1, field532[var8], field533[var8], arg0);
					}

					arg4 += field536[var8];
				}
			}
		}
	}

	@ObfuscatedName("jb.a([BIIIII)V")
	public void method194(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = class32.field483 * arg2 + arg1;
		int var8 = class32.field483 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class32.field485) {
			int var11 = class32.field485 - arg2;
			arg4 -= var11;
			arg2 = class32.field485;
			var10 += arg3 * var11;
			var7 += class32.field483 * var11;
		}

		if (arg2 + arg4 >= class32.field486) {
			arg4 -= arg2 + arg4 + 1 - class32.field486;
		}

		if (arg1 < class32.field487) {
			int var12 = class32.field487 - arg1;
			arg3 -= var12;
			arg1 = class32.field487;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= class32.field488) {
			int var13 = arg1 + arg3 + 1 - class32.field488;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method195(class32.field482, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("jb.a([I[BIIIIIII)V")
	public void method195(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

			field539[var1] = var2;
		}
	}
}
