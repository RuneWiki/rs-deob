package deob;

@ObfuscatedName("gb")
public final class class33 extends class25 {

	@ObfuscatedName("gb.n")
	public class68 field555;

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
	public int field562;

	@ObfuscatedName("gb.v")
	public boolean field563 = false;

	public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field555 = class68.field998[arg2];
		field557 = arg6;
		field558 = arg3;
		field559 = arg0;
		field560 = arg5;
		field556 = arg1 + arg4;
		field563 = false;
	}

	@ObfuscatedName("gb.a(II)V")
	public final void method164(int arg0) {
		field562 += arg0;
		while (field562 > field555.field1002.method384(field561)) {
			field562 -= field555.field1002.method384(field561) + 1;
			field561++;
			if (field561 >= field555.field1002.field980 && (field561 < 0 || field561 >= field555.field1002.field980)) {
				field561 = 0;
				field563 = true;
			}
		}
	}

	@ObfuscatedName("gb.a(I)Lfb;")
	public final class32 method123() {
		class32 var1 = field555.method388();
		if (var1 == null) {
			return null;
		}

		int var2 = field555.field1002.field981[field561];
		class32 var3 = new class32(class8.method62(var2), true, var1, false);
		if (!field563) {
			var3.method146();
			var3.method147(var2);
			var3.field520 = null;
			var3.field519 = null;
		}

		if (field555.field1005 != 128 || field555.field1006 != 128) {
			var3.method155(field555.field1005, field555.field1006, field555.field1005);
		}

		if (field555.field1007 != 0) {
			if (field555.field1007 == 90) {
				var3.method150();
			}

			if (field555.field1007 == 180) {
				var3.method150();
				var3.method150();
			}

			if (field555.field1007 == 270) {
				var3.method150();
				var3.method150();
				var3.method150();
			}
		}

		var3.method156(field555.field1008 + 64, field555.field1009 + 850, -30, -50, -30, true);
		return var3;
	}
}
