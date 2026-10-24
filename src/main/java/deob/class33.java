package deob;

@ObfuscatedName("gb")
public final class class33 extends class25 {

	@ObfuscatedName("gb.n")
	public class68 field554;

	@ObfuscatedName("gb.o")
	public int field555;

	@ObfuscatedName("gb.p")
	public int field556;

	@ObfuscatedName("gb.q")
	public int field557;

	@ObfuscatedName("gb.r")
	public int field558;

	@ObfuscatedName("gb.s")
	public int field559;

	@ObfuscatedName("gb.t")
	public int field560;

	@ObfuscatedName("gb.u")
	public int field561;

	@ObfuscatedName("gb.v")
	public boolean field562 = false;

	public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field554 = class68.field997[arg1];
		field556 = arg0;
		field557 = arg4;
		field558 = arg5;
		field559 = arg3;
		field555 = arg2 + arg6;
		field562 = false;
	}

	@ObfuscatedName("gb.a(II)V")
	public final void method164(int arg0) {
		field561 += arg0;
		while (field561 > field554.field1001.method384(field560)) {
			field561 -= field554.field1001.method384(field560) + 1;
			field560++;
			if (field560 >= field554.field1001.field979 && (field560 < 0 || field560 >= field554.field1001.field979)) {
				field560 = 0;
				field562 = true;
			}
		}
	}

	@ObfuscatedName("gb.a(B)Lfb;")
	public final class32 method123() {
		class32 var1 = field554.method388();
		if (var1 == null) {
			return null;
		}

		int var2 = field554.field1001.field980[field560];
		class32 var3 = new class32(class8.method62(var2), false, true, var1);
		if (!field562) {
			var3.method146();
			var3.method147(var2);
			var3.field519 = null;
			var3.field518 = null;
		}

		if (field554.field1004 != 128 || field554.field1005 != 128) {
			var3.method155(field554.field1004, field554.field1005, field554.field1004);
		}

		if (field554.field1006 != 0) {
			if (field554.field1006 == 90) {
				var3.method150();
			}

			if (field554.field1006 == 180) {
				var3.method150();
				var3.method150();
			}

			if (field554.field1006 == 270) {
				var3.method150();
				var3.method150();
				var3.method150();
			}
		}

		var3.method156(field554.field1007 + 64, field554.field1008 + 850, -30, -50, -30, true);
		return var3;
	}
}
