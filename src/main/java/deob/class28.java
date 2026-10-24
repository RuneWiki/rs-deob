package deob;

@ObfuscatedName("bb")
public final class class28 extends class23 {

	@ObfuscatedName("bb.i")
	public class63 field366;

	@ObfuscatedName("bb.j")
	public int field367;

	@ObfuscatedName("bb.k")
	public int field368;

	@ObfuscatedName("bb.l")
	public int field369;

	@ObfuscatedName("bb.m")
	public int field370;

	@ObfuscatedName("bb.n")
	public int field371;

	@ObfuscatedName("bb.o")
	public int field372;

	@ObfuscatedName("bb.p")
	public int field373;

	@ObfuscatedName("bb.q")
	public boolean field374 = false;

	public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field366 = class63.field906[arg2];
		field368 = arg6;
		field369 = arg4;
		field370 = arg3;
		field371 = arg1;
		field367 = arg0 + arg5;
		field374 = false;
	}

	@ObfuscatedName("bb.a(BI)V")
	public final void method117(int arg0) {
		field373 += arg0;
		while (field373 > field366.field909.field897[field372]) {
			field373 -= field366.field909.field897[field372] + 1;
			field372++;
			if (field372 >= field366.field909.field894 && (field372 < 0 || field372 >= field366.field909.field894)) {
				field372 = 0;
				field374 = true;
			}
		}
	}

	@ObfuscatedName("bb.a(I)Leb;")
	public final class31 method107() {
		class31 var1 = field366.method321();
		class31 var2 = new class31(false, true, !field366.field910, var1);
		if (!field374) {
			var2.method125();
			var2.method126(field366.field909.field895[field372]);
			var2.field433 = null;
			var2.field432 = null;
		}

		if (field366.field913 != 128 || field366.field914 != 128) {
			var2.method134(field366.field914, field366.field913, field366.field913);
		}

		if (field366.field915 != 0) {
			if (field366.field915 == 90) {
				var2.method129();
			}

			if (field366.field915 == 180) {
				var2.method129();
				var2.method129();
			}

			if (field366.field915 == 270) {
				var2.method129();
				var2.method129();
				var2.method129();
			}
		}

		var2.method135(field366.field916 + 64, field366.field917 + 850, -30, -50, -30, true);
		return var2;
	}
}
