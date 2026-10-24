package deob;

@ObfuscatedName("pb")
public final class class42 {

	@ObfuscatedName("pb.e")
	public class21 field654 = new class21();

	@ObfuscatedName("pb.f")
	public class21 field655;

	public class42() {
		field654.field331 = field654;
		field654.field332 = field654;
	}

	@ObfuscatedName("pb.a(Lu;)V")
	public void method244(class21 arg0) {
		if (arg0.field332 != null) {
			arg0.method106();
		}

		arg0.field332 = field654.field332;
		arg0.field331 = field654;
		arg0.field332.field331 = arg0;
		arg0.field331.field332 = arg0;
	}

	@ObfuscatedName("pb.a(ZLu;)V")
	public void method245(class21 arg0) {
		if (arg0.field332 != null) {
			arg0.method106();
		}

		arg0.field332 = field654;
		arg0.field331 = field654.field331;
		arg0.field332.field331 = arg0;
		arg0.field331.field332 = arg0;
	}

	@ObfuscatedName("pb.a()Lu;")
	public class21 method246() {
		class21 var1 = field654.field331;
		if (field654 == var1) {
			return null;
		} else {
			var1.method106();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lu;")
	public class21 method247() {
		class21 var1 = field654.field331;
		if (field654 == var1) {
			field655 = null;
			return null;
		} else {
			field655 = var1.field331;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(I)Lu;")
	public class21 method248() {
		class21 var1 = field654.field332;
		if (field654 == var1) {
			field655 = null;
			return null;
		} else {
			field655 = var1.field332;
			return var1;
		}
	}

	@ObfuscatedName("pb.b(I)Lu;")
	public class21 method249() {
		class21 var1 = field655;
		if (field654 == var1) {
			field655 = null;
			return null;
		} else {
			field655 = var1.field331;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(Z)Lu;")
	public class21 method250() {
		class21 var1 = field655;
		if (field654 == var1) {
			field655 = null;
			return null;
		} else {
			field655 = var1.field332;
			return var1;
		}
	}

	@ObfuscatedName("pb.c()V")
	public void method251() {
		if (field654.field331 != field654) {
			while (true) {
				class21 var1 = field654.field331;
				if (field654 == var1) {
					return;
				}

				var1.method106();
			}
		}
	}
}
