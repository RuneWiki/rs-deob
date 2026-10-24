package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;
import java.util.Random;

@ObfuscatedName("YXVQXWYR")
public final class PixFont extends Pix2D {

	@ObfuscatedName("YXVQXWYR.E")
	public byte[][] charMask = new byte[256][];

	@ObfuscatedName("YXVQXWYR.F")
	public int[] charMaskWidth = new int[256];

	@ObfuscatedName("YXVQXWYR.G")
	public int[] charMaskHeight = new int[256];

	@ObfuscatedName("YXVQXWYR.H")
	public int[] charOffsetX = new int[256];

	@ObfuscatedName("YXVQXWYR.I")
	public int[] charOffsetY = new int[256];

	@ObfuscatedName("YXVQXWYR.J")
	public int[] charAdvance = new int[256];

	@ObfuscatedName("YXVQXWYR.L")
	public Random random = new Random();

	@ObfuscatedName("YXVQXWYR.M")
	public boolean strikethrough = false;

	@ObfuscatedName("YXVQXWYR.K")
	public int height;

	public PixFont(boolean arg0, String arg1, Jagfile arg2) {
		Packet var4 = new Packet(arg2.read(arg1 + ".dat", null));
		Packet var5 = new Packet(arg2.read("index.dat", null));
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

		if (arg0) {
			charAdvance[32] = charAdvance[73];
		} else {
			charAdvance[32] = charAdvance[105];
		}
	}

	@ObfuscatedName("YXVQXWYR.a(Ljava/lang/String;IIBI)V")
	public void drawStringRight(String arg0, int arg1, int arg2, int arg3) {
		drawString(arg2, arg0, arg3, arg1 - stringWidth(arg0));
	}

	@ObfuscatedName("YXVQXWYR.a(ILjava/lang/String;III)V")
	public void drawStringCenter(int arg0, String arg1, int arg2, int arg3) {
		drawString(arg0, arg1, arg2, arg3 - stringWidth(arg1) / 2);
	}

	@ObfuscatedName("YXVQXWYR.a(IIILjava/lang/String;IZ)V")
	public void drawStringCenterTag(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
		drawStringTag(arg4, arg1 - stringWidthTag(arg2) / 2, arg0, arg2, arg3);
	}

	@ObfuscatedName("YXVQXWYR.a(ILjava/lang/String;)I")
	public int stringWidthTag(String arg0) {
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

	@ObfuscatedName("YXVQXWYR.a(Ljava/lang/String;Z)I")
	public int stringWidth(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += charAdvance[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("YXVQXWYR.b(ILjava/lang/String;III)V")
	public void drawString(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg2 -= height;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					drawChar(charMask[var6], charOffsetX[var6] + arg3, charOffsetY[var6] + arg2, charMaskWidth[var6], charMaskHeight[var6], arg0);
				}

				arg3 += charAdvance[var6];
			}
		}
	}

	@ObfuscatedName("YXVQXWYR.a(IZLjava/lang/String;III)V")
	public void drawStringWave(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg2 -= stringWidth(arg1) / 2;
			arg4 -= height;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					drawChar(charMask[var7], charOffsetX[var7] + arg2, charOffsetY[var7] + arg4 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), charMaskWidth[var7], charMaskHeight[var7], arg0);
				}

				arg2 += charAdvance[var7];
			}
		}
	}

	@ObfuscatedName("YXVQXWYR.a(ILjava/lang/String;IIBI)V")
	public void drawStringWave2(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg0 -= stringWidth(arg1) / 2;
			arg3 -= height;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					drawChar(charMask[var7], charOffsetX[var7] + arg0 + (int) (Math.sin(arg2 / 5.0D + var6 / 5.0D) * 5.0D), charOffsetY[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 3.0D) * 5.0D), charMaskWidth[var7], charMaskHeight[var7], arg4);
				}

				arg0 += charAdvance[var7];
			}
		}
	}

	@ObfuscatedName("YXVQXWYR.a(ILjava/lang/String;ZIIII)V")
	public void drawStringShake(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != null) {
			double var7 = 7.0D - arg0 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg4 -= stringWidth(arg1) / 2;
			arg3 -= height;
			for (int var9 = 0; var9 < arg1.length(); var9++) {
				char var10 = arg1.charAt(var9);
				if (var10 != ' ') {
					drawChar(charMask[var10], charOffsetX[var10] + arg4, charOffsetY[var10] + arg3 + (int) (Math.sin(var9 / 1.5D + arg2) * var7), charMaskWidth[var10], charMaskHeight[var10], arg5);
				}

				arg4 += charAdvance[var10];
			}
		}
	}

	@ObfuscatedName("YXVQXWYR.a(ZZIILjava/lang/String;I)V")
	public void drawStringTag(boolean arg0, int arg1, int arg2, String arg3, int arg4) {
		strikethrough = false;
		int var6 = arg1;
		if (arg3 != null) {
			arg4 -= height;
			for (int var7 = 0; var7 < arg3.length(); var7++) {
				if (arg3.charAt(var7) == '@' && var7 + 4 < arg3.length() && arg3.charAt(var7 + 4) == '@') {
					int var8 = evaluateTag(arg3.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg2 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg3.charAt(var7);
					if (var9 != ' ') {
						if (arg0) {
							drawChar(charMask[var9], charOffsetX[var9] + arg1 + 1, charOffsetY[var9] + arg4 + 1, charMaskWidth[var9], charMaskHeight[var9], 0);
						}

						drawChar(charMask[var9], charOffsetX[var9] + arg1, charOffsetY[var9] + arg4, charMaskWidth[var9], charMaskHeight[var9], arg2);
					}

					arg1 += charAdvance[var9];
				}
			}

			if (strikethrough) {
				Pix2D.drawHorizontalLine((int) (height * 0.7D) + arg4, 0x800000, arg1 - var6, var6);
			}
		}
	}

	@ObfuscatedName("YXVQXWYR.a(ZIILjava/lang/String;III)V")
	public void drawStringTooltip(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			random.setSeed(arg4);
			int var7 = (random.nextInt() & 0x1F) + 192;
			arg5 -= height;
			for (int var8 = 0; var8 < arg3.length(); var8++) {
				if (arg3.charAt(var8) == '@' && var8 + 4 < arg3.length() && arg3.charAt(var8 + 4) == '@') {
					int var9 = evaluateTag(arg3.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg2 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg3.charAt(var8);
					if (var10 != ' ') {
						if (arg0) {
							drawCharAlpha(192, charOffsetX[var10] + arg1 + 1, charMask[var10], charMaskWidth[var10], charOffsetY[var10] + arg5 + 1, charMaskHeight[var10], 0);
						}

						drawCharAlpha(var7, charOffsetX[var10] + arg1, charMask[var10], charMaskWidth[var10], charOffsetY[var10] + arg5, charMaskHeight[var10], arg2);
					}

					arg1 += charAdvance[var10];
					if ((random.nextInt() & 0x3) == 0) {
						arg1++;
					}
				}
			}
		}
	}

	@ObfuscatedName("YXVQXWYR.a(Ljava/lang/String;I)I")
	public int evaluateTag(String arg0) {
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
				strikethrough = true;
			}

			if (arg0.equals("end")) {
				strikethrough = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("YXVQXWYR.a([BIIIII)V")
	public void drawChar(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = Pix2D.width2d * arg2 + arg1;
		int var8 = Pix2D.width2d - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.top) {
			int var11 = Pix2D.top - arg2;
			arg4 -= var11;
			arg2 = Pix2D.top;
			var10 += arg3 * var11;
			var7 += Pix2D.width2d * var11;
		}

		if (arg2 + arg4 >= Pix2D.bottom) {
			arg4 -= arg2 + arg4 + 1 - Pix2D.bottom;
		}

		if (arg1 < Pix2D.left) {
			int var12 = Pix2D.left - arg1;
			arg3 -= var12;
			arg1 = Pix2D.left;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= Pix2D.right) {
			int var13 = arg1 + arg3 + 1 - Pix2D.right;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			copyPixels(Pix2D.data, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("YXVQXWYR.a([I[BIIIIIII)V")
	public void copyPixels(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("YXVQXWYR.a(II[BIIIZI)V")
	public void drawCharAlpha(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = Pix2D.width2d * arg4 + arg1;
		int var9 = Pix2D.width2d - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg4 < Pix2D.top) {
			int var12 = Pix2D.top - arg4;
			arg5 -= var12;
			arg4 = Pix2D.top;
			var11 += arg3 * var12;
			var8 += Pix2D.width2d * var12;
		}

		if (arg4 + arg5 >= Pix2D.bottom) {
			arg5 -= arg4 + arg5 + 1 - Pix2D.bottom;
		}

		if (arg1 < Pix2D.left) {
			int var13 = Pix2D.left - arg1;
			arg3 -= var13;
			arg1 = Pix2D.left;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg3 >= Pix2D.right) {
			int var14 = arg1 + arg3 + 1 - Pix2D.right;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg3 > 0 && arg5 > 0) {
			copyPixelsAlpha(arg2, arg5, var8, Pix2D.data, var11, arg3, var10, var9, arg6, arg0);
		}
	}

	@ObfuscatedName("YXVQXWYR.a([BII[IIIIIIII)V")
	public void copyPixelsAlpha(byte[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg8 = ((arg8 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		arg9 = 256 - arg9;
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = -arg5; var12 < 0; var12++) {
				if (arg0[arg4++] == 0) {
					arg2++;
				} else {
					int var13 = arg3[arg2];
					arg3[arg2++] = (((var13 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 & 0xFF0000) >> 8) + arg8;
				}
			}

			arg2 += arg7;
			arg4 += arg6;
		}
	}
}
