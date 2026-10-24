package deob;

@ObfuscatedName("ab")
public final class class27 extends class26 {

	@ObfuscatedName("ab.qb")
	public class59 field423;

	@ObfuscatedName("ab.a(I)Lfb;")
	public final class32 method123() {
		if (field423 == null) {
			return null;
		}

		class32 var1 = method129();
		if (var1 == null) {
			return null;
		}

		field414 = var1.field367;

		if (field401 != -1 && field402 != -1) {
			class68 var2 = class68.field999[field401];
			class32 var3 = var2.method388();
			if (var3 != null) {
				int var4 = var2.field1003.field982[field402];
				class32 var5 = new class32(class8.method62(var4), var3, true, false);
				var5.method152(0, 0, -field405);
				var5.method146();
				var5.method147(var4);
				var5.field520 = null;
				var5.field519 = null;

				if (var2.field1006 != 128 || var2.field1007 != 128) {
					var5.method155(var2.field1006, var2.field1006, var2.field1007);
				}

				var5.method156(var2.field1009 + 64, var2.field1010 + 850, -30, -50, -30, true);
				class32[] var6 = new class32[] { var1, var5 };
				var1 = new class32(var6, 2, true);
			}
		}

		if (field423.field868 == 1) {
			var1.field521 = true;
		}

		return var1;
	}

	@ObfuscatedName("ab.d(I)Lfb;")
	public final class32 method129() {
		if (field396 < 0 || field399 != 0) {
			int var3 = -1;
			if (field393 >= 0) {
				var3 = class66.field980[field393].field982[field394];
			}

			return field423.method346(var3, null, -1);
		}

		int var1 = class66.field980[field396].field982[field397];
		int var2 = -1;
		if (field393 >= 0 && field393 != field373) {
			var2 = class66.field980[field393].field982[field394];
		}

		return field423.method346(var1, class66.field980[field396].field986, var2);
	}

	@ObfuscatedName("ab.c(I)Z")
	public final boolean method127() {
		if (field423 == null) {
			return false;
		}

		return true;
	}
}
