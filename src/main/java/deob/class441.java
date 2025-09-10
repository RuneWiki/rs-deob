package deob;

import java.util.Iterator;

@ObfuscatedName("qx")
public class class441 implements Iterator {

	@ObfuscatedName("qx.af")
	public class442 field5132;

	@ObfuscatedName("qx.aw")
	public class541 field5133;

	@ObfuscatedName("qx.at")
	public class541 field5134 = null;

	public class441(class442 arg0) {
		this.field5132 = arg0;
		this.field5133 = this.field5132.field5136.field5593;
		this.field5134 = null;
	}

	public Object next() {
		class541 var1 = this.field5133;
		if (this.field5132.field5136 == var1) {
			var1 = null;
			this.field5133 = null;
		} else {
			this.field5133 = var1.field5593;
		}
		this.field5134 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field5132.field5136 != this.field5133;
	}

	public void remove() {
		if (this.field5134 == null) {
			throw new IllegalStateException();
		}
		this.field5134.method9759();
		this.field5134 = null;
	}
}
