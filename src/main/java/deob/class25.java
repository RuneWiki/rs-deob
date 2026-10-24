package deob;

@ObfuscatedName("y")
public final class class25 extends class24 {

	@ObfuscatedName("y.gb")
	public class54 field321;

	@ObfuscatedName("y.a(I)Leb;")
	public final class31 method108() {
		if (field321 == null) {
			return null;
		}

		if (field301 != -1 && field302 != -1) {
			class31 var1 = method112();
			class63 var2 = class63.field914[field301];
			class31 var3 = new class31(!var2.field918, false, var2.method322(), true);
			var3.method132(0, -field305, 0);
			var3.method126();
			var3.method127(var2.field917.field903[field302]);
			var3.field435 = null;
			var3.field434 = null;

			if (var2.field921 != 128 || var2.field922 != 128) {
				var3.method135(var2.field921, var2.field921, var2.field922);
			}

			var3.method136(var2.field924 + 64, var2.field925 + 850, -30, -50, -30, true);
			class31[] var4 = new class31[] { var1, var3 };
			class31 var5 = new class31(2, true, var4);
			if (field321.field746 == 1) {
				var5.field436 = true;
			}

			return var5;
		}

		return method112();
	}

	@ObfuscatedName("y.b(Z)Leb;")
	public final class31 method112() {
		if (field296 >= 0 && field299 == 0) {
			int var1 = class62.field901[field296].field903[field297];
			int var2 = -1;
			if (field293 >= 0 && field293 != field274) {
				var2 = class62.field901[field293].field903[field294];
			}

			return field321.method283(var1, var2, class62.field901[field296].field907);
		}

		int var3 = -1;
		if (field293 >= 0) {
			var3 = class62.field901[field293].field903[field294];
		}

		class31 var4 = field321.method283(var3, -1, null);
		field314 = var4.field427;
		return var4;
	}

	@ObfuscatedName("y.a(Z)Z")
	public final boolean method111() {
		if (field321 == null) {
			return false;
		}

		return true;
	}
}
