package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import java.util.Random;

@ObfuscatedName("jb")
public final class PixFont extends Pix2D {

	@ObfuscatedName("jb.B")
	public byte[][] charMask = new byte[94][];

	@ObfuscatedName("jb.C")
	public int[] charMaskWidth = new int[94];

	@ObfuscatedName("jb.D")
	public int[] charMaskHeight = new int[94];

	@ObfuscatedName("jb.E")
	public int[] charOffsetX = new int[94];

	@ObfuscatedName("jb.F")
	public int[] charOffsetY = new int[94];

	@ObfuscatedName("jb.G")
	public int[] charAdvance = new int[95];

	@ObfuscatedName("jb.H")
	public int[] drawWidth = new int[256];

	@ObfuscatedName("jb.J")
	public Random rand = new Random();

	@ObfuscatedName("jb.I")
	public int height;

	@ObfuscatedName("jb.K")
	public static int[] CHARCODESET = new int[256];

	public PixFont(JagFile arg0, String arg1) {
		Packet var3 = new Packet(arg0.read(arg1 + ".dat", null));
		Packet var4 = new Packet(arg0.read("index.dat", null));
		var4.pos = var3.g2() + 4;
		int var5 = var4.g1();
		if (var5 > 0) {
			var4.pos += (var5 - 1) * 3;
		}

		for (int var6 = 0; var6 < 94; var6++) {
			charOffsetX[var6] = var4.g1();
			charOffsetY[var6] = var4.g1();
			int var7 = charMaskWidth[var6] = var4.g2();
			int var8 = charMaskHeight[var6] = var4.g2();
			int var9 = var4.g1();
			int var10 = var7 * var8;
			charMask[var6] = new byte[var10];
			if (var9 == 0) {
				for (int var11 = 0; var11 < var10; var11++) {
					charMask[var6][var11] = var3.g1b();
				}
			} else if (var9 == 1) {
				for (int var12 = 0; var12 < var7; var12++) {
					for (int var13 = 0; var13 < var8; var13++) {
						charMask[var6][var7 * var13 + var12] = var3.g1b();
					}
				}
			}

			if (var8 > height) {
				height = var8;
			}

			charOffsetX[var6] = 1;
			charAdvance[var6] = var7 + 2;
			int var14 = 0;
			for (int var15 = var8 / 7; var15 < var8; var15++) {
				var14 += charMask[var6][var7 * var15];
			}

			if (var14 <= var8 / 7) {
				charAdvance[var6]--;
				charOffsetX[var6] = 0;
			}

			int var16 = 0;
			for (int var17 = var8 / 7; var17 < var8; var17++) {
				var16 += charMask[var6][var7 * var17 + var7 - 1];
			}

			if (var16 <= var8 / 7) {
				charAdvance[var6]--;
			}
		}

		charAdvance[94] = charAdvance[8];
		for (int var18 = 0; var18 < 256; var18++) {
			drawWidth[var18] = charAdvance[CHARCODESET[var18]];
		}
	}

	@ObfuscatedName("jb.a(IBILjava/lang/String;I)V")
	public void centreString(int arg0, int arg1, String arg2, int arg3) {
		drawString(arg3 - stringWidTag(arg2) / 2, arg0, arg1, arg2);
	}

	@ObfuscatedName("jb.a(IIZILjava/lang/String;I)V")
	public void centreStringTag(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		drawStringTag(arg0 - stringWidTag(arg4) / 2, arg3, arg4, arg2, arg1);
	}

	@ObfuscatedName("jb.a(ZLjava/lang/String;)I")
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

	@ObfuscatedName("jb.a(IIZILjava/lang/String;)V")
	public void drawString(int arg0, int arg1, int arg2, String arg3) {
		if (arg3 != null) {
			arg1 -= height;
			for (int var5 = 0; var5 < arg3.length(); var5++) {
				int var6 = CHARCODESET[arg3.charAt(var5)];
				if (var6 != 94) {
					plotLetter(charMask[var6], charOffsetX[var6] + arg0, charOffsetY[var6] + arg1, charMaskWidth[var6], charMaskHeight[var6], arg2);
				}

				arg0 += charAdvance[var6];
			}
		}
	}

	@ObfuscatedName("jb.a(IBIIILjava/lang/String;)V")
	public void centreStringWave(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg1 -= stringWidTag(arg4) / 2;
			arg2 -= height;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				int var7 = CHARCODESET[arg4.charAt(var6)];
				if (var7 != 94) {
					plotLetter(charMask[var7], charOffsetX[var7] + arg1, charOffsetY[var7] + arg2 + (int) (Math.sin(arg0 / 5.0D + var6 / 2.0D) * 5.0D), charMaskWidth[var7], charMaskHeight[var7], arg3);
				}

				arg1 += charAdvance[var7];
			}
		}
	}

	@ObfuscatedName("jb.a(IIILjava/lang/String;ZI)V")
	public void drawStringTag(int arg0, int arg1, String arg2, boolean arg3, int arg4) {
		if (arg2 != null) {
			arg1 -= height;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				if (arg2.charAt(var6) == '@' && var6 + 4 < arg2.length() && arg2.charAt(var6 + 4) == '@') {
					arg4 = updateState(arg2.substring(var6 + 1, var6 + 4));
					var6 += 4;
				} else {
					int var7 = CHARCODESET[arg2.charAt(var6)];
					if (var7 != 94) {
						if (arg3) {
							plotLetter(charMask[var7], charOffsetX[var7] + arg0 + 1, charOffsetY[var7] + arg1 + 1, charMaskWidth[var7], charMaskHeight[var7], 0);
						}

						plotLetter(charMask[var7], charOffsetX[var7] + arg0, charOffsetY[var7] + arg1, charMaskWidth[var7], charMaskHeight[var7], arg4);
					}

					arg0 += charAdvance[var7];
				}
			}
		}
	}

	@ObfuscatedName("jb.a(IZBIILjava/lang/String;I)V")
	public void drawStringAntiMacro(int arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			rand.setSeed(arg0);
			int var7 = (rand.nextInt() & 0x1F) + 192;
			arg2 -= height;
			for (int var8 = 0; var8 < arg4.length(); var8++) {
				if (arg4.charAt(var8) == '@' && var8 + 4 < arg4.length() && arg4.charAt(var8 + 4) == '@') {
					arg3 = updateState(arg4.substring(var8 + 1, var8 + 4));
					var8 += 4;
				} else {
					int var9 = CHARCODESET[arg4.charAt(var8)];
					if (var9 != 94) {
						if (arg1) {
							plotLetterTrans(charMask[var9], charOffsetX[var9] + arg5 + 1, charMaskHeight[var9], 0, charOffsetY[var9] + arg2 + 1, 192, charMaskWidth[var9]);
						}

						plotLetterTrans(charMask[var9], charOffsetX[var9] + arg5, charMaskHeight[var9], arg3, charOffsetY[var9] + arg2, var7, charMaskWidth[var9]);
					}

					arg5 += charAdvance[var9];
					if ((rand.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("jb.a(ILjava/lang/String;)I")
	public int updateState(String arg0) {
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

	@ObfuscatedName("jb.a([BIIIII)V")
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

	@ObfuscatedName("jb.a([I[BIIIIIII)V")
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

	@ObfuscatedName("jb.a([BBIIIIII)V")
	public void plotLetterTrans(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = Pix2D.width * arg4 + arg1;
		int var9 = Pix2D.width - arg6;
		int var10 = 0;
		int var11 = 0;
		if (arg4 < Pix2D.clipMinY) {
			int var12 = Pix2D.clipMinY - arg4;
			arg2 -= var12;
			arg4 = Pix2D.clipMinY;
			var11 += arg6 * var12;
			var8 += Pix2D.width * var12;
		}

		if (arg2 + arg4 >= Pix2D.clipMaxY) {
			arg2 -= arg2 + arg4 + 1 - Pix2D.clipMaxY;
		}

		if (arg1 < Pix2D.clipMinX) {
			int var13 = Pix2D.clipMinX - arg1;
			arg6 -= var13;
			arg1 = Pix2D.clipMinX;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg6 >= Pix2D.clipMaxX) {
			int var14 = arg1 + arg6 + 1 - Pix2D.clipMaxX;
			arg6 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg6 > 0 && arg2 > 0) {
			plotTrans(arg2, var8, arg6, Pix2D.pixels, arg0, arg5, var11, var9, var10, arg3);
		}
	}

	@ObfuscatedName("jb.a(III[I[BIIIIBI)V")
	public void plotTrans(int arg0, int arg1, int arg2, int[] arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg9 = ((arg9 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg5 & 0xFF0000) >> 8;
		arg5 = 256 - arg5;
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = -arg2; var12 < 0; var12++) {
				if (arg4[arg6++] == 0) {
					arg1++;
				} else {
					int var13 = arg3[arg1];
					arg3[arg1++] = (((var13 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((var13 & 0xFF00) * arg5 & 0xFF0000) >> 8) + arg9;
				}
			}

			arg1 += arg7;
			arg6 += arg8;
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
