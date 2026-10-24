package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("OZKFTHAD")
public class Envelope {

	@ObfuscatedName("OZKFTHAD.e")
	public int length;

	@ObfuscatedName("OZKFTHAD.h")
	public int start;

	@ObfuscatedName("OZKFTHAD.i")
	public int end;

	@ObfuscatedName("OZKFTHAD.j")
	public int form;

	@ObfuscatedName("OZKFTHAD.k")
	public int threshold;

	@ObfuscatedName("OZKFTHAD.l")
	public int position;

	@ObfuscatedName("OZKFTHAD.m")
	public int delta;

	@ObfuscatedName("OZKFTHAD.n")
	public int aplitude;

	@ObfuscatedName("OZKFTHAD.o")
	public int ticks;

	@ObfuscatedName("OZKFTHAD.f")
	public int[] shapeDelta;

	@ObfuscatedName("OZKFTHAD.g")
	public int[] shapePeak;

	@ObfuscatedName("OZKFTHAD.a(ZLMBMGIXGO;)V")
	public final void read(Packet arg0) {
		form = arg0.g1();
		start = arg0.g4();
		end = arg0.g4();
		readShape(arg0);
	}

	@ObfuscatedName("OZKFTHAD.a(BLMBMGIXGO;)V")
	public final void readShape(Packet arg0) {
		length = arg0.g1();
		shapeDelta = new int[length];
		shapePeak = new int[length];
		for (int var2 = 0; var2 < length; var2++) {
			shapeDelta[var2] = arg0.g2();
			shapePeak[var2] = arg0.g2();
		}
	}

	@ObfuscatedName("OZKFTHAD.a(B)V")
	public final void reset() {
		threshold = 0;
		position = 0;
		delta = 0;
		aplitude = 0;
		ticks = 0;
	}

	@ObfuscatedName("OZKFTHAD.a(ZI)I")
	public final int evaluate(int arg0) {
		if (ticks >= threshold) {
			aplitude = shapePeak[position++] << 15;

			if (position >= length) {
				position = length - 1;
			}

			threshold = (int) (shapeDelta[position] / 65536.0D * arg0);
			if (threshold > ticks) {
				delta = ((shapePeak[position] << 15) - aplitude) / (threshold - ticks);
			}
		}

		aplitude += delta;
		ticks++;
		return aplitude - delta >> 15;
	}
}
