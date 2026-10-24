package deob;

@ObfuscatedName("gb")
public final class class33 extends class25 {

	@ObfuscatedName("gb.q")
	public class67 field552;

	@ObfuscatedName("gb.r")
	public int field553;

	@ObfuscatedName("gb.s")
	public int field554;

	@ObfuscatedName("gb.t")
	public int field555;

	@ObfuscatedName("gb.u")
	public int field556;

	@ObfuscatedName("gb.v")
	public int field557;

	@ObfuscatedName("gb.w")
	public int field558;

	@ObfuscatedName("gb.x")
	public int field559;

	@ObfuscatedName("gb.y")
	public boolean field560 = false;

	public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field552 = class67.field989[arg6];
		field554 = arg4;
		field555 = arg1;
		field556 = arg5;
		field557 = arg3;
		field553 = arg0 + arg2;
		field560 = false;
	}

	@ObfuscatedName("gb.a(IZ)V")
	public final void method163(int arg0) {
		field559 += arg0;
		while (field559 > field552.field993.method382(field558)) {
			field559 -= field552.field993.method382(field558) + 1;
			field558++;
			if (field558 >= field552.field993.field974 && (field558 < 0 || field558 >= field552.field993.field974)) {
				field558 = 0;
				field560 = true;
			}
		}
	}

	@ObfuscatedName("gb.a(Z)Lfb;")
	public final class32 method122() {
		class32 var1 = field552.method386();
		if (var1 == null) {
			return null;
		}

		class32 var2 = new class32(false, true, var1, !field552.field994);
		if (!field560) {
			var2.method145();
			var2.method146(field552.field993.field975[field558]);
			var2.field517 = null;
			var2.field516 = null;
		}

		if (field552.field997 != 128 || field552.field998 != 128) {
			var2.method154(field552.field997, field552.field997, field552.field998);
		}

		if (field552.field999 != 0) {
			if (field552.field999 == 90) {
				var2.method149();
			}

			if (field552.field999 == 180) {
				var2.method149();
				var2.method149();
			}

			if (field552.field999 == 270) {
				var2.method149();
				var2.method149();
				var2.method149();
			}
		}

		var2.method155(field552.field1000 + 64, field552.field1001 + 850, -30, -50, -30, true);
		return var2;
	}
}
