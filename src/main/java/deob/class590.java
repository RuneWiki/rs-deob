package deob;

@ObfuscatedName("wf")
public class class590 extends class591 {

	@ObfuscatedName("wf.af")
	public static final int[] field5913 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("wf.aw")
	public class609 field5914;

	@ObfuscatedName("wf.at")
	public int field5915;

	public class590(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("wf.af(B)V")
	public void method10292() {
		super.method10292();
		this.field5914 = null;
		this.field5915 = 0;
	}

	@ObfuscatedName("wf.aw([IB)V")
	public void method10282(int[] arg0) {
		this.field5914 = new class609(arg0);
	}

	@ObfuscatedName("wf.at(Lxj;I)V")
	public void method10295(class609 arg0) {
		this.field5914 = arg0;
	}

	@ObfuscatedName("wf.ac(II)V")
	public void method10288(int arg0) {
		this.field5917[++this.field5920 - 1] = (byte) (arg0 + this.field5914.method10944());
	}

	@ObfuscatedName("wf.ap(I)I")
	public int method10285() {
		return this.field5917[++this.field5920 - 1] - this.field5914.method10944() & 0xFF;
	}

	@ObfuscatedName("wf.aq(B)Z")
	public boolean method10286() {
		int var1 = this.field5917[this.field5920] - this.field5914.method10945() & 0xFF;
		return var1 >= 128;
	}

	@ObfuscatedName("wf.ao(I)I")
	public int method10280() {
		int var1 = this.field5917[++this.field5920 - 1] - this.field5914.method10944() & 0xFF;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field5917[++this.field5920 - 1] - this.field5914.method10944() & 0xFF);
	}

	@ObfuscatedName("wf.as([BIII)V")
	public void method10281(byte[] arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < arg2; var4++) {
			arg0[arg1 + var4] = (byte) (this.field5917[++this.field5920 - 1] - this.field5914.method10944());
		}
	}

	@ObfuscatedName("wf.al(B)V")
	public void method10289() {
		this.field5915 = this.field5920 * 8;
	}

	@ObfuscatedName("wf.au(II)I")
	public int method10290(int arg0) {
		int var2 = this.field5915 >> 3;
		int var3 = 8 - (this.field5915 & 0x7);
		int var4 = 0;
		this.field5915 += arg0;
		while (arg0 > var3) {
			var4 += (this.field5917[var2++] & field5913[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}
		int var5;
		if (arg0 == var3) {
			var5 = (this.field5917[var2] & field5913[var3]) + var4;
		} else {
			var5 = (this.field5917[var2] >> var3 - arg0 & field5913[arg0]) + var4;
		}
		return var5;
	}

	@ObfuscatedName("wf.ai(I)V")
	public void method10291() {
		this.field5920 = (this.field5915 + 7) / 8;
	}

	@ObfuscatedName("wf.aa(II)I")
	public int method10311(int arg0) {
		return arg0 * 8 - this.field5915;
	}

	@ObfuscatedName("wf.am(II)I")
	public int method10293(int arg0) {
		return arg0 - this.field5920;
	}
}
