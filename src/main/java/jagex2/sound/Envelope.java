package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

public class Envelope {

	@ObfuscatedName("OZKFTHAD.a")
	public boolean _flowObfuscator1 = false;

	@ObfuscatedName("OZKFTHAD.b")
	public byte _flowObfuscator2 = -112;

	@ObfuscatedName("OZKFTHAD.c")
	public boolean _flowObfuscator3 = false;

	@ObfuscatedName("OZKFTHAD.d")
	public boolean _flowObfuscator4 = true;

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

	@ObfuscatedName("OZKFTHAD.p")
	public static int _flowObfuscator5;

	@ObfuscatedName("OZKFTHAD.f")
	public int[] shapeDelta;

	@ObfuscatedName("OZKFTHAD.g")
	public int[] shapePeak;

	@ObfuscatedName("OZKFTHAD.a(ZLMBMGIXGO;)V")
	public final void read(boolean arg0, Packet arg1) {
		this.form = arg1.g1();
		if (!arg0) {
			throw new NullPointerException();
		}
		this.start = arg1.g4();
		this.end = arg1.g4();
		this.readShape((byte) -112, arg1);
	}

	@ObfuscatedName("OZKFTHAD.a(BLMBMGIXGO;)V")
	public final void readShape(byte arg0, Packet arg1) {
		if (this._flowObfuscator2 != arg0) {
			this._flowObfuscator3 = !this._flowObfuscator3;
		}
		this.length = arg1.g1();
		this.shapeDelta = new int[this.length];
		this.shapePeak = new int[this.length];
		for (int var3 = 0; var3 < this.length; var3++) {
			this.shapeDelta[var3] = arg1.g2();
			this.shapePeak[var3] = arg1.g2();
		}
	}

	@ObfuscatedName("OZKFTHAD.a(B)V")
	public final void reset(byte arg0) {
		this.threshold = 0;
		if (arg0 == 8) {
			boolean var2 = false;
		} else {
			this._flowObfuscator4 = !this._flowObfuscator4;
		}
		this.position = 0;
		this.delta = 0;
		this.aplitude = 0;
		this.ticks = 0;
	}

	@ObfuscatedName("OZKFTHAD.a(ZI)I")
	public final int evaluate(boolean arg0, int arg1) {
		if (!arg0) {
			this._flowObfuscator1 = !this._flowObfuscator1;
		}
		if (this.ticks >= this.threshold) {
			this.aplitude = this.shapePeak[this.position++] << 15;
			if (this.position >= this.length) {
				this.position = this.length - 1;
			}
			this.threshold = (int) ((double) this.shapeDelta[this.position] / 65536.0D * (double) arg1);
			if (this.threshold > this.ticks) {
				this.delta = ((this.shapePeak[this.position] << 15) - this.aplitude) / (this.threshold - this.ticks);
			}
		}
		this.aplitude += this.delta;
		this.ticks++;
		return this.aplitude - this.delta >> 15;
	}
}
