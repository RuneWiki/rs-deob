package deob;

import java.util.Iterator;

@ObfuscatedName("qq")
public class class438 implements Iterator {

	@ObfuscatedName("qq.af")
	public class439 field5125;

	@ObfuscatedName("qq.aw")
	public class545 field5126;

	@ObfuscatedName("qq.at")
	public class545 field5127 = null;

	public class438(class439 arg0) {
		this.method8062(arg0);
	}

	@ObfuscatedName("qq.af(Lqn;)V")
	public void method8062(class439 arg0) {
		this.field5125 = arg0;
		this.method8063();
	}

	@ObfuscatedName("qq.aw()V")
	public void method8063() {
		this.field5126 = this.field5125 == null ? null : this.field5125.field5128.field5600;
		this.field5127 = null;
	}

	public Object next() {
		class545 var1 = this.field5126;
		if (this.field5125.field5128 == var1) {
			var1 = null;
			this.field5126 = null;
		} else {
			this.field5126 = var1.field5600;
		}
		this.field5127 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field5125.field5128 != this.field5126 && this.field5126 != null;
	}

	public void remove() {
		if (this.field5127 == null) {
			throw new IllegalStateException();
		}
		this.field5127.method2234();
		this.field5127 = null;
	}
}
