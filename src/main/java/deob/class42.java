package deob;

@ObfuscatedName("pb")
public final class class42 {

	@ObfuscatedName("pb.d")
	public class22 field649 = new class22();

	@ObfuscatedName("pb.e")
	public class22 field650;

	public class42() {
		field649.field337 = field649;
		field649.field338 = field649;
	}

	@ObfuscatedName("pb.a(Lv;)V")
	public void method254(class22 arg0) {
		if (arg0.field338 != null) {
			arg0.method119();
		}

		arg0.field338 = field649.field338;
		arg0.field337 = field649;
		arg0.field338.field337 = arg0;
		arg0.field337.field338 = arg0;
	}

	@ObfuscatedName("pb.a(Lv;B)V")
	public void method255(class22 arg0) {
		if (arg0.field338 != null) {
			arg0.method119();
		}

		arg0.field338 = field649;
		arg0.field337 = field649.field337;
		arg0.field338.field337 = arg0;
		arg0.field337.field338 = arg0;
	}

	@ObfuscatedName("pb.a()Lv;")
	public class22 method256() {
		class22 var1 = field649.field337;
		if (field649 == var1) {
			return null;
		} else {
			var1.method119();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lv;")
	public class22 method257() {
		class22 var1 = field649.field337;
		if (field649 == var1) {
			field650 = null;
			return null;
		} else {
			field650 = var1.field337;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(I)Lv;")
	public class22 method258() {
		class22 var1 = field649.field338;
		if (field649 == var1) {
			field650 = null;
			return null;
		} else {
			field650 = var1.field338;
			return var1;
		}
	}

	@ObfuscatedName("pb.b(I)Lv;")
	public class22 method259() {
		class22 var1 = field650;
		if (field649 == var1) {
			field650 = null;
			return null;
		} else {
			field650 = var1.field337;
			return var1;
		}
	}

	@ObfuscatedName("pb.c(I)Lv;")
	public class22 method260() {
		class22 var1 = field650;
		if (field649 == var1) {
			field650 = null;
			return null;
		} else {
			field650 = var1.field338;
			return var1;
		}
	}

	@ObfuscatedName("pb.c()V")
	public void method261() {
		while (true) {
			class22 var1 = field649.field337;
			if (field649 == var1) {
				return;
			}

			var1.method119();
		}
	}
}
