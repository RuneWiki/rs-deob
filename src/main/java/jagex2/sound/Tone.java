package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("CLRWXPOI")
public class Tone {

	@ObfuscatedName("CLRWXPOI.j")
	public int[] harmonicVolume = new int[5];

	@ObfuscatedName("CLRWXPOI.k")
	public int[] harmonicSemitone = new int[5];

	@ObfuscatedName("CLRWXPOI.l")
	public int[] harmonicDelay = new int[5];

	@ObfuscatedName("CLRWXPOI.n")
	public int reverbVolume = 100;

	@ObfuscatedName("CLRWXPOI.q")
	public int length = 500;

	@ObfuscatedName("CLRWXPOI.v")
	public static int[] tmpPhases = new int[5];

	@ObfuscatedName("CLRWXPOI.w")
	public static int[] tmpDelays = new int[5];

	@ObfuscatedName("CLRWXPOI.x")
	public static int[] tmpVolumes = new int[5];

	@ObfuscatedName("CLRWXPOI.y")
	public static int[] tmpSemitones = new int[5];

	@ObfuscatedName("CLRWXPOI.z")
	public static int[] tmpStarts = new int[5];

	@ObfuscatedName("CLRWXPOI.m")
	public int reverbDelay;

	@ObfuscatedName("CLRWXPOI.r")
	public int start;

	@ObfuscatedName("CLRWXPOI.b")
	public Envelope frequencyBase;

	@ObfuscatedName("CLRWXPOI.c")
	public Envelope amplitudeBase;

	@ObfuscatedName("CLRWXPOI.d")
	public Envelope frequencyModRate;

	@ObfuscatedName("CLRWXPOI.e")
	public Envelope frequencyModRange;

	@ObfuscatedName("CLRWXPOI.f")
	public Envelope amplitudeModRate;

	@ObfuscatedName("CLRWXPOI.g")
	public Envelope amplitudeModRange;

	@ObfuscatedName("CLRWXPOI.h")
	public Envelope release;

	@ObfuscatedName("CLRWXPOI.i")
	public Envelope attack;

	@ObfuscatedName("CLRWXPOI.p")
	public Envelope filterRange;

	@ObfuscatedName("CLRWXPOI.o")
	public Filter filter;

	@ObfuscatedName("CLRWXPOI.s")
	public static int[] buffer;

	@ObfuscatedName("CLRWXPOI.t")
	public static int[] noise;

	@ObfuscatedName("CLRWXPOI.u")
	public static int[] sin;

	@ObfuscatedName("CLRWXPOI.a()V")
	public static final void init() {
		noise = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				noise[var0] = 1;
			} else {
				noise[var0] = -1;
			}
		}

		sin = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			sin[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		buffer = new int[220500];
	}

	@ObfuscatedName("CLRWXPOI.a(II)[I")
	public final int[] generate(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			buffer[var3] = 0;
		}

		if (arg1 < 10) {
			return buffer;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		frequencyBase.reset();
		amplitudeBase.reset();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (frequencyModRate != null) {
			frequencyModRate.reset();
			frequencyModRange.reset();
			var6 = (int) ((frequencyModRate.end - frequencyModRate.start) * 32.768D / var4);
			var7 = (int) (frequencyModRate.start * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (amplitudeModRate != null) {
			amplitudeModRate.reset();
			amplitudeModRange.reset();
			var9 = (int) ((amplitudeModRate.end - amplitudeModRate.start) * 32.768D / var4);
			var10 = (int) (amplitudeModRate.start * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (harmonicVolume[var12] != 0) {
				tmpPhases[var12] = 0;
				tmpDelays[var12] = (int) (harmonicDelay[var12] * var4);
				tmpVolumes[var12] = (harmonicVolume[var12] << 14) / 100;
				tmpSemitones[var12] = (int) ((frequencyBase.end - frequencyBase.start) * 32.768D * Math.pow(1.0057929410678534D, harmonicSemitone[var12]) / var4);
				tmpStarts[var12] = (int) (frequencyBase.start * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = frequencyBase.evaluate(arg0);
			int var15 = amplitudeBase.evaluate(arg0);

			if (frequencyModRate != null) {
				int var16 = frequencyModRate.evaluate(arg0);
				int var17 = frequencyModRange.evaluate(arg0);
				var14 += generate(var17, var8, frequencyModRate.form) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (amplitudeModRate != null) {
				int var18 = amplitudeModRate.evaluate(arg0);
				int var19 = amplitudeModRange.evaluate(arg0);
				var15 = var15 * ((generate(var19, var11, amplitudeModRate.form) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (harmonicVolume[var20] != 0) {
					int var21 = tmpDelays[var20] + var13;
					if (var21 < arg0) {
						buffer[var21] += generate(tmpVolumes[var20] * var15 >> 15, tmpPhases[var20], frequencyBase.form);
						tmpPhases[var20] += (tmpSemitones[var20] * var14 >> 16) + tmpStarts[var20];
					}
				}
			}
		}

		if (release != null) {
			release.reset();
			attack.reset();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = release.evaluate(arg0);
				int var27 = attack.evaluate(arg0);
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
					buffer[var25] = 0;
				}
			}
		}

		if (reverbDelay > 0 && reverbVolume > 0) {
			int var29 = (int) (reverbDelay * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				buffer[var30] += buffer[var30 - var29] * reverbVolume / 100;
			}
		}

		if (filter.pairs[0] > 0 || filter.pairs[1] > 0) {
			filterRange.reset();
			int var31 = filterRange.evaluate(arg0 + 1);
			int var32 = filter.evaluate(0, var31 / 65536.0F);
			int var33 = filter.evaluate(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (buffer[var32 + var34] * (long) Filter.unity16 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (buffer[var32 + var34 - var37 - 1] * (long) Filter.coefficient16[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (buffer[var34 - var38 - 1] * (long) Filter.coefficient16[1][var38] >> 16);
					}

					buffer[var34] = var36;
					var31 = filterRange.evaluate(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (buffer[var32 + var34] * (long) Filter.unity16 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (buffer[var32 + var34 - var42 - 1] * (long) Filter.coefficient16[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (buffer[var34 - var43 - 1] * (long) Filter.coefficient16[1][var43] >> 16);
						}

						buffer[var34] = var41;
						var31 = filterRange.evaluate(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = filter.evaluate(0, var31 / 65536.0F);
					var33 = filter.evaluate(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (buffer[var32 + var34 - var45 - 1] * (long) Filter.coefficient16[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (buffer[var34 - var46 - 1] * (long) Filter.coefficient16[1][var46] >> 16);
					}

					buffer[var34] = var44;
					filterRange.evaluate(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (buffer[var48] < -32768) {
				buffer[var48] = -32768;
			}

			if (buffer[var48] > 32767) {
				buffer[var48] = 32767;
			}
		}

		return buffer;
	}

	@ObfuscatedName("CLRWXPOI.a(IIII)I")
	public final int generate(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg2 == 2) {
			return sin[arg1 & 0x7FFF] * arg0 >> 14;
		}

		if (arg2 == 3) {
			return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg2 == 4) {
			return noise[arg1 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("CLRWXPOI.a(ZLMBMGIXGO;)V")
	public final void read(Packet arg0) {
		frequencyBase = new Envelope();
		frequencyBase.read(arg0);
		amplitudeBase = new Envelope();
		amplitudeBase.read(arg0);
		int var2 = arg0.g1();
		if (var2 != 0) {
			arg0.pos--;
			frequencyModRate = new Envelope();
			frequencyModRate.read(arg0);
			frequencyModRange = new Envelope();
			frequencyModRange.read(arg0);
		}

		int var3 = arg0.g1();
		if (var3 != 0) {
			arg0.pos--;
			amplitudeModRate = new Envelope();
			amplitudeModRate.read(arg0);
			amplitudeModRange = new Envelope();
			amplitudeModRange.read(arg0);
		}

		int var4 = arg0.g1();
		if (var4 != 0) {
			arg0.pos--;
			release = new Envelope();
			release.read(arg0);
			attack = new Envelope();
			attack.read(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.gsmarts();
			if (var6 == 0) {
				break;
			}

			harmonicVolume[var5] = var6;
			harmonicSemitone[var5] = arg0.gsmart();
			harmonicDelay[var5] = arg0.gsmarts();
		}

		reverbDelay = arg0.gsmarts();
		reverbVolume = arg0.gsmarts();
		length = arg0.g2();
		start = arg0.g2();
		filter = new Filter();
		filterRange = new Envelope();
		filter.read(arg0, filterRange);
	}
}
