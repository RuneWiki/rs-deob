package deob;

@ObfuscatedName("eb")
public final class class31 extends class25 {

	@ObfuscatedName("eb.m")
	public class66 field446;

	@ObfuscatedName("eb.n")
	public int field447;

	@ObfuscatedName("eb.o")
	public int field448;

	@ObfuscatedName("eb.p")
	public int field449;

	@ObfuscatedName("eb.q")
	public int field450;

	@ObfuscatedName("eb.r")
	public int field451;

	@ObfuscatedName("eb.s")
	public int field452;

	@ObfuscatedName("eb.t")
	public int field453;

	@ObfuscatedName("eb.u")
	public int field454;

	@ObfuscatedName("eb.v")
	public int field455;

	@ObfuscatedName("eb.w")
	public int field456;

	@ObfuscatedName("eb.x")
	public boolean field457 = false;

	@ObfuscatedName("eb.y")
	public double field458;

	@ObfuscatedName("eb.z")
	public double field459;

	@ObfuscatedName("eb.A")
	public double field460;

	@ObfuscatedName("eb.B")
	public double field461;

	@ObfuscatedName("eb.C")
	public double field462;

	@ObfuscatedName("eb.D")
	public double field463;

	@ObfuscatedName("eb.E")
	public double field464;

	@ObfuscatedName("eb.F")
	public double field465;

	@ObfuscatedName("eb.G")
	public int field466;

	@ObfuscatedName("eb.H")
	public int field467;

	@ObfuscatedName("eb.I")
	public int field468;

	@ObfuscatedName("eb.J")
	public int field469;

	public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field446 = class66.field959[arg3];
		field447 = arg9;
		field448 = arg2;
		field449 = arg6;
		field450 = arg5;
		field452 = arg7;
		field453 = arg0;
		field454 = arg8;
		field455 = arg4;
		field456 = arg10;
		field451 = arg1;
		field457 = false;
	}

	@ObfuscatedName("eb.a(IBIII)V")
	public final void method129(int arg0, int arg1, int arg2, int arg3) {
		if (!field457) {
			double var5 = (double) (arg3 - field448);
			double var7 = (double) (arg1 - field449);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field458 = field455 * var5 / var9 + field448;
			field459 = field455 * var7 / var9 + field449;
			field460 = field450;
		}

		double var11 = (double) (field453 + 1 - arg2);
		field461 = (arg3 - field458) / var11;
		field462 = (arg1 - field459) / var11;
		field463 = Math.sqrt(field462 * field462 + field461 * field461);
		if (!field457) {
			field464 = -field463 * Math.tan(field454 * 0.02454369D);
		}

		field465 = (arg0 - field460 - field464 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("eb.a(ZI)V")
	public final void method130(int arg0) {
		field457 = true;
		field458 += arg0 * field461;
		field459 += arg0 * field462;
		field460 += field465 * 0.5D * arg0 * arg0 + arg0 * field464;
		field464 += arg0 * field465;
		field466 = (int) (Math.atan2(field461, field462) * 325.949D) + 1024 & 0x7FF;
		field467 = (int) (Math.atan2(field464, field463) * 325.949D) & 0x7FF;

		if (field446.field963 != null) {
			field469 += arg0;
			while (field469 > field446.field963.method373(field468)) {
				field469 -= field446.field963.method373(field468) + 1;
				field468++;
				if (field468 >= field446.field963.field947) {
					field468 = 0;
				}
			}
		}
	}

	@ObfuscatedName("eb.a(Z)Lfb;")
	public final class32 method121() {
		class32 var1 = field446.method377();
		if (var1 == null) {
			return null;
		}

		class32 var2 = new class32(true, false, var1, !field446.field964);
		if (field446.field963 != null) {
			var2.method142();
			var2.method143(field446.field963.field948[field468]);
			var2.field508 = null;
			var2.field507 = null;
		}

		if (field446.field967 != 128 || field446.field968 != 128) {
			var2.method151(field446.field968, field446.field967, field446.field967);
		}

		var2.method147(field467);
		var2.method152(field446.field970 + 64, field446.field971 + 850, -30, -50, -30, true);
		return var2;
	}
}
