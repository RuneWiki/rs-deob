package deob;

@ObfuscatedName("qu")
public class class436 {

	@ObfuscatedName("qu.af")
	public class541 field5122 = new class541();

	public class436() {
		this.field5122.field5593 = this.field5122;
		this.field5122.field5594 = this.field5122;
	}

	@ObfuscatedName("qu.af(Lua;)V")
	public void method8015(class541 arg0) {
		if (arg0.field5594 != null) {
			arg0.method9759();
		}
		arg0.field5594 = this.field5122.field5594;
		arg0.field5593 = this.field5122;
		arg0.field5594.field5593 = arg0;
		arg0.field5593.field5594 = arg0;
	}

	@ObfuscatedName("qu.aw(Lua;)V")
	public void method8016(class541 arg0) {
		if (arg0.field5594 != null) {
			arg0.method9759();
		}
		arg0.field5594 = this.field5122;
		arg0.field5593 = this.field5122.field5593;
		arg0.field5594.field5593 = arg0;
		arg0.field5593.field5594 = arg0;
	}

	@ObfuscatedName("qu.at()Lua;")
	public class541 method8017() {
		class541 var1 = this.field5122.field5593;
		return this.field5122 == var1 ? null : var1;
	}
}
