package deob;

@ObfuscatedName("vk")
public class class550 extends class552 {

	@ObfuscatedName("vk.af")
	public int field5656 = 0;

	@ObfuscatedName("vk.aw")
	public int field5650 = 0;

	@ObfuscatedName("vk.at")
	public int field5652 = 0;

	@ObfuscatedName("vk.ac")
	public int field5653 = 0;

	@ObfuscatedName("vk.ap")
	public int field5651 = 0;

	@ObfuscatedName("vk.aq")
	public int field5655 = 0;

	public class550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		super(arg6, arg7);
		this.field5656 = arg0;
		this.field5650 = arg1;
		this.field5652 = arg2;
		this.field5653 = arg3;
		this.field5651 = arg4;
		this.field5655 = arg5;
	}

	@ObfuscatedName("vk.af(I)I")
	public int method9790() {
		double var1 = this.method9801();
		return (int) Math.round((double) (this.field5653 - this.field5656) * var1 + (double) this.field5656);
	}

	@ObfuscatedName("vk.aw(I)I")
	public int method9791() {
		double var1 = this.method9801();
		return (int) Math.round((double) (this.field5651 - this.field5650) * var1 + (double) this.field5650);
	}

	@ObfuscatedName("vk.at(I)I")
	public int method9789() {
		double var1 = this.method9801();
		return (int) Math.round((double) (this.field5655 - this.field5652) * var1 + (double) this.field5652);
	}
}
