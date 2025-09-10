package deob;

@ObfuscatedName("qw")
public class class429 {

	@ObfuscatedName("qw.af")
	public int field5082;

	@ObfuscatedName("qw.aw")
	public class545[] field5081;

	@ObfuscatedName("qw.at")
	public class545 field5084;

	@ObfuscatedName("qw.ac")
	public class545 field5083;

	@ObfuscatedName("qw.ap")
	public int field5080 = 0;

	public class429(int arg0) {
		this.field5082 = arg0;
		this.field5081 = new class545[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class545 var3 = this.field5081[var2] = new class545();
			var3.field5600 = var3;
			var3.field5599 = var3;
		}
	}

	@ObfuscatedName("qw.af(J)Luk;")
	public class545 method7973(long arg0) {
		class545 var3 = this.field5081[(int) (arg0 & (long) (this.field5082 - 1))];
		for (this.field5084 = var3.field5600; this.field5084 != var3; this.field5084 = this.field5084.field5600) {
			if (this.field5084.field5601 == arg0) {
				class545 var4 = this.field5084;
				this.field5084 = this.field5084.field5600;
				return var4;
			}
		}
		this.field5084 = null;
		return null;
	}

	@ObfuscatedName("qw.aw()I")
	public int method7974() {
		int var1 = 0;
		for (int var2 = 0; var2 < this.field5082; var2++) {
			class545 var3 = this.field5081[var2];
			for (class545 var4 = var3.field5600; var4 != var3; var4 = var4.field5600) {
				var1++;
			}
		}
		return var1;
	}

	@ObfuscatedName("qw.at(Luk;J)V")
	public void method7975(class545 arg0, long arg1) {
		if (arg0.field5599 != null) {
			arg0.method2234();
		}
		class545 var4 = this.field5081[(int) (arg1 & (long) (this.field5082 - 1))];
		arg0.field5599 = var4.field5599;
		arg0.field5600 = var4;
		arg0.field5599.field5600 = arg0;
		arg0.field5600.field5599 = arg0;
		arg0.field5601 = arg1;
	}

	@ObfuscatedName("qw.ac()Luk;")
	public class545 method7976() {
		this.field5080 = 0;
		return this.method7977();
	}

	@ObfuscatedName("qw.ap()Luk;")
	public class545 method7977() {
		if (this.field5080 > 0 && this.field5081[this.field5080 - 1] != this.field5083) {
			class545 var1 = this.field5083;
			this.field5083 = var1.field5600;
			return var1;
		}
		class545 var2;
		do {
			if (this.field5080 >= this.field5082) {
				return null;
			}
			var2 = this.field5081[this.field5080++].field5600;
		} while (this.field5081[this.field5080 - 1] == var2);
		this.field5083 = var2.field5600;
		return var2;
	}
}
