package deob;

@ObfuscatedName("z")
public final class class26 extends class22 {

	@ObfuscatedName("z.g")
	public class59 field328;

	@ObfuscatedName("z.h")
	public int field329;

	@ObfuscatedName("z.i")
	public int field330;

	@ObfuscatedName("z.j")
	public int field331;

	@ObfuscatedName("z.k")
	public int field332;

	@ObfuscatedName("z.l")
	public int field333;

	@ObfuscatedName("z.m")
	public int field334;

	@ObfuscatedName("z.n")
	public int field335;

	@ObfuscatedName("z.o")
	public int field336;

	@ObfuscatedName("z.p")
	public int field337;

	@ObfuscatedName("z.q")
	public int field338;

	@ObfuscatedName("z.r")
	public boolean field339 = false;

	@ObfuscatedName("z.s")
	public double field340;

	@ObfuscatedName("z.t")
	public double field341;

	@ObfuscatedName("z.u")
	public double field342;

	@ObfuscatedName("z.v")
	public double field343;

	@ObfuscatedName("z.w")
	public double field344;

	@ObfuscatedName("z.x")
	public double field345;

	@ObfuscatedName("z.y")
	public double field346;

	@ObfuscatedName("z.z")
	public double field347;

	@ObfuscatedName("z.A")
	public int field348;

	@ObfuscatedName("z.B")
	public int field349;

	@ObfuscatedName("z.C")
	public int field350;

	@ObfuscatedName("z.D")
	public int field351;

	public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field328 = class59.field836[arg5];
		field329 = arg0;
		field330 = arg2;
		field331 = arg8;
		field332 = arg4;
		field334 = arg6;
		field335 = arg9;
		field336 = arg3;
		field337 = arg1;
		field338 = arg10;
		field333 = arg7;
		field339 = false;
	}

	@ObfuscatedName("z.a(IIIII)V")
	public final void method99(int arg0, int arg1, int arg2, int arg3) {
		if (!field339) {
			double var5 = (double) (arg2 - field330);
			double var7 = (double) (arg0 - field331);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field340 = field337 * var5 / var9 + field330;
			field341 = field337 * var7 / var9 + field331;
			field342 = field332;
		}

		double var11 = (double) (field335 + 1 - arg3);
		field343 = (arg2 - field340) / var11;
		field344 = (arg0 - field341) / var11;
		field345 = Math.sqrt(field344 * field344 + field343 * field343);
		if (!field339) {
			field346 = -field345 * Math.tan(field336 * 0.02454369D);
		}

		field347 = (arg1 - field342 - field346 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("z.a(II)V")
	public final void method100(int arg0) {
		field339 = true;
		field340 += arg0 * field343;
		field341 += arg0 * field344;
		field342 += field347 * 0.5D * arg0 * arg0 + arg0 * field346;
		field346 += arg0 * field347;
		field348 = (int) (Math.atan2(field343, field344) * 325.949D) + 1024 & 0x7FF;
		field349 = (int) (Math.atan2(field346, field345) * 325.949D) & 0x7FF;

		if (field328.field839 != null) {
			field351 += arg0;
			while (field351 > field328.field839.field827[field350]) {
				field351 -= field328.field839.field827[field350] + 1;
				field350++;
				if (field350 >= field328.field839.field824) {
					field350 = 0;
				}
			}
		}
	}

	@ObfuscatedName("z.a(I)Ldb;")
	public final class30 method90() {
		class30 var1 = field328.method283();
		class30 var2 = new class30(true, !field328.field840, var1, true, false);
		if (field328.field839 != null) {
			var2.method108();
			var2.method109(field328.field839.field825[field350]);
			var2.field419 = null;
			var2.field418 = null;
		}

		var2.method113(field349);
		var2.method118(64, 850, -30, -50, -30, true);
		return var2;
	}
}
