package deob;

@ObfuscatedName("ab")
public final class class27 extends class26 {

	@ObfuscatedName("ab.tb")
	public class59 field422;

	@ObfuscatedName("ab.a(B)Lfb;")
	public final class32 method123() {
		if (field422 == null) {
			return null;
		}

		class32 var1 = method129();
		if (var1 == null) {
			return null;
		}

		field414 = var1.field367;

		if (field401 != -1 && field402 != -1) {
			class68 var2 = class68.field997[field401];
			class32 var3 = var2.method388();
			if (var3 != null) {
				int var4 = var2.field1001.field980[field402];
				class32 var5 = new class32(class8.method62(var4), false, true, var3);
				var5.method152(0, 0, -field405);
				var5.method146();
				var5.method147(var4);
				var5.field519 = null;
				var5.field518 = null;

				if (var2.field1004 != 128 || var2.field1005 != 128) {
					var5.method155(var2.field1004, var2.field1005, var2.field1004);
				}

				var5.method156(var2.field1007 + 64, var2.field1008 + 850, -30, -50, -30, true);
				class32[] var6 = new class32[] { var1, var5 };
				var1 = new class32(var6, true, 2);
			}
		}

		if (field422.field867 == 1) {
			var1.field520 = true;
		}

		return var1;
	}

	@ObfuscatedName("ab.c(I)Lfb;")
	public final class32 method129() {
		if (field396 < 0 || field399 != 0) {
			int var3 = -1;
			if (field393 >= 0) {
				var3 = class66.field978[field393].field980[field394];
			}

			return field422.method346(var3, -1, null);
		}

		int var1 = class66.field978[field396].field980[field397];
		int var2 = -1;
		if (field393 >= 0 && field393 != field373) {
			var2 = class66.field978[field393].field980[field394];
		}

		return field422.method346(var1, var2, class66.field978[field396].field984);
	}

	@ObfuscatedName("ab.b(I)Z")
	public final boolean method127() {
		if (field422 == null) {
			return false;
		}

		return true;
	}
}
