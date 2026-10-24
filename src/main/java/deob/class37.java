package deob;

import java.util.Random;

@ObfuscatedName("kb")
public final class class37 extends class33 {

	@ObfuscatedName("kb.A")
	public byte[][] field607 = new byte[256][];

	@ObfuscatedName("kb.B")
	public int[] field608 = new int[256];

	@ObfuscatedName("kb.C")
	public int[] field609 = new int[256];

	@ObfuscatedName("kb.D")
	public int[] field610 = new int[256];

	@ObfuscatedName("kb.E")
	public int[] field611 = new int[256];

	@ObfuscatedName("kb.F")
	public int[] field612 = new int[256];

	@ObfuscatedName("kb.H")
	public Random field614 = new Random();

	@ObfuscatedName("kb.I")
	public boolean field615 = false;

	@ObfuscatedName("kb.G")
	public int field613;

	public class37(class50 arg0, boolean arg1, String arg2) {
		class38 var4 = new class38(arg0.method295(arg2 + ".dat", null));
		class38 var5 = new class38(arg0.method295("index.dat", null));
		boolean var6 = true;
		var5.field617 = var4.method227() + 4;
		int var7 = var5.method225();
		if (var7 > 0) {
			var5.field617 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field610[var8] = var5.method225();
			field611[var8] = var5.method225();
			int var10 = field608[var8] = var5.method227();
			int var11 = field609[var8] = var5.method227();
			int var12 = var5.method225();
			int var13 = var10 * var11;
			field607[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field607[var8][var14] = var4.method226();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field607[var8][var10 * var16 + var15] = var4.method226();
					}
				}
			}

			if (var11 > field613 && var8 < 128) {
				field613 = var11;
			}

			field610[var8] = 1;
			field612[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field607[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field612[var8]--;
				field610[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field607[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field612[var8]--;
			}
		}

		if (arg1) {
			field612[32] = field612[73];
		} else {
			field612[32] = field612[105];
		}
	}

	@ObfuscatedName("kb.a(IBILjava/lang/String;I)V")
	public void method200(int arg0, int arg1, String arg2, int arg3) {
		method204(arg0 - method203(arg2) / 2, arg2, arg3, arg1);
	}

	@ObfuscatedName("kb.a(ZILjava/lang/String;IZI)V")
	public void method201(boolean arg0, int arg1, String arg2, int arg3, int arg4) {
		method206(arg1, arg3 - method202(arg2) / 2, arg0, arg4, arg2);
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;I)I")
	public int method202(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field612[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("kb.b(Ljava/lang/String;I)I")
	public int method203(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field612[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;III)V")
	public void method204(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg2 -= field613;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method209(field607[var6], field610[var6] + arg0, field611[var6] + arg2, field608[var6], field609[var6], arg3);
				}

				arg0 += field612[var6];
			}
		}
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;IIIB)V")
	public void method205(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg4 -= method203(arg1) / 2;
			arg3 -= field613;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method209(field607[var7], field610[var7] + arg4, field611[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field608[var7], field609[var7], arg0);
				}

				arg4 += field612[var7];
			}
		}
	}

	@ObfuscatedName("kb.a(IIIZILjava/lang/String;)V")
	public void method206(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		field615 = false;
		int var6 = arg1;
		if (arg4 != null) {
			arg0 -= field613;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method208(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg3 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method209(field607[var9], field610[var9] + arg1 + 1, field611[var9] + arg0 + 1, field608[var9], field609[var9], 0);
						}

						method209(field607[var9], field610[var9] + arg1, field611[var9] + arg0, field608[var9], field609[var9], arg3);
					}

					arg1 += field612[var9];
				}
			}

			if (field615) {
				class33.method159((int) (field613 * 0.7D) + arg0, 0x800000, arg1 - var6, var6);
			}
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;IIZIIZ)V")
	public void method207(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		if (arg0 != null) {
			field614.setSeed(arg4);
			int var7 = (field614.nextInt() & 0x1F) + 192;
			arg2 -= field613;
			for (int var8 = 0; var8 < arg0.length(); var8++) {
				if (arg0.charAt(var8) == '@' && var8 + 4 < arg0.length() && arg0.charAt(var8 + 4) == '@') {
					int var9 = method208(arg0.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg1 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg0.charAt(var8);
					if (var10 != ' ') {
						if (arg3) {
							method211(192, field609[var10], field608[var10], field611[var10] + arg2 + 1, field610[var10] + arg5 + 1, field607[var10], 0);
						}

						method211(var7, field609[var10], field608[var10], field611[var10] + arg2, field610[var10] + arg5, field607[var10], arg1);
					}

					arg5 += field612[var10];
					if ((field614.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("kb.a(BLjava/lang/String;)I")
	public int method208(String arg0) {
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
				field615 = true;
			}

			if (arg0.equals("end")) {
				field615 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("kb.a([BIIIII)V")
	public void method209(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = class33.field560 * arg2 + arg1;
		int var8 = class33.field560 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class33.field562) {
			int var11 = class33.field562 - arg2;
			arg4 -= var11;
			arg2 = class33.field562;
			var10 += arg3 * var11;
			var7 += class33.field560 * var11;
		}

		if (arg2 + arg4 >= class33.field563) {
			arg4 -= arg2 + arg4 + 1 - class33.field563;
		}

		if (arg1 < class33.field564) {
			int var12 = class33.field564 - arg1;
			arg3 -= var12;
			arg1 = class33.field564;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= class33.field565) {
			int var13 = arg1 + arg3 + 1 - class33.field565;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method210(class33.field559, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("kb.a([I[BIIIIIII)V")
	public void method210(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("kb.a(IIZIII[BI)V")
	public void method211(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
		int var8 = class33.field560 * arg3 + arg4;
		int var9 = class33.field560 - arg2;
		int var10 = 0;
		int var11 = 0;
		if (arg3 < class33.field562) {
			int var12 = class33.field562 - arg3;
			arg1 -= var12;
			arg3 = class33.field562;
			var11 += arg2 * var12;
			var8 += class33.field560 * var12;
		}

		if (arg1 + arg3 >= class33.field563) {
			arg1 -= arg1 + arg3 + 1 - class33.field563;
		}

		if (arg4 < class33.field564) {
			int var13 = class33.field564 - arg4;
			arg2 -= var13;
			arg4 = class33.field564;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg4 >= class33.field565) {
			int var14 = arg2 + arg4 + 1 - class33.field565;
			arg2 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg2 > 0 && arg1 > 0) {
			method212(arg1, arg6, arg2, var10, var8, arg5, class33.field559, arg0, var11, var9);
		}
	}

	@ObfuscatedName("kb.a(IIIII[BB[IIII)V")
	public void method212(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
		arg1 = ((arg1 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg7 & 0xFF0000) >> 8;
		arg7 = 256 - arg7;
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = -arg2; var12 < 0; var12++) {
				if (arg5[arg8++] == 0) {
					arg4++;
				} else {
					int var13 = arg6[arg4];
					arg6[arg4++] = (((var13 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((var13 & 0xFF00) * arg7 & 0xFF0000) >> 8) + arg1;
				}
			}

			arg4 += arg9;
			arg8 += arg3;
		}
	}
}
