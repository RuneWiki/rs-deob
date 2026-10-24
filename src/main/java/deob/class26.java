package deob;

@ObfuscatedName("z")
public final class class26 extends class25 {

	@ObfuscatedName("z.wb")
	public class59 field415;

	@ObfuscatedName("z.a(Z)Leb;")
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
			class68 var2 = class68.field1005[field393];
			class31 var3 = var2.method380();
			if (var3 != null) {
				int var4 = var2.field1009.field987[field394];
				class31 var5 = new class31(false, class7.method48(var4), true, var3);
				var5.method138(0, -field397, 0);
				var5.method132();
				var5.method133(var4);
				var5.field515 = null;
				var5.field514 = null;

				if (var2.field1012 != 128 || var2.field1013 != 128) {
					var5.method141(var2.field1012, var2.field1012, var2.field1013);
				}

				var5.method142(var2.field1015 + 64, var2.field1016 + 850, -30, -50, -30, true);
				class31[] var6 = new class31[] { var1, var5 };
				var1 = new class31(true, var6, 2);
			}
		}

		if (field415.field872 == 1) {
			var1.field516 = true;
		}

		return var1;
	}

	@ObfuscatedName("z.a(I)Leb;")
	public final class31 method115() {
		if (field388 < 0 || field391 != 0) {
			int var3 = -1;
			if (field385 >= 0) {
				var3 = class66.field985[field385].field987[field386];
			}

			return field415.method338(var3, -1, null);
		}

		int var1 = class66.field985[field388].field987[field389];
		int var2 = -1;
		if (field385 >= 0 && field385 != field365) {
			var2 = class66.field985[field385].field987[field386];
		}

		return field415.method338(var1, var2, class66.field985[field388].field991);
	}

	@ObfuscatedName("z.b(B)Z")
	public final boolean method113() {
		if (field415 == null) {
			return false;
		}

		return true;
	}
}
