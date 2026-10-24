package deob;

import java.util.Random;

@ObfuscatedName("kb")
public class class37 extends class33 {

	@ObfuscatedName("kb.y")
	public byte[][] field605 = new byte[94][];

	@ObfuscatedName("kb.z")
	public int[] field606 = new int[94];

	@ObfuscatedName("kb.A")
	public int[] field607 = new int[94];

	@ObfuscatedName("kb.B")
	public int[] field608 = new int[94];

	@ObfuscatedName("kb.C")
	public int[] field609 = new int[94];

	@ObfuscatedName("kb.D")
	public int[] field610 = new int[95];

	@ObfuscatedName("kb.E")
	public int[] field611 = new int[256];

	@ObfuscatedName("kb.G")
	public Random field613 = new Random();

	@ObfuscatedName("kb.H")
	public boolean field614 = false;

	@ObfuscatedName("kb.F")
	public int field612;

	@ObfuscatedName("kb.I")
	public static int[] field615 = new int[256];

	public class37() {
	}

	public class37(class51 arg0, String arg1) {
		class39 var3 = new class39(arg0.method298(arg1 + ".dat", null));
		class39 var4 = new class39(arg0.method298("index.dat", null));
		boolean var5 = true;
		var4.field625 = var3.method230() + 4;
		int var6 = var4.method228();
		if (var6 > 0) {
			var4.field625 += (var6 - 1) * 3;
		}

		for (int var7 = 0; var7 < 94; var7++) {
			field608[var7] = var4.method228();
			field609[var7] = var4.method228();
			int var9 = field606[var7] = var4.method230();
			int var10 = field607[var7] = var4.method230();
			int var11 = var4.method228();
			int var12 = var9 * var10;
			field605[var7] = new byte[var12];
			if (var11 == 0) {
				for (int var13 = 0; var13 < var12; var13++) {
					field605[var7][var13] = var3.method229();
				}
			} else if (var11 == 1) {
				for (int var14 = 0; var14 < var9; var14++) {
					for (int var15 = 0; var15 < var10; var15++) {
						field605[var7][var9 * var15 + var14] = var3.method229();
					}
				}
			}

			if (var10 > field612) {
				field612 = var10;
			}

			field608[var7] = 1;
			field610[var7] = var9 + 2;
			int var16 = 0;
			for (int var17 = var10 / 7; var17 < var10; var17++) {
				var16 += field605[var7][var9 * var17];
			}

			if (var16 <= var10 / 7) {
				field610[var7]--;
				field608[var7] = 0;
			}

			int var18 = 0;
			for (int var19 = var10 / 7; var19 < var10; var19++) {
				var18 += field605[var7][var9 * var19 + var9 - 1];
			}

			if (var18 <= var10 / 7) {
				field610[var7]--;
			}
		}

		field610[94] = field610[8];
		for (int var20 = 0; var20 < 256; var20++) {
			field611[var20] = field610[field615[var20]];
		}
	}

	@ObfuscatedName("kb.a(IIILjava/lang/String;I)V")
	public void method200(int arg0, int arg1, String arg2, int arg3) {
		method203(arg2, arg3, arg0, arg1 - method202(arg2) / 2);
	}

	@ObfuscatedName("kb.a(IZZIILjava/lang/String;)V")
	public void method201(int arg0, boolean arg1, int arg2, int arg3, String arg4) {
		method205(arg3, arg4, arg0 - method202(arg4) / 2, arg1, arg2);
	}

	@ObfuscatedName("kb.a(ZLjava/lang/String;)I")
	public int method202(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field611[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;IIBI)V")
	public void method203(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg2 -= field612;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				int var6 = field615[arg0.charAt(var5)];
				if (var6 != 94) {
					method208(field605[var6], field608[var6] + arg3, field609[var6] + arg2, field606[var6], field607[var6], arg1);
				}

				arg3 += field610[var6];
			}
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;IIIII)V")
	public void method204(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method202(arg0) / 2;
			arg3 -= field612;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				int var7 = field615[arg0.charAt(var6)];
				if (var7 != 94) {
					method208(field605[var7], field608[var7] + arg1, field609[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field606[var7], field607[var7], arg4);
				}

				arg1 += field610[var7];
			}
		}
	}

	@ObfuscatedName("kb.a(IILjava/lang/String;IZI)V")
	public void method205(int arg0, String arg1, int arg2, boolean arg3, int arg4) {
		field614 = false;
		int var6 = arg2;
		if (arg1 != null) {
			arg0 -= field612;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method207(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					int var9 = field615[arg1.charAt(var7)];
					if (var9 != 94) {
						if (arg3) {
							method208(field605[var9], field608[var9] + arg2 + 1, field609[var9] + arg0 + 1, field606[var9], field607[var9], 0);
						}

						method208(field605[var9], field608[var9] + arg2, field609[var9] + arg0, field606[var9], field607[var9], arg4);
					}

					arg2 += field610[var9];
				}
			}

			if (field614) {
				class33.method159(0x800000, arg2 - var6, var6, (int) (field612 * 0.7D) + arg0);
			}
		}
	}

	@ObfuscatedName("kb.a(ZLjava/lang/String;IIIII)V")
	public void method206(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != null) {
			field613.setSeed(arg4);
			int var7 = (field613.nextInt() & 0x1F) + 192;
			arg2 -= field612;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = method207(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg3 = var9;
					}

					var8 += 4;
				} else {
					int var10 = field615[arg1.charAt(var8)];
					if (var10 != 94) {
						if (arg0) {
							method210(192, field605[var10], field608[var10] + arg5 + 1, 0, field607[var10], field606[var10], field609[var10] + arg2 + 1);
						}

						method210(var7, field605[var10], field608[var10] + arg5, arg3, field607[var10], field606[var10], field609[var10] + arg2);
					}

					arg5 += field610[var10];
					if ((field613.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("kb.a(BLjava/lang/String;)I")
	public int method207(String arg0) {
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
				field614 = true;
			}

			return -1;
		}
	}

	@ObfuscatedName("kb.a([BIIIII)V")
	public void method208(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = class33.field558 * arg2 + arg1;
		int var8 = class33.field558 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class33.field560) {
			int var11 = class33.field560 - arg2;
			arg4 -= var11;
			arg2 = class33.field560;
			var10 += arg3 * var11;
			var7 += class33.field558 * var11;
		}

		if (arg2 + arg4 >= class33.field561) {
			arg4 -= arg2 + arg4 + 1 - class33.field561;
		}

		if (arg1 < class33.field562) {
			int var12 = class33.field562 - arg1;
			arg3 -= var12;
			arg1 = class33.field562;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= class33.field563) {
			int var13 = arg1 + arg3 + 1 - class33.field563;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method209(class33.field557, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("kb.a([I[BIIIIIII)V")
	public void method209(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("kb.a(I[BIIIIIZ)V")
	public void method210(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = class33.field558 * arg6 + arg2;
		int var9 = class33.field558 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg6 < class33.field560) {
			int var12 = class33.field560 - arg6;
			arg4 -= var12;
			arg6 = class33.field560;
			var11 += arg5 * var12;
			var8 += class33.field558 * var12;
		}

		if (arg4 + arg6 >= class33.field561) {
			arg4 -= arg4 + arg6 + 1 - class33.field561;
		}

		if (arg2 < class33.field562) {
			int var13 = class33.field562 - arg2;
			arg5 -= var13;
			arg2 = class33.field562;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg5 >= class33.field563) {
			int var14 = arg2 + arg5 + 1 - class33.field563;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg4 > 0) {
			method211(var10, arg3, class33.field557, arg5, var11, arg1, arg4, var9, arg0, var8);
		}
	}

	@ObfuscatedName("kb.a(III[III[BIIII)V")
	public void method211(int arg0, int arg1, int[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
		arg1 = ((arg1 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg8 & 0xFF0000) >> 8;
		arg8 = 256 - arg8;
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = -arg3; var12 < 0; var12++) {
				if (arg5[arg4++] == 0) {
					arg9++;
				} else {
					int var13 = arg2[arg9];
					arg2[arg9++] = (((var13 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((var13 & 0xFF00) * arg8 & 0xFF0000) >> 8) + arg1;
				}
			}

			arg9 += arg7;
			arg4 += arg0;
		}
	}

	static {
		String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = var0.indexOf(var1);
			if (var2 == -1) {
				var2 = 74;
			}

			field615[var1] = var2;
		}
	}
}
