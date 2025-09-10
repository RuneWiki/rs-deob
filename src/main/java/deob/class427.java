package deob;

import java.util.Iterator;

@ObfuscatedName("qm")
public class class427 implements Iterable {

	@ObfuscatedName("qm.af")
	public int field5072;

	@ObfuscatedName("qm.aw")
	public class545[] field5074;

	@ObfuscatedName("qm.at")
	public class545 field5071;

	@ObfuscatedName("qm.ac")
	public class545 field5073;

	@ObfuscatedName("qm.ap")
	public int field5075 = 0;

	public class427(int arg0) {
		this.field5072 = arg0;
		this.field5074 = new class545[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class545 var3 = this.field5074[var2] = new class545();
			var3.field5600 = var3;
			var3.field5599 = var3;
		}
	}

	@ObfuscatedName("qm.af(J)Luk;")
	public class545 method7946(long arg0) {
		class545 var3 = this.field5074[(int) (arg0 & (long) (this.field5072 - 1))];
		for (this.field5071 = var3.field5600; this.field5071 != var3; this.field5071 = this.field5071.field5600) {
			if (this.field5071.field5601 == arg0) {
				class545 var4 = this.field5071;
				this.field5071 = this.field5071.field5600;
				return var4;
			}
		}
		this.field5071 = null;
		return null;
	}

	@ObfuscatedName("qm.aw(Luk;J)V")
	public void method7940(class545 arg0, long arg1) {
		if (arg0.field5599 != null) {
			arg0.method2234();
		}
		class545 var4 = this.field5074[(int) (arg1 & (long) (this.field5072 - 1))];
		arg0.field5599 = var4.field5599;
		arg0.field5600 = var4;
		arg0.field5599.field5600 = arg0;
		arg0.field5600.field5599 = arg0;
		arg0.field5601 = arg1;
	}

	@ObfuscatedName("qm.at()V")
	public void method7941() {
		for (int var1 = 0; var1 < this.field5072; var1++) {
			class545 var2 = this.field5074[var1];
			while (true) {
				class545 var3 = var2.field5600;
				if (var2 == var3) {
					break;
				}
				var3.method2234();
			}
		}
		this.field5071 = null;
		this.field5073 = null;
	}

	@ObfuscatedName("qm.ac()Luk;")
	public class545 method7951() {
		this.field5075 = 0;
		return this.method7942();
	}

	@ObfuscatedName("qm.ap()Luk;")
	public class545 method7942() {
		if (this.field5075 > 0 && this.field5074[this.field5075 - 1] != this.field5073) {
			class545 var1 = this.field5073;
			this.field5073 = var1.field5600;
			return var1;
		}
		class545 var2;
		do {
			if (this.field5075 >= this.field5072) {
				return null;
			}
			var2 = this.field5074[this.field5075++].field5600;
		} while (this.field5074[this.field5075 - 1] == var2);
		this.field5073 = var2.field5600;
		return var2;
	}

	public Iterator iterator() {
		return new class426(this);
	}
}
