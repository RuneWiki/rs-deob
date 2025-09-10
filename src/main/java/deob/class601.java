package deob;

@ObfuscatedName("xv")
public class class601 {

	@ObfuscatedName("xv.af")
	public final int field5987;

	@ObfuscatedName("xv.aw")
	public Object field5986;

	public class601(int arg0) {
		this.field5987 = arg0;
	}

	public class601(int arg0, Object arg1) {
		this.field5987 = arg0;
		this.field5986 = arg1;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object arg0) {
		if (!(arg0 instanceof class601)) {
			return false;
		}
		class601 var2 = (class601) arg0;
		if (var2.field5986 == null && this.field5986 != null) {
			return false;
		} else if (this.field5986 == null && var2.field5986 != null) {
			return false;
		} else {
			return this.field5987 == var2.field5987 && var2.field5986.equals(this.field5986);
		}
	}
}
