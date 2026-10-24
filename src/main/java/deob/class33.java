package deob;

@ObfuscatedName("gb")
public final class class33 extends class25 {

	@ObfuscatedName("gb.m")
	public class67 field554;

	@ObfuscatedName("gb.n")
	public int field555;

	@ObfuscatedName("gb.o")
	public int field556;

	@ObfuscatedName("gb.p")
	public int field557;

	@ObfuscatedName("gb.q")
	public int field558;

	@ObfuscatedName("gb.r")
	public int field559;

	@ObfuscatedName("gb.s")
	public int field560;

	@ObfuscatedName("gb.t")
	public int field561;

	@ObfuscatedName("gb.u")
	public boolean field562 = false;

	public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field554 = class67.field994[arg4];
		field556 = arg0;
		field557 = arg5;
		field558 = arg2;
		field559 = arg3;
		field555 = arg1 + arg6;
		field562 = false;
	}

	@ObfuscatedName("gb.a(IZ)V")
	public final void method163(int arg0) {
		field561 += arg0;
		while (field561 > field554.field998.method382(field560)) {
			field561 -= field554.field998.method382(field560) + 1;
			field560++;
			if (field560 >= field554.field998.field979 && (field560 < 0 || field560 >= field554.field998.field979)) {
				field560 = 0;
				field562 = true;
			}
		}
	}

	@ObfuscatedName("gb.a(I)Lfb;")
	public final class32 method122() {
		class32 var1 = field554.method386();
		if (var1 == null) {
			return null;
		}

		class32 var2 = new class32(true, var1, false, !field554.field999);
		if (!field562) {
			var2.method145();
			var2.method146(field554.field998.field980[field560]);
			var2.field519 = null;
			var2.field518 = null;
		}

		if (field554.field1002 != 128 || field554.field1003 != 128) {
			var2.method154(field554.field1002, field554.field1002, field554.field1003);
		}

		if (field554.field1004 != 0) {
			if (field554.field1004 == 90) {
				var2.method149();
			}

			if (field554.field1004 == 180) {
				var2.method149();
				var2.method149();
			}

			if (field554.field1004 == 270) {
				var2.method149();
				var2.method149();
				var2.method149();
			}
		}

		var2.method155(field554.field1005 + 64, field554.field1006 + 850, -30, -50, -30, true);
		return var2;
	}
}
