package deob;

@ObfuscatedName("x")
public final class class24 extends class23 {

	@ObfuscatedName("x.fb")
	public class50 field306;

	@ObfuscatedName("x.a(I)Ldb;")
	public final class30 method90() {
		if (field306 == null) {
			return null;
		}

		if (field287 != -1 && field288 != -1) {
			class30 var1 = method93();
			class59 var2 = class59.field836[field287];
			class30 var3 = new class30(true, !var2.field840, var2.method283(), true, false);
			var3.method114(0, 0, -field291);
			var3.method108();
			var3.method109(var2.field839.field825[field288]);
			var3.field419 = null;
			var3.field418 = null;
			var3.method118(64, 850, -30, -50, -30, true);
			class30[] var4 = new class30[] { var1, var3 };
			return new class30(true, var4, 2);
		}

		return method93();
	}

	@ObfuscatedName("x.b(I)Ldb;")
	public final class30 method93() {
		if (field282 >= 0 && field285 == 0) {
			int var1 = class58.field823[field282].field825[field283];
			int var2 = -1;
			if (field279 >= 0 && field279 != field265) {
				var2 = class58.field823[field279].field825[field280];
			}

			return field306.method245(var1, var2, class58.field823[field282].field829);
		}

		int var3 = -1;
		if (field279 >= 0) {
			var3 = class58.field823[field279].field825[field280];
		}

		class30 var4 = field306.method245(var3, -1, null);
		field300 = var4.field411;
		return var4;
	}

	@ObfuscatedName("x.c(I)Z")
	public final boolean method94() {
		if (field306 == null) {
			return false;
		}

		return true;
	}
}
