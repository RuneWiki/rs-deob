package deob;

@ObfuscatedName("sb")
public class class476 extends class478 {

	@ObfuscatedName("sb.af")
	public class352 field5295 = null;

	@ObfuscatedName("sb.aw")
	public int field5293 = 0;

	public class476(class478 arg0, int arg1, boolean arg2, int arg3) {
		super(arg0);
		this.field5304 = "FadeOutTask";
		if (arg1 >= 0) {
			if (arg2 && arg1 < class340.field3896.size()) {
				this.field5295 = (class352) class340.field3896.get(arg1);
			} else if (!arg2 && arg1 < class340.field3891.size()) {
				this.field5295 = (class352) class340.field3891.get(arg1);
			}
			this.field5293 = arg3;
		}
	}

	@ObfuscatedName("sb.af(B)Z")
	public boolean method8969() {
		if (this.field5295 == null || this.field5295.field4013 == null) {
			return true;
		}
		this.field5295.field4011 = true;
		try {
			if (this.field5295.field4003 > 0.0F && this.field5295.field4013.method6579()) {
				float var1 = this.field5293 == 0 ? (float) this.field5293 : (float) this.field5295.field4006 / (float) this.field5293;
				this.field5295.field4003 -= var1 == 0.0F ? (float) this.field5295.field4006 : var1;
				if (this.field5295.field4003 < 0.0F) {
					this.field5295.field4003 = 0.0F;
				}
				this.field5295.field4013.method6632((int) this.field5295.field4003);
				return false;
			}
		} catch (Exception var3) {
			this.method8982(var3.getMessage());
			return true;
		}
		this.field5295.field4011 = false;
		return true;
	}
}
