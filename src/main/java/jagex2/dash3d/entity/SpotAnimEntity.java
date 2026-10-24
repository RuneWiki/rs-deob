package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;
import jagex2.graphics.Model;

@ObfuscatedName("gb")
public final class SpotAnimEntity extends Entity {

	@ObfuscatedName("gb.m")
	public SpotAnimType field552;

	@ObfuscatedName("gb.n")
	public int field553;

	@ObfuscatedName("gb.o")
	public int field554;

	@ObfuscatedName("gb.p")
	public int field555;

	@ObfuscatedName("gb.q")
	public int field556;

	@ObfuscatedName("gb.r")
	public int field557;

	@ObfuscatedName("gb.s")
	public int field558;

	@ObfuscatedName("gb.t")
	public int field559;

	@ObfuscatedName("gb.u")
	public boolean field560 = false;

	public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field552 = SpotAnimType.field989[arg3];
		field554 = arg2;
		field555 = arg1;
		field556 = arg0;
		field557 = arg4;
		field553 = arg5 + arg6;
		field560 = false;
	}

	@ObfuscatedName("gb.a(II)V")
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

	@ObfuscatedName("gb.a(I)Lfb;")
	public final Model method122() {
		Model var1 = field552.method386();
		if (var1 == null) {
			return null;
		}

		Model var2 = new Model(var1, true, false, !field552.field994);
		if (!field560) {
			var2.method145();
			var2.method146(field552.field993.field975[field558]);
			var2.field517 = null;
			var2.field516 = null;
		}

		if (field552.field997 != 128 || field552.field998 != 128) {
			var2.method154(field552.field998, field552.field997, field552.field997);
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
