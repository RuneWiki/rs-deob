package deob;

@ObfuscatedName("pb")
public final class class42 {

	@ObfuscatedName("pb.b")
	public class30 field579 = new class30();

	public class42() {
		field579.field398 = field579;
		field579.field399 = field579;
	}

	@ObfuscatedName("pb.a(Ldb;)V")
	public void method233(class30 arg0) {
		if (arg0.field399 != null) {
			arg0.method119();
		}

		arg0.field399 = field579.field399;
		arg0.field398 = field579;
		arg0.field399.field398 = arg0;
		arg0.field398.field399 = arg0;
	}

	@ObfuscatedName("pb.a()Ldb;")
	public class30 method234() {
		class30 var1 = field579.field398;
		if (field579 == var1) {
			return null;
		} else {
			var1.method119();
			return var1;
		}
	}
}
