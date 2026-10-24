package deob;

@ObfuscatedName("ib")
public final class class35 extends class31 {

	@ObfuscatedName("ib.y")
	public byte[][] field515 = new byte[94][];

	@ObfuscatedName("ib.z")
	public int[] field516 = new int[94];

	@ObfuscatedName("ib.A")
	public int[] field517 = new int[94];

	@ObfuscatedName("ib.B")
	public int[] field518 = new int[94];

	@ObfuscatedName("ib.C")
	public int[] field519 = new int[94];

	@ObfuscatedName("ib.D")
	public int[] field520 = new int[95];

	@ObfuscatedName("ib.E")
	public int[] field521 = new int[256];

	@ObfuscatedName("ib.F")
	public int field522;

	@ObfuscatedName("ib.G")
	public static int[] field523 = new int[256];

	public class35(String arg0, class46 arg1) {
		class36 var3 = new class36(arg1.method225(null, arg0 + ".dat"));
		class36 var4 = new class36(arg1.method225(null, "index.dat"));
		var4.field525 = var3.method187() + 4;
		int var5 = var4.method185();
		if (var5 > 0) {
			var4.field525 += (var5 - 1) * 3;
		}

		for (int var6 = 0; var6 < 94; var6++) {
			field518[var6] = var4.method185();
			field519[var6] = var4.method185();
			int var7 = field516[var6] = var4.method187();
			int var8 = field517[var6] = var4.method187();
			int var9 = var4.method185();
			int var10 = var7 * var8;
			field515[var6] = new byte[var10];
			if (var9 == 0) {
				for (int var11 = 0; var11 < var10; var11++) {
					field515[var6][var11] = var3.method186();
				}
			} else if (var9 == 1) {
				for (int var12 = 0; var12 < var7; var12++) {
					for (int var13 = 0; var13 < var8; var13++) {
						field515[var6][var7 * var13 + var12] = var3.method186();
					}
				}
			}

			if (var8 > field522) {
				field522 = var8;
			}

			field518[var6] = 1;
			field520[var6] = var7 + 2;
			int var14 = 0;
			for (int var15 = var8 / 7; var15 < var8; var15++) {
				var14 += field515[var6][var7 * var15];
			}

			if (var14 <= var8 / 7) {
				field520[var6]--;
				field518[var6] = 0;
			}

			int var16 = 0;
			for (int var17 = var8 / 7; var17 < var8; var17++) {
				var16 += field515[var6][var7 * var17 + var7 - 1];
			}

			if (var16 <= var8 / 7) {
				field520[var6]--;
			}
		}

		field520[94] = field520[8];
		for (int var18 = 0; var18 < 256; var18++) {
			field521[var18] = field520[field523[var18]];
		}
	}

	@ObfuscatedName("ib.a(IZIILjava/lang/String;)V")
	public void method168(int arg0, int arg1, int arg2, String arg3) {
		method171(arg3, arg1 - method170(arg3) / 2, arg0, arg2);
	}

	@ObfuscatedName("ib.a(ILjava/lang/String;IIIZ)V")
	public void method169(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
		method173(arg4, arg0 - method170(arg1) / 2, arg2, arg3, arg1);
	}

	@ObfuscatedName("ib.a(ILjava/lang/String;)I")
	public int method170(String arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field521[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("ib.a(Ljava/lang/String;IIII)V")
	public void method171(String arg0, int arg1, int arg2, int arg3) {
		arg2 -= field522;
		for (int var5 = 0; var5 < arg0.length(); var5++) {
			int var6 = field523[arg0.charAt(var5)];
			if (var6 != 94) {
				method174(field515[var6], field518[var6] + arg1, field519[var6] + arg2, field516[var6], field517[var6], arg3);
			}

			arg1 += field520[var6];
		}
	}

	@ObfuscatedName("ib.a(IIBIILjava/lang/String;)V")
	public void method172(int arg0, int arg1, int arg2, int arg3, String arg4) {
		arg0 -= method170(arg4) / 2;
		arg3 -= field522;
		for (int var6 = 0; var6 < arg4.length(); var6++) {
			int var7 = field523[arg4.charAt(var6)];
			if (var7 != 94) {
				method174(field515[var7], field518[var7] + arg0, field519[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field516[var7], field517[var7], arg1);
			}

			arg0 += field520[var7];
		}
	}

	@ObfuscatedName("ib.a(ZIIIZLjava/lang/String;)V")
	public void method173(boolean arg0, int arg1, int arg2, int arg3, String arg4) {
		arg2 -= field522;
		for (int var6 = 0; var6 < arg4.length(); var6++) {
			if (arg4.charAt(var6) == '@' && var6 + 4 < arg4.length() && arg4.charAt(var6 + 4) == '@') {
				String var7 = arg4.substring(var6 + 1, var6 + 4);
				if (var7.equals("red")) {
					arg3 = 0xFF0000;
				}

				if (var7.equals("gre")) {
					arg3 = 0xFF00;
				}

				if (var7.equals("blu")) {
					arg3 = 255;
				}

				if (var7.equals("yel")) {
					arg3 = 0xFFFF00;
				}

				if (var7.equals("cya")) {
					arg3 = 0xFFFF;
				}

				if (var7.equals("mag")) {
					arg3 = 0xFF00FF;
				}

				if (var7.equals("whi")) {
					arg3 = 0xFFFFFF;
				}

				if (var7.equals("bla")) {
					arg3 = 0;
				}

				if (var7.equals("lre")) {
					arg3 = 0xFF9040;
				}

				if (var7.equals("dre")) {
					arg3 = 0x800000;
				}

				if (var7.equals("dbl")) {
					arg3 = 128;
				}

				if (var7.equals("or1")) {
					arg3 = 0xFFB000;
				}

				if (var7.equals("or2")) {
					arg3 = 0xFF7000;
				}

				if (var7.equals("or3")) {
					arg3 = 0xFF3000;
				}

				if (var7.equals("gr1")) {
					arg3 = 0xC0FF00;
				}

				if (var7.equals("gr2")) {
					arg3 = 0x80FF00;
				}

				if (var7.equals("gr3")) {
					arg3 = 0x40FF00;
				}

				var6 += 4;
			} else {
				int var8 = field523[arg4.charAt(var6)];
				if (var8 != 94) {
					if (arg0) {
						method174(field515[var8], field518[var8] + arg1 + 1, field519[var8] + arg2 + 1, field516[var8], field517[var8], 0);
					}

					method174(field515[var8], field518[var8] + arg1, field519[var8] + arg2, field516[var8], field517[var8], arg3);
				}

				arg1 += field520[var8];
			}
		}
	}

	@ObfuscatedName("ib.a([BIIIII)V")
	public void method174(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = class31.field468 * arg2 + arg1;
		int var8 = class31.field468 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class31.field470) {
			int var11 = class31.field470 - arg2;
			arg4 -= var11;
			arg2 = class31.field470;
			var10 += arg3 * var11;
			var7 += class31.field468 * var11;
		}

		if (arg2 + arg4 >= class31.field471) {
			arg4 -= arg2 + arg4 + 1 - class31.field471;
		}

		if (arg1 < class31.field472) {
			int var12 = class31.field472 - arg1;
			arg3 -= var12;
			arg1 = class31.field472;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= class31.field473) {
			int var13 = arg1 + arg3 + 1 - class31.field473;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method175(class31.field467, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("ib.a([I[BIIIIIII)V")
	public void method175(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

			field523[var1] = var2;
		}
	}
}
