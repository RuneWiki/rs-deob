package deob;

@ObfuscatedName("vy")
public class class551 extends class553 {

	@ObfuscatedName("vy.af")
	public int field5658 = 0;

	@ObfuscatedName("vy.aw")
	public int field5659 = 0;

	public class551(int arg0, int arg1, int arg2, int arg3) {
		super(arg2, arg3);
		this.field5658 = arg0;
		this.field5659 = arg1;
	}

	@ObfuscatedName("vy.af(B)I")
	public int method9798() {
		double var1 = this.method9801();
		return (int) Math.round((double) (this.field5659 - this.field5658) * var1 + (double) this.field5658);
	}
}
