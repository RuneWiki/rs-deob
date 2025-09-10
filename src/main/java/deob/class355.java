package deob;

@ObfuscatedName("nq")
public class class355 extends class541 {

	@ObfuscatedName("nq.af")
	public final int field4020;

	@ObfuscatedName("nq.aw")
	public final int field4021;

	@ObfuscatedName("nq.at")
	public final int[] field4019;

	@ObfuscatedName("nq.ac")
	public final int[] field4018;

	public class355(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
		this.field4020 = arg0;
		this.field4021 = arg1;
		this.field4019 = arg2;
		this.field4018 = arg3;
	}

	@ObfuscatedName("nq.af(IIB)Z")
	public boolean method6784(int arg0, int arg1) {
		if (arg1 >= 0 && arg1 < this.field4018.length) {
			int var3 = this.field4018[arg1];
			if (arg0 >= var3 && arg0 <= this.field4019[arg1] + var3) {
				return true;
			}
		}
		return false;
	}
}
