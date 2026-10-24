package deob;

@ObfuscatedName("pb")
public final class class42 {

	@ObfuscatedName("pb.b")
	public class30 field582 = new class30();

	public class42() {
		field582.field400 = field582;
		field582.field401 = field582;
	}

	@ObfuscatedName("pb.a(Ldb;)V")
	public void method240(class30 arg0) {
		if (arg0.field401 != null) {
			arg0.method120();
		}

		arg0.field401 = field582.field401;
		arg0.field400 = field582;
		arg0.field401.field400 = arg0;
		arg0.field400.field401 = arg0;
	}

	@ObfuscatedName("pb.a()Ldb;")
	public class30 method241() {
		class30 var1 = field582.field400;
		if (field582 == var1) {
			return null;
		} else {
			var1.method120();
			return var1;
		}
	}
}
