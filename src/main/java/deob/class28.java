package deob;

@ObfuscatedName("bb")
public class class28 extends class24 {

	@ObfuscatedName("bb.n")
	public int field440;

	@ObfuscatedName("bb.o")
	public int field441;

	@ObfuscatedName("bb.p")
	public int field442;

	@ObfuscatedName("bb.q")
	public int field443;

	@ObfuscatedName("bb.r")
	public int field444;

	@ObfuscatedName("bb.s")
	public int field445;

	@ObfuscatedName("bb.t")
	public int field446;

	@ObfuscatedName("bb.u")
	public class66 field447;

	@ObfuscatedName("bb.v")
	public int field448;

	@ObfuscatedName("bb.w")
	public int field449;

	public class28(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
		field440 = arg0;
		field441 = arg1;
		field442 = arg6;
		field443 = arg4;
		field444 = arg2;
		field445 = arg8;
		field446 = arg7;
		field447 = class66.field982[arg3];
		field448 = 0;
		field449 = client.field1410;
		if (arg5 && field447.field987 != -1) {
			field448 = (int) (Math.random() * field447.field983);
			field449 -= (int) (Math.random() * field447.method375(field448));
		}
	}

	@ObfuscatedName("bb.a(I)Leb;")
	public final class31 method109() {
		if (field447 != null) {
			int var1 = client.field1410 - field449;
			if (var1 > 100 && field447.field987 > 0) {
				var1 = 100;
			}

			while (var1 > field447.method375(field448)) {
				var1 -= field447.method375(field448);
				field448++;
				if (field448 >= field447.field983) {
					field448 -= field447.field987;
					if (field448 < 0 || field448 >= field447.field983) {
						break;
					}
				}
			}

			field447 = null;
			field449 = client.field1410 - var1;
		}

		int var2 = -1;
		if (field447 != null) {
			var2 = field447.field984[field448];
		}

		class57 var3 = class57.method325(field440);
		return var3.method331(field441, field442, field443, field444, field445, field446, var2);
	}
}
