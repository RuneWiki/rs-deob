package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

@ObfuscatedName("aj")
public class class25 extends class98 {

	@ObfuscatedName("aj.af")
	public SourceDataLine field104;

	@ObfuscatedName("aj.aw")
	public AudioFormat field103;

	@ObfuscatedName("aj.at")
	public int field105;

	@ObfuscatedName("aj.ac")
	public byte[] field106;

	@ObfuscatedName("aj.af(I)V")
	public void method346() {
		this.field103 = new AudioFormat((float) field1357, 16, Statics.field1340 ? 2 : 1, true, false);
		this.field106 = new byte[0x200 << (Statics.field1340 ? 2 : 1)];
	}

	@ObfuscatedName("aj.aw(IB)V")
	public void method337(int arg0) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.field103, arg0 << (Statics.field1340 ? 2 : 1));
			this.field104 = (SourceDataLine) AudioSystem.getLine(var2);
			this.field104.open();
			this.field104.start();
			this.field105 = arg0;
		} catch (LineUnavailableException var4) {
			if (class337.method3773(arg0) == 1) {
				this.field104 = null;
				throw var4;
			} else {
				this.method337(class337.method3774(arg0));
			}
		}
	}

	@ObfuscatedName("aj.at(B)I")
	public int method338() {
		return this.field105 - (this.field104.available() >> (Statics.field1340 ? 2 : 1));
	}

	@ObfuscatedName("aj.ac()V")
	public void method339() {
		int var1 = 512;
		if (Statics.field1340) {
			var1 <<= 0x1;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = this.field1341[var2];
			if ((var3 + 8388608 & 0xFF000000) != 0) {
				var3 = var3 >> 31 ^ 0x7FFFFF;
			}
			this.field106[var2 * 2] = (byte) (var3 >> 8);
			this.field106[var2 * 2 + 1] = (byte) (var3 >> 16);
		}
		this.field104.write(this.field106, 0, var1 << 1);
	}

	@ObfuscatedName("aj.ap(I)V")
	public void method340() {
		if (this.field104 != null) {
			this.field104.close();
			this.field104 = null;
		}
	}

	@ObfuscatedName("aj.aq(I)V")
	public void method352() {
		this.field104.flush();
	}
}
