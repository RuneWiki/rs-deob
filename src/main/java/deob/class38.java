package deob;

import java.util.Random;

@ObfuscatedName("lb")
public final class class38 extends class34 {

	@ObfuscatedName("lb.B")
	public byte[][] field600 = new byte[94][];

	@ObfuscatedName("lb.C")
	public int[] field601 = new int[94];

	@ObfuscatedName("lb.D")
	public int[] field602 = new int[94];

	@ObfuscatedName("lb.E")
	public int[] field603 = new int[94];

	@ObfuscatedName("lb.F")
	public int[] field604 = new int[94];

	@ObfuscatedName("lb.G")
	public int[] field605 = new int[95];

	@ObfuscatedName("lb.H")
	public int[] field606 = new int[256];

	@ObfuscatedName("lb.J")
	public Random field608 = new Random();

	@ObfuscatedName("lb.I")
	public int field607;

	@ObfuscatedName("lb.K")
	public static int[] field609 = new int[256];

	public class38(String arg0, class51 arg1) {
		class39 var3 = new class39(arg1.method299(arg0 + ".dat", null));
		class39 var4 = new class39(arg1.method299("index.dat", null));
		boolean var5 = true;
		var4.field611 = var3.method233() + 4;
		int var6 = var4.method231();
		if (var6 > 0) {
			var4.field611 += (var6 - 1) * 3;
		}

		for (int var7 = 0; var7 < 94; var7++) {
			field603[var7] = var4.method231();
			field604[var7] = var4.method231();
			int var9 = field601[var7] = var4.method233();
			int var10 = field602[var7] = var4.method233();
			int var11 = var4.method231();
			int var12 = var9 * var10;
			field600[var7] = new byte[var12];
			if (var11 == 0) {
				for (int var13 = 0; var13 < var12; var13++) {
					field600[var7][var13] = var3.method232();
				}
			} else if (var11 == 1) {
				for (int var14 = 0; var14 < var9; var14++) {
					for (int var15 = 0; var15 < var10; var15++) {
						field600[var7][var9 * var15 + var14] = var3.method232();
					}
				}
			}

			if (var10 > field607) {
				field607 = var10;
			}

			field603[var7] = 1;
			field605[var7] = var9 + 2;
			int var16 = 0;
			for (int var17 = var10 / 7; var17 < var10; var17++) {
				var16 += field600[var7][var9 * var17];
			}

			if (var16 <= var10 / 7) {
				field605[var7]--;
				field603[var7] = 0;
			}

			int var18 = 0;
			for (int var19 = var10 / 7; var19 < var10; var19++) {
				var18 += field600[var7][var9 * var19 + var9 - 1];
			}

			if (var18 <= var10 / 7) {
				field605[var7]--;
			}
		}

		field605[94] = field605[8];
		for (int var20 = 0; var20 < 256; var20++) {
			field606[var20] = field605[field609[var20]];
		}
	}

	@ObfuscatedName("lb.a(BLjava/lang/String;III)V")
	public void method206(String arg0, int arg1, int arg2, int arg3) {
		method209(arg3, arg1 - method208(arg0) / 2, arg2, arg0);
	}

	@ObfuscatedName("lb.a(IZIIILjava/lang/String;)V")
	public void method207(int arg0, boolean arg1, int arg2, int arg3, String arg4) {
		method211(arg0, arg3, arg4, arg1, arg2 - method208(arg4) / 2);
	}

	@ObfuscatedName("lb.a(BLjava/lang/String;)I")
	public int method208(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field606[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("lb.a(IIIILjava/lang/String;)V")
	public void method209(int arg0, int arg1, int arg2, String arg3) {
		if (arg3 != null) {
			arg2 -= field607;
			for (int var5 = 0; var5 < arg3.length(); var5++) {
				int var6 = field609[arg3.charAt(var5)];
				if (var6 != 94) {
					method214(field600[var6], field603[var6] + arg1, field604[var6] + arg2, field601[var6], field602[var6], arg0);
				}

				arg1 += field605[var6];
			}
		}
	}

	@ObfuscatedName("lb.a(BLjava/lang/String;IIII)V")
	public void method210(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg4 -= method208(arg0) / 2;
			arg2 -= field607;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				int var7 = field609[arg0.charAt(var6)];
				if (var7 != 94) {
					method214(field600[var7], field603[var7] + arg4, field604[var7] + arg2 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field601[var7], field602[var7], arg1);
				}

				arg4 += field605[var7];
			}
		}
	}

	@ObfuscatedName("lb.a(IIZLjava/lang/String;ZI)V")
	public void method211(int arg0, int arg1, String arg2, boolean arg3, int arg4) {
		if (arg2 != null) {
			arg1 -= field607;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				if (arg2.charAt(var6) == '@' && var6 + 4 < arg2.length() && arg2.charAt(var6 + 4) == '@') {
					arg0 = method213(arg2.substring(var6 + 1, var6 + 4));
					var6 += 4;
				} else {
					int var7 = field609[arg2.charAt(var6)];
					if (var7 != 94) {
						if (arg3) {
							method214(field600[var7], field603[var7] + arg4 + 1, field604[var7] + arg1 + 1, field601[var7], field602[var7], 0);
						}

						method214(field600[var7], field603[var7] + arg4, field604[var7] + arg1, field601[var7], field602[var7], arg0);
					}

					arg4 += field605[var7];
				}
			}
		}
	}

	@ObfuscatedName("lb.a(IIZLjava/lang/String;IZI)V")
	public void method212(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			field608.setSeed(arg1);
			int var7 = (field608.nextInt() & 0x1F) + 192;
			arg0 -= field607;
			for (int var8 = 0; var8 < arg3.length(); var8++) {
				if (arg3.charAt(var8) == '@' && var8 + 4 < arg3.length() && arg3.charAt(var8 + 4) == '@') {
					arg5 = method213(arg3.substring(var8 + 1, var8 + 4));
					var8 += 4;
				} else {
					int var9 = field609[arg3.charAt(var8)];
					if (var9 != 94) {
						if (arg2) {
							method216(field602[var9], field601[var9], field600[var9], 0, field603[var9] + arg4 + 1, field604[var9] + arg0 + 1, 192);
						}

						method216(field602[var9], field601[var9], field600[var9], arg5, field603[var9] + arg4, field604[var9] + arg0, var7);
					}

					arg4 += field605[var9];
					if ((field608.nextInt() & 0x3) == 0) {
						arg4++;
					}
				}
			}
		}
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;I)I")
	public int method213(String arg0) {
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

	@ObfuscatedName("lb.a([BIIIII)V")
	public void method214(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = class34.field553 * arg2 + arg1;
		int var8 = class34.field553 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class34.field555) {
			int var11 = class34.field555 - arg2;
			arg4 -= var11;
			arg2 = class34.field555;
			var10 += arg3 * var11;
			var7 += class34.field553 * var11;
		}

		if (arg2 + arg4 >= class34.field556) {
			arg4 -= arg2 + arg4 + 1 - class34.field556;
		}

		if (arg1 < class34.field557) {
			int var12 = class34.field557 - arg1;
			arg3 -= var12;
			arg1 = class34.field557;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= class34.field558) {
			int var13 = arg1 + arg3 + 1 - class34.field558;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method215(class34.field552, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("lb.a([I[BIIIIIII)V")
	public void method215(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("lb.a(III[BIIII)V")
	public void method216(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = class34.field553 * arg5 + arg4;
		int var9 = class34.field553 - arg1;
		int var10 = 0;
		int var11 = 0;
		if (arg5 < class34.field555) {
			int var12 = class34.field555 - arg5;
			arg0 -= var12;
			arg5 = class34.field555;
			var11 += arg1 * var12;
			var8 += class34.field553 * var12;
		}

		if (arg0 + arg5 >= class34.field556) {
			arg0 -= arg0 + arg5 + 1 - class34.field556;
		}

		if (arg4 < class34.field557) {
			int var13 = class34.field557 - arg4;
			arg1 -= var13;
			arg4 = class34.field557;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg4 >= class34.field558) {
			int var14 = arg1 + arg4 + 1 - class34.field558;
			arg1 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg1 > 0 && arg0 > 0) {
			method217(class34.field552, var9, arg2, var8, arg6, arg1, arg0, arg3, var11, var10);
		}
	}

	@ObfuscatedName("lb.a([II[BIIIIIIII)V")
	public void method217(int[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg7 = ((arg7 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg4 & 0xFF0000) >> 8;
		arg4 = 256 - arg4;
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = -arg5; var12 < 0; var12++) {
				if (arg2[arg8++] == 0) {
					arg3++;
				} else {
					int var13 = arg0[arg3];
					arg0[arg3++] = (((var13 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((var13 & 0xFF00) * arg4 & 0xFF0000) >> 8) + arg7;
				}
			}

			arg3 += arg1;
			arg8 += arg9;
		}
	}

	static {
		String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = var0.indexOf(var1);
			if (var2 == -1) {
				var2 = 74;
			}

			field609[var1] = var2;
		}
	}
}
