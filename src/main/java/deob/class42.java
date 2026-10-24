package deob;

@ObfuscatedName("pb")
public final class class42 {

	@ObfuscatedName("pb.d")
	public class22 field653 = new class22();

	@ObfuscatedName("pb.e")
	public class22 field654;

	public class42() {
		field653.field340 = field653;
		field653.field341 = field653;
	}

	@ObfuscatedName("pb.a(Lv;)V")
	public void method255(class22 arg0) {
		if (arg0.field341 != null) {
			arg0.method120();
		}

		arg0.field341 = field653.field341;
		arg0.field340 = field653;
		arg0.field341.field340 = arg0;
		arg0.field340.field341 = arg0;
	}

	@ObfuscatedName("pb.a(Lv;I)V")
	public void method256(class22 arg0) {
		if (arg0.field341 != null) {
			arg0.method120();
		}

		arg0.field341 = field653;
		arg0.field340 = field653.field340;
		arg0.field341.field340 = arg0;
		arg0.field340.field341 = arg0;
	}

	@ObfuscatedName("pb.a()Lv;")
	public class22 method257() {
		class22 var1 = field653.field340;
		if (field653 == var1) {
			return null;
		} else {
			var1.method120();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lv;")
	public class22 method258() {
		class22 var1 = field653.field340;
		if (field653 == var1) {
			field654 = null;
			return null;
		} else {
			field654 = var1.field340;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(B)Lv;")
	public class22 method259() {
		class22 var1 = field653.field341;
		if (field653 == var1) {
			field654 = null;
			return null;
		} else {
			field654 = var1.field341;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(Z)Lv;")
	public class22 method260() {
		class22 var1 = field654;
		if (field653 == var1) {
			field654 = null;
			return null;
		} else {
			field654 = var1.field340;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(I)Lv;")
	public class22 method261() {
		class22 var1 = field654;
		if (field653 == var1) {
			field654 = null;
			return null;
		} else {
			field654 = var1.field341;
			return var1;
		}
	}

	@ObfuscatedName("pb.c()V")
	public void method262() {
		while (true) {
			class22 var1 = field653.field340;
			if (field653 == var1) {
				return;
			}

			var1.method120();
		}
	}
}
