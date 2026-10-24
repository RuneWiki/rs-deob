package deob;

@ObfuscatedName("y")
public final class class25 extends class24 {

	@ObfuscatedName("y.ib")
	public class54 field322;

	@ObfuscatedName("y.a(I)Leb;")
	public final class31 method109() {
		if (field322 == null) {
			return null;
		}

		if (field302 != -1 && field303 != -1) {
			class31 var1 = method113();
			class63 var2 = class63.field914[field302];
			class31 var3 = new class31(!var2.field919, true, var2.method330(), false);
			var3.method133(0, -field306, 0);
			var3.method127();
			var3.method128(var2.field918.field903[field303]);
			var3.field435 = null;
			var3.field434 = null;

			if (var2.field922 != 128 || var2.field923 != 128) {
				var3.method136(var2.field923, var2.field922, var2.field922);
			}

			var3.method137(var2.field925 + 64, var2.field926 + 850, -30, -50, -30, true);
			class31[] var4 = new class31[] { var1, var3 };
			class31 var5 = new class31(true, var4, 2);
			if (field322.field745 == 1) {
				var5.field436 = true;
			}

			return var5;
		}

		return method113();
	}

	@ObfuscatedName("y.c(I)Leb;")
	public final class31 method113() {
		if (field297 >= 0 && field300 == 0) {
			int var1 = class62.field901[field297].field903[field298];
			int var2 = -1;
			if (field294 >= 0 && field294 != field275) {
				var2 = class62.field901[field294].field903[field295];
			}

			return field322.method290(var1, var2, class62.field901[field297].field907);
		}

		int var3 = -1;
		if (field294 >= 0) {
			var3 = class62.field901[field294].field903[field295];
		}

		class31 var4 = field322.method290(var3, -1, null);
		field315 = var4.field427;
		return var4;
	}

	@ObfuscatedName("y.b(I)Z")
	public final boolean method112() {
		if (field322 == null) {
			return false;
		}

		return true;
	}
}
