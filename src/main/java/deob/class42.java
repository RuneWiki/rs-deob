package deob;

@ObfuscatedName("pb")
public final class class42 {

	@ObfuscatedName("pb.c")
	public class23 field647 = new class23();

	@ObfuscatedName("pb.d")
	public class23 field648;

	public class42() {
		field647.field356 = field647;
		field647.field357 = field647;
	}

	@ObfuscatedName("pb.a(Lw;)V")
	public void method248(class23 arg0) {
		if (arg0.field357 != null) {
			arg0.method107();
		}

		arg0.field357 = field647.field357;
		arg0.field356 = field647;
		arg0.field357.field356 = arg0;
		arg0.field356.field357 = arg0;
	}

	@ObfuscatedName("pb.a()Lw;")
	public class23 method249() {
		class23 var1 = field647.field356;
		if (field647 == var1) {
			return null;
		} else {
			var1.method107();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lw;")
	public class23 method250() {
		class23 var1 = field647.field356;
		if (field647 == var1) {
			field648 = null;
			return null;
		} else {
			field648 = var1.field356;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(I)Lw;")
	public class23 method251() {
		class23 var1 = field648;
		if (field647 == var1) {
			field648 = null;
			return null;
		} else {
			field648 = var1.field356;
			return var1;
		}
	}

	@ObfuscatedName("pb.c()I")
	public int method252() {
		int var1 = 0;
		for (class23 var2 = field647.field356; var2 != field647; var2 = var2.field356) {
			var1++;
		}

		return var1;
	}
}
