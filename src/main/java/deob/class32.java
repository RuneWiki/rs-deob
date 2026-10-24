package deob;

@ObfuscatedName("fb")
public final class class32 extends class24 {

	@ObfuscatedName("fb.r")
	public class68 field555;

	@ObfuscatedName("fb.s")
	public int field556;

	@ObfuscatedName("fb.t")
	public int field557;

	@ObfuscatedName("fb.u")
	public int field558;

	@ObfuscatedName("fb.v")
	public int field559;

	@ObfuscatedName("fb.w")
	public int field560;

	@ObfuscatedName("fb.x")
	public int field561;

	@ObfuscatedName("fb.y")
	public int field562;

	@ObfuscatedName("fb.z")
	public boolean field563 = false;

	public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field555 = class68.field1017[arg4];
		field557 = arg3;
		field558 = arg2;
		field559 = arg6;
		field560 = arg1;
		field556 = arg0 + arg5;
		field563 = false;
	}

	@ObfuscatedName("fb.a(IZ)V")
	public final void method151(int arg0) {
		field562 += arg0;
		while (field562 > field555.field1021.method382(field561)) {
			field562 -= field555.field1021.method382(field561) + 1;
			field561++;
			if (field561 >= field555.field1021.field998 && (field561 < 0 || field561 >= field555.field1021.field998)) {
				field561 = 0;
				field563 = true;
			}
		}
	}

	@ObfuscatedName("fb.a(I)Leb;")
	public final class31 method109() {
		class31 var1 = field555.method386();
		if (var1 == null) {
			return null;
		}

		int var2 = field555.field1021.field999[field561];
		class31 var3 = new class31(false, -16051, var1, class7.method48(var2), true);
		if (!field563) {
			var3.method133();
			var3.method134(var2);
			var3.field520 = null;
			var3.field519 = null;
		}

		if (field555.field1024 != 128 || field555.field1025 != 128) {
			var3.method142(field555.field1024, field555.field1024, field555.field1025);
		}

		if (field555.field1026 != 0) {
			if (field555.field1026 == 90) {
				var3.method137();
			}

			if (field555.field1026 == 180) {
				var3.method137();
				var3.method137();
			}

			if (field555.field1026 == 270) {
				var3.method137();
				var3.method137();
				var3.method137();
			}
		}

		var3.method143(field555.field1027 + 64, field555.field1028 + 850, -30, -50, -30, true);
		return var3;
	}
}
