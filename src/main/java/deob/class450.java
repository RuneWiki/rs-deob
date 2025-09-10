package deob;

@ObfuscatedName("rw")
public class class450 {

	@ObfuscatedName("rw.af")
	public static class450[] field5165 = new class450[0];

	@ObfuscatedName("rw.aw")
	public static int field5158 = 8;

	@ObfuscatedName("rw.at")
	public static int field5162;

	@ObfuscatedName("rw.ac")
	public int field5161;

	@ObfuscatedName("rw.ap")
	public int field5160;

	@ObfuscatedName("rw.aq")
	public int field5163;

	@ObfuscatedName("rw.ao")
	public int field5164;

	static {
		field5165 = new class450[8];
		field5162 = 0;
	}

	public class450(int arg0, int arg1) {
		this(0, 0, arg0, arg1);
	}

	public class450(int arg0, int arg1, int arg2, int arg3) {
		this.method8286(arg0, arg1);
		this.method8287(arg2, arg3);
	}

	@ObfuscatedName("rw.af(B)V")
	public void method8285() {
		class450[] var1 = field5165;
		synchronized (field5165) {
			if (field5162 < field5158) {
				field5165[++field5162 - 1] = this;
			}
		}
	}

	@ObfuscatedName("rw.aw(IIB)V")
	public void method8286(int arg0, int arg1) {
		this.field5161 = arg0;
		this.field5160 = arg1;
	}

	@ObfuscatedName("rw.at(III)V")
	public void method8287(int arg0, int arg1) {
		this.field5163 = arg0;
		this.field5164 = arg1;
	}

	@ObfuscatedName("rw.ac(III)Z")
	public boolean method8320(int arg0, int arg1) {
		return arg0 >= this.field5161 && arg0 < this.field5163 + this.field5161 && arg1 >= this.field5160 && arg1 < this.field5164 + this.field5160;
	}

	public String toString() {
		return null;
	}

	@ObfuscatedName("rw.ap(Lrw;I)Z")
	public boolean method8288(class450 arg0) {
		return this.field5161 <= arg0.method8292() && arg0.field5161 <= this.method8292() && this.field5160 <= arg0.method8293() && arg0.field5160 <= this.method8293();
	}

	@ObfuscatedName("rw.aq(Lrw;Lrw;I)V")
	public void method8289(class450 arg0, class450 arg1) {
		this.method8303(arg0, arg1);
		this.method8290(arg0, arg1);
	}

	@ObfuscatedName("rw.ao(Lrw;Lrw;B)V")
	public void method8303(class450 arg0, class450 arg1) {
		arg1.field5161 = this.field5161;
		arg1.field5163 = this.field5163;
		if (this.field5161 < arg0.field5161) {
			arg1.field5163 -= arg0.field5161 - this.field5161;
			arg1.field5161 = arg0.field5161;
		}
		if (arg1.method8292() > arg0.method8292()) {
			arg1.field5163 -= arg1.method8292() - arg0.method8292();
		}
		if (arg1.field5163 < 0) {
			arg1.field5163 = 0;
		}
	}

	@ObfuscatedName("rw.as(Lrw;Lrw;I)V")
	public void method8290(class450 arg0, class450 arg1) {
		arg1.field5160 = this.field5160;
		arg1.field5164 = this.field5164;
		if (this.field5160 < arg0.field5160) {
			arg1.field5164 -= arg0.field5160 - this.field5160;
			arg1.field5160 = arg0.field5160;
		}
		if (arg1.method8293() > arg0.method8293()) {
			arg1.field5164 -= arg1.method8293() - arg0.method8293();
		}
		if (arg1.field5164 < 0) {
			arg1.field5164 = 0;
		}
	}

	@ObfuscatedName("rw.al(B)I")
	public int method8292() {
		return this.field5163 + this.field5161;
	}

	@ObfuscatedName("rw.au(B)I")
	public int method8293() {
		return this.field5164 + this.field5160;
	}
}
