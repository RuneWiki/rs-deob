package deob;

@ObfuscatedName("gb")
public final class class33 extends class25 {

	@ObfuscatedName("gb.o")
	public class68 field555;

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
	public int field562;

	@ObfuscatedName("gb.w")
	public boolean field563 = false;

	public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field555 = class68.field999[arg1];
		field557 = arg2;
		field558 = arg5;
		field559 = arg6;
		field560 = arg3;
		field556 = arg0 + arg4;
		field563 = false;
	}

	@ObfuscatedName("gb.a(IZ)V")
	public final void method164(int arg0) {
		field562 += arg0;
		while (field562 > field555.field1003.method384(field561)) {
			field562 -= field555.field1003.method384(field561) + 1;
			field561++;
			if (field561 >= field555.field1003.field981 && (field561 < 0 || field561 >= field555.field1003.field981)) {
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

		int var2 = field555.field1003.field982[field561];
		class32 var3 = new class32(class8.method62(var2), var1, true, false);
		if (!field563) {
			var3.method146();
			var3.method147(var2);
			var3.field520 = null;
			var3.field519 = null;
		}

		if (field555.field1006 != 128 || field555.field1007 != 128) {
			var3.method155(field555.field1006, field555.field1006, field555.field1007);
		}

		if (field555.field1008 != 0) {
			if (field555.field1008 == 90) {
				var3.method150();
			}

			if (field555.field1008 == 180) {
				var3.method150();
				var3.method150();
			}

			if (field555.field1008 == 270) {
				var3.method150();
				var3.method150();
				var3.method150();
			}
		}

		var3.method156(field555.field1009 + 64, field555.field1010 + 850, -30, -50, -30, true);
		return var3;
	}
}
