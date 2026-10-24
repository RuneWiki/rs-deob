package deob;

@ObfuscatedName("bb")
public final class class28 extends class23 {

	@ObfuscatedName("bb.f")
	public class63 field366;

	@ObfuscatedName("bb.g")
	public int field367;

	@ObfuscatedName("bb.h")
	public int field368;

	@ObfuscatedName("bb.i")
	public int field369;

	@ObfuscatedName("bb.j")
	public int field370;

	@ObfuscatedName("bb.k")
	public int field371;

	@ObfuscatedName("bb.l")
	public int field372;

	@ObfuscatedName("bb.m")
	public int field373;

	@ObfuscatedName("bb.n")
	public boolean field374 = false;

	public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field366 = class63.field909[arg4];
		field368 = arg2;
		field369 = arg6;
		field370 = arg1;
		field371 = arg0;
		field367 = arg3 + arg5;
		field374 = false;
	}

	@ObfuscatedName("bb.a(II)V")
	public final void method118(int arg0) {
		field373 += arg0;
		while (field373 > field366.field912.field900[field372]) {
			field373 -= field366.field912.field900[field372] + 1;
			field372++;
			if (field372 >= field366.field912.field897 && (field372 < 0 || field372 >= field366.field912.field897)) {
				field372 = 0;
				field374 = true;
			}
		}
	}

	@ObfuscatedName("bb.a(Z)Leb;")
	public final class31 method108() {
		class31 var1 = field366.method322();
		class31 var2 = new class31(!field366.field913, var1, true, false);
		if (!field374) {
			var2.method126();
			var2.method127(field366.field912.field898[field372]);
			var2.field433 = null;
			var2.field432 = null;
		}

		if (field366.field916 != 128 || field366.field917 != 128) {
			var2.method135(field366.field917, field366.field916, field366.field916);
		}

		if (field366.field918 != 0) {
			if (field366.field918 == 90) {
				var2.method130();
			}

			if (field366.field918 == 180) {
				var2.method130();
				var2.method130();
			}

			if (field366.field918 == 270) {
				var2.method130();
				var2.method130();
				var2.method130();
			}
		}

		var2.method136(field366.field919 + 64, field366.field920 + 850, -30, -50, -30, true);
		return var2;
	}
}
