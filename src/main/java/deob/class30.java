package deob;

@ObfuscatedName("db")
public final class class30 extends class24 {

	@ObfuscatedName("db.m")
	public class68 field457;

	@ObfuscatedName("db.n")
	public int field458;

	@ObfuscatedName("db.o")
	public int field459;

	@ObfuscatedName("db.p")
	public int field460;

	@ObfuscatedName("db.q")
	public int field461;

	@ObfuscatedName("db.r")
	public int field462;

	@ObfuscatedName("db.s")
	public int field463;

	@ObfuscatedName("db.t")
	public int field464;

	@ObfuscatedName("db.u")
	public int field465;

	@ObfuscatedName("db.v")
	public int field466;

	@ObfuscatedName("db.w")
	public int field467;

	@ObfuscatedName("db.x")
	public boolean field468 = false;

	@ObfuscatedName("db.y")
	public double field469;

	@ObfuscatedName("db.z")
	public double field470;

	@ObfuscatedName("db.A")
	public double field471;

	@ObfuscatedName("db.B")
	public double field472;

	@ObfuscatedName("db.C")
	public double field473;

	@ObfuscatedName("db.D")
	public double field474;

	@ObfuscatedName("db.E")
	public double field475;

	@ObfuscatedName("db.F")
	public double field476;

	@ObfuscatedName("db.G")
	public int field477;

	@ObfuscatedName("db.H")
	public int field478;

	@ObfuscatedName("db.I")
	public int field479;

	@ObfuscatedName("db.J")
	public int field480;

	public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field457 = class68.field1016[arg2];
		field458 = arg9;
		field459 = arg7;
		field460 = arg1;
		field461 = arg0;
		field463 = arg10;
		field464 = arg3;
		field465 = arg5;
		field466 = arg6;
		field467 = arg4;
		field462 = arg8;
		field468 = false;
	}

	@ObfuscatedName("db.a(IIZII)V")
	public final void method120(int arg0, int arg1, int arg2, int arg3) {
		if (!field468) {
			double var5 = (double) (arg3 - field459);
			double var7 = (double) (arg0 - field460);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field469 = field466 * var5 / var9 + field459;
			field470 = field466 * var7 / var9 + field460;
			field471 = field461;
		}

		double var11 = (double) (field464 + 1 - arg1);
		field472 = (arg3 - field469) / var11;
		field473 = (arg0 - field470) / var11;
		field474 = Math.sqrt(field473 * field473 + field472 * field472);
		if (!field468) {
			field475 = -field474 * Math.tan(field465 * 0.02454369D);
		}

		field476 = (arg2 - field471 - field475 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("db.a(II)V")
	public final void method121(int arg0) {
		field468 = true;
		field469 += arg0 * field472;
		field470 += arg0 * field473;
		field471 += field476 * 0.5D * arg0 * arg0 + arg0 * field475;
		field475 += arg0 * field476;
		field477 = (int) (Math.atan2(field472, field473) * 325.949D) + 1024 & 0x7FF;
		field478 = (int) (Math.atan2(field475, field474) * 325.949D) & 0x7FF;

		if (field457.field1020 != null) {
			field480 += arg0;
			while (field480 > field457.field1020.method382(field479)) {
				field480 -= field457.field1020.method382(field479) + 1;
				field479++;
				if (field479 >= field457.field1020.field997) {
					field479 = 0;
				}
			}
		}
	}

	@ObfuscatedName("db.a(I)Leb;")
	public final class31 method109() {
		class31 var1 = field457.method386();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field457.field1020 != null) {
			var2 = field457.field1020.field998[field479];
		}

		class31 var3 = new class31(class7.method48(var2), false, true, var1);
		if (var2 != -1) {
			var3.method133();
			var3.method134(var2);
			var3.field519 = null;
			var3.field518 = null;
		}

		if (field457.field1023 != 128 || field457.field1024 != 128) {
			var3.method142(field457.field1023, field457.field1023, field457.field1024);
		}

		var3.method138(field478);
		var3.method143(field457.field1026 + 64, field457.field1027 + 850, -30, -50, -30, true);
		return var3;
	}
}
