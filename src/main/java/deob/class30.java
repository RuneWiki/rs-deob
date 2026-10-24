package deob;

@ObfuscatedName("db")
public final class class30 extends class24 {

	@ObfuscatedName("db.n")
	public class68 field452;

	@ObfuscatedName("db.o")
	public int field453;

	@ObfuscatedName("db.p")
	public int field454;

	@ObfuscatedName("db.q")
	public int field455;

	@ObfuscatedName("db.r")
	public int field456;

	@ObfuscatedName("db.s")
	public int field457;

	@ObfuscatedName("db.t")
	public int field458;

	@ObfuscatedName("db.u")
	public int field459;

	@ObfuscatedName("db.v")
	public int field460;

	@ObfuscatedName("db.w")
	public int field461;

	@ObfuscatedName("db.x")
	public int field462;

	@ObfuscatedName("db.y")
	public boolean field463 = false;

	@ObfuscatedName("db.z")
	public double field464;

	@ObfuscatedName("db.A")
	public double field465;

	@ObfuscatedName("db.B")
	public double field466;

	@ObfuscatedName("db.C")
	public double field467;

	@ObfuscatedName("db.D")
	public double field468;

	@ObfuscatedName("db.E")
	public double field469;

	@ObfuscatedName("db.F")
	public double field470;

	@ObfuscatedName("db.G")
	public double field471;

	@ObfuscatedName("db.H")
	public int field472;

	@ObfuscatedName("db.I")
	public int field473;

	@ObfuscatedName("db.J")
	public int field474;

	@ObfuscatedName("db.K")
	public int field475;

	public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field452 = class68.field1001[arg6];
		field453 = arg9;
		field454 = arg10;
		field455 = arg0;
		field456 = arg4;
		field458 = arg8;
		field459 = arg5;
		field460 = arg1;
		field461 = arg7;
		field462 = arg3;
		field457 = arg2;
		field463 = false;
	}

	@ObfuscatedName("db.a(IIIII)V")
	public final void method119(int arg0, int arg1, int arg2, int arg3) {
		if (!field463) {
			double var5 = (double) (arg3 - field454);
			double var7 = (double) (arg2 - field455);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field464 = field461 * var5 / var9 + field454;
			field465 = field461 * var7 / var9 + field455;
			field466 = field456;
		}

		double var11 = (double) (field459 + 1 - arg1);
		field467 = (arg3 - field464) / var11;
		field468 = (arg2 - field465) / var11;
		field469 = Math.sqrt(field468 * field468 + field467 * field467);
		if (!field463) {
			field470 = -field469 * Math.tan(field460 * 0.02454369D);
		}

		field471 = (arg0 - field466 - field470 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("db.a(II)V")
	public final void method120(int arg0) {
		field463 = true;
		field464 += arg0 * field467;
		field465 += arg0 * field468;
		field466 += field471 * 0.5D * arg0 * arg0 + arg0 * field470;
		field470 += arg0 * field471;
		field472 = (int) (Math.atan2(field467, field468) * 325.949D) + 1024 & 0x7FF;
		field473 = (int) (Math.atan2(field470, field469) * 325.949D) & 0x7FF;

		if (field452.field1005 != null) {
			field475 += arg0;
			while (field475 > field452.field1005.method375(field474)) {
				field475 -= field452.field1005.method375(field474) + 1;
				field474++;
				if (field474 >= field452.field1005.field983) {
					field474 = 0;
				}
			}
		}
	}

	@ObfuscatedName("db.a(I)Leb;")
	public final class31 method109() {
		class31 var1 = field452.method379();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field452.field1005 != null) {
			var2 = field452.field1005.field984[field474];
		}

		class31 var3 = new class31(false, true, var1, class7.method48(var2));
		if (var2 != -1) {
			var3.method132();
			var3.method133(var2);
			var3.field514 = null;
			var3.field513 = null;
		}

		if (field452.field1008 != 128 || field452.field1009 != 128) {
			var3.method141(field452.field1008, field452.field1009, field452.field1008);
		}

		var3.method137(field473);
		var3.method142(field452.field1011 + 64, field452.field1012 + 850, -30, -50, -30, true);
		return var3;
	}
}
