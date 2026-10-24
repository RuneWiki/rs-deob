package deob;

@ObfuscatedName("ab")
public final class class27 extends class26 {

	@ObfuscatedName("ab.rb")
	public class59 field420;

	@ObfuscatedName("ab.a(Z)Lfb;")
	public final class32 method122() {
		if (field420 == null) {
			return null;
		}

		class32 var1 = method128();
		if (var1 == null) {
			return null;
		}

		field412 = var1.field365;

		if (field399 != -1 && field400 != -1) {
			class67 var2 = class67.field989[field399];
			class32 var3 = var2.method386();
			if (var3 != null) {
				class32 var4 = new class32(false, true, var3, !var2.field994);
				var4.method151(0, -field403, 0);
				var4.method145();
				var4.method146(var2.field993.field975[field400]);
				var4.field517 = null;
				var4.field516 = null;

				if (var2.field997 != 128 || var2.field998 != 128) {
					var4.method154(var2.field997, var2.field997, var2.field998);
				}

				var4.method155(var2.field1000 + 64, var2.field1001 + 850, -30, -50, -30, true);
				class32[] var5 = new class32[] { var1, var4 };
				var1 = new class32(2, var5, true);
			}
		}

		if (field420.field864 == 1) {
			var1.field518 = true;
		}

		return var1;
	}

	@ObfuscatedName("ab.b(Z)Lfb;")
	public final class32 method128() {
		if (field394 < 0 || field397 != 0) {
			int var3 = -1;
			if (field391 >= 0) {
				var3 = class66.field973[field391].field975[field392];
			}

			return field420.method344(null, var3, -1);
		}

		int var1 = class66.field973[field394].field975[field395];
		int var2 = -1;
		if (field391 >= 0 && field391 != field371) {
			var2 = class66.field973[field391].field975[field392];
		}

		return field420.method344(class66.field973[field394].field979, var1, var2);
	}

	@ObfuscatedName("ab.b(I)Z")
	public final boolean method126() {
		if (field420 == null) {
			return false;
		}

		return true;
	}
}
