package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("bc")
public class Envelope {

	@ObfuscatedName("bc.c")
	public int length;

	@ObfuscatedName("bc.d")
	public int[] shapeDelta;

	@ObfuscatedName("bc.e")
	public int[] shapePeak;

	@ObfuscatedName("bc.f")
	public int start;

	@ObfuscatedName("bc.g")
	public int end;

	@ObfuscatedName("bc.h")
	public int form;

	@ObfuscatedName("bc.i")
	public int threshold;

	@ObfuscatedName("bc.j")
	public int position;

	@ObfuscatedName("bc.k")
	public int delta;

	@ObfuscatedName("bc.l")
	public int amplitude;

	@ObfuscatedName("bc.m")
	public int ticks;

	@ObfuscatedName("bc.a(ILmb;)V")
	public final void load(Packet arg0) {
		form = arg0.g1();
		start = arg0.g4();
		end = arg0.g4();
		length = arg0.g1();
		shapeDelta = new int[length];
		shapePeak = new int[length];
		for (int var2 = 0; var2 < length; var2++) {
			shapeDelta[var2] = arg0.g2();
			shapePeak[var2] = arg0.g2();
		}
	}

	@ObfuscatedName("bc.a(I)V")
	public final void genInit() {
		threshold = 0;
		position = 0;
		delta = 0;
		amplitude = 0;
		ticks = 0;
	}

	@ObfuscatedName("bc.a(II)I")
	public final int genNext(int arg0) {
		if (ticks >= threshold) {
			amplitude = shapePeak[position++] << 15;

			if (position >= length) {
				position = length - 1;
			}

			threshold = (int) (shapeDelta[position] / 65536.0D * arg0);
			if (threshold > ticks) {
				delta = ((shapePeak[position] << 15) - amplitude) / (threshold - ticks);
			}
		}

		amplitude += delta;
		ticks++;
		return amplitude - delta >> 15;
	}
}
