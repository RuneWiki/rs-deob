package deob;

@ObfuscatedName("sp")
public class class470 {

	@ObfuscatedName("sp.aw")
	public int field5279 = -1;

	@ObfuscatedName("sp.at")
	public class216 field5278 = null;

	@ObfuscatedName("sp.ac")
	public int field5280;

	@ObfuscatedName("sp.ap")
	public int field5282 = -1;

	@ObfuscatedName("sp.aq")
	public int field5283 = 0;

	@ObfuscatedName("sp.ao")
	public int field5284 = 0;

	@ObfuscatedName("sp.af(Lsp;S)V")
	public void method8899(class470 arg0) {
		this.field5278 = arg0.field5278;
		this.field5279 = arg0.field5279;
		this.field5280 = arg0.field5280;
		this.field5282 = arg0.field5282;
		this.field5283 = arg0.field5283;
		this.field5284 = arg0.field5284;
	}

	@ObfuscatedName("sp.aw(I)V")
	public void method8947() {
		this.method8908(-1);
	}

	@ObfuscatedName("sp.at(II)V")
	public void method8908(int arg0) {
		if (arg0 < 0) {
			this.field5279 = -1;
			this.field5278 = null;
			this.field5282 = -1;
		} else if (this.field5279 != arg0) {
			this.field5279 = arg0;
			this.field5278 = class216.method3858(arg0);
			this.field5284 = 0;
			if (this.field5282 == -1) {
				this.field5282 = 0;
			}
		}
	}

	@ObfuscatedName("sp.ac(I)Z")
	public boolean method8901() {
		return this.field5278 != null;
	}

	@ObfuscatedName("sp.ap(I)Lij;")
	public class216 method8916() {
		return this.field5278;
	}

	@ObfuscatedName("sp.aq(I)I")
	public int method8931() {
		return this.field5279;
	}

	@ObfuscatedName("sp.ao(B)I")
	public int method8900() {
		return this.field5282;
	}

	@ObfuscatedName("sp.as(I)I")
	public int method8962() {
		return this.field5280;
	}

	@ObfuscatedName("sp.al(B)I")
	public int method8955() {
		return this.field5283;
	}

	@ObfuscatedName("sp.au(I)V")
	public void method8907() {
		this.field5282 = 0;
		this.field5280 = 0;
		this.field5283 = 0;
	}

	@ObfuscatedName("sp.ai(B)V")
	public void method8924() {
		this.field5283 = 0;
	}

	@ObfuscatedName("sp.aa(I)I")
	public int method8909() {
		return this.field5284;
	}

	@ObfuscatedName("sp.am(IB)V")
	public void method8910(int arg0) {
		this.field5284 = arg0;
	}

	@ObfuscatedName("sp.an(IS)Z")
	public boolean method8902(int arg0) {
		return this.method8901() && this.field5284 > 0 && this.field5284 < arg0;
	}

	@ObfuscatedName("sp.ar(S)Z")
	public boolean method8912() {
		return this.field5278 == null || this.field5278.method4490();
	}

	@ObfuscatedName("sp.ae(IIII)V")
	public void method8959(int arg0, int arg1, int arg2) {
		this.field5282 = arg0;
		this.field5280 = arg1;
		this.field5283 = arg2;
	}

	@ObfuscatedName("sp.ay(IIB)V")
	public void method8914(int arg0, int arg1) {
		this.field5282 = arg0;
		this.field5283 = arg1;
	}

	@ObfuscatedName("sp.ad(I)V")
	public void method8915() {
		if (this.field5278 == null) {
			return;
		}
		if (this.field5278.method4467()) {
			this.field5282 = (int) (Math.random() * (double) this.field5278.method4468());
		} else {
			this.field5282 = (int) (Math.random() * (double) this.field5278.field2475.length);
			this.field5280 = (int) (Math.random() * (double) this.field5278.field2461[this.field5282]);
		}
	}
}
