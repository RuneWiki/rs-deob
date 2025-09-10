package deob;

@ObfuscatedName("tj")
public class class506 extends class545 implements class599 {

	@ObfuscatedName("tj.as")
	public final class280 field5423 = new class280();

	@ObfuscatedName("tj.al")
	public int field5422 = 0;

	@ObfuscatedName("tj.au")
	public class80 field5430;

	@ObfuscatedName("tj.ai")
	public class204 field5426;

	@ObfuscatedName("tj.aa")
	public class507[] field5421 = new class507[10];

	@ObfuscatedName("tj.am")
	public int field5428 = 0;

	@ObfuscatedName("tj.an")
	public int field5432 = -1;

	@ObfuscatedName("tj.ar")
	public class395 field5429 = class395.field4797;

	@ObfuscatedName("tj.ae")
	public int field5431 = 31;

	@ObfuscatedName("tj.ay")
	public class508 field5427 = new class509();

	@ObfuscatedName("tj.ad")
	public boolean field5433 = false;

	public class506(int arg0, class80 arg1) {
		this.field5422 = arg0;
		this.field5430 = arg1;
		this.field5428 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			this.field5421[var3] = new class507();
		}
	}

	@ObfuscatedName("tj.aw(ZI)V")
	public void method9338(boolean arg0) {
		this.field5430.field1160.field2712 = this.field5430.field1171;
		if (arg0) {
			this.field5430.field1160.field2717 = false;
			this.field5430.field1160.field2714 = -1200;
			this.field5430.field1160.field2688 = 0.01F;
			this.field5430.field1160.field2700.method5312((byte) 38, (byte) 2, (byte) 20, (byte) 127);
		} else {
			this.field5430.field1160.field2717 = true;
			this.field5430.field1160.field2714 = 0;
			this.field5430.field1160.field2688 = 1.0F;
			this.field5430.field1160.field2700.method5313();
		}
	}

	@ObfuscatedName("tj.at(B)Z")
	public boolean method9340() {
		return this.field5430.field1160.field2688 == 0.01F;
	}

	@ObfuscatedName("tj.dq(S)I")
	public int method2394() {
		return this.field5423.method5831();
	}

	@ObfuscatedName("tj.ac(B)I")
	public int method9341() {
		return this.field5423.method5857();
	}

	@ObfuscatedName("tj.dh(I)I")
	public int method2395() {
		return this.field5423.method5833();
	}

	@ObfuscatedName("tj.af(B)I")
	public int method2177() {
		if (this.field5432 != -1) {
			class80 var1 = client.field334.method2311(this.field5432);
			if (var1 != null) {
				return var1.field1171;
			}
		}
		return Statics.field3837.field1171;
	}

	@ObfuscatedName("tj.ap(I)I")
	public int method9377() {
		return this.field5423.method5844();
	}

	@ObfuscatedName("tj.aq(I)Lky;")
	public class280 method9361() {
		return this.field5428 == 0 ? this.field5423 : this.field5421[0].field5435;
	}

	@ObfuscatedName("tj.ao(Lhu;S)V")
	public void method9343(class204 arg0) {
		this.field5426 = arg0;
		this.field5430.field1160.field2727 = arg0.method4152();
		this.field5430.field1160.field2715 = arg0.method4153();
	}

	@ObfuscatedName("tj.as(B)Lpd;")
	public class395 method9344() {
		return this.field5429;
	}

	@ObfuscatedName("tj.al(ZB)Lpj;")
	public class399 method9345(boolean arg0) {
		return arg0 ? class399.field4840 : this.field5426.method4155();
	}

	@ObfuscatedName("tj.au(Lpd;I)V")
	public void method9346(class395 arg0) {
		this.field5429 = arg0;
	}

	@ObfuscatedName("tj.ai(II)V")
	public void method9347(int arg0) {
		this.field5431 = arg0;
	}

	@ObfuscatedName("tj.aa(IB)Z")
	public boolean method9348(int arg0) {
		if (arg0 >= 0 && arg0 <= 4) {
			return (this.field5431 & 0x1 << arg0) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("tj.am(I)I")
	public int method9349() {
		return this.field5430.field1163 * 64 + this.field5426.method4152();
	}

	@ObfuscatedName("tj.an(B)I")
	public int method9363() {
		return this.field5430.field1164 * 64 + this.field5426.method4153();
	}

	@ObfuscatedName("tj.ar(III)V")
	public void method9351(int arg0, int arg1) {
		for (int var3 = 0; var3 < this.field5421.length; var3++) {
			this.field5421[var3].field5435.method5840(arg0, arg1);
		}
		this.field5423.method5840(arg0, arg1);
		this.field5427.method9403(arg0, arg1);
	}

	@ObfuscatedName("tj.ae(Lky;I)V")
	public final void method9350(class280 arg0) {
		int var2 = arg0.method5834();
		int var3 = arg0.method5838();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			int var4 = arg0.method5831() - this.field5421[0].field5435.method5831();
			int var5 = arg0.method5833() - this.field5421[0].field5435.method5833();
			this.method9354(arg0, Math.abs(var4), Math.abs(var5));
		} else {
			this.method9394(arg0);
		}
	}

	@ObfuscatedName("tj.ay(Lky;I)V")
	public void method9394(class280 arg0) {
		this.field5423.method5837(arg0);
		this.field5421[0].field5435.method5837(arg0);
		this.field5428 = 0;
		this.field5433 = false;
	}

	@ObfuscatedName("tj.ad(Lky;III)V")
	public void method9354(class280 arg0, int arg1, int arg2) {
		if (this.field5428 < 9) {
			this.field5428++;
		}
		for (int var4 = this.field5428; var4 > 0; var4--) {
			class507 var5 = this.field5421[var4];
			this.field5421[var4] = this.field5421[var4 - 1];
			this.field5421[var4 - 1] = var5;
		}
		this.field5421[0].field5435.method5837(arg0);
		this.field5421[0].field5434 = client.field413;
	}

	@ObfuscatedName("tj.ag(II)V")
	public final void method9355(int arg0) {
		if (this.field5428 == 0) {
			this.method9394(this.field5421[0].field5435);
			return;
		}
		if (!this.field5433) {
			this.field5427.method9401(this.field5423, this.field5421[0], arg0);
			this.field5433 = true;
		}
		if (this.field5427.method9406(this.field5423, arg0, this.field5428)) {
			this.field5428--;
			this.field5433 = false;
		}
	}

	@ObfuscatedName("tj.av(III)Lre;")
	public class453 method9356(int arg0, int arg1) {
		class449 var3 = new class449();
		class455 var4 = class455.method7603();
		var3.field5156.method8416(class537.method1865(this.field5423.method5844()), 0.0F, 0.0F);
		var3.field5155.method8337((float) this.field5423.method5831(), 0.0F, (float) this.field5423.method5833());
		int var5 = arg0 - this.method9349();
		int var6 = arg1 - this.method9363();
		var4.method8441(var3);
		var3.method8275();
		class453 var7 = var4.method8488((float) var5, 0.0F, (float) var6);
		var4.method8484();
		return var7;
	}

	@ObfuscatedName("tj.ak(III)Lre;")
	public class453 method9375(int arg0, int arg1) {
		class449 var3 = new class449();
		class455 var4 = class455.method7603();
		var3.field5156.method8416(class537.method1865(this.field5423.method5844()), 0.0F, 0.0F);
		var3.field5155.method8337((float) this.field5423.method5831(), 0.0F, (float) this.field5423.method5833());
		var4.method8441(var3);
		var4.method8445();
		var3.method8275();
		class453 var5 = var4.method8488((float) arg0, 0.0F, (float) arg1);
		var5.method8350((float) this.method9349(), 0.0F, (float) this.method9363());
		var4.method8484();
		return var5;
	}
}
