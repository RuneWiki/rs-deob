package deob;

@ObfuscatedName("fb")
public final class class32 extends class24 {

	@ObfuscatedName("fb.m")
	public class68 field554;

	@ObfuscatedName("fb.n")
	public int field555;

	@ObfuscatedName("fb.o")
	public int field556;

	@ObfuscatedName("fb.p")
	public int field557;

	@ObfuscatedName("fb.q")
	public int field558;

	@ObfuscatedName("fb.r")
	public int field559;

	@ObfuscatedName("fb.s")
	public int field560;

	@ObfuscatedName("fb.t")
	public int field561;

	@ObfuscatedName("fb.u")
	public boolean field562 = false;

	public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field554 = class68.field1017[arg1];
		field556 = arg3;
		field557 = arg0;
		field558 = arg5;
		field559 = arg2;
		field555 = arg4 + arg6;
		field562 = false;
	}

	@ObfuscatedName("fb.a(BI)V")
	public final void method151(int arg0) {
		field561 += arg0;
		while (field561 > field554.field1021.method382(field560)) {
			field561 -= field554.field1021.method382(field560) + 1;
			field560++;
			if (field560 >= field554.field1021.field998 && (field560 < 0 || field560 >= field554.field1021.field998)) {
				field560 = 0;
				field562 = true;
			}
		}
	}

	@ObfuscatedName("fb.a(B)Leb;")
	public final class31 method109() {
		class31 var1 = field554.method386();
		if (var1 == null) {
			return null;
		}

		int var2 = field554.field1021.field999[field560];
		class31 var3 = new class31(false, true, class7.method48(var2), var1);
		if (!field562) {
			var3.method133();
			var3.method134(var2);
			var3.field519 = null;
			var3.field518 = null;
		}

		if (field554.field1024 != 128 || field554.field1025 != 128) {
			var3.method142(field554.field1024, field554.field1024, field554.field1025);
		}

		if (field554.field1026 != 0) {
			if (field554.field1026 == 90) {
				var3.method137();
			}

			if (field554.field1026 == 180) {
				var3.method137();
				var3.method137();
			}

			if (field554.field1026 == 270) {
				var3.method137();
				var3.method137();
				var3.method137();
			}
		}

		var3.method143(field554.field1027 + 64, field554.field1028 + 850, -30, -50, -30, true);
		return var3;
	}
}
