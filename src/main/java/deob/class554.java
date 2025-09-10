package deob;

@ObfuscatedName("vr")
public class class554 {

	@ObfuscatedName("vr.ap")
	public String field5672;

	@ObfuscatedName("vr.aq")
	public class413 field5674;

	@ObfuscatedName("vr.ao")
	public int field5671 = 0;

	@ObfuscatedName("vr.as")
	public boolean field5676 = false;

	public class554(class413 arg0) {
		this.field5674 = arg0;
	}

	@ObfuscatedName("vr.af(Ljava/lang/String;B)V")
	public void method9808(String arg0) {
		if (arg0 != null && !arg0.isEmpty() && this.field5672 != arg0) {
			this.field5672 = arg0;
			this.field5671 = 0;
			this.field5676 = false;
			this.method9809();
		}
	}

	@ObfuscatedName("vr.aw(I)I")
	public int method9809() {
		if (this.field5672 == null) {
			this.field5671 = 100;
			this.field5676 = true;
		} else {
			if (this.field5671 < 33) {
				if (!this.field5674.method7711(class309.field3495.field3497, this.field5672)) {
					return this.field5671;
				}
				this.field5671 = 33;
			}
			if (this.field5671 == 33) {
				if (this.field5674.method7710(class309.field3496.field3497, this.field5672) && !this.field5674.method7711(class309.field3496.field3497, this.field5672)) {
					return this.field5671;
				}
				this.field5671 = 66;
			}
			if (this.field5671 == 66) {
				if (!this.field5674.method7711(this.field5672, class309.field3498.field3497)) {
					return this.field5671;
				}
				this.field5671 = 100;
				this.field5676 = true;
			}
		}
		return this.field5671;
	}

	@ObfuscatedName("vr.at(I)Z")
	public boolean method9815() {
		return this.field5676;
	}

	@ObfuscatedName("vr.ac(I)I")
	public int method9811() {
		return this.field5671;
	}
}
