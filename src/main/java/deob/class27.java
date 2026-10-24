package deob;

@ObfuscatedName("ab")
public final class class27 extends class23 {

	@ObfuscatedName("ab.h")
	public class60 field339;

	@ObfuscatedName("ab.i")
	public int field340;

	@ObfuscatedName("ab.j")
	public int field341;

	@ObfuscatedName("ab.k")
	public int field342;

	@ObfuscatedName("ab.l")
	public int field343;

	@ObfuscatedName("ab.m")
	public int field344;

	@ObfuscatedName("ab.n")
	public int field345;

	@ObfuscatedName("ab.o")
	public int field346;

	@ObfuscatedName("ab.p")
	public int field347;

	@ObfuscatedName("ab.q")
	public int field348;

	@ObfuscatedName("ab.r")
	public int field349;

	@ObfuscatedName("ab.s")
	public boolean field350 = false;

	@ObfuscatedName("ab.t")
	public double field351;

	@ObfuscatedName("ab.u")
	public double field352;

	@ObfuscatedName("ab.v")
	public double field353;

	@ObfuscatedName("ab.w")
	public double field354;

	@ObfuscatedName("ab.x")
	public double field355;

	@ObfuscatedName("ab.y")
	public double field356;

	@ObfuscatedName("ab.z")
	public double field357;

	@ObfuscatedName("ab.A")
	public double field358;

	@ObfuscatedName("ab.B")
	public int field359;

	@ObfuscatedName("ab.C")
	public int field360;

	@ObfuscatedName("ab.D")
	public int field361;

	@ObfuscatedName("ab.E")
	public int field362;

	public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field339 = class60.field856[arg3];
		field340 = arg5;
		field341 = arg0;
		field342 = arg9;
		field343 = arg4;
		field345 = arg7;
		field346 = arg1;
		field347 = arg8;
		field348 = arg2;
		field349 = arg6;
		field344 = arg10;
		field350 = false;
	}

	@ObfuscatedName("ab.a(IIIIZ)V")
	public final void method113(int arg0, int arg1, int arg2, int arg3) {
		if (!field350) {
			double var5 = (double) (arg3 - field341);
			double var7 = (double) (arg1 - field342);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field351 = field348 * var5 / var9 + field341;
			field352 = field348 * var7 / var9 + field342;
			field353 = field343;
		}

		double var11 = (double) (field346 + 1 - arg2);
		field354 = (arg3 - field351) / var11;
		field355 = (arg1 - field352) / var11;
		field356 = Math.sqrt(field355 * field355 + field354 * field354);
		if (!field350) {
			field357 = -field356 * Math.tan(field347 * 0.02454369D);
		}

		field358 = (arg0 - field353 - field357 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("ab.a(II)V")
	public final void method114(int arg0) {
		field350 = true;
		field351 += arg0 * field354;
		field352 += arg0 * field355;
		field353 += field358 * 0.5D * arg0 * arg0 + arg0 * field357;
		field357 += arg0 * field358;
		field359 = (int) (Math.atan2(field354, field355) * 325.949D) + 1024 & 0x7FF;
		field360 = (int) (Math.atan2(field357, field356) * 325.949D) & 0x7FF;

		if (field339.field859 != null) {
			field362 += arg0;
			while (field362 > field339.field859.field847[field361]) {
				field362 -= field339.field859.field847[field361] + 1;
				field361++;
				if (field361 >= field339.field859.field844) {
					field361 = 0;
				}
			}
		}
	}

	@ObfuscatedName("ab.a(I)Leb;")
	public final class31 method105() {
		class31 var1 = field339.method299();
		class31 var2 = new class31(true, var1, true, false, !field339.field860);
		if (field339.field859 != null) {
			var2.method122();
			var2.method123(field339.field859.field845[field361]);
			var2.field430 = null;
			var2.field429 = null;
		}

		var2.method127(field360);
		var2.method132(64, 850, -30, -50, -30, true);
		return var2;
	}
}
