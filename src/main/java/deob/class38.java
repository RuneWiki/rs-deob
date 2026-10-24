package deob;

import java.util.Random;

@ObfuscatedName("lb")
public final class class38 extends class34 {

	@ObfuscatedName("lb.A")
	public byte[][] field612 = new byte[94][];

	@ObfuscatedName("lb.B")
	public int[] field613 = new int[94];

	@ObfuscatedName("lb.C")
	public int[] field614 = new int[94];

	@ObfuscatedName("lb.D")
	public int[] field615 = new int[94];

	@ObfuscatedName("lb.E")
	public int[] field616 = new int[94];

	@ObfuscatedName("lb.F")
	public int[] field617 = new int[95];

	@ObfuscatedName("lb.G")
	public int[] field618 = new int[256];

	@ObfuscatedName("lb.I")
	public Random field620 = new Random();

	@ObfuscatedName("lb.J")
	public boolean field621 = false;

	@ObfuscatedName("lb.H")
	public int field619;

	@ObfuscatedName("lb.K")
	public static int[] field622 = new int[256];

	public class38(String arg0, class51 arg1) {
		class39 var3 = new class39(arg1.method309(arg0 + ".dat", null));
		class39 var4 = new class39(arg1.method309("index.dat", null));
		boolean var5 = true;
		var4.field624 = var3.method241() + 4;
		int var6 = var4.method239();
		if (var6 > 0) {
			var4.field624 += (var6 - 1) * 3;
		}

		for (int var7 = 0; var7 < 94; var7++) {
			field615[var7] = var4.method239();
			field616[var7] = var4.method239();
			int var9 = field613[var7] = var4.method241();
			int var10 = field614[var7] = var4.method241();
			int var11 = var4.method239();
			int var12 = var9 * var10;
			field612[var7] = new byte[var12];
			if (var11 == 0) {
				for (int var13 = 0; var13 < var12; var13++) {
					field612[var7][var13] = var3.method240();
				}
			} else if (var11 == 1) {
				for (int var14 = 0; var14 < var9; var14++) {
					for (int var15 = 0; var15 < var10; var15++) {
						field612[var7][var9 * var15 + var14] = var3.method240();
					}
				}
			}

			if (var10 > field619) {
				field619 = var10;
			}

			field615[var7] = 1;
			field617[var7] = var9 + 2;
			int var16 = 0;
			for (int var17 = var10 / 7; var17 < var10; var17++) {
				var16 += field612[var7][var9 * var17];
			}

			if (var16 <= var10 / 7) {
				field617[var7]--;
				field615[var7] = 0;
			}

			int var18 = 0;
			for (int var19 = var10 / 7; var19 < var10; var19++) {
				var18 += field612[var7][var9 * var19 + var9 - 1];
			}

			if (var18 <= var10 / 7) {
				field617[var7]--;
			}
		}

		field617[94] = field617[8];
		for (int var20 = 0; var20 < 256; var20++) {
			field618[var20] = field617[field622[var20]];
		}
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;IIII)V")
	public void method214(String arg0, int arg1, int arg2, int arg3) {
		method217(arg2, arg3 - method216(arg0) / 2, arg0, arg1);
	}

	@ObfuscatedName("lb.a(IBIZLjava/lang/String;I)V")
	public void method215(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
		method219(arg3, arg0, arg1 - method216(arg3) / 2, arg2, arg4);
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;)I")
	public int method216(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field618[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("lb.a(IILjava/lang/String;IB)V")
	public void method217(int arg0, int arg1, String arg2, int arg3) {
		if (arg2 != null) {
			arg0 -= field619;
			for (int var5 = 0; var5 < arg2.length(); var5++) {
				int var6 = field622[arg2.charAt(var5)];
				if (var6 != 94) {
					method222(field612[var6], field615[var6] + arg1, field616[var6] + arg0, field613[var6], field614[var6], arg3);
				}

				arg1 += field617[var6];
			}
		}
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;IIII)V")
	public void method218(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg0 -= method216(arg1) / 2;
			arg4 -= field619;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				int var7 = field622[arg1.charAt(var6)];
				if (var7 != 94) {
					method222(field612[var7], field615[var7] + arg0, field616[var7] + arg4 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field613[var7], field614[var7], arg2);
				}

				arg0 += field617[var7];
			}
		}
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;IIZII)V")
	public void method219(String arg0, int arg1, int arg2, boolean arg3, int arg4) {
		field621 = false;
		int var6 = arg2;
		if (arg0 != null) {
			arg1 -= field619;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = method221(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					int var9 = field622[arg0.charAt(var7)];
					if (var9 != 94) {
						if (arg3) {
							method222(field612[var9], field615[var9] + arg2 + 1, field616[var9] + arg1 + 1, field613[var9], field614[var9], 0);
						}

						method222(field612[var9], field615[var9] + arg2, field616[var9] + arg1, field613[var9], field614[var9], arg4);
					}

					arg2 += field617[var9];
				}
			}

			if (field621) {
				class34.method173((int) (field619 * 0.7D) + arg1, var6, arg2 - var6, 0x800000);
			}
		}
	}

	@ObfuscatedName("lb.a(IBIIILjava/lang/String;Z)V")
	public void method220(int arg0, int arg1, int arg2, int arg3, String arg4, boolean arg5) {
		if (arg4 != null) {
			field620.setSeed(arg0);
			int var7 = (field620.nextInt() & 0x1F) + 192;
			arg1 -= field619;
			for (int var8 = 0; var8 < arg4.length(); var8++) {
				if (arg4.charAt(var8) == '@' && var8 + 4 < arg4.length() && arg4.charAt(var8 + 4) == '@') {
					int var9 = method221(arg4.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg3 = var9;
					}

					var8 += 4;
				} else {
					int var10 = field622[arg4.charAt(var8)];
					if (var10 != 94) {
						if (arg5) {
							method224(field615[var10] + arg2 + 1, field616[var10] + arg1 + 1, field613[var10], 0, field614[var10], field612[var10], 192);
						}

						method224(field615[var10] + arg2, field616[var10] + arg1, field613[var10], arg3, field614[var10], field612[var10], var7);
					}

					arg2 += field617[var10];
					if ((field620.nextInt() & 0x3) == 0) {
						arg2++;
					}
				}
			}
		}
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;I)I")
	public int method221(String arg0) {
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
				field621 = true;
			}

			return -1;
		}
	}

	@ObfuscatedName("lb.a([BIIIII)V")
	public void method222(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = class34.field565 * arg2 + arg1;
		int var8 = class34.field565 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class34.field567) {
			int var11 = class34.field567 - arg2;
			arg4 -= var11;
			arg2 = class34.field567;
			var10 += arg3 * var11;
			var7 += class34.field565 * var11;
		}

		if (arg2 + arg4 >= class34.field568) {
			arg4 -= arg2 + arg4 + 1 - class34.field568;
		}

		if (arg1 < class34.field569) {
			int var12 = class34.field569 - arg1;
			arg3 -= var12;
			arg1 = class34.field569;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= class34.field570) {
			int var13 = arg1 + arg3 + 1 - class34.field570;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method223(class34.field564, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("lb.a([I[BIIIIIII)V")
	public void method223(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("lb.a(IIIIII[BI)V")
	public void method224(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
		int var8 = class34.field565 * arg1 + arg0;
		int var9 = class34.field565 - arg2;
		int var10 = 0;
		int var11 = 0;
		if (arg1 < class34.field567) {
			int var12 = class34.field567 - arg1;
			arg4 -= var12;
			arg1 = class34.field567;
			var11 += arg2 * var12;
			var8 += class34.field565 * var12;
		}

		if (arg1 + arg4 >= class34.field568) {
			arg4 -= arg1 + arg4 + 1 - class34.field568;
		}

		if (arg0 < class34.field569) {
			int var13 = class34.field569 - arg0;
			arg2 -= var13;
			arg0 = class34.field569;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg0 + arg2 >= class34.field570) {
			int var14 = arg0 + arg2 + 1 - class34.field570;
			arg2 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg2 > 0 && arg4 > 0) {
			method225(var9, class34.field564, arg2, var10, arg3, var11, arg6, var8, arg4, arg5);
		}
	}

	@ObfuscatedName("lb.a(I[IIIIIIIZI[B)V")
	public void method225(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		arg4 = ((arg4 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg6 & 0xFF0000) >> 8;
		arg6 = 256 - arg6;
		for (int var11 = -arg8; var11 < 0; var11++) {
			for (int var12 = -arg2; var12 < 0; var12++) {
				if (arg9[arg5++] == 0) {
					arg7++;
				} else {
					int var13 = arg1[arg7];
					arg1[arg7++] = (((var13 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((var13 & 0xFF00) * arg6 & 0xFF0000) >> 8) + arg4;
				}
			}

			arg7 += arg0;
			arg5 += arg3;
		}
	}

	static {
		String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = var0.indexOf(var1);
			if (var2 == -1) {
				var2 = 74;
			}

			field622[var1] = var2;
		}
	}
}
