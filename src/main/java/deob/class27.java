package deob;

@ObfuscatedName("ab")
public final class class27 extends class26 {

	@ObfuscatedName("ab.nb")
	public class58 field411;

	@ObfuscatedName("ab.a(I)Lfb;")
	public final class32 method121() {
		if (field411 == null) {
			return null;
		}

		class32 var1 = method125();
		if (var1 == null) {
			return null;
		}

		field404 = var1.field358;

		if (field391 != -1 && field392 != -1) {
			class66 var2 = class66.field956[field391];
			class32 var3 = var2.method373();
			if (var3 != null) {
				class32 var4 = new class32(true, !var2.field961, false, var3);
				var4.method148(-field395, 0, 0);
				var4.method142();
				var4.method143(var2.field960.field945[field392]);
				var4.field508 = null;
				var4.field507 = null;

				if (var2.field964 != 128 || var2.field965 != 128) {
					var4.method151(var2.field964, var2.field964, var2.field965);
				}

				var4.method152(var2.field967 + 64, var2.field968 + 850, -30, -50, -30, true);
				class32[] var5 = new class32[] { var1, var4 };
				var1 = new class32(true, 2, var5);
			}
		}

		if (field411.field843 == 1) {
			var1.field509 = true;
		}

		return var1;
	}

	@ObfuscatedName("ab.c(I)Lfb;")
	public final class32 method125() {
		if (field386 < 0 || field389 != 0) {
			int var3 = -1;
			if (field383 >= 0) {
				var3 = class65.field943[field383].field945[field384];
			}

			return field411.method331(var3, -1, null);
		}

		int var1 = class65.field943[field386].field945[field387];
		int var2 = -1;
		if (field383 >= 0 && field383 != field364) {
			var2 = class65.field943[field383].field945[field384];
		}

		return field411.method331(var1, var2, class65.field943[field386].field949);
	}

	@ObfuscatedName("ab.b(I)Z")
	public final boolean method124() {
		if (field411 == null) {
			return false;
		}

		return true;
	}
}
