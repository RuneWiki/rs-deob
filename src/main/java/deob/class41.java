package deob;

@ObfuscatedName("ob")
public final class class41 {

	@ObfuscatedName("ob.d")
	public class21 field574 = new class21();

	@ObfuscatedName("ob.e")
	public class21 field575;

	public class41() {
		field574.field262 = field574;
		field574.field263 = field574;
	}

	@ObfuscatedName("ob.a(Lu;)V")
	public void method217(class21 arg0) {
		if (arg0.field263 != null) {
			arg0.method104();
		}

		arg0.field263 = field574.field263;
		arg0.field262 = field574;
		arg0.field263.field262 = arg0;
		arg0.field262.field263 = arg0;
	}

	@ObfuscatedName("ob.a(Lu;I)V")
	public void method218(class21 arg0) {
		if (arg0.field263 != null) {
			arg0.method104();
		}

		arg0.field263 = field574;
		arg0.field262 = field574.field262;
		arg0.field263.field262 = arg0;
		arg0.field262.field263 = arg0;
	}

	@ObfuscatedName("ob.a()Lu;")
	public class21 method219() {
		class21 var1 = field574.field262;
		if (field574 == var1) {
			return null;
		} else {
			var1.method104();
			return var1;
		}
	}

	@ObfuscatedName("ob.b()Lu;")
	public class21 method220() {
		class21 var1 = field574.field262;
		if (field574 == var1) {
			field575 = null;
			return null;
		} else {
			field575 = var1.field262;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(I)Lu;")
	public class21 method221() {
		class21 var1 = field574.field263;
		if (field574 == var1) {
			field575 = null;
			return null;
		} else {
			field575 = var1.field263;
			return var1;
		}
	}

	@ObfuscatedName("ob.b(I)Lu;")
	public class21 method222() {
		class21 var1 = field575;
		if (field574 == var1) {
			field575 = null;
			return null;
		} else {
			field575 = var1.field262;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(Z)Lu;")
	public class21 method223() {
		class21 var1 = field575;
		if (field574 == var1) {
			field575 = null;
			return null;
		} else {
			field575 = var1.field263;
			return var1;
		}
	}

	@ObfuscatedName("ob.c()V")
	public void method224() {
		while (true) {
			class21 var1 = field574.field262;
			if (field574 == var1) {
				return;
			}

			var1.method104();
		}
	}
}
