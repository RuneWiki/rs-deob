package deob;

@ObfuscatedName("pb")
public final class class42 {

	@ObfuscatedName("pb.b")
	public class30 field582 = new class30();

	public class42() {
		field582.field399 = field582;
		field582.field400 = field582;
	}

	@ObfuscatedName("pb.a(Ldb;)V")
	public void method233(class30 arg0) {
		if (arg0.field400 != null) {
			arg0.method119();
		}

		arg0.field400 = field582.field400;
		arg0.field399 = field582;
		arg0.field400.field399 = arg0;
		arg0.field399.field400 = arg0;
	}

	@ObfuscatedName("pb.a()Ldb;")
	public class30 method234() {
		class30 var1 = field582.field399;
		if (field582 == var1) {
			return null;
		} else {
			var1.method119();
			return var1;
		}
	}
}
