package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("SGFGLWZQ")
public class Filter {

	@ObfuscatedName("SGFGLWZQ.c")
	public int[] field1222 = new int[2];

	@ObfuscatedName("SGFGLWZQ.d")
	public int[][][] field1223 = new int[2][2][4];

	@ObfuscatedName("SGFGLWZQ.e")
	public int[][][] field1224 = new int[2][2][4];

	@ObfuscatedName("SGFGLWZQ.f")
	public int[] field1225 = new int[2];

	@ObfuscatedName("SGFGLWZQ.g")
	public static float[][] field1226 = new float[2][8];

	@ObfuscatedName("SGFGLWZQ.h")
	public static int[][] field1227 = new int[2][8];

	@ObfuscatedName("SGFGLWZQ.i")
	public static float field1228;

	@ObfuscatedName("SGFGLWZQ.j")
	public static int field1229;

	@ObfuscatedName("SGFGLWZQ.a(IIFI)F")
	public float method465(int arg0, float arg1, int arg2) {
		float var4 = (field1224[arg0][1][arg2] - field1224[arg0][0][arg2]) * arg1 + field1224[arg0][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("SGFGLWZQ.a(FI)F")
	public float method466(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("SGFGLWZQ.a(IIIF)F")
	public float method467(int arg0, int arg1, float arg2) {
		float var4 = (field1223[arg1][1][arg0] - field1223[arg1][0][arg0]) * arg2 + field1223[arg1][0][arg0];
		var4 *= 1.2207031E-4F;
		return method466(var4);
	}

	@ObfuscatedName("SGFGLWZQ.a(IZF)I")
	public int method468(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1225[1] - field1225[0]) * arg1 + field1225[0];
			var3 *= 0.0030517578F;
			field1228 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1229 = (int) (field1228 * 65536.0F);
		}

		if (field1222[arg0] == 0) {
			return 0;
		}

		float var4 = method465(arg0, arg1, 0);
		field1226[arg0][0] = var4 * -2.0F * (float) Math.cos(method467(0, arg0, arg1));
		field1226[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1222[arg0]; var5++) {
			float var6 = method465(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method467(var5, arg0, arg1));
			float var8 = var6 * var6;
			field1226[arg0][var5 * 2 + 1] = field1226[arg0][var5 * 2 - 1] * var8;
			field1226[arg0][var5 * 2] = field1226[arg0][var5 * 2 - 1] * var7 + field1226[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1226[arg0][var9] += field1226[arg0][var9 - 1] * var7 + field1226[arg0][var9 - 2] * var8;
			}

			field1226[arg0][1] += field1226[arg0][0] * var7 + var8;
			field1226[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1222[0] * 2; var10++) {
				field1226[0][var10] *= field1228;
			}
		}

		for (int var11 = 0; var11 < field1222[arg0] * 2; var11++) {
			field1227[arg0][var11] = (int) (field1226[arg0][var11] * 65536.0F);
		}

		return field1222[arg0] * 2;
	}

	@ObfuscatedName("SGFGLWZQ.a(ILPFANSVWX;LMFMVIYHT;)V")
	public final void method469(Envelope arg0, Packet arg1) {
		int var3 = arg1.g1();
		field1222[0] = var3 >> 4;
		field1222[1] = var3 & 0xF;
		if (var3 == 0) {
			field1225[0] = field1225[1] = 0;
		} else {
			field1225[0] = arg1.g2();
			field1225[1] = arg1.g2();
			int var4 = arg1.g1();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1222[var5]; var6++) {
					field1223[var5][0][var6] = arg1.g2();
					field1224[var5][0][var6] = arg1.g2();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1222[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1223[var7][1][var8] = field1223[var7][0][var8];
						field1224[var7][1][var8] = field1224[var7][0][var8];
					} else {
						field1223[var7][1][var8] = arg1.g2();
						field1224[var7][1][var8] = arg1.g2();
					}
				}
			}

			if (var4 != 0 || field1225[1] != field1225[0]) {
				arg0.method442(arg1);
			}
		}
	}
}
