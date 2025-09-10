package deob;

@ObfuscatedName("vs")
public abstract class class553 {

	@ObfuscatedName("vs.al")
	public int field5664 = 0;

	@ObfuscatedName("vs.au")
	public int field5667 = 0;

	@ObfuscatedName("vs.ai")
	public double field5666 = 0.0D;

	@ObfuscatedName("vs.aa")
	public int field5665 = 0;

	public class553(int arg0, int arg1) {
		this.field5664 = arg0;
		this.field5667 = 0;
		this.field5665 = arg1 >= 0 && arg1 <= 27 ? arg1 : 0;
		int var4 = this.field5667;
		int var5 = this.field5664;
		int var6 = this.field5665;
		class338 var7 = class338.field3861[var6];
		this.field5666 = class338.method5562((long) var4, (long) var5, var7);
	}

	@ObfuscatedName("vs.al(I)V")
	public void method9803() {
		if (this.field5667 >= this.field5664) {
			return;
		}
		this.field5667++;
		int var1 = this.field5667;
		int var2 = this.field5664;
		int var3 = this.field5665;
		class338 var4 = class338.field3861[var3];
		this.field5666 = class338.method5562((long) var1, (long) var2, var4);
	}

	@ObfuscatedName("vs.au(I)D")
	public double method9801() {
		return this.field5666;
	}
}
