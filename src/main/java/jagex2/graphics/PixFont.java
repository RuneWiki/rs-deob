package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import java.util.Random;

@ObfuscatedName("lb")
public final class PixFont extends Pix2D {

	@ObfuscatedName("lb.E")
	public byte[][] charMask = new byte[94][];

	@ObfuscatedName("lb.F")
	public int[] charMaskWidth = new int[94];

	@ObfuscatedName("lb.G")
	public int[] charMaskHeight = new int[94];

	@ObfuscatedName("lb.H")
	public int[] charOffsetX = new int[94];

	@ObfuscatedName("lb.I")
	public int[] charOffsetY = new int[94];

	@ObfuscatedName("lb.J")
	public int[] charAdvance = new int[95];

	@ObfuscatedName("lb.K")
	public int[] drawWidth = new int[256];

	@ObfuscatedName("lb.M")
	public Random rand = new Random();

	@ObfuscatedName("lb.N")
	public boolean strikeout = false;

	@ObfuscatedName("lb.L")
	public int height;

	@ObfuscatedName("lb.O")
	public static int[] CHARCODESET = new int[256];

	public PixFont(String arg0, JagFile arg1) {
		Packet var3 = new Packet(arg1.read(arg0 + ".dat", null));
		Packet var4 = new Packet(arg1.read("index.dat", null));
		boolean var5 = true;
		var4.pos = var3.g2() + 4;
		int var6 = var4.g1();
		if (var6 > 0) {
			var4.pos += (var6 - 1) * 3;
		}

		for (int var7 = 0; var7 < 94; var7++) {
			charOffsetX[var7] = var4.g1();
			charOffsetY[var7] = var4.g1();
			int var9 = charMaskWidth[var7] = var4.g2();
			int var10 = charMaskHeight[var7] = var4.g2();
			int var11 = var4.g1();
			int var12 = var9 * var10;
			charMask[var7] = new byte[var12];
			if (var11 == 0) {
				for (int var13 = 0; var13 < var12; var13++) {
					charMask[var7][var13] = var3.g1b();
				}
			} else if (var11 == 1) {
				for (int var14 = 0; var14 < var9; var14++) {
					for (int var15 = 0; var15 < var10; var15++) {
						charMask[var7][var9 * var15 + var14] = var3.g1b();
					}
				}
			}

			if (var10 > height) {
				height = var10;
			}

			charOffsetX[var7] = 1;
			charAdvance[var7] = var9 + 2;
			int var16 = 0;
			for (int var17 = var10 / 7; var17 < var10; var17++) {
				var16 += charMask[var7][var9 * var17];
			}

			if (var16 <= var10 / 7) {
				charAdvance[var7]--;
				charOffsetX[var7] = 0;
			}

			int var18 = 0;
			for (int var19 = var10 / 7; var19 < var10; var19++) {
				var18 += charMask[var7][var9 * var19 + var9 - 1];
			}

			if (var18 <= var10 / 7) {
				charAdvance[var7]--;
			}
		}

		charAdvance[94] = charAdvance[8];
		for (int var20 = 0; var20 < 256; var20++) {
			drawWidth[var20] = charAdvance[CHARCODESET[var20]];
		}
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;III)V")
	public void centreString(int arg0, String arg1, int arg2, int arg3) {
		drawString(arg3, arg2 - stringWidTag(arg1) / 2, arg0, arg1);
	}

	@ObfuscatedName("lb.a(IILjava/lang/String;ZIZ)V")
	public void centreStringTag(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
		drawStringTag(arg4, arg2, arg3, arg0, arg1 - stringWidTag(arg2) / 2);
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;Z)I")
	public int stringWidTag(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += drawWidth[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("lb.a(IIIILjava/lang/String;)V")
	public void drawString(int arg0, int arg1, int arg2, String arg3) {
		if (arg3 != null) {
			arg2 -= height;
			for (int var5 = 0; var5 < arg3.length(); var5++) {
				int var6 = CHARCODESET[arg3.charAt(var5)];
				if (var6 != 94) {
					plotLetter(charMask[var6], charOffsetX[var6] + arg1, charOffsetY[var6] + arg2, charMaskWidth[var6], charMaskHeight[var6], arg0);
				}

				arg1 += charAdvance[var6];
			}
		}
	}

	@ObfuscatedName("lb.a(IIBILjava/lang/String;I)V")
	public void centreStringWave(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg2 -= stringWidTag(arg3) / 2;
			arg4 -= height;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				int var7 = CHARCODESET[arg3.charAt(var6)];
				if (var7 != 94) {
					plotLetter(charMask[var7], charOffsetX[var7] + arg2, charOffsetY[var7] + arg4 + (int) (Math.sin(arg0 / 5.0D + var6 / 2.0D) * 5.0D), charMaskWidth[var7], charMaskHeight[var7], arg1);
				}

				arg2 += charAdvance[var7];
			}
		}
	}

	@ObfuscatedName("lb.a(ZLjava/lang/String;IBII)V")
	public void drawStringTag(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
		strikeout = false;
		int var6 = arg4;
		if (arg1 != null) {
			arg2 -= height;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = updateState(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg3 = var8;
					}

					var7 += 4;
				} else {
					int var9 = CHARCODESET[arg1.charAt(var7)];
					if (var9 != 94) {
						if (arg0) {
							plotLetter(charMask[var9], charOffsetX[var9] + arg4 + 1, charOffsetY[var9] + arg2 + 1, charMaskWidth[var9], charMaskHeight[var9], 0);
						}

						plotLetter(charMask[var9], charOffsetX[var9] + arg4, charOffsetY[var9] + arg2, charMaskWidth[var9], charMaskHeight[var9], arg3);
					}

					arg4 += charAdvance[var9];
				}
			}

			if (strikeout) {
				Pix2D.hline(var6, (int) (height * 0.7D) + arg2, 0x800000, arg4 - var6);
			}
		}
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;IIZII)V")
	public void drawStringAntiMacro(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5) {
		if (arg1 != null) {
			rand.setSeed(arg4);
			int var7 = (rand.nextInt() & 0x1F) + 192;
			arg0 -= height;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = updateState(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg2 = var9;
					}

					var8 += 4;
				} else {
					int var10 = CHARCODESET[arg1.charAt(var8)];
					if (var10 != 94) {
						if (arg3) {
							plotLetterTrans(charMaskHeight[var10], charOffsetY[var10] + arg0 + 1, 0, 192, charMaskWidth[var10], charMask[var10], charOffsetX[var10] + arg5 + 1);
						}

						plotLetterTrans(charMaskHeight[var10], charOffsetY[var10] + arg0, arg2, var7, charMaskWidth[var10], charMask[var10], charOffsetX[var10] + arg5);
					}

					arg5 += charAdvance[var10];
					if ((rand.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("lb.a(BLjava/lang/String;)I")
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

	@ObfuscatedName("lb.a([BIIIII)V")
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

	@ObfuscatedName("lb.a([I[BIIIIIII)V")
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

	@ObfuscatedName("lb.a(IIIII[BII)V")
	public void plotLetterTrans(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
		int var8 = Pix2D.width * arg1 + arg6;
		int var9 = Pix2D.width - arg4;
		int var10 = 0;
		int var11 = 0;
		if (arg1 < Pix2D.clipMinY) {
			int var12 = Pix2D.clipMinY - arg1;
			arg0 -= var12;
			arg1 = Pix2D.clipMinY;
			var11 += arg4 * var12;
			var8 += Pix2D.width * var12;
		}

		if (arg0 + arg1 >= Pix2D.clipMaxY) {
			arg0 -= arg0 + arg1 + 1 - Pix2D.clipMaxY;
		}

		if (arg6 < Pix2D.clipMinX) {
			int var13 = Pix2D.clipMinX - arg6;
			arg4 -= var13;
			arg6 = Pix2D.clipMinX;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg4 + arg6 >= Pix2D.clipMaxX) {
			int var14 = arg4 + arg6 + 1 - Pix2D.clipMaxX;
			arg4 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg4 > 0 && arg0 > 0) {
			plotTrans(arg2, Pix2D.pixels, arg4, arg3, var10, arg5, var11, var9, arg0, var8);
		}
	}

	@ObfuscatedName("lb.a(I[IIIII[BIIII)V")
	public void plotTrans(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
		arg0 = ((arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg3 & 0xFF0000) >> 8;
		arg3 = 256 - arg3;
		for (int var11 = -arg8; var11 < 0; var11++) {
			for (int var12 = -arg2; var12 < 0; var12++) {
				if (arg5[arg6++] == 0) {
					arg9++;
				} else {
					int var13 = arg1[arg9];
					arg1[arg9++] = (((var13 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((var13 & 0xFF00) * arg3 & 0xFF0000) >> 8) + arg0;
				}
			}

			arg9 += arg7;
			arg6 += arg4;
		}
	}

	static {
		String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = var0.indexOf(var1);
			if (var2 == -1) {
				var2 = 74;
			}

			CHARCODESET[var1] = var2;
		}
	}
}
