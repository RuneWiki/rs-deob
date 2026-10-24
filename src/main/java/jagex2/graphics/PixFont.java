package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;
import java.util.Random;

@ObfuscatedName("JDPYRDAS")
public final class PixFont extends Pix2D {

	@ObfuscatedName("JDPYRDAS.A")
	public byte[][] field776 = new byte[256][];

	@ObfuscatedName("JDPYRDAS.B")
	public int[] field777 = new int[256];

	@ObfuscatedName("JDPYRDAS.C")
	public int[] field778 = new int[256];

	@ObfuscatedName("JDPYRDAS.D")
	public int[] field779 = new int[256];

	@ObfuscatedName("JDPYRDAS.E")
	public int[] field780 = new int[256];

	@ObfuscatedName("JDPYRDAS.F")
	public int[] field781 = new int[256];

	@ObfuscatedName("JDPYRDAS.H")
	public Random field783 = new Random();

	@ObfuscatedName("JDPYRDAS.I")
	public boolean field784 = false;

	@ObfuscatedName("JDPYRDAS.G")
	public int field782;

	public PixFont(boolean arg0, Jagfile arg1, String arg2) {
		Packet var4 = new Packet(arg1.method2(arg2 + ".dat", null));
		Packet var5 = new Packet(arg1.method2("index.dat", null));
		boolean var6 = true;
		var5.pos = var4.g2() + 4;
		int var7 = var5.g1();
		if (var7 > 0) {
			var5.pos += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field779[var8] = var5.g1();
			field780[var8] = var5.g1();
			int var10 = field777[var8] = var5.g2();
			int var11 = field778[var8] = var5.g2();
			int var12 = var5.g1();
			int var13 = var10 * var11;
			field776[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field776[var8][var14] = var4.g1b();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field776[var8][var10 * var16 + var15] = var4.g1b();
					}
				}
			}

			if (var11 > field782 && var8 < 128) {
				field782 = var11;
			}

			field779[var8] = 1;
			field781[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field776[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field781[var8]--;
				field779[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field776[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field781[var8]--;
			}
		}

		if (arg0) {
			field781[32] = field781[73];
		} else {
			field781[32] = field781[105];
		}
	}

	@ObfuscatedName("JDPYRDAS.a(ZLjava/lang/String;III)V")
	public void method243(String arg0, int arg1, int arg2, int arg3) {
		method248(arg2 - method247(arg0), arg1, arg3, arg0);
	}

	@ObfuscatedName("JDPYRDAS.a(IIIILjava/lang/String;)V")
	public void method244(int arg0, int arg1, int arg2, String arg3) {
		method248(arg0 - method247(arg3) / 2, arg2, arg1, arg3);
	}

	@ObfuscatedName("JDPYRDAS.a(ZIIIILjava/lang/String;)V")
	public void method245(boolean arg0, int arg1, int arg2, int arg3, String arg4) {
		method252(arg1, arg3 - method246(arg4) / 2, arg2, arg0, arg4);
	}

	@ObfuscatedName("JDPYRDAS.a(BLjava/lang/String;)I")
	public int method246(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field781[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("JDPYRDAS.a(Ljava/lang/String;B)I")
	public int method247(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field781[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("JDPYRDAS.b(IIIILjava/lang/String;)V")
	public void method248(int arg0, int arg1, int arg2, String arg3) {
		if (arg3 != null) {
			arg2 -= field782;
			for (int var5 = 0; var5 < arg3.length(); var5++) {
				char var6 = arg3.charAt(var5);
				if (var6 != ' ') {
					method255(field776[var6], field779[var6] + arg0, field780[var6] + arg2, field777[var6], field778[var6], arg1);
				}

				arg0 += field781[var6];
			}
		}
	}

	@ObfuscatedName("JDPYRDAS.a(IBILjava/lang/String;II)V")
	public void method249(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg3 -= method247(arg2) / 2;
			arg0 -= field782;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method255(field776[var7], field779[var7] + arg3, field780[var7] + arg0 + (int) (Math.sin(arg1 / 5.0D + var6 / 2.0D) * 5.0D), field777[var7], field778[var7], arg4);
				}

				arg3 += field781[var7];
			}
		}
	}

	@ObfuscatedName("JDPYRDAS.a(IIBLjava/lang/String;II)V")
	public void method250(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg3 -= method247(arg2) / 2;
			arg0 -= field782;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method255(field776[var7], field779[var7] + arg3 + (int) (Math.sin(arg4 / 5.0D + var6 / 5.0D) * 5.0D), field780[var7] + arg0 + (int) (Math.sin(arg4 / 5.0D + var6 / 3.0D) * 5.0D), field777[var7], field778[var7], arg1);
				}

				arg3 += field781[var7];
			}
		}
	}

	@ObfuscatedName("JDPYRDAS.a(ILjava/lang/String;IIIII)V")
	public void method251(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			double var7 = 7.0D - arg4 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg2 -= method247(arg0) / 2;
			arg3 -= field782;
			for (int var9 = 0; var9 < arg0.length(); var9++) {
				char var10 = arg0.charAt(var9);
				if (var10 != ' ') {
					method255(field776[var10], field779[var10] + arg2, field780[var10] + arg3 + (int) (Math.sin(var9 / 1.5D + arg5) * var7), field777[var10], field778[var10], arg1);
				}

				arg2 += field781[var10];
			}
		}
	}

	@ObfuscatedName("JDPYRDAS.a(IIIZLjava/lang/String;I)V")
	public void method252(int arg0, int arg1, int arg2, boolean arg3, String arg4) {
		field784 = false;
		int var6 = arg1;
		if (arg4 != null) {
			arg2 -= field782;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method254(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg0 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg3) {
							method255(field776[var9], field779[var9] + arg1 + 1, field780[var9] + arg2 + 1, field777[var9], field778[var9], 0);
						}

						method255(field776[var9], field779[var9] + arg1, field780[var9] + arg2, field777[var9], field778[var9], arg0);
					}

					arg1 += field781[var9];
				}
			}

			if (field784) {
				Pix2D.method340(var6, 0x800000, (int) (field782 * 0.7D) + arg2, arg1 - var6);
			}
		}
	}

	@ObfuscatedName("JDPYRDAS.a(ZIIIILjava/lang/String;I)V")
	public void method253(boolean arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
		if (arg5 != null) {
			field783.setSeed(arg1);
			int var7 = (field783.nextInt() & 0x1F) + 192;
			arg4 -= field782;
			for (int var8 = 0; var8 < arg5.length(); var8++) {
				if (arg5.charAt(var8) == '@' && var8 + 4 < arg5.length() && arg5.charAt(var8 + 4) == '@') {
					int var9 = method254(arg5.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg3 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg5.charAt(var8);
					if (var10 != ' ') {
						if (arg0) {
							method257(field779[var10] + arg2 + 1, 0, field776[var10], field780[var10] + arg4 + 1, field778[var10], field777[var10], 192);
						}

						method257(field779[var10] + arg2, arg3, field776[var10], field780[var10] + arg4, field778[var10], field777[var10], var7);
					}

					arg2 += field781[var10];
					if ((field783.nextInt() & 0x3) == 0) {
						arg2++;
					}
				}
			}
		}
	}

	@ObfuscatedName("JDPYRDAS.a(ILjava/lang/String;)I")
	public int method254(String arg0) {
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
				field784 = true;
			}

			if (arg0.equals("end")) {
				field784 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("JDPYRDAS.a([BIIIII)V")
	public void method255(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = Pix2D.field950 * arg2 + arg1;
		int var8 = Pix2D.field950 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.field952) {
			int var11 = Pix2D.field952 - arg2;
			arg4 -= var11;
			arg2 = Pix2D.field952;
			var10 += arg3 * var11;
			var7 += Pix2D.field950 * var11;
		}

		if (arg2 + arg4 >= Pix2D.field953) {
			arg4 -= arg2 + arg4 + 1 - Pix2D.field953;
		}

		if (arg1 < Pix2D.field954) {
			int var12 = Pix2D.field954 - arg1;
			arg3 -= var12;
			arg1 = Pix2D.field954;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= Pix2D.field955) {
			int var13 = arg1 + arg3 + 1 - Pix2D.field955;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method256(Pix2D.field949, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("JDPYRDAS.a([I[BIIIIIII)V")
	public void method256(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("JDPYRDAS.a(IZI[BIIII)V")
	public void method257(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = Pix2D.field950 * arg3 + arg0;
		int var9 = Pix2D.field950 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg3 < Pix2D.field952) {
			int var12 = Pix2D.field952 - arg3;
			arg4 -= var12;
			arg3 = Pix2D.field952;
			var11 += arg5 * var12;
			var8 += Pix2D.field950 * var12;
		}

		if (arg3 + arg4 >= Pix2D.field953) {
			arg4 -= arg3 + arg4 + 1 - Pix2D.field953;
		}

		if (arg0 < Pix2D.field954) {
			int var13 = Pix2D.field954 - arg0;
			arg5 -= var13;
			arg0 = Pix2D.field954;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg0 + arg5 >= Pix2D.field955) {
			int var14 = arg0 + arg5 + 1 - Pix2D.field955;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg4 > 0) {
			method258(var11, var9, var10, var8, arg6, Pix2D.field949, arg1, arg4, arg5, arg2);
		}
	}

	@ObfuscatedName("JDPYRDAS.a(IIIII[IIIII[B)V")
	public void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		arg6 = ((arg6 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg4 & 0xFF0000) >> 8;
		arg4 = 256 - arg4;
		for (int var11 = -arg7; var11 < 0; var11++) {
			for (int var12 = -arg8; var12 < 0; var12++) {
				if (arg9[arg0++] == 0) {
					arg3++;
				} else {
					int var13 = arg5[arg3];
					arg5[arg3++] = (((var13 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((var13 & 0xFF00) * arg4 & 0xFF0000) >> 8) + arg6;
				}
			}

			arg3 += arg1;
			arg0 += arg2;
		}
	}
}
