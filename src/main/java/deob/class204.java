package deob;

@ObfuscatedName("hu")
public class class204 extends class541 {

	@ObfuscatedName("hu.av")
	public static class321 field2238 = new class321(64);

	@ObfuscatedName("hu.ah")
	public String field2234 = class394.field4507;

	@ObfuscatedName("hu.ab")
	public String[] field2235 = new String[5];

	@ObfuscatedName("hu.ax")
	public boolean field2246 = false;

	@ObfuscatedName("hu.ak")
	public int field2237 = 0;

	@ObfuscatedName("hu.aj")
	public int field2231 = 0;

	@ObfuscatedName("hu.az")
	public int field2239 = 0;

	@ObfuscatedName("hu.bt")
	public int field2240 = 0;

	@ObfuscatedName("hu.bs")
	public int field2241 = 0;

	@ObfuscatedName("hu.bu")
	public int field2242 = 0;

	@ObfuscatedName("hu.bi")
	public class587 field2243;

	@ObfuscatedName("hu.bd")
	public class587[] field2236 = new class587[4];

	@ObfuscatedName("hu.ba")
	public int field2245 = -1;

	@ObfuscatedName("hu.bb")
	public int field2223 = 0;

	@ObfuscatedName("hu.bo")
	public class399 field2233 = class399.field4839;

	@ObfuscatedName("hu.bl")
	public class381 field2248 = class381.field4372;

	@ObfuscatedName("gk.af(II)Lhu;")
	public static class204 method3677(int arg0) {
		class204 var1 = (class204) field2238.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field66.method7692(72, arg0);
		class204 var3 = new class204();
		var3.field2245 = arg0;
		if (var2 != null) {
			var3.method4147(new class591(var2));
		}
		var3.method4172();
		field2238.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("hu.aw(I)I")
	public int method4146() {
		return this.field2245;
	}

	@ObfuscatedName("hu.at(Lwb;B)V")
	public void method4147(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method4148(arg0, var2);
		}
	}

	@ObfuscatedName("hu.ac(Lwb;II)V")
	public void method4148(class591 arg0, int arg1) {
		switch(arg1) {
			case 2:
				this.field2223 = arg0.method10339();
			case 3:
			case 10:
			case 11:
			case 13:
			case 21:
			case 22:
			default:
				break;
			case 4:
				this.field2237 = arg0.method10593();
				break;
			case 5:
				this.field2231 = arg0.method10593();
				break;
			case 6:
				this.field2239 = arg0.method10593();
				break;
			case 7:
				this.field2240 = arg0.method10593();
				break;
			case 8:
				this.field2241 = arg0.method10341();
				break;
			case 9:
				this.field2242 = arg0.method10341();
				break;
			case 12:
				this.field2234 = arg0.method10350();
				break;
			case 14:
				this.field2246 = true;
				break;
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				int var4 = arg1 - 15;
				this.field2235[var4] = arg0.method10350();
				if (this.field2235[var4].equalsIgnoreCase(class394.field4757)) {
					this.field2235[var4] = null;
				}
				this.field2246 = true;
				break;
			case 20:
				arg0.method10341();
				break;
			case 23:
				this.field2233 = (class399) class432.method3817(class399.method7549(), arg0.method10339());
				break;
			case 24:
				class381[] var3 = new class381[] { class381.field4375, class381.field4379, class381.field4374 };
				this.field2248 = (class381) class432.method3817(var3, arg0.method10339());
		}
	}

	@ObfuscatedName("hu.ap(I)V")
	public void method4172() {
		this.field2243 = new class587(this.field2241, this.field2242, this.field2239, this.field2240);
		this.method4150();
	}

	@ObfuscatedName("hu.aq(I)V")
	public void method4150() {
		short var1 = 256;
		this.field2236[0] = new class587(this.field2241 + var1, this.field2242 + var1, this.field2239, this.field2240);
		short var2 = 362;
		this.field2236[2] = new class587(this.field2241 + var2, this.field2242 + var2, this.field2239, this.field2240);
		short var3 = 334;
		this.field2236[1] = new class587(this.field2241 + var3, this.field2242 + var3, this.field2239, this.field2240);
		this.field2236[3] = this.field2236[1];
	}

	@ObfuscatedName("hu.ao(B)I")
	public int method4151() {
		return this.field2223;
	}

	@ObfuscatedName("hu.as(I)I")
	public int method4152() {
		return this.field2237;
	}

	@ObfuscatedName("hu.al(B)I")
	public int method4153() {
		return this.field2231;
	}

	@ObfuscatedName("hu.au(I)Lwm;")
	public class587 method4154() {
		return this.field2243;
	}

	@ObfuscatedName("hu.ai(I)Lpj;")
	public class399 method4155() {
		return this.field2233;
	}

	@ObfuscatedName("hu.aa(I)Loh;")
	public class381 method4156() {
		return this.field2248;
	}
}
