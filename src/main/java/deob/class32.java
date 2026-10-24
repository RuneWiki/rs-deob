package deob;

@ObfuscatedName("fb")
public final class class32 extends class24 {

	@ObfuscatedName("fb.p")
	public class68 field554;

	@ObfuscatedName("fb.q")
	public int field555;

	@ObfuscatedName("fb.r")
	public int field556;

	@ObfuscatedName("fb.s")
	public int field557;

	@ObfuscatedName("fb.t")
	public int field558;

	@ObfuscatedName("fb.u")
	public int field559;

	@ObfuscatedName("fb.v")
	public int field560;

	@ObfuscatedName("fb.w")
	public int field561;

	@ObfuscatedName("fb.x")
	public boolean field562 = false;

	public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field554 = class68.field1016[arg1];
		field556 = arg6;
		field557 = arg3;
		field558 = arg4;
		field559 = arg5;
		field555 = arg0 + arg2;
		field562 = false;
	}

	@ObfuscatedName("fb.a(II)V")
	public final void method151(int arg0) {
		field561 += arg0;
		while (field561 > field554.field1020.method382(field560)) {
			field561 -= field554.field1020.method382(field560) + 1;
			field560++;
			if (field560 >= field554.field1020.field997 && (field560 < 0 || field560 >= field554.field1020.field997)) {
				field560 = 0;
				field562 = true;
			}
		}
	}

	@ObfuscatedName("fb.a(I)Leb;")
	public final class31 method109() {
		class31 var1 = field554.method386();
		if (var1 == null) {
			return null;
		}

		int var2 = field554.field1020.field998[field560];
		class31 var3 = new class31(var1, true, false, class7.method48(var2));
		if (!field562) {
			var3.method133();
			var3.method134(var2);
			var3.field519 = null;
			var3.field518 = null;
		}

		if (field554.field1023 != 128 || field554.field1024 != 128) {
			var3.method142(field554.field1024, field554.field1023, field554.field1023);
		}

		if (field554.field1025 != 0) {
			if (field554.field1025 == 90) {
				var3.method137();
			}

			if (field554.field1025 == 180) {
				var3.method137();
				var3.method137();
			}

			if (field554.field1025 == 270) {
				var3.method137();
				var3.method137();
				var3.method137();
			}
		}

		var3.method143(field554.field1026 + 64, field554.field1027 + 850, -30, -50, -30, true);
		return var3;
	}
}
