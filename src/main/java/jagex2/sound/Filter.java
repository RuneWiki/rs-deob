package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;
import jagex2.io.Packet;

public class Filter {

	@ObfuscatedName("VADHJTLJ.a")
	public int _flowObfuscator1 = 748;

	@ObfuscatedName("VADHJTLJ.b")
	public int _flowObfuscator2 = 201;

	@ObfuscatedName("VADHJTLJ.c")
	public int[] pairs = new int[2];

	@ObfuscatedName("VADHJTLJ.d")
	public int[][][] frequencies = new int[2][2][4];

	@ObfuscatedName("VADHJTLJ.e")
	public int[][][] ranges = new int[2][2][4];

	@ObfuscatedName("VADHJTLJ.f")
	public int[] unities = new int[2];

	@ObfuscatedName("VADHJTLJ.g")
	public static float[][] coefficient = new float[2][8];

	@ObfuscatedName("VADHJTLJ.h")
	public static int[][] coefficient16 = new int[2][8];

	@ObfuscatedName("VADHJTLJ.i")
	public static float unity;

	@ObfuscatedName("VADHJTLJ.j")
	public static int unity16;

	@ObfuscatedName("VADHJTLJ.a(IIFZ)F")
	public float gain(int arg0, int arg1, float arg2, boolean arg3) {
		float var5 = (float) (this.ranges[arg0][1][arg1] - this.ranges[arg0][0][arg1]) * arg2 + (float) this.ranges[arg0][0][arg1];
		if (arg3) {
			throw new NullPointerException();
		}
		float var6 = var5 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
	}

	@ObfuscatedName("VADHJTLJ.a(BF)F")
	public float normalize(byte arg0, float arg1) {
		float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
		if (arg0 != 8) {
			throw new NullPointerException();
		}
		boolean var4 = false;
		return var3 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("VADHJTLJ.a(BFII)F")
	public float phase(byte arg0, float arg1, int arg2, int arg3) {
		if (arg0 == 9) {
			boolean var5 = false;
		} else {
			this._flowObfuscator1 = -457;
		}
		float var6 = (float) (this.frequencies[arg3][1][arg2] - this.frequencies[arg3][0][arg2]) * arg1 + (float) this.frequencies[arg3][0][arg2];
		float var7 = var6 * 1.2207031E-4F;
		return this.normalize((byte) 8, var7);
	}

	@ObfuscatedName("VADHJTLJ.a(IFI)I")
	public int evaluate(int arg0, float arg1, int arg2) {
		int var4 = 31 / arg2;
		if (arg0 == 0) {
			float var5 = (float) (this.unities[1] - this.unities[0]) * arg1 + (float) this.unities[0];
			float var6 = var5 * 0.0030517578F;
			unity = (float) Math.pow(0.1D, (double) (var6 / 20.0F));
			unity16 = (int) (unity * 65536.0F);
		}
		if (this.pairs[arg0] == 0) {
			return 0;
		}
		float var7 = this.gain(arg0, 0, arg1, false);
		coefficient[arg0][0] = var7 * -2.0F * (float) Math.cos((double) this.phase((byte) 9, arg1, 0, arg0));
		coefficient[arg0][1] = var7 * var7;
		for (int var8 = 1; var8 < this.pairs[arg0]; var8++) {
			float var11 = this.gain(arg0, var8, arg1, false);
			float var12 = var11 * -2.0F * (float) Math.cos((double) this.phase((byte) 9, arg1, var8, arg0));
			float var13 = var11 * var11;
			coefficient[arg0][var8 * 2 + 1] = coefficient[arg0][var8 * 2 - 1] * var13;
			coefficient[arg0][var8 * 2] = coefficient[arg0][var8 * 2 - 1] * var12 + coefficient[arg0][var8 * 2 - 2] * var13;
			for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
				coefficient[arg0][var14] += coefficient[arg0][var14 - 1] * var12 + coefficient[arg0][var14 - 2] * var13;
			}
			coefficient[arg0][1] += coefficient[arg0][0] * var12 + var13;
			coefficient[arg0][0] += var12;
		}
		if (arg0 == 0) {
			for (int var9 = 0; var9 < this.pairs[0] * 2; var9++) {
				coefficient[0][var9] *= unity;
			}
		}
		for (int var10 = 0; var10 < this.pairs[arg0] * 2; var10++) {
			coefficient16[arg0][var10] = (int) (coefficient[arg0][var10] * 65536.0F);
		}
		return this.pairs[arg0] * 2;
	}

	@ObfuscatedName("VADHJTLJ.a(LMBMGIXGO;ZLOZKFTHAD;)V")
	public final void read(Packet arg0, boolean arg1, Envelope arg2) {
		int var4 = arg0.g1();
		this.pairs[0] = var4 >> 4;
		if (arg1) {
			return;
		}
		this.pairs[1] = var4 & 0xF;
		if (var4 == 0) {
			this.unities[0] = this.unities[1] = 0;
			return;
		}
		this.unities[0] = arg0.g2();
		this.unities[1] = arg0.g2();
		int var5 = arg0.g1();
		for (int var6 = 0; var6 < 2; var6++) {
			for (int var9 = 0; var9 < this.pairs[var6]; var9++) {
				this.frequencies[var6][0][var9] = arg0.g2();
				this.ranges[var6][0][var9] = arg0.g2();
			}
		}
		for (int var7 = 0; var7 < 2; var7++) {
			for (int var8 = 0; var8 < this.pairs[var7]; var8++) {
				if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
					this.frequencies[var7][1][var8] = this.frequencies[var7][0][var8];
					this.ranges[var7][1][var8] = this.ranges[var7][0][var8];
				} else {
					this.frequencies[var7][1][var8] = arg0.g2();
					this.ranges[var7][1][var8] = arg0.g2();
				}
			}
		}
		if (var5 != 0 || this.unities[1] != this.unities[0]) {
			arg2.readShape((byte) -112, arg0);
		}
	}

	public Filter() {
		if (Linkable._flowObfuscator2) {
		}
	}
}
