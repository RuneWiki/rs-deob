package deob;

@ObfuscatedName("eb")
public final class class31 extends class25 {

	@ObfuscatedName("eb.o")
	public class66 field446;

	@ObfuscatedName("eb.p")
	public int field447;

	@ObfuscatedName("eb.q")
	public int field448;

	@ObfuscatedName("eb.r")
	public int field449;

	@ObfuscatedName("eb.s")
	public int field450;

	@ObfuscatedName("eb.t")
	public int field451;

	@ObfuscatedName("eb.u")
	public int field452;

	@ObfuscatedName("eb.v")
	public int field453;

	@ObfuscatedName("eb.w")
	public int field454;

	@ObfuscatedName("eb.x")
	public int field455;

	@ObfuscatedName("eb.y")
	public int field456;

	@ObfuscatedName("eb.z")
	public boolean field457 = false;

	@ObfuscatedName("eb.A")
	public double field458;

	@ObfuscatedName("eb.B")
	public double field459;

	@ObfuscatedName("eb.C")
	public double field460;

	@ObfuscatedName("eb.D")
	public double field461;

	@ObfuscatedName("eb.E")
	public double field462;

	@ObfuscatedName("eb.F")
	public double field463;

	@ObfuscatedName("eb.G")
	public double field464;

	@ObfuscatedName("eb.H")
	public double field465;

	@ObfuscatedName("eb.I")
	public int field466;

	@ObfuscatedName("eb.J")
	public int field467;

	@ObfuscatedName("eb.K")
	public int field468;

	@ObfuscatedName("eb.L")
	public int field469;

	public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field446 = class66.field956[arg8];
		field447 = arg7;
		field448 = arg5;
		field449 = arg4;
		field450 = arg9;
		field452 = arg2;
		field453 = arg6;
		field454 = arg3;
		field455 = arg1;
		field456 = arg0;
		field451 = arg10;
		field457 = false;
	}

	@ObfuscatedName("eb.a(IIIII)V")
	public final void method129(int arg0, int arg1, int arg2, int arg3) {
		if (!field457) {
			double var5 = (double) (arg0 - field448);
			double var7 = (double) (arg3 - field449);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field458 = field455 * var5 / var9 + field448;
			field459 = field455 * var7 / var9 + field449;
			field460 = field450;
		}

		double var11 = (double) (field453 + 1 - arg1);
		field461 = (arg0 - field458) / var11;
		field462 = (arg3 - field459) / var11;
		field463 = Math.sqrt(field462 * field462 + field461 * field461);
		if (!field457) {
			field464 = -field463 * Math.tan(field454 * 0.02454369D);
		}

		field465 = (arg2 - field460 - field464 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("eb.a(II)V")
	public final void method130(int arg0) {
		field457 = true;
		field458 += arg0 * field461;
		field459 += arg0 * field462;
		field460 += field465 * 0.5D * arg0 * arg0 + arg0 * field464;
		field464 += arg0 * field465;
		field466 = (int) (Math.atan2(field461, field462) * 325.949D) + 1024 & 0x7FF;
		field467 = (int) (Math.atan2(field464, field463) * 325.949D) & 0x7FF;

		if (field446.field960 != null) {
			field469 += arg0;
			while (field469 > field446.field960.method369(field468)) {
				field469 -= field446.field960.method369(field468) + 1;
				field468++;
				if (field468 >= field446.field960.field944) {
					field468 = 0;
				}
			}
		}
	}

	@ObfuscatedName("eb.a(I)Lfb;")
	public final class32 method121() {
		class32 var1 = field446.method373();
		if (var1 == null) {
			return null;
		}

		class32 var2 = new class32(true, !field446.field961, false, var1);
		if (field446.field960 != null) {
			var2.method142();
			var2.method143(field446.field960.field945[field468]);
			var2.field508 = null;
			var2.field507 = null;
		}

		if (field446.field964 != 128 || field446.field965 != 128) {
			var2.method151(field446.field964, field446.field964, field446.field965);
		}

		var2.method147(field467);
		var2.method152(field446.field967 + 64, field446.field968 + 850, -30, -50, -30, true);
		return var2;
	}
}
