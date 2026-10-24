package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("dc")
public class Tone {

	@ObfuscatedName("dc.c")
	public Envelope frequencyBase;

	@ObfuscatedName("dc.d")
	public Envelope amplitudeBase;

	@ObfuscatedName("dc.e")
	public Envelope frequencyModRate;

	@ObfuscatedName("dc.f")
	public Envelope frequencyModRange;

	@ObfuscatedName("dc.g")
	public Envelope amplitudeModRate;

	@ObfuscatedName("dc.h")
	public Envelope amplitudeModRange;

	@ObfuscatedName("dc.i")
	public Envelope release;

	@ObfuscatedName("dc.j")
	public Envelope attack;

	@ObfuscatedName("dc.k")
	public int[] harmonicVolume = new int[5];

	@ObfuscatedName("dc.l")
	public int[] harmonicSemitone = new int[5];

	@ObfuscatedName("dc.m")
	public int[] harmonicDelay = new int[5];

	@ObfuscatedName("dc.n")
	public int reverbDelay;

	@ObfuscatedName("dc.o")
	public int reverbVolume = 100;

	@ObfuscatedName("dc.p")
	public Filter filter;

	@ObfuscatedName("dc.q")
	public Envelope filterRange;

	@ObfuscatedName("dc.r")
	public int length = 500;

	@ObfuscatedName("dc.s")
	public int start;

	@ObfuscatedName("dc.t")
	public static int[] buf;

	@ObfuscatedName("dc.u")
	public static int[] noise;

	@ObfuscatedName("dc.v")
	public static int[] sine;

	@ObfuscatedName("dc.w")
	public static int[] fPos = new int[5];

	@ObfuscatedName("dc.x")
	public static int[] fDel = new int[5];

	@ObfuscatedName("dc.y")
	public static int[] fAmp = new int[5];

	@ObfuscatedName("dc.z")
	public static int[] fMulti = new int[5];

	@ObfuscatedName("dc.A")
	public static int[] fOffset = new int[5];

	@ObfuscatedName("dc.a()V")
	public static final void init() {
		noise = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				noise[var0] = 1;
			} else {
				noise[var0] = -1;
			}
		}

		sine = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			sine[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		buf = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public final int[] generate(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			buf[var3] = 0;
		}

		if (arg1 < 10) {
			return buf;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		frequencyBase.genInit();
		amplitudeBase.genInit();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (frequencyModRate != null) {
			frequencyModRate.genInit();
			frequencyModRange.genInit();
			var6 = (int) ((frequencyModRate.end - frequencyModRate.start) * 32.768D / var4);
			var7 = (int) (frequencyModRate.start * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (amplitudeModRate != null) {
			amplitudeModRate.genInit();
			amplitudeModRange.genInit();
			var9 = (int) ((amplitudeModRate.end - amplitudeModRate.start) * 32.768D / var4);
			var10 = (int) (amplitudeModRate.start * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (harmonicVolume[var12] != 0) {
				fPos[var12] = 0;
				fDel[var12] = (int) (harmonicDelay[var12] * var4);
				fAmp[var12] = (harmonicVolume[var12] << 14) / 100;
				fMulti[var12] = (int) ((frequencyBase.end - frequencyBase.start) * 32.768D * Math.pow(1.0057929410678534D, harmonicSemitone[var12]) / var4);
				fOffset[var12] = (int) (frequencyBase.start * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = frequencyBase.genNext(arg0);
			int var15 = amplitudeBase.genNext(arg0);

			if (frequencyModRate != null) {
				int var16 = frequencyModRate.genNext(arg0);
				int var17 = frequencyModRange.genNext(arg0);
				var14 += waveFunc(frequencyModRate.form, var8, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (amplitudeModRate != null) {
				int var18 = amplitudeModRate.genNext(arg0);
				int var19 = amplitudeModRange.genNext(arg0);
				var15 = var15 * ((waveFunc(amplitudeModRate.form, var11, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (harmonicVolume[var20] != 0) {
					int var21 = fDel[var20] + var13;
					if (var21 < arg0) {
						buf[var21] += waveFunc(frequencyBase.form, fPos[var20], fAmp[var20] * var15 >> 15);
						fPos[var20] += (fMulti[var20] * var14 >> 16) + fOffset[var20];
					}
				}
			}
		}

		if (release != null) {
			release.genInit();
			attack.genInit();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = release.genNext(arg0);
				int var27 = attack.genNext(arg0);
				int var28;
				if (var24) {
					var28 = ((release.end - release.start) * var26 >> 8) + release.start;
				} else {
					var28 = ((release.end - release.start) * var27 >> 8) + release.start;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					buf[var25] = 0;
				}
			}
		}

		if (reverbDelay > 0 && reverbVolume > 0) {
			int var29 = (int) (reverbDelay * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				buf[var30] += buf[var30 - var29] * reverbVolume / 100;
			}
		}

		if (filter.pairs[0] > 0 || filter.pairs[1] > 0) {
			filterRange.genInit();
			int var31 = filterRange.genNext(arg0 + 1);
			int var32 = filter.calculateCoeffs(0, var31 / 65536.0F);
			int var33 = filter.calculateCoeffs(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (buf[var32 + var34] * (long) Filter.reduceCoeffInt >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (buf[var32 + var34 - var37 - 1] * (long) Filter.coeffInt[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (buf[var34 - var38 - 1] * (long) Filter.coeffInt[1][var38] >> 16);
					}

					buf[var34] = var36;
					var31 = filterRange.genNext(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (buf[var32 + var34] * (long) Filter.reduceCoeffInt >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (buf[var32 + var34 - var42 - 1] * (long) Filter.coeffInt[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (buf[var34 - var43 - 1] * (long) Filter.coeffInt[1][var43] >> 16);
						}

						buf[var34] = var41;
						var31 = filterRange.genNext(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = filter.calculateCoeffs(0, var31 / 65536.0F);
					var33 = filter.calculateCoeffs(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (buf[var32 + var34 - var45 - 1] * (long) Filter.coeffInt[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (buf[var34 - var46 - 1] * (long) Filter.coeffInt[1][var46] >> 16);
					}

					buf[var34] = var44;
					filterRange.genNext(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (buf[var48] < -32768) {
				buf[var48] = -32768;
			}

			if (buf[var48] > 32767) {
				buf[var48] = 32767;
			}
		}

		return buf;
	}

	@ObfuscatedName("dc.a(IIII)I")
	public final int waveFunc(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg0 == 2) {
			return sine[arg1 & 0x7FFF] * arg2 >> 14;
		}

		if (arg0 == 3) {
			return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg0 == 4) {
			return noise[arg1 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("dc.a(BLlb;)V")
	public final void load(Packet arg0) {
		frequencyBase = new Envelope();
		frequencyBase.load(arg0);
		amplitudeBase = new Envelope();
		amplitudeBase.load(arg0);
		int var2 = arg0.g1();
		if (var2 != 0) {
			arg0.pos--;
			frequencyModRate = new Envelope();
			frequencyModRate.load(arg0);
			frequencyModRange = new Envelope();
			frequencyModRange.load(arg0);
		}

		int var3 = arg0.g1();
		if (var3 != 0) {
			arg0.pos--;
			amplitudeModRate = new Envelope();
			amplitudeModRate.load(arg0);
			amplitudeModRange = new Envelope();
			amplitudeModRange.load(arg0);
		}

		int var4 = arg0.g1();
		if (var4 != 0) {
			arg0.pos--;
			release = new Envelope();
			release.load(arg0);
			attack = new Envelope();
			attack.load(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.gsmart();
			if (var6 == 0) {
				break;
			}

			harmonicVolume[var5] = var6;
			harmonicSemitone[var5] = arg0.gsmarts();
			harmonicDelay[var5] = arg0.gsmart();
		}

		reverbDelay = arg0.gsmart();
		reverbVolume = arg0.gsmart();
		length = arg0.g2();
		start = arg0.g2();
		filter = new Filter();
		filterRange = new Envelope();
		filter.load(arg0, filterRange);
	}
}
