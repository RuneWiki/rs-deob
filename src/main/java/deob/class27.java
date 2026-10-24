package deob;

@ObfuscatedName("ab")
public final class class27 extends class26 {

	@ObfuscatedName("ab.rb")
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

		field415 = var1.field368;

		if (field402 != -1 && field403 != -1) {
			class68 var2 = class68.field998[field402];
			class32 var3 = var2.method388();
			if (var3 != null) {
				int var4 = var2.field1002.field981[field403];
				class32 var5 = new class32(class8.method62(var4), true, var3, false);
				var5.method152(0, -field406, 0);
				var5.method146();
				var5.method147(var4);
				var5.field520 = null;
				var5.field519 = null;

				if (var2.field1005 != 128 || var2.field1006 != 128) {
					var5.method155(var2.field1005, var2.field1006, var2.field1005);
				}

				var5.method156(var2.field1008 + 64, var2.field1009 + 850, -30, -50, -30, true);
				class32[] var6 = new class32[] { var1, var5 };
				var1 = new class32(2, var6, true);
			}
		}

		if (field423.field868 == 1) {
			var1.field521 = true;
		}

		return var1;
	}

	@ObfuscatedName("ab.c(I)Lfb;")
	public final class32 method129() {
		if (field397 < 0 || field400 != 0) {
			int var3 = -1;
			if (field394 >= 0) {
				var3 = class66.field979[field394].field981[field395];
			}

			return field423.method346(-1, var3, null);
		}

		int var1 = class66.field979[field397].field981[field398];
		int var2 = -1;
		if (field394 >= 0 && field394 != field374) {
			var2 = class66.field979[field394].field981[field395];
		}

		return field423.method346(var2, var1, class66.field979[field397].field985);
	}

	@ObfuscatedName("ab.a(Z)Z")
	public final boolean method127() {
		if (field423 == null) {
			return false;
		}

		return true;
	}
}
