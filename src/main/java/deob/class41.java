package deob;

@ObfuscatedName("ob")
public final class class41 {

	@ObfuscatedName("ob.c")
	public class21 field578 = new class21();

	@ObfuscatedName("ob.d")
	public class21 field579;

	public class41() {
		field578.field264 = field578;
		field578.field265 = field578;
	}

	@ObfuscatedName("ob.a(Lu;)V")
	public void method225(class21 arg0) {
		if (arg0.field265 != null) {
			arg0.method107();
		}

		arg0.field265 = field578.field265;
		arg0.field264 = field578;
		arg0.field265.field264 = arg0;
		arg0.field264.field265 = arg0;
	}

	@ObfuscatedName("ob.a(Lu;B)V")
	public void method226(class21 arg0) {
		if (arg0.field265 != null) {
			arg0.method107();
		}

		arg0.field265 = field578;
		arg0.field264 = field578.field264;
		arg0.field265.field264 = arg0;
		arg0.field264.field265 = arg0;
	}

	@ObfuscatedName("ob.a()Lu;")
	public class21 method227() {
		class21 var1 = field578.field264;
		if (field578 == var1) {
			return null;
		} else {
			var1.method107();
			return var1;
		}
	}

	@ObfuscatedName("ob.b()Lu;")
	public class21 method228() {
		class21 var1 = field578.field264;
		if (field578 == var1) {
			field579 = null;
			return null;
		} else {
			field579 = var1.field264;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(I)Lu;")
	public class21 method229() {
		class21 var1 = field578.field265;
		if (field578 == var1) {
			field579 = null;
			return null;
		} else {
			field579 = var1.field265;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(B)Lu;")
	public class21 method230() {
		class21 var1 = field579;
		if (field578 == var1) {
			field579 = null;
			return null;
		} else {
			field579 = var1.field264;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(Z)Lu;")
	public class21 method231() {
		class21 var1 = field579;
		if (field578 == var1) {
			field579 = null;
			return null;
		} else {
			field579 = var1.field265;
			return var1;
		}
	}

	@ObfuscatedName("ob.c()V")
	public void method232() {
		while (true) {
			class21 var1 = field578.field264;
			if (field578 == var1) {
				return;
			}

			var1.method107();
		}
	}
}
