package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("xb")
public class Envelope {

	@ObfuscatedName("xb.a")
	public int length;

	@ObfuscatedName("xb.b")
	public int[] shapeDelta;

	@ObfuscatedName("xb.c")
	public int[] shapePeak;

	@ObfuscatedName("xb.d")
	public int start;

	@ObfuscatedName("xb.e")
	public int end;

	@ObfuscatedName("xb.f")
	public int form;

	@ObfuscatedName("xb.g")
	public int threshold;

	@ObfuscatedName("xb.h")
	public int position;

	@ObfuscatedName("xb.i")
	public int delta;

	@ObfuscatedName("xb.j")
	public int amplitude;

	@ObfuscatedName("xb.k")
	public int ticks;

	@ObfuscatedName("xb.a(ZLkb;)V")
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

	@ObfuscatedName("xb.a(I)V")
	public final void genInit() {
		threshold = 0;
		position = 0;
		delta = 0;
		amplitude = 0;
		ticks = 0;
	}

	@ObfuscatedName("xb.a(ZI)I")
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
