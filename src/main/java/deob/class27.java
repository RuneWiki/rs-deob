package deob;

@ObfuscatedName("ab")
public final class class27 extends class23 {

	@ObfuscatedName("ab.g")
	public class63 field342;

	@ObfuscatedName("ab.h")
	public int field343;

	@ObfuscatedName("ab.i")
	public int field344;

	@ObfuscatedName("ab.j")
	public int field345;

	@ObfuscatedName("ab.k")
	public int field346;

	@ObfuscatedName("ab.l")
	public int field347;

	@ObfuscatedName("ab.m")
	public int field348;

	@ObfuscatedName("ab.n")
	public int field349;

	@ObfuscatedName("ab.o")
	public int field350;

	@ObfuscatedName("ab.p")
	public int field351;

	@ObfuscatedName("ab.q")
	public int field352;

	@ObfuscatedName("ab.r")
	public boolean field353 = false;

	@ObfuscatedName("ab.s")
	public double field354;

	@ObfuscatedName("ab.t")
	public double field355;

	@ObfuscatedName("ab.u")
	public double field356;

	@ObfuscatedName("ab.v")
	public double field357;

	@ObfuscatedName("ab.w")
	public double field358;

	@ObfuscatedName("ab.x")
	public double field359;

	@ObfuscatedName("ab.y")
	public double field360;

	@ObfuscatedName("ab.z")
	public double field361;

	@ObfuscatedName("ab.A")
	public int field362;

	@ObfuscatedName("ab.B")
	public int field363;

	@ObfuscatedName("ab.C")
	public int field364;

	@ObfuscatedName("ab.D")
	public int field365;

	public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field342 = class63.field908[arg8];
		field343 = arg1;
		field344 = arg9;
		field345 = arg3;
		field346 = arg7;
		field348 = arg2;
		field349 = arg10;
		field350 = arg0;
		field351 = arg6;
		field352 = arg5;
		field347 = arg4;
		field353 = false;
	}

	@ObfuscatedName("ab.a(IIZII)V")
	public final void method116(int arg0, int arg1, int arg2, int arg3) {
		if (!field353) {
			double var5 = (double) (arg1 - field344);
			double var7 = (double) (arg2 - field345);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field354 = field351 * var5 / var9 + field344;
			field355 = field351 * var7 / var9 + field345;
			field356 = field346;
		}

		double var11 = (double) (field349 + 1 - arg3);
		field357 = (arg1 - field354) / var11;
		field358 = (arg2 - field355) / var11;
		field359 = Math.sqrt(field358 * field358 + field357 * field357);
		if (!field353) {
			field360 = -field359 * Math.tan(field350 * 0.02454369D);
		}

		field361 = (arg0 - field356 - field360 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("ab.a(ZI)V")
	public final void method117(int arg0) {
		field353 = true;
		field354 += arg0 * field357;
		field355 += arg0 * field358;
		field356 += field361 * 0.5D * arg0 * arg0 + arg0 * field360;
		field360 += arg0 * field361;
		field362 = (int) (Math.atan2(field357, field358) * 325.949D) + 1024 & 0x7FF;
		field363 = (int) (Math.atan2(field360, field359) * 325.949D) & 0x7FF;

		if (field342.field911 != null) {
			field365 += arg0;
			while (field365 > field342.field911.field899[field364]) {
				field365 -= field342.field911.field899[field364] + 1;
				field364++;
				if (field364 >= field342.field911.field896) {
					field364 = 0;
				}
			}
		}
	}

	@ObfuscatedName("ab.a(I)Leb;")
	public final class31 method108() {
		class31 var1 = field342.method322();
		class31 var2 = new class31(var1, !field342.field912, false, true);
		if (field342.field911 != null) {
			var2.method126();
			var2.method127(field342.field911.field897[field364]);
			var2.field433 = null;
			var2.field432 = null;
		}

		var2.method131(field363);
		var2.method136(field342.field918 + 64, field342.field919 + 850, -30, -50, -30, true);
		return var2;
	}
}
