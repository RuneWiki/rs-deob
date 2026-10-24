package deob;

@ObfuscatedName("db")
public final class class30 extends class24 {

	@ObfuscatedName("db.s")
	public class68 field453;

	@ObfuscatedName("db.t")
	public int field454;

	@ObfuscatedName("db.u")
	public int field455;

	@ObfuscatedName("db.v")
	public int field456;

	@ObfuscatedName("db.w")
	public int field457;

	@ObfuscatedName("db.x")
	public int field458;

	@ObfuscatedName("db.y")
	public int field459;

	@ObfuscatedName("db.z")
	public int field460;

	@ObfuscatedName("db.D")
	public boolean field464 = false;

	@ObfuscatedName("db.A")
	public int field461;

	@ObfuscatedName("db.B")
	public int field462;

	@ObfuscatedName("db.C")
	public int field463;

	@ObfuscatedName("db.E")
	public double field465;

	@ObfuscatedName("db.F")
	public double field466;

	@ObfuscatedName("db.G")
	public double field467;

	@ObfuscatedName("db.H")
	public double field468;

	@ObfuscatedName("db.I")
	public double field469;

	@ObfuscatedName("db.J")
	public double field470;

	@ObfuscatedName("db.K")
	public double field471;

	@ObfuscatedName("db.L")
	public double field472;

	@ObfuscatedName("db.M")
	public int field473;

	@ObfuscatedName("db.N")
	public int field474;

	@ObfuscatedName("db.O")
	public int field475;

	@ObfuscatedName("db.P")
	public int field476;

	public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field453 = class68.field1005[arg9];
		field454 = arg10;
		field455 = arg6;
		field456 = arg2;
		field457 = arg4;
		field459 = arg0;
		field460 = arg7;
		field461 = arg1;
		field462 = arg5;
		field463 = arg8;
		field458 = arg3;
		field464 = false;
	}

	@ObfuscatedName("db.a(IIIII)V")
	public final void method119(int arg0, int arg1, int arg2, int arg3) {
		if (!field464) {
			double var5 = (double) (arg1 - field455);
			double var7 = (double) (arg0 - field456);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field465 = field462 * var5 / var9 + field455;
			field466 = field462 * var7 / var9 + field456;
			field467 = field457;
		}

		double var11 = (double) (field460 + 1 - arg3);
		field468 = (arg1 - field465) / var11;
		field469 = (arg0 - field466) / var11;
		field470 = Math.sqrt(field469 * field469 + field468 * field468);
		if (!field464) {
			field471 = -field470 * Math.tan(field461 * 0.02454369D);
		}

		field472 = (arg2 - field467 - field471 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("db.a(II)V")
	public final void method120(int arg0) {
		field464 = true;
		field465 += arg0 * field468;
		field466 += arg0 * field469;
		field467 += field472 * 0.5D * arg0 * arg0 + arg0 * field471;
		field471 += arg0 * field472;
		field473 = (int) (Math.atan2(field468, field469) * 325.949D) + 1024 & 0x7FF;
		field474 = (int) (Math.atan2(field471, field470) * 325.949D) & 0x7FF;

		if (field453.field1009 != null) {
			field476 += arg0;
			while (field476 > field453.field1009.method376(field475)) {
				field476 -= field453.field1009.method376(field475) + 1;
				field475++;
				if (field475 >= field453.field1009.field986) {
					field475 = 0;
				}
			}
		}
	}

	@ObfuscatedName("db.a(Z)Leb;")
	public final class31 method109() {
		class31 var1 = field453.method380();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field453.field1009 != null) {
			var2 = field453.field1009.field987[field475];
		}

		class31 var3 = new class31(false, class7.method48(var2), true, var1);
		if (var2 != -1) {
			var3.method132();
			var3.method133(var2);
			var3.field515 = null;
			var3.field514 = null;
		}

		if (field453.field1012 != 128 || field453.field1013 != 128) {
			var3.method141(field453.field1012, field453.field1012, field453.field1013);
		}

		var3.method137(field474);
		var3.method142(field453.field1015 + 64, field453.field1016 + 850, -30, -50, -30, true);
		return var3;
	}
}
