package deob;

@ObfuscatedName("db")
public final class class30 extends class24 {

	@ObfuscatedName("db.p")
	public class68 field457;

	@ObfuscatedName("db.q")
	public int field458;

	@ObfuscatedName("db.r")
	public int field459;

	@ObfuscatedName("db.s")
	public int field460;

	@ObfuscatedName("db.t")
	public int field461;

	@ObfuscatedName("db.u")
	public int field462;

	@ObfuscatedName("db.v")
	public int field463;

	@ObfuscatedName("db.w")
	public int field464;

	@ObfuscatedName("db.x")
	public int field465;

	@ObfuscatedName("db.y")
	public int field466;

	@ObfuscatedName("db.z")
	public int field467;

	@ObfuscatedName("db.A")
	public boolean field468 = false;

	@ObfuscatedName("db.B")
	public double field469;

	@ObfuscatedName("db.C")
	public double field470;

	@ObfuscatedName("db.D")
	public double field471;

	@ObfuscatedName("db.E")
	public double field472;

	@ObfuscatedName("db.F")
	public double field473;

	@ObfuscatedName("db.G")
	public double field474;

	@ObfuscatedName("db.H")
	public double field475;

	@ObfuscatedName("db.I")
	public double field476;

	@ObfuscatedName("db.J")
	public int field477;

	@ObfuscatedName("db.K")
	public int field478;

	@ObfuscatedName("db.L")
	public int field479;

	@ObfuscatedName("db.M")
	public int field480;

	public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field457 = class68.field1017[arg3];
		field458 = arg7;
		field459 = arg5;
		field460 = arg9;
		field461 = arg1;
		field463 = arg2;
		field464 = arg0;
		field465 = arg8;
		field466 = arg10;
		field467 = arg4;
		field462 = arg6;
		field468 = false;
	}

	@ObfuscatedName("db.a(IIIII)V")
	public final void method120(int arg0, int arg1, int arg2, int arg3) {
		if (!field468) {
			double var5 = (double) (arg2 - field459);
			double var7 = (double) (arg1 - field460);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field469 = field466 * var5 / var9 + field459;
			field470 = field466 * var7 / var9 + field460;
			field471 = field461;
		}

		double var11 = (double) (field464 + 1 - arg3);
		field472 = (arg2 - field469) / var11;
		field473 = (arg1 - field470) / var11;
		field474 = Math.sqrt(field473 * field473 + field472 * field472);
		if (!field468) {
			field475 = -field474 * Math.tan(field465 * 0.02454369D);
		}

		field476 = (arg0 - field471 - field475 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("db.a(ZI)V")
	public final void method121(int arg0) {
		field468 = true;
		field469 += arg0 * field472;
		field470 += arg0 * field473;
		field471 += field476 * 0.5D * arg0 * arg0 + arg0 * field475;
		field475 += arg0 * field476;
		field477 = (int) (Math.atan2(field472, field473) * 325.949D) + 1024 & 0x7FF;
		field478 = (int) (Math.atan2(field475, field474) * 325.949D) & 0x7FF;

		if (field457.field1021 != null) {
			field480 += arg0;
			while (field480 > field457.field1021.method382(field479)) {
				field480 -= field457.field1021.method382(field479) + 1;
				field479++;
				if (field479 >= field457.field1021.field998) {
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
		if (field457.field1021 != null) {
			var2 = field457.field1021.field999[field479];
		}

		class31 var3 = new class31(false, -16051, var1, class7.method48(var2), true);
		if (var2 != -1) {
			var3.method133();
			var3.method134(var2);
			var3.field520 = null;
			var3.field519 = null;
		}

		if (field457.field1024 != 128 || field457.field1025 != 128) {
			var3.method142(field457.field1024, field457.field1024, field457.field1025);
		}

		var3.method138(field478);
		var3.method143(field457.field1027 + 64, field457.field1028 + 850, -30, -50, -30, true);
		return var3;
	}
}
