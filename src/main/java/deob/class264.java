package deob;

@ObfuscatedName("ki")
public class class264 extends class272 {

	@ObfuscatedName("ki.af")
	public long[] field3122 = new long[10];

	@ObfuscatedName("ki.aw")
	public int field3123 = 256;

	@ObfuscatedName("ki.at")
	public int field3130 = 1;

	@ObfuscatedName("ki.ac")
	public long field3124 = class335.method3987();

	@ObfuscatedName("ki.ap")
	public int field3129 = 0;

	@ObfuscatedName("ki.aq")
	public int field3127;

	public class264() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.field3122[var1] = this.field3124;
		}
	}

	@ObfuscatedName("ki.af(I)V")
	public void method5414() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.field3122[var1] = 0L;
		}
	}

	@ObfuscatedName("ki.aw(III)I")
	public int method5416(int arg0, int arg1) {
		int var3 = this.field3123;
		int var4 = this.field3130;
		this.field3123 = 300;
		this.field3130 = 1;
		this.field3124 = class335.method3987();
		if (this.field3122[this.field3127] == 0L) {
			this.field3123 = var3;
			this.field3130 = var4;
		} else if (this.field3124 > this.field3122[this.field3127]) {
			this.field3123 = (int) ((long) (arg0 * 2560) / (this.field3124 - this.field3122[this.field3127]));
		}
		if (this.field3123 < 25) {
			this.field3123 = 25;
		}
		if (this.field3123 > 256) {
			this.field3123 = 256;
			this.field3130 = (int) ((long) arg0 - (this.field3124 - this.field3122[this.field3127]) / 10L);
		}
		if (this.field3130 > arg0) {
			this.field3130 = arg0;
		}
		this.field3122[this.field3127] = this.field3124;
		this.field3127 = (this.field3127 + 1) % 10;
		if (this.field3130 > 1) {
			for (int var5 = 0; var5 < 10; var5++) {
				if (this.field3122[var5] != 0L) {
					this.field3122[var5] += this.field3130;
				}
			}
		}
		if (this.field3130 < arg1) {
			this.field3130 = arg1;
		}
		class336.method3770((long) this.field3130);
		int var6 = 0;
		while (this.field3129 < 256) {
			var6++;
			this.field3129 += this.field3123;
		}
		this.field3129 &= 0xFF;
		return var6;
	}
}
