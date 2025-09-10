package deob;

@ObfuscatedName("sn")
public class class487 {

	@ObfuscatedName("sn.af")
	public final int[] field5348;

	@ObfuscatedName("sn.aw")
	public int field5347;

	public class487(int arg0) {
		this.field5348 = new int[arg0];
	}

	@ObfuscatedName("sn.af(II)V")
	public void method9115(int arg0) {
		this.field5348[++this.field5347 - 1] = arg0;
	}

	@ObfuscatedName("sn.aw(IB)I")
	public int method9104(int arg0) {
		return this.field5348[arg0];
	}

	@ObfuscatedName("sn.at(B)I")
	public int method9107() {
		return this.field5347;
	}

	@ObfuscatedName("sn.ac(I)V")
	public void method9110() {
		this.field5347 = 0;
	}
}
