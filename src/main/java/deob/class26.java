package deob;

@ObfuscatedName("z")
public final class class26 extends class25 {

	@ObfuscatedName("z.rb")
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
			class68 var2 = class68.field1001[field393];
			class31 var3 = var2.method379();
			if (var3 != null) {
				int var4 = var2.field1005.field984[field394];
				class31 var5 = new class31(false, true, var3, class7.method48(var4));
				var5.method138(0, -field397, 0);
				var5.method132();
				var5.method133(var4);
				var5.field514 = null;
				var5.field513 = null;

				if (var2.field1008 != 128 || var2.field1009 != 128) {
					var5.method141(var2.field1008, var2.field1009, var2.field1008);
				}

				var5.method142(var2.field1011 + 64, var2.field1012 + 850, -30, -50, -30, true);
				class31[] var6 = new class31[] { var1, var5 };
				var1 = new class31(true, var6, 2);
			}
		}

		if (field415.field870 == 1) {
			var1.field515 = true;
		}

		return var1;
	}

	@ObfuscatedName("z.a(B)Leb;")
	public final class31 method115() {
		if (field388 < 0 || field391 != 0) {
			int var3 = -1;
			if (field385 >= 0) {
				var3 = class66.field982[field385].field984[field386];
			}

			return field415.method337(var3, null, -1);
		}

		int var1 = class66.field982[field388].field984[field389];
		int var2 = -1;
		if (field385 >= 0 && field385 != field365) {
			var2 = class66.field982[field385].field984[field386];
		}

		return field415.method337(var1, class66.field982[field388].field988, var2);
	}

	@ObfuscatedName("z.c(I)Z")
	public final boolean method113() {
		if (field415 == null) {
			return false;
		}

		return true;
	}
}
