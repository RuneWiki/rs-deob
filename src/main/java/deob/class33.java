package deob;

@ObfuscatedName("gb")
public final class class33 extends class25 {

	@ObfuscatedName("gb.n")
	public class66 field543;

	@ObfuscatedName("gb.o")
	public int field544;

	@ObfuscatedName("gb.p")
	public int field545;

	@ObfuscatedName("gb.q")
	public int field546;

	@ObfuscatedName("gb.r")
	public int field547;

	@ObfuscatedName("gb.s")
	public int field548;

	@ObfuscatedName("gb.t")
	public int field549;

	@ObfuscatedName("gb.u")
	public int field550;

	@ObfuscatedName("gb.v")
	public boolean field551 = false;

	public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field543 = class66.field956[arg0];
		field545 = arg6;
		field546 = arg5;
		field547 = arg3;
		field548 = arg2;
		field544 = arg1 + arg4;
		field551 = false;
	}

	@ObfuscatedName("gb.a(II)V")
	public final void method160(int arg0) {
		field550 += arg0;
		while (field550 > field543.field960.method369(field549)) {
			field550 -= field543.field960.method369(field549) + 1;
			field549++;
			if (field549 >= field543.field960.field944 && (field549 < 0 || field549 >= field543.field960.field944)) {
				field549 = 0;
				field551 = true;
			}
		}
	}

	@ObfuscatedName("gb.a(I)Lfb;")
	public final class32 method121() {
		class32 var1 = field543.method373();
		if (var1 == null) {
			return null;
		}

		class32 var2 = new class32(true, !field543.field961, false, var1);
		if (!field551) {
			var2.method142();
			var2.method143(field543.field960.field945[field549]);
			var2.field508 = null;
			var2.field507 = null;
		}

		if (field543.field964 != 128 || field543.field965 != 128) {
			var2.method151(field543.field964, field543.field964, field543.field965);
		}

		if (field543.field966 != 0) {
			if (field543.field966 == 90) {
				var2.method146();
			}

			if (field543.field966 == 180) {
				var2.method146();
				var2.method146();
			}

			if (field543.field966 == 270) {
				var2.method146();
				var2.method146();
				var2.method146();
			}
		}

		var2.method152(field543.field967 + 64, field543.field968 + 850, -30, -50, -30, true);
		return var2;
	}
}
