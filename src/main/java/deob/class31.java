package deob;

@ObfuscatedName("eb")
public final class class31 extends class25 {

	@ObfuscatedName("eb.o")
	public class67 field457;

	@ObfuscatedName("eb.p")
	public int field458;

	@ObfuscatedName("eb.q")
	public int field459;

	@ObfuscatedName("eb.r")
	public int field460;

	@ObfuscatedName("eb.s")
	public int field461;

	@ObfuscatedName("eb.t")
	public int field462;

	@ObfuscatedName("eb.u")
	public int field463;

	@ObfuscatedName("eb.v")
	public int field464;

	@ObfuscatedName("eb.w")
	public int field465;

	@ObfuscatedName("eb.x")
	public int field466;

	@ObfuscatedName("eb.y")
	public int field467;

	@ObfuscatedName("eb.z")
	public boolean field468 = false;

	@ObfuscatedName("eb.A")
	public double field469;

	@ObfuscatedName("eb.B")
	public double field470;

	@ObfuscatedName("eb.C")
	public double field471;

	@ObfuscatedName("eb.D")
	public double field472;

	@ObfuscatedName("eb.E")
	public double field473;

	@ObfuscatedName("eb.F")
	public double field474;

	@ObfuscatedName("eb.G")
	public double field475;

	@ObfuscatedName("eb.H")
	public double field476;

	@ObfuscatedName("eb.I")
	public int field477;

	@ObfuscatedName("eb.J")
	public int field478;

	@ObfuscatedName("eb.K")
	public int field479;

	@ObfuscatedName("eb.L")
	public int field480;

	public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field457 = class67.field994[arg6];
		field458 = arg2;
		field459 = arg9;
		field460 = arg3;
		field461 = arg0;
		field463 = arg10;
		field464 = arg4;
		field465 = arg7;
		field466 = arg1;
		field467 = arg8;
		field462 = arg5;
		field468 = false;
	}

	@ObfuscatedName("eb.a(IIIBI)V")
	public final void method132(int arg0, int arg1, int arg2, int arg3) {
		if (!field468) {
			double var5 = (double) (arg0 - field459);
			double var7 = (double) (arg1 - field460);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field469 = field466 * var5 / var9 + field459;
			field470 = field466 * var7 / var9 + field460;
			field471 = field461;
		}

		double var11 = (double) (field464 + 1 - arg2);
		field472 = (arg0 - field469) / var11;
		field473 = (arg1 - field470) / var11;
		field474 = Math.sqrt(field473 * field473 + field472 * field472);
		if (!field468) {
			field475 = -field474 * Math.tan(field465 * 0.02454369D);
		}

		field476 = (arg3 - field471 - field475 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("eb.a(IB)V")
	public final void method133(int arg0) {
		field468 = true;
		field469 += arg0 * field472;
		field470 += arg0 * field473;
		field471 += field476 * 0.5D * arg0 * arg0 + arg0 * field475;
		field475 += arg0 * field476;
		field477 = (int) (Math.atan2(field472, field473) * 325.949D) + 1024 & 0x7FF;
		field478 = (int) (Math.atan2(field475, field474) * 325.949D) & 0x7FF;

		if (field457.field998 != null) {
			field480 += arg0;
			while (field480 > field457.field998.method382(field479)) {
				field480 -= field457.field998.method382(field479) + 1;
				field479++;
				if (field479 >= field457.field998.field979) {
					field479 = 0;
				}
			}
		}
	}

	@ObfuscatedName("eb.a(I)Lfb;")
	public final class32 method122() {
		class32 var1 = field457.method386();
		if (var1 == null) {
			return null;
		}

		class32 var2 = new class32(true, var1, false, !field457.field999);
		if (field457.field998 != null) {
			var2.method145();
			var2.method146(field457.field998.field980[field479]);
			var2.field519 = null;
			var2.field518 = null;
		}

		if (field457.field1002 != 128 || field457.field1003 != 128) {
			var2.method154(field457.field1002, field457.field1002, field457.field1003);
		}

		var2.method150(field478);
		var2.method155(field457.field1005 + 64, field457.field1006 + 850, -30, -50, -30, true);
		return var2;
	}
}
