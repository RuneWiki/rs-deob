package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

public class Wave {

	@ObfuscatedName("JHDAGNBV.a")
	public boolean _flowObfuscator1 = true;

	@ObfuscatedName("JHDAGNBV.i")
	public Tone[] tones = new Tone[10];

	@ObfuscatedName("JHDAGNBV.d")
	public int _flowObfuscator4;

	@ObfuscatedName("JHDAGNBV.c")
	public static boolean _flowObfuscator3 = true;

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

	@ObfuscatedName("JHDAGNBV.b")
	public static boolean _flowObfuscator2;

	@ObfuscatedName("JHDAGNBV.g")
	public static byte[] waveBytes;

	public Wave(int arg0) {
		if (arg0 < 8 || arg0 > 8) {
			this._flowObfuscator4 = 477;
		}
	}

	@ObfuscatedName("JHDAGNBV.a(ILMBMGIXGO;)V")
	public static final void unpack(int arg0, Packet arg1) {
		waveBytes = new byte[441000];
		waveBuffer = new Packet(waveBytes, 891);
		if (arg0 != 0) {
			_flowObfuscator2 = !_flowObfuscator2;
		}
		Tone.init();
		while (true) {
			int var2 = arg1.g2();
			if (var2 == 65535) {
				return;
			}
			tracks[var2] = new Wave(8);
			tracks[var2].read(true, arg1);
			delays[var2] = tracks[var2].trim(0);
		}
	}

	@ObfuscatedName("JHDAGNBV.a(IIZ)LMBMGIXGO;")
	public static final Packet generate(int arg0, int arg1, boolean arg2) {
		if (arg2) {
			_flowObfuscator3 = !_flowObfuscator3;
		}
		if (tracks[arg1] == null) {
			return null;
		} else {
			Wave var3 = tracks[arg1];
			return var3.getWave(arg0, 6);
		}
	}

	@ObfuscatedName("JHDAGNBV.a(ZLMBMGIXGO;)V")
	public final void read(boolean arg0, Packet arg1) {
		for (int var3 = 0; var3 < 10; var3++) {
			int var4 = arg1.g1();
			if (var4 != 0) {
				arg1.pos--;
				this.tones[var3] = new Tone();
				this.tones[var3].read(true, arg1);
			}
		}
		if (!arg0) {
			this._flowObfuscator4 = 58;
		}
		this.loopBegin = arg1.g2();
		this.loopEnd = arg1.g2();
	}

	@ObfuscatedName("JHDAGNBV.a(I)I")
	public final int trim(int arg0) {
		int var2 = 9999999;
		if (arg0 != 0) {
			this._flowObfuscator4 = -52;
		}
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.tones[var3] != null && this.tones[var3].start / 20 < var2) {
				var2 = this.tones[var3].start / 20;
			}
		}
		if (this.loopBegin < this.loopEnd && this.loopBegin / 20 < var2) {
			var2 = this.loopBegin / 20;
		}
		if (var2 == 9999999 || var2 == 0) {
			return 0;
		}
		for (int var4 = 0; var4 < 10; var4++) {
			if (this.tones[var4] != null) {
				this.tones[var4].start -= var2 * 20;
			}
		}
		if (this.loopBegin < this.loopEnd) {
			this.loopBegin -= var2 * 20;
			this.loopEnd -= var2 * 20;
		}
		return var2;
	}

	@ObfuscatedName("JHDAGNBV.a(II)LMBMGIXGO;")
	public final Packet getWave(int arg0, int arg1) {
		int var3 = this.generate(arg0);
		waveBuffer.pos = 0;
		waveBuffer.p4(1380533830);
		waveBuffer.ip4(0, var3 + 36);
		waveBuffer.p4(1463899717);
		waveBuffer.p4(1718449184);
		waveBuffer.ip4(0, 16);
		waveBuffer.ip2(true, 1);
		if (arg1 < 6 || arg1 > 6) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		waveBuffer.ip2(true, 1);
		waveBuffer.ip4(0, 22050);
		waveBuffer.ip4(0, 22050);
		waveBuffer.ip2(true, 1);
		waveBuffer.ip2(true, 8);
		waveBuffer.p4(1684108385);
		waveBuffer.ip4(0, var3);
		waveBuffer.pos += var3;
		return waveBuffer;
	}

	@ObfuscatedName("JHDAGNBV.b(I)I")
	public final int generate(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.tones[var3] != null && this.tones[var3].start + this.tones[var3].length > var2) {
				var2 = this.tones[var3].start + this.tones[var3].length;
			}
		}
		if (var2 == 0) {
			return 0;
		}
		int var4 = var2 * 22050 / 1000;
		int var5 = this.loopBegin * 22050 / 1000;
		int var6 = this.loopEnd * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}
		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			waveBytes[var8] = -128;
		}
		for (int var9 = 0; var9 < 10; var9++) {
			if (this.tones[var9] != null) {
				int var15 = this.tones[var9].length * 22050 / 1000;
				int var16 = this.tones[var9].start * 22050 / 1000;
				int[] var17 = this.tones[var9].generate(var15, this.tones[var9].length);
				for (int var18 = 0; var18 < var15; var18++) {
					waveBytes[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
				}
			}
		}
		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var10 = var7 - var4;
			for (int var11 = var4 - 1; var11 >= var6; var11--) {
				waveBytes[var10 + var11] = waveBytes[var11];
			}
			for (int var12 = 1; var12 < arg0; var12++) {
				int var13 = (var6 - var5) * var12;
				for (int var14 = var5; var14 < var6; var14++) {
					waveBytes[var13 + var14] = waveBytes[var14];
				}
			}
			var7 -= 44;
		}
		return var7;
	}
}
