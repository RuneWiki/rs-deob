package deob;

import java.util.Random;

@ObfuscatedName("kb")
public final class class37 extends class33 {

	@ObfuscatedName("kb.E")
	public byte[][] field612 = new byte[256][];

	@ObfuscatedName("kb.F")
	public int[] field613 = new int[256];

	@ObfuscatedName("kb.G")
	public int[] field614 = new int[256];

	@ObfuscatedName("kb.H")
	public int[] field615 = new int[256];

	@ObfuscatedName("kb.I")
	public int[] field616 = new int[256];

	@ObfuscatedName("kb.J")
	public int[] field617 = new int[256];

	@ObfuscatedName("kb.L")
	public Random field619 = new Random();

	@ObfuscatedName("kb.M")
	public boolean field620 = false;

	@ObfuscatedName("kb.K")
	public int field618;

	public class37(boolean arg0, String arg1, class50 arg2) {
		class38 var4 = new class38(arg2.method299(arg1 + ".dat", null));
		class38 var5 = new class38(arg2.method299("index.dat", null));
		boolean var6 = true;
		var5.field622 = var4.method231() + 4;
		int var7 = var5.method229();
		if (var7 > 0) {
			var5.field622 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field615[var8] = var5.method229();
			field616[var8] = var5.method229();
			int var10 = field613[var8] = var5.method231();
			int var11 = field614[var8] = var5.method231();
			int var12 = var5.method229();
			int var13 = var10 * var11;
			field612[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field612[var8][var14] = var4.method230();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field612[var8][var10 * var16 + var15] = var4.method230();
					}
				}
			}

			if (var11 > field618 && var8 < 128) {
				field618 = var11;
			}

			field615[var8] = 1;
			field617[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field612[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field617[var8]--;
				field615[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field612[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field617[var8]--;
			}
		}

		if (arg0) {
			field617[32] = field617[73];
		} else {
			field617[32] = field617[105];
		}
	}

	@ObfuscatedName("kb.a(IIILjava/lang/String;B)V")
	public void method201(int arg0, int arg1, int arg2, String arg3) {
		method206(arg2, arg3, arg1, arg0 - method205(arg3));
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;ZIII)V")
	public void method202(String arg0, int arg1, int arg2, int arg3) {
		method206(arg3, arg0, arg1, arg2 - method205(arg0) / 2);
	}

	@ObfuscatedName("kb.a(IBILjava/lang/String;IZ)V")
	public void method203(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
		method210(arg2, arg3, arg0, arg4, arg1 - method204(arg2) / 2);
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;B)I")
	public int method204(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field617[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("kb.b(Ljava/lang/String;B)I")
	public int method205(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field617[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;III)V")
	public void method206(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg0 -= field618;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method213(field612[var6], field615[var6] + arg3, field616[var6] + arg0, field613[var6], field614[var6], arg2);
				}

				arg3 += field617[var6];
			}
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;IIIZI)V")
	public void method207(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg2 -= method205(arg0) / 2;
			arg1 -= field618;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method213(field612[var7], field615[var7] + arg2, field616[var7] + arg1 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field613[var7], field614[var7], arg4);
				}

				arg2 += field617[var7];
			}
		}
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;IIII)V")
	public void method208(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg4 -= method205(arg0) / 2;
			arg3 -= field618;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method213(field612[var7], field615[var7] + arg4 + (int) (Math.sin(arg2 / 5.0D + var6 / 5.0D) * 5.0D), field616[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 3.0D) * 5.0D), field613[var7], field614[var7], arg1);
				}

				arg4 += field617[var7];
			}
		}
	}

	@ObfuscatedName("kb.a(IZILjava/lang/String;III)V")
	public void method209(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 != null) {
			double var7 = 7.0D - arg5 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg1 -= method205(arg2) / 2;
			arg3 -= field618;
			for (int var9 = 0; var9 < arg2.length(); var9++) {
				char var10 = arg2.charAt(var9);
				if (var10 != ' ') {
					method213(field612[var10], field615[var10] + arg1, field616[var10] + arg3 + (int) (Math.sin(var9 / 1.5D + arg4) * var7), field613[var10], field614[var10], arg0);
				}

				arg1 += field617[var10];
			}
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;BIIZI)V")
	public void method210(String arg0, int arg1, int arg2, boolean arg3, int arg4) {
		field620 = false;
		int var6 = arg4;
		if (arg0 != null) {
			arg2 -= field618;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = method212(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg1 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg0.charAt(var7);
					if (var9 != ' ') {
						if (arg3) {
							method213(field612[var9], field615[var9] + arg4 + 1, field616[var9] + arg2 + 1, field613[var9], field614[var9], 0);
						}

						method213(field612[var9], field615[var9] + arg4, field616[var9] + arg2, field613[var9], field614[var9], arg1);
					}

					arg4 += field617[var9];
				}
			}

			if (field620) {
				class33.method160(arg4 - var6, 0x800000, (int) (field618 * 0.7D) + arg2, var6);
			}
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;IBIZII)V")
	public void method211(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		if (arg0 != null) {
			field619.setSeed(arg1);
			int var7 = (field619.nextInt() & 0x1F) + 192;
			arg2 -= field618;
			for (int var8 = 0; var8 < arg0.length(); var8++) {
				if (arg0.charAt(var8) == '@' && var8 + 4 < arg0.length() && arg0.charAt(var8 + 4) == '@') {
					int var9 = method212(arg0.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg4 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg0.charAt(var8);
					if (var10 != ' ') {
						if (arg3) {
							method215(field614[var10], 192, field616[var10] + arg2 + 1, field613[var10], field612[var10], field615[var10] + arg5 + 1, 0);
						}

						method215(field614[var10], var7, field616[var10] + arg2, field613[var10], field612[var10], field615[var10] + arg5, arg4);
					}

					arg5 += field617[var10];
					if ((field619.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("kb.c(Ljava/lang/String;B)I")
	public int method212(String arg0) {
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
				field620 = true;
			}

			if (arg0.equals("end")) {
				field620 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("kb.a([BIIIII)V")
	public void method213(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = class33.field565 * arg2 + arg1;
		int var8 = class33.field565 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class33.field567) {
			int var11 = class33.field567 - arg2;
			arg4 -= var11;
			arg2 = class33.field567;
			var10 += arg3 * var11;
			var7 += class33.field565 * var11;
		}

		if (arg2 + arg4 >= class33.field568) {
			arg4 -= arg2 + arg4 + 1 - class33.field568;
		}

		if (arg1 < class33.field569) {
			int var12 = class33.field569 - arg1;
			arg3 -= var12;
			arg1 = class33.field569;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= class33.field570) {
			int var13 = arg1 + arg3 + 1 - class33.field570;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method214(class33.field564, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("kb.a([I[BIIIIIII)V")
	public void method214(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("kb.a(IIII[BIII)V")
	public void method215(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
		int var8 = class33.field565 * arg2 + arg5;
		int var9 = class33.field565 - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg2 < class33.field567) {
			int var12 = class33.field567 - arg2;
			arg0 -= var12;
			arg2 = class33.field567;
			var11 += arg3 * var12;
			var8 += class33.field565 * var12;
		}

		if (arg0 + arg2 >= class33.field568) {
			arg0 -= arg0 + arg2 + 1 - class33.field568;
		}

		if (arg5 < class33.field569) {
			int var13 = class33.field569 - arg5;
			arg3 -= var13;
			arg5 = class33.field569;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg3 + arg5 >= class33.field570) {
			int var14 = arg3 + arg5 + 1 - class33.field570;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg3 > 0 && arg0 > 0) {
			method216(class33.field564, var10, var8, var11, arg1, arg0, arg3, arg4, arg6, var9);
		}
	}

	@ObfuscatedName("kb.a([IIIIIIII[BII)V")
	public void method216(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9) {
		arg8 = ((arg8 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg4 & 0xFF0000) >> 8;
		arg4 = 256 - arg4;
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = -arg6; var12 < 0; var12++) {
				if (arg7[arg3++] == 0) {
					arg2++;
				} else {
					int var13 = arg0[arg2];
					arg0[arg2++] = (((var13 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((var13 & 0xFF00) * arg4 & 0xFF0000) >> 8) + arg8;
				}
			}

			arg2 += arg9;
			arg3 += arg1;
		}
	}
}
