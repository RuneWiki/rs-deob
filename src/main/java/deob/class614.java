package deob;

@ObfuscatedName("xa")
public class class614 implements Comparable {

	@ObfuscatedName("xa.af")
	public String field6076;

	@ObfuscatedName("xa.aw")
	public String field6077;

	public class614(String arg0) {
		this.field6076 = arg0;
		this.field6077 = class564.method4087(arg0, class563.field5768);
	}

	public class614(String arg0, class563 arg1) {
		this.field6076 = arg0;
		this.field6077 = class564.method4087(arg0, arg1);
	}

	@ObfuscatedName("xa.af(B)Ljava/lang/String;")
	public String method11022() {
		return this.field6076;
	}

	@ObfuscatedName("xa.aw(B)Ljava/lang/String;")
	public String method11023() {
		return this.field6077;
	}

	@ObfuscatedName("xa.at(I)Z")
	public boolean method11024() {
		return this.field6077 != null;
	}

	public boolean equals(Object arg0) {
		if (!(arg0 instanceof class614)) {
			return false;
		}
		class614 var2 = (class614) arg0;
		if (this.field6077 == null) {
			return var2.field6077 == null;
		} else if (var2.field6077 == null) {
			return false;
		} else if (this.hashCode() == var2.hashCode()) {
			return this.field6077.equals(var2.field6077);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.field6077 == null ? 0 : this.field6077.hashCode();
	}

	public String toString() {
		return this.method11022();
	}

	@ObfuscatedName("xa.ac(Lxa;I)I")
	public int method11025(class614 arg0) {
		if (this.field6077 == null) {
			return arg0.field6077 == null ? 0 : 1;
		} else if (arg0.field6077 == null) {
			return -1;
		} else {
			return this.field6077.compareTo(arg0.field6077);
		}
	}

	public int compareTo(Object arg0) {
		return this.method11025((class614) arg0);
	}
}
