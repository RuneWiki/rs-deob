package deob;

@ObfuscatedName("xp")
public class class610 {

	@ObfuscatedName("xp.aw")
	public int field6049;

	@ObfuscatedName("xp.at")
	public int field6038;

	@ObfuscatedName("xp.ac")
	public int field6041;

	@ObfuscatedName("xp.ap")
	public int field6039;

	@ObfuscatedName("xp.aq")
	public int field6043;

	@ObfuscatedName("xp.ao")
	public int field6044;

	@ObfuscatedName("xp.as")
	public int field6045 = 0;

	@ObfuscatedName("xp.al")
	public int field6046 = 0;

	@ObfuscatedName("xp.au")
	public boolean field6047;

	@ObfuscatedName("xp.ai")
	public int field6042;

	@ObfuscatedName("xp.aa")
	public int field6040;

	@ObfuscatedName("xp.am")
	public int field6048;

	@ObfuscatedName("xp.an")
	public int field6051;

	@ObfuscatedName("xp.af(IIIIIIIIZI)V")
	public void method10959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		this.field6049 = arg0;
		this.field6038 = arg1;
		this.field6041 = arg2;
		this.field6039 = arg3;
		this.field6043 = arg4;
		this.field6044 = arg5;
		this.field6045 = arg6;
		this.field6046 = arg7;
		this.field6047 = arg8;
	}

	@ObfuscatedName("xp.aw(IIIIB)V")
	public void method10963(int arg0, int arg1, int arg2, int arg3) {
		this.field6042 = arg0;
		this.field6040 = arg1;
		this.field6048 = arg2;
		this.field6051 = arg3;
	}

	@ObfuscatedName("xp.at(Lrb;Lrv;I)V")
	public void method10961(class463 arg0, class462 arg1) {
		if (arg1 == null) {
			return;
		}
		int var3 = arg1.field5252;
		int var4 = Math.min(this.field6039, (int) ((float) var3 * 0.9F));
		int var5 = arg0.method8643(this.field6041);
		int var6 = arg0.method8642(this.field6039);
		int var7 = this.field6049 - this.field6043 + var5;
		int var8 = this.field6038 - this.field6044 + var6 + var3;
		class602.method10674(this.field6049, this.field6038, this.field6049 + this.field6041, this.field6039 + this.field6038);
		int var9 = this.field6046;
		int var10 = this.field6045;
		if (var9 > var10) {
			int var11 = var9;
			var9 = var10;
			var10 = var11;
		}
		class467 var12 = arg0.method8621(0, var9);
		class467 var13 = arg0.method8621(var9, var10);
		class467 var14 = arg0.method8621(var10, arg0.method8719());
		class467 var15 = arg0.method8621(0, this.field6045);
		if (!var13.method8868()) {
			int var16 = arg1.field5261 + arg1.field5258;
			for (int var17 = 0; var17 < var13.method8867(); var17++) {
				class465 var18 = var13.method8860(var17);
				int var19 = var18.field5242 + var7;
				int var20 = arg1.method8757(var18.field5243);
				int var21 = var18.field5245 + var8 - var3;
				class602.method10682(var19, var21, var20, var16, this.field6051);
			}
		}
		if (!var12.method8868()) {
			arg1.method8769(var12, var7, var8, this.field6042, this.field6040, -1);
		}
		if (!var13.method8868()) {
			arg1.method8769(var13, var7, var8, this.field6048, this.field6040, -1);
		}
		if (!var14.method8868()) {
			arg1.method8769(var14, var7, var8, this.field6042, this.field6040, -1);
		}
		if (!this.field6047) {
			return;
		}
		class558 var22 = var15.method8859();
		int var23 = var7 + (Integer) var22.field5758;
		int var24 = var8 + (Integer) var22.field5757;
		int var25 = var24 - var4;
		class602.method10687(var23, var24, var23, var25, this.field6042);
		if (this.field6040 != -1) {
			class602.method10687(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field6040);
		}
	}
}
