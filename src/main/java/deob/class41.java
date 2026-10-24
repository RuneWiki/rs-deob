package deob;

@ObfuscatedName("ob")
public final class class41 {

	@ObfuscatedName("ob.a")
	public class21 field651 = new class21();

	@ObfuscatedName("ob.b")
	public class21 field652;

	public class41() {
		field651.field331 = field651;
		field651.field332 = field651;
	}

	@ObfuscatedName("ob.a(Lu;)V")
	public void method245(class21 arg0) {
		if (arg0.field332 != null) {
			arg0.method106();
		}

		arg0.field332 = field651.field332;
		arg0.field331 = field651;
		arg0.field332.field331 = arg0;
		arg0.field331.field332 = arg0;
	}

	@ObfuscatedName("ob.a(ZLu;)V")
	public void method246(class21 arg0) {
		if (arg0.field332 != null) {
			arg0.method106();
		}

		arg0.field332 = field651;
		arg0.field331 = field651.field331;
		arg0.field332.field331 = arg0;
		arg0.field331.field332 = arg0;
	}

	@ObfuscatedName("ob.a()Lu;")
	public class21 method247() {
		class21 var1 = field651.field331;
		if (field651 == var1) {
			return null;
		} else {
			var1.method106();
			return var1;
		}
	}

	@ObfuscatedName("ob.b()Lu;")
	public class21 method248() {
		class21 var1 = field651.field331;
		if (field651 == var1) {
			field652 = null;
			return null;
		} else {
			field652 = var1.field331;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(Z)Lu;")
	public class21 method249() {
		class21 var1 = field651.field332;
		if (field651 == var1) {
			field652 = null;
			return null;
		} else {
			field652 = var1.field332;
			return var1;
		}
	}

	@ObfuscatedName("ob.b(Z)Lu;")
	public class21 method250() {
		class21 var1 = field652;
		if (field651 == var1) {
			field652 = null;
			return null;
		} else {
			field652 = var1.field331;
			return var1;
		}
	}

	@ObfuscatedName("ob.a(B)Lu;")
	public class21 method251() {
		class21 var1 = field652;
		if (field651 == var1) {
			field652 = null;
			return null;
		} else {
			field652 = var1.field332;
			return var1;
		}
	}

	@ObfuscatedName("ob.c()V")
	public void method252() {
		if (field651.field331 != field651) {
			while (true) {
				class21 var1 = field651.field331;
				if (field651 == var1) {
					return;
				}

				var1.method106();
			}
		}
	}
}
