package deob;

@ObfuscatedName("db")
public final class class30 extends class24 {

	@ObfuscatedName("db.p")
	public class69 field451;

	@ObfuscatedName("db.q")
	public int field452;

	@ObfuscatedName("db.r")
	public int field453;

	@ObfuscatedName("db.s")
	public int field454;

	@ObfuscatedName("db.t")
	public int field455;

	@ObfuscatedName("db.u")
	public int field456;

	@ObfuscatedName("db.v")
	public int field457;

	@ObfuscatedName("db.w")
	public int field458;

	@ObfuscatedName("db.x")
	public int field459;

	@ObfuscatedName("db.y")
	public int field460;

	@ObfuscatedName("db.z")
	public int field461;

	@ObfuscatedName("db.A")
	public boolean field462 = false;

	@ObfuscatedName("db.B")
	public double field463;

	@ObfuscatedName("db.C")
	public double field464;

	@ObfuscatedName("db.D")
	public double field465;

	@ObfuscatedName("db.E")
	public double field466;

	@ObfuscatedName("db.F")
	public double field467;

	@ObfuscatedName("db.G")
	public double field468;

	@ObfuscatedName("db.H")
	public double field469;

	@ObfuscatedName("db.I")
	public double field470;

	@ObfuscatedName("db.J")
	public int field471;

	@ObfuscatedName("db.K")
	public int field472;

	@ObfuscatedName("db.L")
	public int field473;

	@ObfuscatedName("db.M")
	public int field474;

	public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field451 = class69.field1010[arg0];
		field452 = arg5;
		field453 = arg9;
		field454 = arg3;
		field455 = arg4;
		field457 = arg1;
		field458 = arg8;
		field459 = arg6;
		field460 = arg10;
		field461 = arg2;
		field456 = arg7;
		field462 = false;
	}

	@ObfuscatedName("db.a(IIIII)V")
	public final void method119(int arg0, int arg1, int arg2, int arg3) {
		if (!field462) {
			double var5 = (double) (arg0 - field453);
			double var7 = (double) (arg2 - field454);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field463 = field460 * var5 / var9 + field453;
			field464 = field460 * var7 / var9 + field454;
			field465 = field455;
		}

		double var11 = (double) (field458 + 1 - arg3);
		field466 = (arg0 - field463) / var11;
		field467 = (arg2 - field464) / var11;
		field468 = Math.sqrt(field467 * field467 + field466 * field466);
		if (!field462) {
			field469 = -field468 * Math.tan(field459 * 0.02454369D);
		}

		field470 = (arg1 - field465 - field469 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("db.a(ZI)V")
	public final void method120(int arg0) {
		field462 = true;
		field463 += arg0 * field466;
		field464 += arg0 * field467;
		field465 += field470 * 0.5D * arg0 * arg0 + arg0 * field469;
		field469 += arg0 * field470;
		field471 = (int) (Math.atan2(field466, field467) * 325.949D) + 1024 & 0x7FF;
		field472 = (int) (Math.atan2(field469, field468) * 325.949D) & 0x7FF;

		if (field451.field1014 != null) {
			field474 += arg0;
			while (field474 > field451.field1014.method379(field473)) {
				field474 -= field451.field1014.method379(field473) + 1;
				field473++;
				if (field473 >= field451.field1014.field992) {
					field473 = 0;
				}
			}
		}
	}

	@ObfuscatedName("db.a(I)Leb;")
	public final class31 method109() {
		class31 var1 = field451.method383();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field451.field1014 != null) {
			var2 = field451.field1014.field993[field473];
		}

		class31 var3 = new class31(false, var1, true, class7.method48(var2));
		if (var2 != -1) {
			var3.method132();
			var3.method133(var2);
			var3.field513 = null;
			var3.field512 = null;
		}

		if (field451.field1017 != 128 || field451.field1018 != 128) {
			var3.method141(field451.field1017, field451.field1017, field451.field1018);
		}

		var3.method137(field472);
		var3.method142(field451.field1020 + 64, field451.field1021 + 850, -30, -50, -30, true);
		return var3;
	}
}
