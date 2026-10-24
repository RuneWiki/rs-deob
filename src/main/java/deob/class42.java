package deob;

@ObfuscatedName("pb")
public final class class42 {

	@ObfuscatedName("pb.d")
	public class22 field639 = new class22();

	@ObfuscatedName("pb.e")
	public class22 field640;

	public class42() {
		field639.field330 = field639;
		field639.field331 = field639;
	}

	@ObfuscatedName("pb.a(Lv;)V")
	public void method247(class22 arg0) {
		if (arg0.field331 != null) {
			arg0.method118();
		}

		arg0.field331 = field639.field331;
		arg0.field330 = field639;
		arg0.field331.field330 = arg0;
		arg0.field330.field331 = arg0;
	}

	@ObfuscatedName("pb.a(Lv;I)V")
	public void method248(class22 arg0) {
		if (arg0.field331 != null) {
			arg0.method118();
		}

		arg0.field331 = field639;
		arg0.field330 = field639.field330;
		arg0.field331.field330 = arg0;
		arg0.field330.field331 = arg0;
	}

	@ObfuscatedName("pb.a()Lv;")
	public class22 method249() {
		class22 var1 = field639.field330;
		if (field639 == var1) {
			return null;
		} else {
			var1.method118();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lv;")
	public class22 method250() {
		class22 var1 = field639.field330;
		if (field639 == var1) {
			field640 = null;
			return null;
		} else {
			field640 = var1.field330;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(B)Lv;")
	public class22 method251() {
		class22 var1 = field639.field331;
		if (field639 == var1) {
			field640 = null;
			return null;
		} else {
			field640 = var1.field331;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(Z)Lv;")
	public class22 method252() {
		class22 var1 = field640;
		if (field639 == var1) {
			field640 = null;
			return null;
		} else {
			field640 = var1.field330;
			return var1;
		}
	}

	@ObfuscatedName("pb.b(B)Lv;")
	public class22 method253() {
		class22 var1 = field640;
		if (field639 == var1) {
			field640 = null;
			return null;
		} else {
			field640 = var1.field331;
			return var1;
		}
	}

	@ObfuscatedName("pb.c()V")
	public void method254() {
		while (true) {
			class22 var1 = field639.field330;
			if (field639 == var1) {
				return;
			}

			var1.method118();
		}
	}
}
