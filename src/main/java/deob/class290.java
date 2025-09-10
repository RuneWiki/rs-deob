package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ll")
public class class290 {

	@ObfuscatedName("ll.af")
	public int field3328 = -1;

	@ObfuscatedName("ll.aw")
	public String field3335;

	@ObfuscatedName("ll.at")
	public String field3334;

	@ObfuscatedName("ll.ac")
	public int field3330 = -1;

	@ObfuscatedName("ll.ap")
	public int field3331 = -16777216;

	@ObfuscatedName("ll.aq")
	public int field3332 = -1;

	@ObfuscatedName("ll.ao")
	public class357 field3333 = null;

	@ObfuscatedName("ll.as")
	public int field3338 = Integer.MAX_VALUE;

	@ObfuscatedName("ll.al")
	public int field3336 = 0;

	@ObfuscatedName("ll.au")
	public int field3327 = Integer.MAX_VALUE;

	@ObfuscatedName("ll.ai")
	public int field3337 = 0;

	@ObfuscatedName("ll.aa")
	public boolean field3329 = false;

	@ObfuscatedName("ll.am")
	public LinkedList field3339;

	@ObfuscatedName("ll.af(Lwb;II)V")
	public void method5973(class591 arg0, int arg1) {
		this.field3328 = arg1;
		this.field3335 = arg0.method10350();
		this.field3334 = arg0.method10350();
		this.field3333 = new class357(arg0.method10345());
		this.field3330 = arg0.method10345();
		this.field3331 = arg0.method10345();
		arg0.method10339();
		this.field3329 = arg0.method10339() == 1;
		this.field3332 = arg0.method10339();
		int var3 = arg0.method10339();
		this.field3339 = new LinkedList();
		for (int var4 = 0; var4 < var3; var4++) {
			this.field3339.add(this.method6046(arg0));
		}
		this.method5972();
	}

	@ObfuscatedName("ll.aw(Lwb;I)Llz;")
	public class310 method6046(class591 arg0) {
		int var2 = arg0.method10339();
		class298 var3 = (class298) class432.method3817(class298.method6276(), var2);
		Object var4 = null;
		Object var5;
		switch(var3.field3418) {
			case 0:
				var5 = new class307();
				break;
			case 1:
				var5 = new class289();
				break;
			case 2:
				var5 = new class297();
				break;
			case 3:
				var5 = new class294();
				break;
			default:
				throw new IllegalStateException("");
		}
		((class310) var5).method5952(arg0);
		return (class310) var5;
	}

	@ObfuscatedName("ll.at(IIIB)Z")
	public boolean method5975(int arg0, int arg1, int arg2) {
		Iterator var4 = this.field3339.iterator();
		class310 var5;
		do {
			if (!var4.hasNext()) {
				return false;
			}
			var5 = (class310) var4.next();
		} while (!var5.method5948(arg0, arg1, arg2));
		return true;
	}

	@ObfuscatedName("ll.ac(III)Z")
	public boolean method6045(int arg0, int arg1) {
		int var3 = arg0 / 64;
		int var4 = arg1 / 64;
		if (var3 < this.field3338 || var3 > this.field3336) {
			return false;
		} else if (var4 >= this.field3327 && var4 <= this.field3337) {
			Iterator var5 = this.field3339.iterator();
			class310 var6;
			do {
				if (!var5.hasNext()) {
					return false;
				}
				var6 = (class310) var5.next();
			} while (!var6.method5949(arg0, arg1));
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ll.ap(IIIB)[I")
	public int[] method5977(int arg0, int arg1, int arg2) {
		Iterator var4 = this.field3339.iterator();
		class310 var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}
			var5 = (class310) var4.next();
		} while (!var5.method5948(arg0, arg1, arg2));
		return var5.method5954(arg0, arg1, arg2);
	}

	@ObfuscatedName("ll.aq(III)Lna;")
	public class357 method5978(int arg0, int arg1) {
		Iterator var3 = this.field3339.iterator();
		class310 var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}
			var4 = (class310) var3.next();
		} while (!var4.method5949(arg0, arg1));
		return var4.method5951(arg0, arg1);
	}

	@ObfuscatedName("ll.ao(I)V")
	public void method5972() {
		Iterator var1 = this.field3339.iterator();
		while (var1.hasNext()) {
			class310 var2 = (class310) var1.next();
			var2.method5947(this);
		}
	}

	@ObfuscatedName("ll.as(I)I")
	public int method5991() {
		return this.field3328;
	}

	@ObfuscatedName("ll.al(I)Z")
	public boolean method5981() {
		return this.field3329;
	}

	@ObfuscatedName("ll.au(I)Ljava/lang/String;")
	public String method5982() {
		return this.field3335;
	}

	@ObfuscatedName("ll.ai(I)Ljava/lang/String;")
	public String method5983() {
		return this.field3334;
	}

	@ObfuscatedName("ll.aa(S)I")
	public int method5974() {
		return this.field3330;
	}

	@ObfuscatedName("ll.am(I)I")
	public int method5984() {
		return this.field3331;
	}

	@ObfuscatedName("ll.an(I)I")
	public int method5985() {
		return this.field3332;
	}

	@ObfuscatedName("ll.ar(I)I")
	public int method5986() {
		return this.field3338;
	}

	@ObfuscatedName("ll.ae(B)I")
	public int method6008() {
		return this.field3336;
	}

	@ObfuscatedName("ll.ay(I)I")
	public int method5988() {
		return this.field3327;
	}

	@ObfuscatedName("ll.ad(B)I")
	public int method5989() {
		return this.field3337;
	}

	@ObfuscatedName("ll.ag(I)I")
	public int method6035() {
		return this.field3333.field4027;
	}

	@ObfuscatedName("ll.av(I)I")
	public int method5992() {
		return this.field3333.field4028;
	}

	@ObfuscatedName("ll.ah(I)I")
	public int method6050() {
		return this.field3333.field4026;
	}

	@ObfuscatedName("ll.ab(B)Lna;")
	public class357 method5993() {
		return new class357(this.field3333);
	}
}
