package deob;

@ObfuscatedName("ob")
public final class class41 {

	@ObfuscatedName("ob.c")
	public class21 field580 = new class21();

	@ObfuscatedName("ob.d")
	public class21 field581;

	public class41() {
		field580.field265 = field580;
		field580.field266 = field580;
	}

	@ObfuscatedName("ob.a(Lu;)V")
	public void method225(class21 arg0) {
		if (arg0.field266 != null) {
			arg0.method107();
		}

		arg0.field266 = field580.field266;
		arg0.field265 = field580;
		arg0.field266.field265 = arg0;
		arg0.field265.field266 = arg0;
	}

	@ObfuscatedName("ob.a(Lu;I)V")
	public void method226(class21 arg0) {
		if (arg0.field266 != null) {
			arg0.method107();
		}

		arg0.field266 = field580;
		arg0.field265 = field580.field265;
		arg0.field266.field265 = arg0;
		arg0.field265.field266 = arg0;
	}

	@ObfuscatedName("ob.a()Lu;")
	public class21 method227() {
		class21 var1 = field580.field265;
		if (field580 == var1) {
			return null;
		} else {
			var1.method107();
			return var1;
		}
	}

	@ObfuscatedName("ob.b()Lu;")
	public class21 method228() {
		class21 var1 = field580.field265;
		if (field580 == var1) {
			field581 = null;
			return null;
		} else {
			field581 = var1.field265;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(I)Lu;")
	public class21 method229() {
		class21 var1 = field580.field266;
		if (field580 == var1) {
			field581 = null;
			return null;
		} else {
			field581 = var1.field266;
			return var1;
		}
	}

	@ObfuscatedName("ob.b(I)Lu;")
	public class21 method230() {
		class21 var1 = field581;
		if (field580 == var1) {
			field581 = null;
			return null;
		} else {
			field581 = var1.field265;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(Z)Lu;")
	public class21 method231() {
		class21 var1 = field581;
		if (field580 == var1) {
			field581 = null;
			return null;
		} else {
			field581 = var1.field266;
			return var1;
		}
	}

	@ObfuscatedName("ob.c()V")
	public void method232() {
		while (true) {
			class21 var1 = field580.field265;
			if (field580 == var1) {
				return;
			}

			var1.method107();
		}
	}
}
