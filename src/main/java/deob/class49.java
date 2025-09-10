package deob;

@ObfuscatedName("bm")
public class class49 extends class234 {

	@ObfuscatedName("bm.af")
	public final class80 field694;

	@ObfuscatedName("bm.aw")
	public int field690;

	@ObfuscatedName("bm.at")
	public int field691;

	@ObfuscatedName("bm.ac")
	public int field692;

	@ObfuscatedName("bm.ap")
	public int field693;

	@ObfuscatedName("bm.aq")
	public int field697;

	@ObfuscatedName("bm.ao")
	public int field695;

	@ObfuscatedName("bm.as")
	public final class470 field696 = new class470();

	public class49(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.field694 = arg0;
		this.field695 = arg1;
		this.field691 = arg2;
		this.field692 = arg3;
		this.field693 = arg4;
		this.field697 = arg5;
		this.field690 = arg6 + arg7;
		this.field696.method8908(class202.method8008(this.field695).field2199);
	}

	@ObfuscatedName("bm.af(B)Z")
	public boolean method1845() {
		return !this.field696.method8901();
	}

	@ObfuscatedName("bm.aw(IB)V")
	public final void method1846(int arg0) {
		if (this.method1845()) {
			return;
		}
		client.field400.method10043(this.field694, this.field692, this.field693, false);
		int var2 = class468.method3602(this.field696, arg0, client.field400);
		client.field400.method10041();
		if ((var2 & 0x1) != 0) {
			this.field696.method8947();
		}
	}

	@ObfuscatedName("bm.at(I)Ljn;")
	public final class242 method1847() {
		if (this.field696.method8902(30)) {
			return null;
		} else {
			class202 var1 = class202.method8008(this.field695);
			class242 var2 = var1.method4106(this.field696.method8900());
			return var2 == null ? null : var2;
		}
	}
}
