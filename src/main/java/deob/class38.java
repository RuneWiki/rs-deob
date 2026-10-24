package deob;

import java.util.Random;

@ObfuscatedName("lb")
public final class class38 extends class34 {

	@ObfuscatedName("lb.A")
	public byte[][] field609 = new byte[94][];

	@ObfuscatedName("lb.B")
	public int[] field610 = new int[94];

	@ObfuscatedName("lb.C")
	public int[] field611 = new int[94];

	@ObfuscatedName("lb.D")
	public int[] field612 = new int[94];

	@ObfuscatedName("lb.E")
	public int[] field613 = new int[94];

	@ObfuscatedName("lb.F")
	public int[] field614 = new int[95];

	@ObfuscatedName("lb.G")
	public int[] field615 = new int[256];

	@ObfuscatedName("lb.I")
	public Random field617 = new Random();

	@ObfuscatedName("lb.J")
	public boolean field618 = false;

	@ObfuscatedName("lb.H")
	public int field616;

	@ObfuscatedName("lb.K")
	public static int[] field619 = new int[256];

	public class38(String arg0, class51 arg1) {
		class39 var3 = new class39(arg1.method308(arg0 + ".dat", null));
		class39 var4 = new class39(arg1.method308("index.dat", null));
		boolean var5 = true;
		var4.field621 = var3.method240() + 4;
		int var6 = var4.method238();
		if (var6 > 0) {
			var4.field621 += (var6 - 1) * 3;
		}

		for (int var7 = 0; var7 < 94; var7++) {
			field612[var7] = var4.method238();
			field613[var7] = var4.method238();
			int var9 = field610[var7] = var4.method240();
			int var10 = field611[var7] = var4.method240();
			int var11 = var4.method238();
			int var12 = var9 * var10;
			field609[var7] = new byte[var12];
			if (var11 == 0) {
				for (int var13 = 0; var13 < var12; var13++) {
					field609[var7][var13] = var3.method239();
				}
			} else if (var11 == 1) {
				for (int var14 = 0; var14 < var9; var14++) {
					for (int var15 = 0; var15 < var10; var15++) {
						field609[var7][var9 * var15 + var14] = var3.method239();
					}
				}
			}

			if (var10 > field616) {
				field616 = var10;
			}

			field612[var7] = 1;
			field614[var7] = var9 + 2;
			int var16 = 0;
			for (int var17 = var10 / 7; var17 < var10; var17++) {
				var16 += field609[var7][var9 * var17];
			}

			if (var16 <= var10 / 7) {
				field614[var7]--;
				field612[var7] = 0;
			}

			int var18 = 0;
			for (int var19 = var10 / 7; var19 < var10; var19++) {
				var18 += field609[var7][var9 * var19 + var9 - 1];
			}

			if (var18 <= var10 / 7) {
				field614[var7]--;
			}
		}

		field614[94] = field614[8];
		for (int var20 = 0; var20 < 256; var20++) {
			field615[var20] = field614[field619[var20]];
		}
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;IIII)V")
	public void method213(String arg0, int arg1, int arg2, int arg3) {
		method216(arg1 - method215(arg0) / 2, arg2, arg0, arg3);
	}

	@ObfuscatedName("lb.a(IZILjava/lang/String;ZI)V")
	public void method214(int arg0, boolean arg1, int arg2, String arg3, int arg4) {
		method218(arg3, arg2, arg0, arg1, arg4 - method215(arg3) / 2);
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;Z)I")
	public int method215(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field615[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("lb.a(IIZLjava/lang/String;I)V")
	public void method216(int arg0, int arg1, String arg2, int arg3) {
		if (arg2 != null) {
			arg1 -= field616;
			for (int var5 = 0; var5 < arg2.length(); var5++) {
				int var6 = field619[arg2.charAt(var5)];
				if (var6 != 94) {
					method221(field609[var6], field612[var6] + arg0, field613[var6] + arg1, field610[var6], field611[var6], arg3);
				}

				arg0 += field614[var6];
			}
		}
	}

	@ObfuscatedName("lb.a(IZLjava/lang/String;III)V")
	public void method217(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg2 -= method215(arg1) / 2;
			arg3 -= field616;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				int var7 = field619[arg1.charAt(var6)];
				if (var7 != 94) {
					method221(field609[var7], field612[var7] + arg2, field613[var7] + arg3 + (int) (Math.sin(arg0 / 5.0D + var6 / 2.0D) * 5.0D), field610[var7], field611[var7], arg4);
				}

				arg2 += field614[var7];
			}
		}
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;IIZIZ)V")
	public void method218(String arg0, int arg1, int arg2, boolean arg3, int arg4) {
		field618 = false;
		int var6 = arg4;
		if (arg0 != null) {
			arg2 -= field616;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = method220(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg1 = var8;
					}

					var7 += 4;
				} else {
					int var9 = field619[arg0.charAt(var7)];
					if (var9 != 94) {
						if (arg3) {
							method221(field609[var9], field612[var9] + arg4 + 1, field613[var9] + arg2 + 1, field610[var9], field611[var9], 0);
						}

						method221(field609[var9], field612[var9] + arg4, field613[var9] + arg2, field610[var9], field611[var9], arg1);
					}

					arg4 += field614[var9];
				}
			}

			if (field618) {
				class34.method172(0x800000, var6, arg4 - var6, (int) (field616 * 0.7D) + arg2);
			}
		}
	}

	@ObfuscatedName("lb.a(IIIBLjava/lang/String;IZ)V")
	public void method219(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5) {
		if (arg3 != null) {
			field617.setSeed(arg1);
			int var7 = (field617.nextInt() & 0x1F) + 192;
			arg4 -= field616;
			for (int var8 = 0; var8 < arg3.length(); var8++) {
				if (arg3.charAt(var8) == '@' && var8 + 4 < arg3.length() && arg3.charAt(var8 + 4) == '@') {
					int var9 = method220(arg3.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg2 = var9;
					}

					var8 += 4;
				} else {
					int var10 = field619[arg3.charAt(var8)];
					if (var10 != 94) {
						if (arg5) {
							method223(field612[var10] + arg0 + 1, field609[var10], 192, field610[var10], field611[var10], field613[var10] + arg4 + 1, 0);
						}

						method223(field612[var10] + arg0, field609[var10], var7, field610[var10], field611[var10], field613[var10] + arg4, arg2);
					}

					arg0 += field614[var10];
					if ((field617.nextInt() & 0x3) == 0) {
						arg0++;
					}
				}
			}
		}
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;)I")
	public int method220(String arg0) {
		if (arg0.equals("red")) {
			return 0xFF0000;
		} else if (arg0.equals("gre")) {
			return 0xFF00;
		} else if (arg0.equals("blu")) {
			return 255;
		} else if (arg0.equals("yel")) {
			return 0xFFFF00;
		} else if (arg0.equals("cya")) {
			return 0xFFFF;
		} else if (arg0.equals("mag")) {
			return 0xFF00FF;
		} else if (arg0.equals("whi")) {
			return 0xFFFFFF;
		} else if (arg0.equals("bla")) {
			return 0;
		} else if (arg0.equals("lre")) {
			return 0xFF9040;
		} else if (arg0.equals("dre")) {
			return 0x800000;
		} else if (arg0.equals("dbl")) {
			return 128;
		} else if (arg0.equals("or1")) {
			return 0xFFB000;
		} else if (arg0.equals("or2")) {
			return 0xFF7000;
		} else if (arg0.equals("or3")) {
			return 0xFF3000;
		} else if (arg0.equals("gr1")) {
			return 0xC0FF00;
		} else if (arg0.equals("gr2")) {
			return 0x80FF00;
		} else if (arg0.equals("gr3")) {
			return 0x40FF00;
		} else {
			if (arg0.equals("str")) {
				field618 = true;
			}

			return -1;
		}
	}

	@ObfuscatedName("lb.a([BIIIII)V")
	public void method221(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = class34.field562 * arg2 + arg1;
		int var8 = class34.field562 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class34.field564) {
			int var11 = class34.field564 - arg2;
			arg4 -= var11;
			arg2 = class34.field564;
			var10 += arg3 * var11;
			var7 += class34.field562 * var11;
		}

		if (arg2 + arg4 >= class34.field565) {
			arg4 -= arg2 + arg4 + 1 - class34.field565;
		}

		if (arg1 < class34.field566) {
			int var12 = class34.field566 - arg1;
			arg3 -= var12;
			arg1 = class34.field566;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= class34.field567) {
			int var13 = arg1 + arg3 + 1 - class34.field567;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method222(class34.field561, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("lb.a([I[BIIIIIII)V")
	public void method222(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("lb.a(I[BIIIIII)V")
	public void method223(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = class34.field562 * arg5 + arg0;
		int var9 = class34.field562 - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg5 < class34.field564) {
			int var12 = class34.field564 - arg5;
			arg4 -= var12;
			arg5 = class34.field564;
			var11 += arg3 * var12;
			var8 += class34.field562 * var12;
		}

		if (arg4 + arg5 >= class34.field565) {
			arg4 -= arg4 + arg5 + 1 - class34.field565;
		}

		if (arg0 < class34.field566) {
			int var13 = class34.field566 - arg0;
			arg3 -= var13;
			arg0 = class34.field566;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg0 + arg3 >= class34.field567) {
			int var14 = arg0 + arg3 + 1 - class34.field567;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg3 > 0 && arg4 > 0) {
			method224(var9, arg3, arg6, arg2, var8, arg1, arg4, class34.field561, var11, var10);
		}
	}

	@ObfuscatedName("lb.a(IIIIBI[BI[III)V")
	public void method224(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		arg2 = ((arg2 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg3 & 0xFF0000) >> 8;
		arg3 = 256 - arg3;
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = -arg1; var12 < 0; var12++) {
				if (arg5[arg8++] == 0) {
					arg4++;
				} else {
					int var13 = arg7[arg4];
					arg7[arg4++] = (((var13 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((var13 & 0xFF00) * arg3 & 0xFF0000) >> 8) + arg2;
				}
			}

			arg4 += arg0;
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

			field619[var1] = var2;
		}
	}
}
