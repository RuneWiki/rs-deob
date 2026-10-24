package deob;

@ObfuscatedName("jb")
public final class class36 extends class32 {

	@ObfuscatedName("jb.A")
	public byte[][] field532 = new byte[94][];

	@ObfuscatedName("jb.B")
	public int[] field533 = new int[94];

	@ObfuscatedName("jb.C")
	public int[] field534 = new int[94];

	@ObfuscatedName("jb.D")
	public int[] field535 = new int[94];

	@ObfuscatedName("jb.E")
	public int[] field536 = new int[94];

	@ObfuscatedName("jb.F")
	public int[] field537 = new int[95];

	@ObfuscatedName("jb.G")
	public int[] field538 = new int[256];

	@ObfuscatedName("jb.H")
	public int field539;

	@ObfuscatedName("jb.I")
	public static int[] field540 = new int[256];

	public class36(String arg0, class47 arg1) {
		class37 var3 = new class37(arg1.method250(arg0 + ".dat", null));
		class37 var4 = new class37(arg1.method250("index.dat", null));
		var4.field542 = var3.method211() + 4;
		int var5 = var4.method209();
		if (var5 > 0) {
			var4.field542 += (var5 - 1) * 3;
		}

		for (int var6 = 0; var6 < 94; var6++) {
			field535[var6] = var4.method209();
			field536[var6] = var4.method209();
			int var7 = field533[var6] = var4.method211();
			int var8 = field534[var6] = var4.method211();
			int var9 = var4.method209();
			int var10 = var7 * var8;
			field532[var6] = new byte[var10];
			if (var9 == 0) {
				for (int var11 = 0; var11 < var10; var11++) {
					field532[var6][var11] = var3.method210();
				}
			} else if (var9 == 1) {
				for (int var12 = 0; var12 < var7; var12++) {
					for (int var13 = 0; var13 < var8; var13++) {
						field532[var6][var7 * var13 + var12] = var3.method210();
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
			field538[var18] = field537[field540[var18]];
		}
	}

	@ObfuscatedName("jb.a(IIILjava/lang/String;I)V")
	public void method188(int arg0, int arg1, String arg2, int arg3) {
		method191(arg0 - method190(arg2) / 2, arg3, arg2, arg1);
	}

	@ObfuscatedName("jb.a(ILjava/lang/String;ZIBI)V")
	public void method189(int arg0, String arg1, boolean arg2, int arg3, int arg4) {
		method193(arg4 - method190(arg1) / 2, arg3, arg0, arg1, arg2);
	}

	@ObfuscatedName("jb.a(Ljava/lang/String;Z)I")
	public int method190(String arg0) {
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

	@ObfuscatedName("jb.a(IIBLjava/lang/String;I)V")
	public void method191(int arg0, int arg1, String arg2, int arg3) {
		if (arg2 != null) {
			arg3 -= field539;
			for (int var5 = 0; var5 < arg2.length(); var5++) {
				int var6 = field540[arg2.charAt(var5)];
				if (var6 != 94) {
					method194(field532[var6], field535[var6] + arg0, field536[var6] + arg3, field533[var6], field534[var6], arg1);
				}

				arg0 += field537[var6];
			}
		}
	}

	@ObfuscatedName("jb.a(IIILjava/lang/String;II)V")
	public void method192(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg0 -= method190(arg2) / 2;
			arg1 -= field539;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				int var7 = field540[arg2.charAt(var6)];
				if (var7 != 94) {
					method194(field532[var7], field535[var7] + arg0, field536[var7] + arg1 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field533[var7], field534[var7], arg4);
				}

				arg0 += field537[var7];
			}
		}
	}

	@ObfuscatedName("jb.a(IIILjava/lang/String;IZ)V")
	public void method193(int arg0, int arg1, int arg2, String arg3, boolean arg4) {
		if (arg3 != null) {
			arg2 -= field539;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				if (arg3.charAt(var6) == '@' && var6 + 4 < arg3.length() && arg3.charAt(var6 + 4) == '@') {
					String var7 = arg3.substring(var6 + 1, var6 + 4);
					if (var7.equals("red")) {
						arg1 = 0xFF0000;
					}

					if (var7.equals("gre")) {
						arg1 = 0xFF00;
					}

					if (var7.equals("blu")) {
						arg1 = 255;
					}

					if (var7.equals("yel")) {
						arg1 = 0xFFFF00;
					}

					if (var7.equals("cya")) {
						arg1 = 0xFFFF;
					}

					if (var7.equals("mag")) {
						arg1 = 0xFF00FF;
					}

					if (var7.equals("whi")) {
						arg1 = 0xFFFFFF;
					}

					if (var7.equals("bla")) {
						arg1 = 0;
					}

					if (var7.equals("lre")) {
						arg1 = 0xFF9040;
					}

					if (var7.equals("dre")) {
						arg1 = 0x800000;
					}

					if (var7.equals("dbl")) {
						arg1 = 128;
					}

					if (var7.equals("or1")) {
						arg1 = 0xFFB000;
					}

					if (var7.equals("or2")) {
						arg1 = 0xFF7000;
					}

					if (var7.equals("or3")) {
						arg1 = 0xFF3000;
					}

					if (var7.equals("gr1")) {
						arg1 = 0xC0FF00;
					}

					if (var7.equals("gr2")) {
						arg1 = 0x80FF00;
					}

					if (var7.equals("gr3")) {
						arg1 = 0x40FF00;
					}

					var6 += 4;
				} else {
					int var8 = field540[arg3.charAt(var6)];
					if (var8 != 94) {
						if (arg4) {
							method194(field532[var8], field535[var8] + arg0 + 1, field536[var8] + arg2 + 1, field533[var8], field534[var8], 0);
						}

						method194(field532[var8], field535[var8] + arg0, field536[var8] + arg2, field533[var8], field534[var8], arg1);
					}

					arg0 += field537[var8];
				}
			}
		}
	}

	@ObfuscatedName("jb.a([BIIIII)V")
	public void method194(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
			method195(class32.field484, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
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

			field540[var1] = var2;
		}
	}
}
