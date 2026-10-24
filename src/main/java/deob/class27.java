package deob;

@ObfuscatedName("ab")
public final class class27 extends class23 {

	@ObfuscatedName("ab.g")
	public class63 field344;

	@ObfuscatedName("ab.h")
	public int field345;

	@ObfuscatedName("ab.i")
	public int field346;

	@ObfuscatedName("ab.j")
	public int field347;

	@ObfuscatedName("ab.k")
	public int field348;

	@ObfuscatedName("ab.l")
	public int field349;

	@ObfuscatedName("ab.m")
	public int field350;

	@ObfuscatedName("ab.n")
	public int field351;

	@ObfuscatedName("ab.o")
	public int field352;

	@ObfuscatedName("ab.p")
	public int field353;

	@ObfuscatedName("ab.q")
	public int field354;

	@ObfuscatedName("ab.r")
	public boolean field355 = false;

	@ObfuscatedName("ab.s")
	public double field356;

	@ObfuscatedName("ab.t")
	public double field357;

	@ObfuscatedName("ab.u")
	public double field358;

	@ObfuscatedName("ab.v")
	public double field359;

	@ObfuscatedName("ab.w")
	public double field360;

	@ObfuscatedName("ab.x")
	public double field361;

	@ObfuscatedName("ab.y")
	public double field362;

	@ObfuscatedName("ab.z")
	public double field363;

	@ObfuscatedName("ab.A")
	public int field364;

	@ObfuscatedName("ab.B")
	public int field365;

	@ObfuscatedName("ab.C")
	public int field366;

	@ObfuscatedName("ab.D")
	public int field367;

	public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field344 = class63.field914[arg9];
		field345 = arg3;
		field346 = arg10;
		field347 = arg5;
		field348 = arg7;
		field350 = arg0;
		field351 = arg6;
		field352 = arg2;
		field353 = arg8;
		field354 = arg1;
		field349 = arg4;
		field355 = false;
	}

	@ObfuscatedName("ab.a(IIIII)V")
	public final void method117(int arg0, int arg1, int arg2, int arg3) {
		if (!field355) {
			double var5 = (double) (arg3 - field346);
			double var7 = (double) (arg0 - field347);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field356 = field353 * var5 / var9 + field346;
			field357 = field353 * var7 / var9 + field347;
			field358 = field348;
		}

		double var11 = (double) (field351 + 1 - arg1);
		field359 = (arg3 - field356) / var11;
		field360 = (arg0 - field357) / var11;
		field361 = Math.sqrt(field360 * field360 + field359 * field359);
		if (!field355) {
			field362 = -field361 * Math.tan(field352 * 0.02454369D);
		}

		field363 = (arg2 - field358 - field362 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("ab.a(II)V")
	public final void method118(int arg0) {
		field355 = true;
		field356 += arg0 * field359;
		field357 += arg0 * field360;
		field358 += field363 * 0.5D * arg0 * arg0 + arg0 * field362;
		field362 += arg0 * field363;
		field364 = (int) (Math.atan2(field359, field360) * 325.949D) + 1024 & 0x7FF;
		field365 = (int) (Math.atan2(field362, field361) * 325.949D) & 0x7FF;

		if (field344.field918 != null) {
			field367 += arg0;
			while (field367 > field344.field918.field905[field366]) {
				field367 -= field344.field918.field905[field366] + 1;
				field366++;
				if (field366 >= field344.field918.field902) {
					field366 = 0;
				}
			}
		}
	}

	@ObfuscatedName("ab.a(I)Leb;")
	public final class31 method109() {
		class31 var1 = field344.method330();
		class31 var2 = new class31(var1, false, !field344.field919, true);
		if (field344.field918 != null) {
			var2.method127();
			var2.method128(field344.field918.field903[field366]);
			var2.field435 = null;
			var2.field434 = null;
		}

		if (field344.field922 != 128 || field344.field923 != 128) {
			var2.method136(field344.field922, field344.field922, field344.field923);
		}

		var2.method132(field365);
		var2.method137(field344.field925 + 64, field344.field926 + 850, -30, -50, -30, true);
		return var2;
	}
}
