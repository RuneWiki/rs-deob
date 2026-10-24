package deob;

@ObfuscatedName("pb")
public final class class42 {

	@ObfuscatedName("pb.c")
	public class23 field652 = new class23();

	@ObfuscatedName("pb.d")
	public class23 field653;

	public class42() {
		field652.field356 = field652;
		field652.field357 = field652;
	}

	@ObfuscatedName("pb.a(Lw;)V")
	public void method253(class23 arg0) {
		if (arg0.field357 != null) {
			arg0.method107();
		}

		arg0.field357 = field652.field357;
		arg0.field356 = field652;
		arg0.field357.field356 = arg0;
		arg0.field356.field357 = arg0;
	}

	@ObfuscatedName("pb.a()Lw;")
	public class23 method254() {
		class23 var1 = field652.field356;
		if (field652 == var1) {
			return null;
		} else {
			var1.method107();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lw;")
	public class23 method255() {
		class23 var1 = field652.field356;
		if (field652 == var1) {
			field653 = null;
			return null;
		} else {
			field653 = var1.field356;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(I)Lw;")
	public class23 method256() {
		class23 var1 = field653;
		if (field652 == var1) {
			field653 = null;
			return null;
		} else {
			field653 = var1.field356;
			return var1;
		}
	}

	@ObfuscatedName("pb.c()I")
	public int method257() {
		int var1 = 0;
		for (class23 var2 = field652.field356; var2 != field652; var2 = var2.field356) {
			var1++;
		}

		return var1;
	}
}
