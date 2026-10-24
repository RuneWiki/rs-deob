package deob;

@ObfuscatedName("ob")
public final class class41 {

	@ObfuscatedName("ob.e")
	public class21 field577 = new class21();

	@ObfuscatedName("ob.f")
	public class21 field578;

	public class41() {
		field577.field264 = field577;
		field577.field265 = field577;
	}

	@ObfuscatedName("ob.a(Lu;)V")
	public void method225(class21 arg0) {
		if (arg0.field265 != null) {
			arg0.method107();
		}

		arg0.field265 = field577.field265;
		arg0.field264 = field577;
		arg0.field265.field264 = arg0;
		arg0.field264.field265 = arg0;
	}

	@ObfuscatedName("ob.a(Lu;I)V")
	public void method226(class21 arg0) {
		if (arg0.field265 != null) {
			arg0.method107();
		}

		arg0.field265 = field577;
		arg0.field264 = field577.field264;
		arg0.field265.field264 = arg0;
		arg0.field264.field265 = arg0;
	}

	@ObfuscatedName("ob.a()Lu;")
	public class21 method227() {
		class21 var1 = field577.field264;
		if (field577 == var1) {
			return null;
		} else {
			var1.method107();
			return var1;
		}
	}

	@ObfuscatedName("ob.b()Lu;")
	public class21 method228() {
		class21 var1 = field577.field264;
		if (field577 == var1) {
			field578 = null;
			return null;
		} else {
			field578 = var1.field264;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(I)Lu;")
	public class21 method229() {
		class21 var1 = field577.field265;
		if (field577 == var1) {
			field578 = null;
			return null;
		} else {
			field578 = var1.field265;
			return var1;
		}
	}

	@ObfuscatedName("ob.b(I)Lu;")
	public class21 method230() {
		class21 var1 = field578;
		if (field577 == var1) {
			field578 = null;
			return null;
		} else {
			field578 = var1.field264;
			return var1;
		}
	}

	@ObfuscatedName("ob.c(I)Lu;")
	public class21 method231() {
		class21 var1 = field578;
		if (field577 == var1) {
			field578 = null;
			return null;
		} else {
			field578 = var1.field265;
			return var1;
		}
	}

	@ObfuscatedName("ob.c()V")
	public void method232() {
		while (true) {
			class21 var1 = field577.field264;
			if (field577 == var1) {
				return;
			}

			var1.method107();
		}
	}
}
