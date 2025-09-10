package deob;

@ObfuscatedName("vd")
public class class549 extends class552 {

	@ObfuscatedName("vd.af")
	public int field5644 = 0;

	@ObfuscatedName("vd.aw")
	public int field5643 = 0;

	@ObfuscatedName("vd.at")
	public double field5649 = 0.0D;

	@ObfuscatedName("vd.ac")
	public double field5642 = 0.0D;

	@ObfuscatedName("vd.ap")
	public double field5646 = 0.0D;

	@ObfuscatedName("vd.aq")
	public double field5647 = 0.0D;

	@ObfuscatedName("vd.ao")
	public double field5648 = 0.0D;

	public class549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		super(arg8, arg9);
		this.field5644 = arg2;
		this.field5643 = arg5;
		if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
			this.field5649 = arg3;
			this.field5642 = arg4;
		} else {
			double var11 = (double) (arg0 + arg6) / 2.0D;
			double var13 = (double) (arg1 + arg7) / 2.0D;
			double var15 = (double) (arg3 + arg6) / 2.0D;
			double var17 = (double) (arg4 + arg7) / 2.0D;
			double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
			double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
			this.field5649 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
			this.field5642 = (this.field5649 - var11) * var19 + var13;
			this.field5646 = Math.sqrt(Math.pow(this.field5649 - (double) arg0, 2.0D) + Math.pow(this.field5642 - (double) arg1, 2.0D));
			this.field5647 = Math.atan2((double) arg1 - this.field5642, (double) arg0 - this.field5649);
			double var23 = Math.atan2((double) arg7 - this.field5642, (double) arg6 - this.field5649);
			this.field5648 = Math.atan2((double) arg4 - this.field5642, (double) arg3 - this.field5649);
			boolean var25 = this.field5647 <= var23 && var23 <= this.field5648 || this.field5648 <= var23 && var23 <= this.field5647;
			if (!var25) {
				this.field5648 += (double) (this.field5647 - this.field5648 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}
		}
	}

	@ObfuscatedName("vd.af(I)I")
	public int method9790() {
		double var1 = this.method9801();
		double var3 = (this.field5648 - this.field5647) * var1 + this.field5647;
		return (int) Math.round(this.field5649 + this.field5646 * Math.cos(var3));
	}

	@ObfuscatedName("vd.aw(I)I")
	public int method9791() {
		double var1 = this.method9801();
		double var3 = (this.field5648 - this.field5647) * var1 + this.field5647;
		return (int) Math.round(this.field5642 + this.field5646 * Math.sin(var3));
	}

	@ObfuscatedName("vd.at(I)I")
	public int method9789() {
		double var1 = this.method9801();
		return (int) Math.round((double) (this.field5643 - this.field5644) * var1 + (double) this.field5644);
	}
}
