package deob;

@ObfuscatedName("pb")
public final class class42 {

	@ObfuscatedName("pb.c")
	public class23 field648 = new class23();

	@ObfuscatedName("pb.d")
	public class23 field649;

	public class42() {
		field648.field356 = field648;
		field648.field357 = field648;
	}

	@ObfuscatedName("pb.a(Lw;)V")
	public void method249(class23 arg0) {
		if (arg0.field357 != null) {
			arg0.method107();
		}

		arg0.field357 = field648.field357;
		arg0.field356 = field648;
		arg0.field357.field356 = arg0;
		arg0.field356.field357 = arg0;
	}

	@ObfuscatedName("pb.a()Lw;")
	public class23 method250() {
		class23 var1 = field648.field356;
		if (field648 == var1) {
			return null;
		} else {
			var1.method107();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lw;")
	public class23 method251() {
		class23 var1 = field648.field356;
		if (field648 == var1) {
			field649 = null;
			return null;
		} else {
			field649 = var1.field356;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(Z)Lw;")
	public class23 method252() {
		class23 var1 = field649;
		if (field648 == var1) {
			field649 = null;
			return null;
		} else {
			field649 = var1.field356;
			return var1;
		}
	}

	@ObfuscatedName("pb.c()I")
	public int method253() {
		int var1 = 0;
		for (class23 var2 = field648.field356; var2 != field648; var2 = var2.field356) {
			var1++;
		}

		return var1;
	}
}
