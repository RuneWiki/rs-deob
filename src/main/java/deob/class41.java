package deob;

@ObfuscatedName("ob")
public final class class41 {

	@ObfuscatedName("ob.c")
	public class21 field646 = new class21();

	@ObfuscatedName("ob.d")
	public class21 field647;

	public class41() {
		field646.field331 = field646;
		field646.field332 = field646;
	}

	@ObfuscatedName("ob.a(Lu;)V")
	public void method241(class21 arg0) {
		if (arg0.field332 != null) {
			arg0.method106();
		}

		arg0.field332 = field646.field332;
		arg0.field331 = field646;
		arg0.field332.field331 = arg0;
		arg0.field331.field332 = arg0;
	}

	@ObfuscatedName("ob.a(Lu;Z)V")
	public void method242(class21 arg0) {
		if (arg0.field332 != null) {
			arg0.method106();
		}

		arg0.field332 = field646;
		arg0.field331 = field646.field331;
		arg0.field332.field331 = arg0;
		arg0.field331.field332 = arg0;
	}

	@ObfuscatedName("ob.a()Lu;")
	public class21 method243() {
		class21 var1 = field646.field331;
		if (field646 == var1) {
			return null;
		} else {
			var1.method106();
			return var1;
		}
	}

	@ObfuscatedName("ob.b()Lu;")
	public class21 method244() {
		class21 var1 = field646.field331;
		if (field646 == var1) {
			field647 = null;
			return null;
		} else {
			field647 = var1.field331;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(B)Lu;")
	public class21 method245() {
		class21 var1 = field646.field332;
		if (field646 == var1) {
			field647 = null;
			return null;
		} else {
			field647 = var1.field332;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(Z)Lu;")
	public class21 method246() {
		class21 var1 = field647;
		if (field646 == var1) {
			field647 = null;
			return null;
		} else {
			field647 = var1.field331;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(I)Lu;")
	public class21 method247() {
		class21 var1 = field647;
		if (field646 == var1) {
			field647 = null;
			return null;
		} else {
			field647 = var1.field332;
			return var1;
		}
	}

	@ObfuscatedName("ob.c()V")
	public void method248() {
		if (field646.field331 != field646) {
			while (true) {
				class21 var1 = field646.field331;
				if (field646 == var1) {
					return;
				}

				var1.method106();
			}
		}
	}
}
