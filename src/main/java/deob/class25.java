package deob;

@ObfuscatedName("y")
public final class class25 extends class24 {

	@ObfuscatedName("y.hb")
	public class51 field317;

	@ObfuscatedName("y.a(I)Leb;")
	public final class31 method105() {
		if (field317 == null) {
			return null;
		}

		if (field297 != -1 && field298 != -1) {
			class31 var1 = method109();
			class60 var2 = class60.field856[field297];
			class31 var3 = new class31(true, var2.method299(), true, false, !var2.field860);
			var3.method128(0, 0, -field301);
			var3.method122();
			var3.method123(var2.field859.field845[field298]);
			var3.field430 = null;
			var3.field429 = null;
			var3.method132(64, 850, -30, -50, -30, true);
			class31[] var4 = new class31[] { var1, var3 };
			class31 var5 = new class31(true, var4, 2);
			if (field317.field696 == 1) {
				var5.field431 = true;
			}

			return var5;
		}

		return method109();
	}

	@ObfuscatedName("y.c(I)Leb;")
	public final class31 method109() {
		if (field292 >= 0 && field295 == 0) {
			int var1 = class59.field843[field292].field845[field293];
			int var2 = -1;
			if (field289 >= 0 && field289 != field270) {
				var2 = class59.field843[field289].field845[field290];
			}

			return field317.method261(var1, var2, class59.field843[field292].field849);
		}

		int var3 = -1;
		if (field289 >= 0) {
			var3 = class59.field843[field289].field845[field290];
		}

		class31 var4 = field317.method261(var3, -1, null);
		field310 = var4.field422;
		return var4;
	}

	@ObfuscatedName("y.b(I)Z")
	public final boolean method108() {
		if (field317 == null) {
			return false;
		}

		return true;
	}
}
