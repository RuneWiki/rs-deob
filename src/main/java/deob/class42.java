package deob;

@ObfuscatedName("pb")
public final class class42 {

	@ObfuscatedName("pb.d")
	public class22 field651 = new class22();

	@ObfuscatedName("pb.e")
	public class22 field652;

	public class42() {
		field651.field339 = field651;
		field651.field340 = field651;
	}

	@ObfuscatedName("pb.a(Lv;)V")
	public void method254(class22 arg0) {
		if (arg0.field340 != null) {
			arg0.method119();
		}

		arg0.field340 = field651.field340;
		arg0.field339 = field651;
		arg0.field340.field339 = arg0;
		arg0.field339.field340 = arg0;
	}

	@ObfuscatedName("pb.a(Lv;I)V")
	public void method255(class22 arg0) {
		if (arg0.field340 != null) {
			arg0.method119();
		}

		arg0.field340 = field651;
		arg0.field339 = field651.field339;
		arg0.field340.field339 = arg0;
		arg0.field339.field340 = arg0;
	}

	@ObfuscatedName("pb.a()Lv;")
	public class22 method256() {
		class22 var1 = field651.field339;
		if (field651 == var1) {
			return null;
		} else {
			var1.method119();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lv;")
	public class22 method257() {
		class22 var1 = field651.field339;
		if (field651 == var1) {
			field652 = null;
			return null;
		} else {
			field652 = var1.field339;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(B)Lv;")
	public class22 method258() {
		class22 var1 = field651.field340;
		if (field651 == var1) {
			field652 = null;
			return null;
		} else {
			field652 = var1.field340;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(I)Lv;")
	public class22 method259() {
		class22 var1 = field652;
		if (field651 == var1) {
			field652 = null;
			return null;
		} else {
			field652 = var1.field339;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(Z)Lv;")
	public class22 method260() {
		class22 var1 = field652;
		if (field651 == var1) {
			field652 = null;
			return null;
		} else {
			field652 = var1.field340;
			return var1;
		}
	}

	@ObfuscatedName("pb.c()V")
	public void method261() {
		while (true) {
			class22 var1 = field651.field339;
			if (field651 == var1) {
				return;
			}

			var1.method119();
		}
	}
}
