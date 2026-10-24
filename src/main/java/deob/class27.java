package deob;

@ObfuscatedName("ab")
public final class class27 extends class26 {

	@ObfuscatedName("ab.sb")
	public class59 field422;

	@ObfuscatedName("ab.a(I)Lfb;")
	public final class32 method122() {
		if (field422 == null) {
			return null;
		}

		class32 var1 = method128();
		if (var1 == null) {
			return null;
		}

		field414 = var1.field367;

		if (field401 != -1 && field402 != -1) {
			class67 var2 = class67.field994[field401];
			class32 var3 = var2.method386();
			if (var3 != null) {
				class32 var4 = new class32(true, var3, false, !var2.field999);
				var4.method151(0, 0, -field405);
				var4.method145();
				var4.method146(var2.field998.field980[field402]);
				var4.field519 = null;
				var4.field518 = null;

				if (var2.field1002 != 128 || var2.field1003 != 128) {
					var4.method154(var2.field1002, var2.field1002, var2.field1003);
				}

				var4.method155(var2.field1005 + 64, var2.field1006 + 850, -30, -50, -30, true);
				class32[] var5 = new class32[] { var1, var4 };
				var1 = new class32(2, true, var5);
			}
		}

		if (field422.field867 == 1) {
			var1.field520 = true;
		}

		return var1;
	}

	@ObfuscatedName("ab.a(Z)Lfb;")
	public final class32 method128() {
		if (field396 < 0 || field399 != 0) {
			int var3 = -1;
			if (field393 >= 0) {
				var3 = class66.field978[field393].field980[field394];
			}

			return field422.method344(var3, null, -1);
		}

		int var1 = class66.field978[field396].field980[field397];
		int var2 = -1;
		if (field393 >= 0 && field393 != field373) {
			var2 = class66.field978[field393].field980[field394];
		}

		return field422.method344(var1, class66.field978[field396].field984, var2);
	}

	@ObfuscatedName("ab.b(B)Z")
	public final boolean method126() {
		if (field422 == null) {
			return false;
		}

		return true;
	}
}
