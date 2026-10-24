package deob;

@ObfuscatedName("ab")
public final class class27 extends class23 {

	@ObfuscatedName("ab.f")
	public class63 field343;

	@ObfuscatedName("ab.g")
	public int field344;

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
	public boolean field354 = false;

	@ObfuscatedName("ab.r")
	public double field355;

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
	public int field363;

	@ObfuscatedName("ab.A")
	public int field364;

	@ObfuscatedName("ab.B")
	public int field365;

	@ObfuscatedName("ab.C")
	public int field366;

	public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field343 = class63.field914[arg8];
		field344 = arg4;
		field345 = arg9;
		field346 = arg7;
		field347 = arg1;
		field349 = arg3;
		field350 = arg0;
		field351 = arg6;
		field352 = arg2;
		field353 = arg5;
		field348 = arg10;
		field354 = false;
	}

	@ObfuscatedName("ab.a(IIIII)V")
	public final void method116(int arg0, int arg1, int arg2, int arg3) {
		if (!field354) {
			double var5 = (double) (arg0 - field345);
			double var7 = (double) (arg2 - field346);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field355 = field352 * var5 / var9 + field345;
			field356 = field352 * var7 / var9 + field346;
			field357 = field347;
		}

		double var11 = (double) (field350 + 1 - arg3);
		field358 = (arg0 - field355) / var11;
		field359 = (arg2 - field356) / var11;
		field360 = Math.sqrt(field359 * field359 + field358 * field358);
		if (!field354) {
			field361 = -field360 * Math.tan(field351 * 0.02454369D);
		}

		field362 = (arg1 - field357 - field361 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("ab.a(II)V")
	public final void method117(int arg0) {
		field354 = true;
		field355 += arg0 * field358;
		field356 += arg0 * field359;
		field357 += field362 * 0.5D * arg0 * arg0 + arg0 * field361;
		field361 += arg0 * field362;
		field363 = (int) (Math.atan2(field358, field359) * 325.949D) + 1024 & 0x7FF;
		field364 = (int) (Math.atan2(field361, field360) * 325.949D) & 0x7FF;

		if (field343.field917 != null) {
			field366 += arg0;
			while (field366 > field343.field917.field905[field365]) {
				field366 -= field343.field917.field905[field365] + 1;
				field365++;
				if (field365 >= field343.field917.field902) {
					field365 = 0;
				}
			}
		}
	}

	@ObfuscatedName("ab.a(I)Leb;")
	public final class31 method108() {
		class31 var1 = field343.method322();
		class31 var2 = new class31(!field343.field918, false, var1, true);
		if (field343.field917 != null) {
			var2.method126();
			var2.method127(field343.field917.field903[field365]);
			var2.field435 = null;
			var2.field434 = null;
		}

		var2.method131(field364);
		var2.method136(field343.field924 + 64, field343.field925 + 850, -30, -50, -30, true);
		return var2;
	}
}
