package deob;

@ObfuscatedName("eb")
public final class class31 extends class25 {

	@ObfuscatedName("eb.n")
	public class67 field455;

	@ObfuscatedName("eb.o")
	public int field456;

	@ObfuscatedName("eb.p")
	public int field457;

	@ObfuscatedName("eb.q")
	public int field458;

	@ObfuscatedName("eb.r")
	public int field459;

	@ObfuscatedName("eb.s")
	public int field460;

	@ObfuscatedName("eb.t")
	public int field461;

	@ObfuscatedName("eb.u")
	public int field462;

	@ObfuscatedName("eb.v")
	public int field463;

	@ObfuscatedName("eb.w")
	public int field464;

	@ObfuscatedName("eb.x")
	public int field465;

	@ObfuscatedName("eb.y")
	public boolean field466 = false;

	@ObfuscatedName("eb.z")
	public double field467;

	@ObfuscatedName("eb.A")
	public double field468;

	@ObfuscatedName("eb.B")
	public double field469;

	@ObfuscatedName("eb.C")
	public double field470;

	@ObfuscatedName("eb.D")
	public double field471;

	@ObfuscatedName("eb.E")
	public double field472;

	@ObfuscatedName("eb.F")
	public double field473;

	@ObfuscatedName("eb.G")
	public double field474;

	@ObfuscatedName("eb.H")
	public int field475;

	@ObfuscatedName("eb.I")
	public int field476;

	@ObfuscatedName("eb.J")
	public int field477;

	@ObfuscatedName("eb.K")
	public int field478;

	public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field455 = class67.field989[arg6];
		field456 = arg1;
		field457 = arg10;
		field458 = arg4;
		field459 = arg3;
		field461 = arg7;
		field462 = arg5;
		field463 = arg2;
		field464 = arg9;
		field465 = arg8;
		field460 = arg0;
		field466 = false;
	}

	@ObfuscatedName("eb.a(IIIII)V")
	public final void method132(int arg0, int arg1, int arg2, int arg3) {
		if (!field466) {
			double var5 = (double) (arg3 - field457);
			double var7 = (double) (arg2 - field458);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field467 = field464 * var5 / var9 + field457;
			field468 = field464 * var7 / var9 + field458;
			field469 = field459;
		}

		double var11 = (double) (field462 + 1 - arg1);
		field470 = (arg3 - field467) / var11;
		field471 = (arg2 - field468) / var11;
		field472 = Math.sqrt(field471 * field471 + field470 * field470);
		if (!field466) {
			field473 = -field472 * Math.tan(field463 * 0.02454369D);
		}

		field474 = (arg0 - field469 - field473 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("eb.a(II)V")
	public final void method133(int arg0) {
		field466 = true;
		field467 += arg0 * field470;
		field468 += arg0 * field471;
		field469 += field474 * 0.5D * arg0 * arg0 + arg0 * field473;
		field473 += arg0 * field474;
		field475 = (int) (Math.atan2(field470, field471) * 325.949D) + 1024 & 0x7FF;
		field476 = (int) (Math.atan2(field473, field472) * 325.949D) & 0x7FF;

		if (field455.field993 != null) {
			field478 += arg0;
			while (field478 > field455.field993.method382(field477)) {
				field478 -= field455.field993.method382(field477) + 1;
				field477++;
				if (field477 >= field455.field993.field974) {
					field477 = 0;
				}
			}
		}
	}

	@ObfuscatedName("eb.a(Z)Lfb;")
	public final class32 method122() {
		class32 var1 = field455.method386();
		if (var1 == null) {
			return null;
		}

		class32 var2 = new class32(false, true, var1, !field455.field994);
		if (field455.field993 != null) {
			var2.method145();
			var2.method146(field455.field993.field975[field477]);
			var2.field517 = null;
			var2.field516 = null;
		}

		if (field455.field997 != 128 || field455.field998 != 128) {
			var2.method154(field455.field997, field455.field997, field455.field998);
		}

		var2.method150(field476);
		var2.method155(field455.field1000 + 64, field455.field1001 + 850, -30, -50, -30, true);
		return var2;
	}
}
