package deob;

@ObfuscatedName("ob")
public final class class41 {

	@ObfuscatedName("ob.c")
	public class29 field564 = new class29();

	public class41() {
		field564.field384 = field564;
		field564.field385 = field564;
	}

	@ObfuscatedName("ob.a(Lcb;)V")
	public void method208(class29 arg0) {
		if (arg0.field385 != null) {
			arg0.method102();
		}

		arg0.field385 = field564.field385;
		arg0.field384 = field564;
		arg0.field385.field384 = arg0;
		arg0.field384.field385 = arg0;
	}

	@ObfuscatedName("ob.a()Lcb;")
	public class29 method209() {
		class29 var1 = field564.field384;
		if (field564 == var1) {
			return null;
		} else {
			var1.method102();
			return var1;
		}
	}
}
