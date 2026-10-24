package deob;

@ObfuscatedName("eb")
public final class class31 extends class25 {

	@ObfuscatedName("eb.o")
	public class68 field458;

	@ObfuscatedName("eb.p")
	public int field459;

	@ObfuscatedName("eb.q")
	public int field460;

	@ObfuscatedName("eb.r")
	public int field461;

	@ObfuscatedName("eb.s")
	public int field462;

	@ObfuscatedName("eb.t")
	public int field463;

	@ObfuscatedName("eb.u")
	public int field464;

	@ObfuscatedName("eb.v")
	public int field465;

	@ObfuscatedName("eb.w")
	public int field466;

	@ObfuscatedName("eb.x")
	public int field467;

	@ObfuscatedName("eb.y")
	public int field468;

	@ObfuscatedName("eb.z")
	public boolean field469 = false;

	@ObfuscatedName("eb.A")
	public double field470;

	@ObfuscatedName("eb.B")
	public double field471;

	@ObfuscatedName("eb.C")
	public double field472;

	@ObfuscatedName("eb.D")
	public double field473;

	@ObfuscatedName("eb.E")
	public double field474;

	@ObfuscatedName("eb.F")
	public double field475;

	@ObfuscatedName("eb.G")
	public double field476;

	@ObfuscatedName("eb.H")
	public double field477;

	@ObfuscatedName("eb.I")
	public int field478;

	@ObfuscatedName("eb.J")
	public int field479;

	@ObfuscatedName("eb.K")
	public int field480;

	@ObfuscatedName("eb.L")
	public int field481;

	public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field458 = class68.field999[arg8];
		field459 = arg9;
		field460 = arg2;
		field461 = arg1;
		field462 = arg6;
		field464 = arg4;
		field465 = arg10;
		field466 = arg3;
		field467 = arg7;
		field468 = arg0;
		field463 = arg5;
		field469 = false;
	}

	@ObfuscatedName("eb.a(IIIIB)V")
	public final void method133(int arg0, int arg1, int arg2, int arg3) {
		if (!field469) {
			double var5 = (double) (arg0 - field460);
			double var7 = (double) (arg3 - field461);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field470 = field467 * var5 / var9 + field460;
			field471 = field467 * var7 / var9 + field461;
			field472 = field462;
		}

		double var11 = (double) (field465 + 1 - arg1);
		field473 = (arg0 - field470) / var11;
		field474 = (arg3 - field471) / var11;
		field475 = Math.sqrt(field474 * field474 + field473 * field473);
		if (!field469) {
			field476 = -field475 * Math.tan(field466 * 0.02454369D);
		}

		field477 = (arg2 - field472 - field476 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("eb.a(IB)V")
	public final void method134(int arg0) {
		field469 = true;
		field470 += arg0 * field473;
		field471 += arg0 * field474;
		field472 += field477 * 0.5D * arg0 * arg0 + arg0 * field476;
		field476 += arg0 * field477;
		field478 = (int) (Math.atan2(field473, field474) * 325.949D) + 1024 & 0x7FF;
		field479 = (int) (Math.atan2(field476, field475) * 325.949D) & 0x7FF;

		if (field458.field1003 != null) {
			field481 += arg0;
			while (field481 > field458.field1003.method384(field480)) {
				field481 -= field458.field1003.method384(field480) + 1;
				field480++;
				if (field480 >= field458.field1003.field981) {
					field480 = 0;
				}
			}
		}
	}

	@ObfuscatedName("eb.a(I)Lfb;")
	public final class32 method123() {
		class32 var1 = field458.method388();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field458.field1003 != null) {
			var2 = field458.field1003.field982[field480];
		}

		class32 var3 = new class32(class8.method62(var2), var1, true, false);
		if (var2 != -1) {
			var3.method146();
			var3.method147(var2);
			var3.field520 = null;
			var3.field519 = null;
		}

		if (field458.field1006 != 128 || field458.field1007 != 128) {
			var3.method155(field458.field1006, field458.field1006, field458.field1007);
		}

		var3.method151(field479);
		var3.method156(field458.field1009 + 64, field458.field1010 + 850, -30, -50, -30, true);
		return var3;
	}
}
