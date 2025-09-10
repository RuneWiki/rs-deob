package deob;

@ObfuscatedName("so")
public class class477 extends class478 {

	@ObfuscatedName("so.af")
	public class352 field5297 = null;

	@ObfuscatedName("so.aw")
	public int field5299 = 0;

	public class477(class478 arg0, int arg1, boolean arg2, int arg3) {
		super(arg0);
		this.field5304 = "FadeInTask";
		if (arg1 >= 0) {
			if (arg2 && arg1 < class340.field3896.size()) {
				this.field5297 = (class352) class340.field3896.get(arg1);
			} else if (!arg2 && arg1 < class340.field3891.size()) {
				this.field5297 = (class352) class340.field3891.get(arg1);
			}
			this.field5299 = arg3;
		}
	}

	@ObfuscatedName("so.af(B)Z")
	public boolean method8969() {
		if (this.field5297 == null || this.field5297.field4013 == null) {
			return true;
		}
		this.field5297.field4011 = true;
		try {
			if (this.field5297.field4003 < (float) this.field5297.field4006 && this.field5297.field4013.method6579()) {
				float var1 = this.field5299 == 0 ? (float) this.field5299 : (float) this.field5297.field4006 / (float) this.field5299;
				this.field5297.field4003 += var1 == 0.0F ? (float) this.field5297.field4006 : var1;
				if (this.field5297.field4003 > (float) this.field5297.field4006) {
					this.field5297.field4003 = this.field5297.field4006;
				}
				this.field5297.field4013.method6632((int) this.field5297.field4003);
				return false;
			}
		} catch (Exception var3) {
			this.method8982(var3.getMessage());
			return true;
		}
		this.field5297.field4011 = false;
		return true;
	}
}
