package deob;

@ObfuscatedName("mu")
public class class321 {

	@ObfuscatedName("mu.af")
	public class541 field3525 = new class541();

	@ObfuscatedName("mu.aw")
	public int field3523;

	@ObfuscatedName("mu.at")
	public int field3527;

	@ObfuscatedName("mu.ac")
	public class427 field3526;

	@ObfuscatedName("mu.ap")
	public class442 field3524 = new class442();

	public class321(int arg0) {
		this.field3523 = arg0;
		this.field3527 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.field3526 = new class427(var2);
	}

	@ObfuscatedName("mu.af(J)Lua;")
	public class541 method6463(long arg0) {
		class541 var3 = (class541) this.field3526.method7946(arg0);
		if (var3 != null) {
			this.field3524.method8191(var3);
		}
		return var3;
	}

	@ObfuscatedName("mu.aw(J)V")
	public void method6455(long arg0) {
		class541 var3 = (class541) this.field3526.method7946(arg0);
		if (var3 != null) {
			var3.method2234();
			var3.method9759();
			this.field3527++;
		}
	}

	@ObfuscatedName("mu.at(Lua;J)V")
	public void method6454(class541 arg0, long arg1) {
		if (this.field3527 == 0) {
			class541 var4 = this.field3524.method8192();
			var4.method2234();
			var4.method9759();
			if (this.field3525 == var4) {
				class541 var5 = this.field3524.method8192();
				var5.method2234();
				var5.method9759();
			}
		} else {
			this.field3527--;
		}
		this.field3526.method7940(arg0, arg1);
		this.field3524.method8191(arg0);
	}

	@ObfuscatedName("mu.ac()V")
	public void method6456() {
		this.field3524.method8190();
		this.field3526.method7941();
		this.field3525 = new class541();
		this.field3527 = this.field3523;
	}
}
