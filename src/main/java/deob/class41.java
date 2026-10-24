package deob;

@ObfuscatedName("ob")
public final class class41 {

	@ObfuscatedName("ob.c")
	public class21 field580 = new class21();

	@ObfuscatedName("ob.d")
	public class21 field581;

	public class41() {
		field580.field266 = field580;
		field580.field267 = field580;
	}

	@ObfuscatedName("ob.a(Lu;)V")
	public void method232(class21 arg0) {
		if (arg0.field267 != null) {
			arg0.method108();
		}

		arg0.field267 = field580.field267;
		arg0.field266 = field580;
		arg0.field267.field266 = arg0;
		arg0.field266.field267 = arg0;
	}

	@ObfuscatedName("ob.a(Lu;B)V")
	public void method233(class21 arg0) {
		if (arg0.field267 != null) {
			arg0.method108();
		}

		arg0.field267 = field580;
		arg0.field266 = field580.field266;
		arg0.field267.field266 = arg0;
		arg0.field266.field267 = arg0;
	}

	@ObfuscatedName("ob.a()Lu;")
	public class21 method234() {
		class21 var1 = field580.field266;
		if (field580 == var1) {
			return null;
		} else {
			var1.method108();
			return var1;
		}
	}

	@ObfuscatedName("ob.b()Lu;")
	public class21 method235() {
		class21 var1 = field580.field266;
		if (field580 == var1) {
			field581 = null;
			return null;
		} else {
			field581 = var1.field266;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(I)Lu;")
	public class21 method236() {
		class21 var1 = field580.field267;
		if (field580 == var1) {
			field581 = null;
			return null;
		} else {
			field581 = var1.field267;
			return var1;
		}
	}

	@ObfuscatedName("ob.b(I)Lu;")
	public class21 method237() {
		class21 var1 = field581;
		if (field580 == var1) {
			field581 = null;
			return null;
		} else {
			field581 = var1.field266;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(B)Lu;")
	public class21 method238() {
		class21 var1 = field581;
		if (field580 == var1) {
			field581 = null;
			return null;
		} else {
			field581 = var1.field267;
			return var1;
		}
	}

	@ObfuscatedName("ob.c()V")
	public void method239() {
		while (true) {
			class21 var1 = field580.field266;
			if (field580 == var1) {
				return;
			}

			var1.method108();
		}
	}
}
