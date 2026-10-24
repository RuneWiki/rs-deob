package deob;

@ObfuscatedName("z")
public final class class26 extends class25 {

	@ObfuscatedName("z.vb")
	public class59 field415;

	@ObfuscatedName("z.a(I)Leb;")
	public final class31 method109() {
		if (field415 == null) {
			return null;
		}

		class31 var1 = method115();
		if (var1 == null) {
			return null;
		}

		field406 = var1.field359;

		if (field393 != -1 && field394 != -1) {
			class68 var2 = class68.field1016[field393];
			class31 var3 = var2.method386();
			if (var3 != null) {
				int var4 = var2.field1020.field998[field394];
				class31 var5 = new class31(var3, true, false, class7.method48(var4));
				var5.method139(-field397, 0, 0);
				var5.method133();
				var5.method134(var4);
				var5.field519 = null;
				var5.field518 = null;

				if (var2.field1023 != 128 || var2.field1024 != 128) {
					var5.method142(var2.field1024, var2.field1023, var2.field1023);
				}

				var5.method143(var2.field1026 + 64, var2.field1027 + 850, -30, -50, -30, true);
				class31[] var6 = new class31[] { var1, var5 };
				var1 = new class31(true, var6, 2);
			}
		}

		if (field415.field882 == 1) {
			var1.field520 = true;
		}

		return var1;
	}

	@ObfuscatedName("z.c(I)Leb;")
	public final class31 method115() {
		if (field388 < 0 || field391 != 0) {
			int var3 = -1;
			if (field385 >= 0) {
				var3 = class66.field996[field385].field998[field386];
			}

			return field415.method343(var3, -1, null);
		}

		int var1 = class66.field996[field388].field998[field389];
		int var2 = -1;
		if (field385 >= 0 && field385 != field365) {
			var2 = class66.field996[field385].field998[field386];
		}

		return field415.method343(var1, var2, class66.field996[field388].field1002);
	}

	@ObfuscatedName("z.a(Z)Z")
	public final boolean method113() {
		if (field415 == null) {
			return false;
		}

		return true;
	}
}
