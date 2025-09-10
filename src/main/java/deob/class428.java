package deob;

import java.util.Iterator;

@ObfuscatedName("qa")
public class class428 implements Iterator {

	@ObfuscatedName("qa.af")
	public class425 field5078;

	@ObfuscatedName("qa.aw")
	public class540 field5076;

	@ObfuscatedName("qa.at")
	public int field5079;

	@ObfuscatedName("qa.ac")
	public class540 field5077 = null;

	public class428(class425 arg0) {
		this.field5078 = arg0;
		this.method7968();
	}

	@ObfuscatedName("qa.af()V")
	public void method7968() {
		this.field5076 = this.field5078.field5065[0].field5592;
		this.field5079 = 1;
		this.field5077 = null;
	}

	public Object next() {
		if (this.field5078.field5065[this.field5079 - 1] != this.field5076) {
			class540 var1 = this.field5076;
			this.field5076 = var1.field5592;
			this.field5077 = var1;
			return var1;
		}
		class540 var2;
		do {
			if (this.field5079 >= this.field5078.field5064) {
				return null;
			}
			var2 = this.field5078.field5065[this.field5079++].field5592;
		} while (this.field5078.field5065[this.field5079 - 1] == var2);
		this.field5076 = var2.field5592;
		this.field5077 = var2;
		return var2;
	}

	public boolean hasNext() {
		if (this.field5078.field5065[this.field5079 - 1] != this.field5076) {
			return true;
		}
		while (this.field5079 < this.field5078.field5064) {
			if (this.field5078.field5065[this.field5079++].field5592 != this.field5078.field5065[this.field5079 - 1]) {
				this.field5076 = this.field5078.field5065[this.field5079 - 1].field5592;
				return true;
			}
			this.field5076 = this.field5078.field5065[this.field5079 - 1];
		}
		return false;
	}

	public void remove() {
		if (this.field5077 == null) {
			throw new IllegalStateException();
		}
		this.field5077.method9757();
		this.field5077 = null;
	}
}
