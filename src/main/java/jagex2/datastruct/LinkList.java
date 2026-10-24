package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public final class LinkList {

	@ObfuscatedName("pb.b")
	public Linkable field649 = new Linkable();

	@ObfuscatedName("pb.c")
	public Linkable field650;

	public LinkList() {
		field649.field337 = field649;
		field649.field338 = field649;
	}

	@ObfuscatedName("pb.a(Lv;)V")
	public void method254(Linkable arg0) {
		if (arg0.field338 != null) {
			arg0.method119();
		}

		arg0.field338 = field649.field338;
		arg0.field337 = field649;
		arg0.field338.field337 = arg0;
		arg0.field337.field338 = arg0;
	}

	@ObfuscatedName("pb.a(Lv;B)V")
	public void method255(Linkable arg0) {
		if (arg0.field338 != null) {
			arg0.method119();
		}

		arg0.field338 = field649;
		arg0.field337 = field649.field337;
		arg0.field338.field337 = arg0;
		arg0.field337.field338 = arg0;
	}

	@ObfuscatedName("pb.a()Lv;")
	public Linkable method256() {
		Linkable var1 = field649.field337;
		if (field649 == var1) {
			return null;
		} else {
			var1.method119();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lv;")
	public Linkable method257() {
		Linkable var1 = field649.field337;
		if (field649 == var1) {
			field650 = null;
			return null;
		} else {
			field650 = var1.field337;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(B)Lv;")
	public Linkable method258() {
		Linkable var1 = field649.field338;
		if (field649 == var1) {
			field650 = null;
			return null;
		} else {
			field650 = var1.field338;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(I)Lv;")
	public Linkable method259() {
		Linkable var1 = field650;
		if (field649 == var1) {
			field650 = null;
			return null;
		} else {
			field650 = var1.field337;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(Z)Lv;")
	public Linkable method260() {
		Linkable var1 = field650;
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
			Linkable var1 = field649.field337;
			if (field649 == var1) {
				return;
			}

			var1.method119();
		}
	}
}
