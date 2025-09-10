package deob;

@ObfuscatedName("wk")
public class class588 {

	@ObfuscatedName("wk.as")
	public final int field5904;

	@ObfuscatedName("wk.al")
	public final int field5899;

	@ObfuscatedName("wk.au")
	public final int field5901;

	@ObfuscatedName("wk.ai")
	public final int field5902;

	@ObfuscatedName("wk.aa")
	public final int field5903;

	@ObfuscatedName("wk.am")
	public final int field5900;

	public class588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.field5904 = arg0;
		this.field5899 = arg1;
		this.field5903 = arg2;
		this.field5900 = arg3;
		this.field5901 = arg0 / 2;
		this.field5902 = arg1 / 2;
	}

	public String toString() {
		return String.format("%dx%d (offset %d,%d)", this.field5904, this.field5899, this.field5903, this.field5900);
	}
}
