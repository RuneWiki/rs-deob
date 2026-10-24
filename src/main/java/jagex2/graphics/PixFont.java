package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import java.util.Random;

@ObfuscatedName("kb")
public final class PixFont extends Pix2D {

	@ObfuscatedName("kb.B")
	public byte[][] charMask = new byte[256][];

	@ObfuscatedName("kb.C")
	public int[] charMaskWidth = new int[256];

	@ObfuscatedName("kb.D")
	public int[] charMaskHeight = new int[256];

	@ObfuscatedName("kb.E")
	public int[] charOffsetX = new int[256];

	@ObfuscatedName("kb.F")
	public int[] charOffsetY = new int[256];

	@ObfuscatedName("kb.G")
	public int[] charAdvance = new int[256];

	@ObfuscatedName("kb.I")
	public Random rand = new Random();

	@ObfuscatedName("kb.J")
	public boolean strikeout = false;

	@ObfuscatedName("kb.H")
	public int height;

	public PixFont(JagFile arg0, boolean arg1, String arg2) {
		Packet var4 = new Packet(arg0.read(arg2 + ".dat", null));
		Packet var5 = new Packet(arg0.read("index.dat", null));
		boolean var6 = true;
		var5.pos = var4.g2() + 4;
		int var7 = var5.g1();
		if (var7 > 0) {
			var5.pos += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			charOffsetX[var8] = var5.g1();
			charOffsetY[var8] = var5.g1();
			int var10 = charMaskWidth[var8] = var5.g2();
			int var11 = charMaskHeight[var8] = var5.g2();
			int var12 = var5.g1();
			int var13 = var10 * var11;
			charMask[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					charMask[var8][var14] = var4.g1b();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						charMask[var8][var10 * var16 + var15] = var4.g1b();
					}
				}
			}

			if (var11 > height && var8 < 128) {
				height = var11;
			}

			charOffsetX[var8] = 1;
			charAdvance[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += charMask[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				charAdvance[var8]--;
				charOffsetX[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += charMask[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				charAdvance[var8]--;
			}
		}

		if (arg1) {
			charAdvance[32] = charAdvance[73];
		} else {
			charAdvance[32] = charAdvance[105];
		}
	}

	@ObfuscatedName("kb.a(IIILjava/lang/String;Z)V")
	public void centreString(int arg0, int arg1, int arg2, String arg3) {
		drawString(arg0 - stringWidTag(arg3) / 2, arg3, arg2, arg1);
	}

	@ObfuscatedName("kb.a(IIILjava/lang/String;IZ)V")
	public void centreStringTag(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
		drawStringTag(arg2, arg4, arg1, arg0 - stringWidTag(arg2) / 2, arg3);
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;)I")
	public int stringWidTag(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += charAdvance[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;IIZ)V")
	public void drawString(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg3 -= height;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					plotLetter(charMask[var6], charOffsetX[var6] + arg0, charOffsetY[var6] + arg3, charMaskWidth[var6], charMaskHeight[var6], arg2);
				}

				arg0 += charAdvance[var6];
			}
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;IIIII)V")
	public void centreStringWave(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg2 -= stringWidTag(arg0) / 2;
			arg1 -= height;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					plotLetter(charMask[var7], charOffsetX[var7] + arg2, charOffsetY[var7] + arg1 + (int) (Math.sin(arg4 / 5.0D + var6 / 2.0D) * 5.0D), charMaskWidth[var7], charMaskHeight[var7], arg3);
				}

				arg2 += charAdvance[var7];
			}
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;IZIII)V")
	public void drawStringTag(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
		strikeout = false;
		int var6 = arg3;
		if (arg0 != null) {
			arg2 -= height;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = updateState(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg0.charAt(var7);
					if (var9 != ' ') {
						if (arg1) {
							plotLetter(charMask[var9], charOffsetX[var9] + arg3 + 1, charOffsetY[var9] + arg2 + 1, charMaskWidth[var9], charMaskHeight[var9], 0);
						}

						plotLetter(charMask[var9], charOffsetX[var9] + arg3, charOffsetY[var9] + arg2, charMaskWidth[var9], charMaskHeight[var9], arg4);
					}

					arg3 += charAdvance[var9];
				}
			}

			if (strikeout) {
				Pix2D.hline(arg3 - var6, 0x800000, var6, (int) (height * 0.7D) + arg2);
			}
		}
	}

	@ObfuscatedName("kb.a(IILjava/lang/String;IIIZ)V")
	public void drawStringAntiMacro(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 != null) {
			rand.setSeed(arg4);
			int var7 = (rand.nextInt() & 0x1F) + 192;
			arg2 -= height;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = updateState(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg3 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg1.charAt(var8);
					if (var10 != ' ') {
						if (arg5) {
							plotLetterTrans(charOffsetY[var10] + arg2 + 1, charMask[var10], charOffsetX[var10] + arg0 + 1, 0, charMaskHeight[var10], 192, charMaskWidth[var10]);
						}

						plotLetterTrans(charOffsetY[var10] + arg2, charMask[var10], charOffsetX[var10] + arg0, arg3, charMaskHeight[var10], var7, charMaskWidth[var10]);
					}

					arg0 += charAdvance[var10];
					if ((rand.nextInt() & 0x3) == 0) {
						arg0++;
					}
				}
			}
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;I)I")
	public int updateState(String arg0) {
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
				strikeout = true;
			}

			return -1;
		}
	}

	@ObfuscatedName("kb.a([BIIIII)V")
	public void plotLetter(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = Pix2D.width * arg2 + arg1;
		int var8 = Pix2D.width - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.clipMinY) {
			int var11 = Pix2D.clipMinY - arg2;
			arg4 -= var11;
			arg2 = Pix2D.clipMinY;
			var10 += arg3 * var11;
			var7 += Pix2D.width * var11;
		}

		if (arg2 + arg4 >= Pix2D.clipMaxY) {
			arg4 -= arg2 + arg4 + 1 - Pix2D.clipMaxY;
		}

		if (arg1 < Pix2D.clipMinX) {
			int var12 = Pix2D.clipMinX - arg1;
			arg3 -= var12;
			arg1 = Pix2D.clipMinX;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= Pix2D.clipMaxX) {
			int var13 = arg1 + arg3 + 1 - Pix2D.clipMaxX;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			plot(Pix2D.pixels, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("kb.a([I[BIIIIIII)V")
	public void plot(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("kb.a(I[BIIIZII)V")
	public void plotLetterTrans(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = Pix2D.width * arg0 + arg2;
		int var9 = Pix2D.width - arg6;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < Pix2D.clipMinY) {
			int var12 = Pix2D.clipMinY - arg0;
			arg4 -= var12;
			arg0 = Pix2D.clipMinY;
			var11 += arg6 * var12;
			var8 += Pix2D.width * var12;
		}

		if (arg0 + arg4 >= Pix2D.clipMaxY) {
			arg4 -= arg0 + arg4 + 1 - Pix2D.clipMaxY;
		}

		if (arg2 < Pix2D.clipMinX) {
			int var13 = Pix2D.clipMinX - arg2;
			arg6 -= var13;
			arg2 = Pix2D.clipMinX;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg6 >= Pix2D.clipMaxX) {
			int var14 = arg2 + arg6 + 1 - Pix2D.clipMaxX;
			arg6 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg6 > 0 && arg4 > 0) {
			plotTrans(arg4, arg1, arg3, arg6, var10, arg5, var8, Pix2D.pixels, var11, var9);
		}
	}

	@ObfuscatedName("kb.a(I[BIIIII[IIII)V")
	public void plotTrans(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		arg2 = ((arg2 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg5 & 0xFF0000) >> 8;
		arg5 = 256 - arg5;
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = -arg3; var12 < 0; var12++) {
				if (arg1[arg8++] == 0) {
					arg6++;
				} else {
					int var13 = arg7[arg6];
					arg7[arg6++] = (((var13 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((var13 & 0xFF00) * arg5 & 0xFF0000) >> 8) + arg2;
				}
			}

			arg6 += arg9;
			arg8 += arg4;
		}
	}
}
