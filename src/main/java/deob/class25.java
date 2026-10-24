package deob;

@ObfuscatedName("y")
public final class class25 extends class24 {

	@ObfuscatedName("y.jb")
	public class54 field320;

	@ObfuscatedName("y.a(I)Leb;")
	public final class31 method107() {
		if (field320 == null) {
			return null;
		}

		if (field300 != -1 && field301 != -1) {
			class31 var1 = method111();
			class63 var2 = class63.field906[field300];
			class31 var3 = new class31(false, true, !var2.field910, var2.method321());
			var3.method131(-field304, 0, 0);
			var3.method125();
			var3.method126(var2.field909.field895[field301]);
			var3.field433 = null;
			var3.field432 = null;

			if (var2.field913 != 128 || var2.field914 != 128) {
				var3.method134(var2.field914, var2.field913, var2.field913);
			}

			var3.method135(var2.field916 + 64, var2.field917 + 850, -30, -50, -30, true);
			class31[] var4 = new class31[] { var1, var3 };
			class31 var5 = new class31(var4, 2, true);
			if (field320.field741 == 1) {
				var5.field434 = true;
			}

			return var5;
		}

		return method111();
	}

	@ObfuscatedName("y.b(Z)Leb;")
	public final class31 method111() {
		if (field295 >= 0 && field298 == 0) {
			int var1 = class62.field893[field295].field895[field296];
			int var2 = -1;
			if (field292 >= 0 && field292 != field273) {
				var2 = class62.field893[field292].field895[field293];
			}

			return field320.method282(var1, var2, class62.field893[field295].field899);
		}

		int var3 = -1;
		if (field292 >= 0) {
			var3 = class62.field893[field292].field895[field293];
		}

		class31 var4 = field320.method282(var3, -1, null);
		field313 = var4.field425;
		return var4;
	}

	@ObfuscatedName("y.a(Z)Z")
	public final boolean method110() {
		if (field320 == null) {
			return false;
		}

		return true;
	}
}
