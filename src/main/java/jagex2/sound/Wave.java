package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("JHDAGNBV")
public class Wave {

	@ObfuscatedName("JHDAGNBV.i")
	public Tone[] tones = new Tone[10];

	@ObfuscatedName("JHDAGNBV.e")
	public static Wave[] tracks = new Wave[5000];

	@ObfuscatedName("JHDAGNBV.f")
	public static int[] delays = new int[5000];

	@ObfuscatedName("JHDAGNBV.j")
	public int loopBegin;

	@ObfuscatedName("JHDAGNBV.k")
	public int loopEnd;

	@ObfuscatedName("JHDAGNBV.h")
	public static Packet waveBuffer;

	@ObfuscatedName("JHDAGNBV.g")
	public static byte[] waveBytes;

	@ObfuscatedName("JHDAGNBV.a(ILMBMGIXGO;)V")
	public static final void unpack(Packet arg0) {
		waveBytes = new byte[441000];
		waveBuffer = new Packet(waveBytes);
		Tone.init();

		while (true) {
			int var1 = arg0.g2();
			if (var1 == 0xFFFF) {
				return;
			}

			tracks[var1] = new Wave();
			tracks[var1].read(arg0);
			delays[var1] = tracks[var1].trim();
		}
	}

	@ObfuscatedName("JHDAGNBV.a(IIZ)LMBMGIXGO;")
	public static final Packet generate(int arg0, int arg1) {
		if (tracks[arg1] != null) {
			Wave var2 = tracks[arg1];
			return var2.getWave(arg0);
		}

		return null;
	}

	@ObfuscatedName("JHDAGNBV.a(ZLMBMGIXGO;)V")
	public final void read(Packet arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.g1();
			if (var3 != 0) {
				arg0.pos--;
				tones[var2] = new Tone();
				tones[var2].read(arg0);
			}
		}

		loopBegin = arg0.g2();
		loopEnd = arg0.g2();
	}

	@ObfuscatedName("JHDAGNBV.a(I)I")
	public final int trim() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (tones[var2] != null && tones[var2].start / 20 < var1) {
				var1 = tones[var2].start / 20;
			}
		}

		if (loopBegin < loopEnd && loopBegin / 20 < var1) {
			var1 = loopBegin / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (tones[var3] != null) {
					tones[var3].start -= var1 * 20;
				}
			}

			if (loopBegin < loopEnd) {
				loopBegin -= var1 * 20;
				loopEnd -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("JHDAGNBV.a(II)LMBMGIXGO;")
	public final Packet getWave(int arg0) {
		int var2 = generate(arg0);
		waveBuffer.pos = 0;
		waveBuffer.p4(0x52494646);
		waveBuffer.ip4(var2 + 36);
		waveBuffer.p4(0x57415645);
		waveBuffer.p4(0x666D7420);
		waveBuffer.ip4(16);
		waveBuffer.ip2(1);
		waveBuffer.ip2(1);
		waveBuffer.ip4(22050);
		waveBuffer.ip4(22050);
		waveBuffer.ip2(1);
		waveBuffer.ip2(8);
		waveBuffer.p4(0x64617461);
		waveBuffer.ip4(var2);
		waveBuffer.pos += var2;
		return waveBuffer;
	}

	@ObfuscatedName("JHDAGNBV.b(I)I")
	public final int generate(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (tones[var3] != null && tones[var3].start + tones[var3].length > var2) {
				var2 = tones[var3].start + tones[var3].length;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = loopBegin * 22050 / 1000;
		int var6 = loopEnd * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			waveBytes[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (tones[var9] != null) {
				int var10 = tones[var9].length * 22050 / 1000;
				int var11 = tones[var9].start * 22050 / 1000;
				int[] var12 = tones[var9].generate(var10, tones[var9].length);
				for (int var13 = 0; var13 < var10; var13++) {
					waveBytes[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
				}
			}
		}

		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var14 = var7 - var4;
			for (int var15 = var4 - 1; var15 >= var6; var15--) {
				waveBytes[var14 + var15] = waveBytes[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					waveBytes[var17 + var18] = waveBytes[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
