package deob;

@ObfuscatedName("mi")
public class class319 {

	@ObfuscatedName("mi.af")
	public int field3518;

	@ObfuscatedName("mi.aw")
	public int field3517;

	@ObfuscatedName("mi.at")
	public class427 field3519;

	@ObfuscatedName("mi.ac")
	public class442 field3520;

	@ObfuscatedName("mi.ap")
	public class318 field3521;

	public class319(int arg0) {
		this(arg0, arg0);
	}

	public class319(int arg0, int arg1) {
		this.field3520 = new class442();
		this.field3518 = arg0;
		this.field3517 = arg0;
		int var3;
		for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
		}
		this.field3519 = new class427(var3);
	}

	@ObfuscatedName("mi.af(J)Ljava/lang/Object;")
	public Object method6423(long arg0) {
		class323 var3 = (class323) this.field3519.method7946(arg0);
		if (var3 == null) {
			return null;
		}
		Object var4 = var3.method6449();
		if (var4 == null) {
			var3.method2234();
			var3.method9759();
			this.field3517 += var3.field3529;
			return null;
		}
		if (var3.method6451()) {
			class322 var5 = new class322(var4, var3.field3529);
			this.field3519.method7940(var5, var3.field5601);
			this.field3520.method8191(var5);
			var5.field5595 = 0L;
			var3.method2234();
			var3.method9759();
		} else {
			this.field3520.method8191(var3);
			var3.field5595 = 0L;
		}
		return var4;
	}

	@ObfuscatedName("mi.aw(J)V")
	public void method6424(long arg0) {
		class323 var3 = (class323) this.field3519.method7946(arg0);
		this.method6437(var3);
	}

	@ObfuscatedName("mi.at(Lmm;)V")
	public void method6437(class323 arg0) {
		if (arg0 != null) {
			arg0.method2234();
			arg0.method9759();
			this.field3517 += arg0.field3529;
		}
	}

	@ObfuscatedName("mi.ac(Ljava/lang/Object;J)V")
	public void method6425(Object arg0, long arg1) {
		this.method6422(arg0, arg1, 1);
	}

	@ObfuscatedName("mi.ap(Ljava/lang/Object;JI)V")
	public void method6422(Object arg0, long arg1, int arg2) {
		if (arg2 > this.field3518) {
			throw new IllegalStateException();
		}
		this.method6424(arg1);
		this.field3517 -= arg2;
		while (this.field3517 < 0) {
			class323 var5 = (class323) this.field3520.method8192();
			if (var5 == null) {
				throw new RuntimeException("");
			}
			if (!var5.method6451()) {
			}
			this.method6437(var5);
			if (this.field3521 != null) {
				this.field3521.method6418(var5.method6449());
			}
		}
		class322 var6 = new class322(arg0, arg2);
		this.field3519.method7940(var6, arg1);
		this.field3520.method8191(var6);
		var6.field5595 = 0L;
	}

	@ObfuscatedName("mi.aq(I)V")
	public void method6427(int arg0) {
		for (class323 var2 = (class323) this.field3520.method8193(); var2 != null; var2 = (class323) this.field3520.method8188()) {
			if (var2.method6451()) {
				if (var2.method6449() == null) {
					var2.method2234();
					var2.method9759();
					this.field3517 += var2.field3529;
				}
			} else if (++var2.field5595 > (long) arg0) {
				class320 var3 = new class320(var2.method6449(), var2.field3529);
				this.field3519.method7940(var3, var2.field5601);
				class442.method8197(var3, var2);
				var2.method2234();
				var2.method9759();
			}
		}
	}

	@ObfuscatedName("mi.ao()V")
	public void method6432() {
		this.field3520.method8190();
		this.field3519.method7941();
		this.field3517 = this.field3518;
	}
}
