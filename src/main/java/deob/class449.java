package deob;

@ObfuscatedName("rq")
public class class449 {

	@ObfuscatedName("rq.af")
	public class454 field5156 = class454.method2375();

	@ObfuscatedName("rq.aw")
	public class453 field5155;

	@ObfuscatedName("rq.at")
	public class453 field5157;

	public class449() {
		class453[] var1 = class453.field5172;
		class453 var2;
		synchronized (class453.field5172) {
			if (class453.field5174 == 0) {
				var2 = new class453();
			} else {
				class453.field5172[--class453.field5174].method8348();
				var2 = class453.field5172[class453.field5174];
			}
		}
		this.field5155 = var2;
		this.field5157 = class453.method6269(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("rq.af(I)V")
	public void method8275() {
		this.field5156.method8398();
		this.field5155.method8336();
		this.field5157.method8336();
	}

	public String toString() {
		return "[" + this.field5156.toString() + "|" + this.field5155.toString() + "|" + this.field5157.toString() + "]";
	}

	public boolean equals(Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof class449) {
			class449 var2 = (class449) arg0;
			return this.field5156.equals(var2.field5156) && this.field5155.method8340(var2.field5155) && this.field5157.method8340(var2.field5157);
		} else {
			return false;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + this.field5156.hashCode();
		int var4 = var3 * 31 + this.field5155.hashCode();
		return var4 * 31 + this.field5157.hashCode();
	}
}
