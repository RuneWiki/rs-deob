package deob;

@ObfuscatedName("fa")
public class class136 {

	@ObfuscatedName("fa.af")
	public final int field1634;

	@ObfuscatedName("fa.aw")
	public final class455[] field1627;

	@ObfuscatedName("fa.at")
	public class136 field1637;

	@ObfuscatedName("fa.ac")
	public float[][] field1629;

	@ObfuscatedName("fa.ap")
	public boolean field1630 = true;

	@ObfuscatedName("fa.aq")
	public boolean field1631 = true;

	@ObfuscatedName("fa.ao")
	public class455[] field1628;

	@ObfuscatedName("fa.as")
	public class455[] field1633;

	@ObfuscatedName("fa.al")
	public class455 field1632 = new class455();

	@ObfuscatedName("fa.au")
	public class455 field1635 = new class455();

	@ObfuscatedName("fa.ai")
	public class455 field1636 = new class455();

	@ObfuscatedName("fa.aa")
	public float[][] field1639;

	@ObfuscatedName("fa.am")
	public float[][] field1638;

	@ObfuscatedName("fa.an")
	public float[][] field1626;

	public class136(int arg0, class591 arg1, boolean arg2) {
		this.field1634 = arg1.method10593();
		this.field1627 = new class455[arg0];
		this.field1628 = new class455[this.field1627.length];
		this.field1633 = new class455[this.field1627.length];
		this.field1629 = new float[this.field1627.length][3];
		for (int var4 = 0; var4 < this.field1627.length; var4++) {
			this.field1627[var4] = new class455(arg1, arg2);
			this.field1629[var4][0] = arg1.method10503();
			this.field1629[var4][1] = arg1.method10503();
			this.field1629[var4][2] = arg1.method10503();
		}
		this.method3482();
	}

	@ObfuscatedName("fa.af(I)V")
	public void method3482() {
		this.field1639 = new float[this.field1627.length][3];
		this.field1638 = new float[this.field1627.length][3];
		this.field1626 = new float[this.field1627.length][3];
		class455 var1 = class455.method7603();
		for (int var2 = 0; var2 < this.field1627.length; var2++) {
			class455 var3 = this.method3484(var2);
			var1.method8436(var3);
			var1.method8445();
			this.field1639[var2] = var1.method8433();
			this.field1638[var2][0] = var3.field5187[12];
			this.field1638[var2][1] = var3.field5187[13];
			this.field1638[var2][2] = var3.field5187[14];
			this.field1626[var2] = var3.method8440();
		}
		var1.method8484();
	}

	@ObfuscatedName("fa.aw(IB)Lrj;")
	public class455 method3484(int arg0) {
		return this.field1627[arg0];
	}

	@ObfuscatedName("fa.at(II)Lrj;")
	public class455 method3487(int arg0) {
		if (this.field1628[arg0] == null) {
			this.field1628[arg0] = new class455(this.method3484(arg0));
			if (this.field1637 == null) {
				this.field1628[arg0].method8517(class455.field5185);
			} else {
				this.field1628[arg0].method8517(this.field1637.method3487(arg0));
			}
		}
		return this.field1628[arg0];
	}

	@ObfuscatedName("fa.ac(IB)Lrj;")
	public class455 method3486(int arg0) {
		if (this.field1633[arg0] == null) {
			this.field1633[arg0] = new class455(this.method3487(arg0));
			this.field1633[arg0].method8445();
		}
		return this.field1633[arg0];
	}

	@ObfuscatedName("fa.ap(B)Lrj;")
	public class455 method3500() {
		return this.field1632;
	}

	@ObfuscatedName("fa.aq(Lrj;I)V")
	public void method3497(class455 arg0) {
		this.field1632.method8436(arg0);
		this.field1630 = true;
		this.field1631 = true;
	}

	@ObfuscatedName("fa.ao(I)Lrj;")
	public class455 method3489() {
		if (this.field1630) {
			this.field1635.method8436(this.method3500());
			if (this.field1637 != null) {
				this.field1635.method8517(this.field1637.method3489());
			}
			this.field1630 = false;
		}
		return this.field1635;
	}

	@ObfuscatedName("fa.as(II)Lrj;")
	public class455 method3485(int arg0) {
		if (this.field1631) {
			this.field1636.method8436(this.method3486(arg0));
			this.field1636.method8517(this.method3489());
			this.field1631 = false;
		}
		return this.field1636;
	}

	@ObfuscatedName("fa.al(II)[F")
	public float[] method3491(int arg0) {
		return this.field1639[arg0];
	}

	@ObfuscatedName("fa.au(II)[F")
	public float[] method3492(int arg0) {
		return this.field1638[arg0];
	}

	@ObfuscatedName("fa.ai(II)[F")
	public float[] method3493(int arg0) {
		return this.field1626[arg0];
	}
}
