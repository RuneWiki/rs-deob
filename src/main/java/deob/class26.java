package deob;

@ObfuscatedName("z")
public final class class26 extends class25 {

	@ObfuscatedName("z.sb")
	public class60 field415;

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
			class69 var2 = class69.field1010[field393];
			class31 var3 = var2.method383();
			if (var3 != null) {
				int var4 = var2.field1014.field993[field394];
				class31 var5 = new class31(false, var3, true, class7.method48(var4));
				var5.method138(-field397, 0, 0);
				var5.method132();
				var5.method133(var4);
				var5.field513 = null;
				var5.field512 = null;

				if (var2.field1017 != 128 || var2.field1018 != 128) {
					var5.method141(var2.field1017, var2.field1017, var2.field1018);
				}

				var5.method142(var2.field1020 + 64, var2.field1021 + 850, -30, -50, -30, true);
				class31[] var6 = new class31[] { var1, var5 };
				var1 = new class31(2, true, var6);
			}
		}

		if (field415.field879 == 1) {
			var1.field514 = true;
		}

		return var1;
	}

	@ObfuscatedName("z.b(Z)Leb;")
	public final class31 method115() {
		if (field388 < 0 || field391 != 0) {
			int var3 = -1;
			if (field385 >= 0) {
				var3 = class67.field991[field385].field993[field386];
			}

			return field415.method341(-1, var3, null);
		}

		int var1 = class67.field991[field388].field993[field389];
		int var2 = -1;
		if (field385 >= 0 && field385 != field365) {
			var2 = class67.field991[field385].field993[field386];
		}

		return field415.method341(var2, var1, class67.field991[field388].field997);
	}

	@ObfuscatedName("z.a(Z)Z")
	public final boolean method113() {
		if (field415 == null) {
			return false;
		}

		return true;
	}
}
