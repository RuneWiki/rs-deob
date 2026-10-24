package deob;

@ObfuscatedName("gb")
public final class class33 extends class25 {

	@ObfuscatedName("gb.m")
	public class66 field543;

	@ObfuscatedName("gb.n")
	public int field544;

	@ObfuscatedName("gb.o")
	public int field545;

	@ObfuscatedName("gb.p")
	public int field546;

	@ObfuscatedName("gb.q")
	public int field547;

	@ObfuscatedName("gb.r")
	public int field548;

	@ObfuscatedName("gb.s")
	public int field549;

	@ObfuscatedName("gb.t")
	public int field550;

	@ObfuscatedName("gb.u")
	public boolean field551 = false;

	public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field543 = class66.field959[arg2];
		field545 = arg6;
		field546 = arg1;
		field547 = arg0;
		field548 = arg5;
		field544 = arg3 + arg4;
		field551 = false;
	}

	@ObfuscatedName("gb.a(II)V")
	public final void method160(int arg0) {
		field550 += arg0;
		while (field550 > field543.field963.method373(field549)) {
			field550 -= field543.field963.method373(field549) + 1;
			field549++;
			if (field549 >= field543.field963.field947 && (field549 < 0 || field549 >= field543.field963.field947)) {
				field549 = 0;
				field551 = true;
			}
		}
	}

	@ObfuscatedName("gb.a(Z)Lfb;")
	public final class32 method121() {
		class32 var1 = field543.method377();
		if (var1 == null) {
			return null;
		}

		class32 var2 = new class32(true, false, var1, !field543.field964);
		if (!field551) {
			var2.method142();
			var2.method143(field543.field963.field948[field549]);
			var2.field508 = null;
			var2.field507 = null;
		}

		if (field543.field967 != 128 || field543.field968 != 128) {
			var2.method151(field543.field968, field543.field967, field543.field967);
		}

		if (field543.field969 != 0) {
			if (field543.field969 == 90) {
				var2.method146();
			}

			if (field543.field969 == 180) {
				var2.method146();
				var2.method146();
			}

			if (field543.field969 == 270) {
				var2.method146();
				var2.method146();
				var2.method146();
			}
		}

		var2.method152(field543.field970 + 64, field543.field971 + 850, -30, -50, -30, true);
		return var2;
	}
}
