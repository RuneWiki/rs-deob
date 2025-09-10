package deob;

@ObfuscatedName("vt")
public class class558 {

	@ObfuscatedName("vt.af")
	public final Object field5758;

	@ObfuscatedName("vt.aw")
	public final Object field5757;

	public class558(Object arg0, Object arg1) {
		this.field5758 = arg0;
		this.field5757 = arg1;
	}

	public String toString() {
		return this.field5758 + ", " + this.field5757;
	}

	public boolean equals(Object arg0) {
		if (arg0 == null || !(arg0 instanceof class558)) {
			return false;
		}
		class558 var2 = (class558) arg0;
		if (this.field5758 == null) {
			if (var2.field5758 != null) {
				return false;
			}
		} else if (!this.field5758.equals(var2.field5758)) {
			return false;
		}
		if (this.field5757 == null) {
			if (var2.field5757 != null) {
				return false;
			}
		} else if (!this.field5757.equals(var2.field5757)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5758 != null) {
			var1 += this.field5758.hashCode();
		}
		if (this.field5757 != null) {
			var1 += this.field5757.hashCode() * 31;
		}
		return var1;
	}
}
