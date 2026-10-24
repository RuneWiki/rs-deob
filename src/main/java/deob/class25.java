package deob;

@ObfuscatedName("y")
public final class class25 extends class24 {

	@ObfuscatedName("y.jb")
	public class54 field320;

	@ObfuscatedName("y.a(Z)Leb;")
	public final class31 method108() {
		if (field320 == null) {
			return null;
		}

		if (field300 != -1 && field301 != -1) {
			class31 var1 = method112();
			class63 var2 = class63.field908[field300];
			class31 var3 = new class31(var2.method322(), !var2.field912, false, true);
			var3.method132(0, 0, -field304);
			var3.method126();
			var3.method127(var2.field911.field897[field301]);
			var3.field433 = null;
			var3.field432 = null;

			if (var2.field915 != 128 || var2.field916 != 128) {
				var3.method135(var2.field915, var2.field915, var2.field916);
			}

			var3.method136(var2.field918 + 64, var2.field919 + 850, -30, -50, -30, true);
			class31[] var4 = new class31[] { var1, var3 };
			class31 var5 = new class31(var4, 2, true);
			if (field320.field742 == 1) {
				var5.field434 = true;
			}

			return var5;
		}

		return method112();
	}

	@ObfuscatedName("y.b(I)Leb;")
	public final class31 method112() {
		if (field295 >= 0 && field298 == 0) {
			int var1 = class62.field895[field295].field897[field296];
			int var2 = -1;
			if (field292 >= 0 && field292 != field273) {
				var2 = class62.field895[field292].field897[field293];
			}

			return field320.method283(var1, var2, class62.field895[field295].field901);
		}

		int var3 = -1;
		if (field292 >= 0) {
			var3 = class62.field895[field292].field897[field293];
		}

		class31 var4 = field320.method283(var3, -1, null);
		field313 = var4.field425;
		return var4;
	}

	@ObfuscatedName("y.a(I)Z")
	public final boolean method111() {
		if (field320 == null) {
			return false;
		}

		return true;
	}
}
