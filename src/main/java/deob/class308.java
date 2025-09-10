package deob;

@ObfuscatedName("le")
public abstract class class308 {

	@ObfuscatedName("le.ao")
	public final class357 field3492;

	@ObfuscatedName("le.as")
	public final class357 field3489;

	@ObfuscatedName("le.al")
	public int field3491;

	@ObfuscatedName("le.au")
	public int field3490;

	public class308(class357 arg0, class357 arg1) {
		this.field3489 = arg0;
		this.field3492 = arg1;
	}

	@ObfuscatedName("le.ay(III)Z")
	public boolean method6343(int arg0, int arg1) {
		if (this.method6346(arg0, arg1)) {
			return true;
		} else {
			return this.method6344(arg0, arg1);
		}
	}

	@ObfuscatedName("le.ad(I)Z")
	public boolean method6341() {
		return this.method5939() >= 0;
	}

	@ObfuscatedName("le.ag(III)Z")
	public boolean method6346(int arg0, int arg1) {
		if (!this.method6341()) {
			return false;
		}
		class185 var3 = class185.method4094(this.method5939());
		int var4 = this.method5934();
		int var5 = this.method5943();
		switch(var3.field2012.field2091) {
			case 0:
				if (arg0 >= this.field3491 - var4 / 2 && arg0 <= var4 / 2 + this.field3491) {
					break;
				}
				return false;
			case 1:
				if (arg0 >= this.field3491 && arg0 < this.field3491 + var4) {
					break;
				}
				return false;
			case 2:
				if (arg0 <= this.field3491 - var4 || arg0 > this.field3491) {
					return false;
				}
		}
		switch(var3.field2000.field2167) {
			case 0:
				if (arg1 >= this.field3490 && arg1 < this.field3490 + var5) {
					break;
				}
				return false;
			case 1:
				if (arg1 <= this.field3490 - var5 || arg1 > this.field3490) {
					return false;
				}
				break;
			case 2:
				if (arg1 < this.field3490 - var5 / 2 || arg1 > var5 / 2 + this.field3490) {
					return false;
				}
		}
		return true;
	}

	@ObfuscatedName("le.av(III)Z")
	public boolean method6344(int arg0, int arg1) {
		class303 var3 = this.method5933();
		if (var3 == null) {
			return false;
		} else if (arg0 >= this.field3491 - var3.field3457 / 2 && arg0 <= var3.field3457 / 2 + this.field3491) {
			return arg1 >= this.field3490 && arg1 <= this.field3490 + var3.field3460;
		} else {
			return false;
		}
	}

	@ObfuscatedName("le.at(I)Lls;")
	public abstract class303 method5933();

	@ObfuscatedName("le.ap(I)I")
	public abstract int method5943();

	@ObfuscatedName("le.ac(B)I")
	public abstract int method5934();

	@ObfuscatedName("le.aw(I)I")
	public abstract int method5939();
}
