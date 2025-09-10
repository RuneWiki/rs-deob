package deob;

import java.util.Iterator;

@ObfuscatedName("qo")
public class class426 implements Iterator {

	@ObfuscatedName("qo.af")
	public class427 field5068;

	@ObfuscatedName("qo.aw")
	public class545 field5069;

	@ObfuscatedName("qo.at")
	public int field5067;

	@ObfuscatedName("qo.ac")
	public class545 field5070 = null;

	public class426(class427 arg0) {
		this.field5068 = arg0;
		this.method7921();
	}

	@ObfuscatedName("qo.af()V")
	public void method7921() {
		this.field5069 = this.field5068.field5074[0].field5600;
		this.field5067 = 1;
		this.field5070 = null;
	}

	@ObfuscatedName("qo.aw()Luk;")
	public class545 method7923() {
		this.method7921();
		return (class545) this.next();
	}

	public Object next() {
		if (this.field5068.field5074[this.field5067 - 1] != this.field5069) {
			class545 var1 = this.field5069;
			this.field5069 = var1.field5600;
			this.field5070 = var1;
			return var1;
		}
		class545 var2;
		do {
			if (this.field5067 >= this.field5068.field5072) {
				return null;
			}
			var2 = this.field5068.field5074[this.field5067++].field5600;
		} while (this.field5068.field5074[this.field5067 - 1] == var2);
		this.field5069 = var2.field5600;
		this.field5070 = var2;
		return var2;
	}

	public boolean hasNext() {
		if (this.field5068.field5074[this.field5067 - 1] != this.field5069) {
			return true;
		}
		while (this.field5067 < this.field5068.field5072) {
			if (this.field5068.field5074[this.field5067++].field5600 != this.field5068.field5074[this.field5067 - 1]) {
				this.field5069 = this.field5068.field5074[this.field5067 - 1].field5600;
				return true;
			}
			this.field5069 = this.field5068.field5074[this.field5067 - 1];
		}
		return false;
	}

	public void remove() {
		if (this.field5070 == null) {
			throw new IllegalStateException();
		}
		this.field5070.method2234();
		this.field5070 = null;
	}
}
