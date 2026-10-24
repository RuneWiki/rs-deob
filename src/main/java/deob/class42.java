package deob;

@ObfuscatedName("pb")
public final class class42 {

	@ObfuscatedName("pb.c")
	public class30 field576 = new class30();

	public class42() {
		field576.field395 = field576;
		field576.field396 = field576;
	}

	@ObfuscatedName("pb.a(Ldb;)V")
	public void method225(class30 arg0) {
		if (arg0.field396 != null) {
			arg0.method116();
		}

		arg0.field396 = field576.field396;
		arg0.field395 = field576;
		arg0.field396.field395 = arg0;
		arg0.field395.field396 = arg0;
	}

	@ObfuscatedName("pb.a()Ldb;")
	public class30 method226() {
		class30 var1 = field576.field395;
		if (field576 == var1) {
			return null;
		} else {
			var1.method116();
			return var1;
		}
	}
}
