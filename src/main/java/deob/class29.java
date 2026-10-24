package deob;

@ObfuscatedName("cb")
public class class29 extends class25 {

	@ObfuscatedName("cb.m")
	public int field434;

	@ObfuscatedName("cb.n")
	public int field435;

	@ObfuscatedName("cb.o")
	public int field436;

	@ObfuscatedName("cb.p")
	public int field437;

	@ObfuscatedName("cb.q")
	public int field438;

	@ObfuscatedName("cb.r")
	public int field439;

	@ObfuscatedName("cb.s")
	public int field440;

	@ObfuscatedName("cb.t")
	public class65 field441;

	@ObfuscatedName("cb.u")
	public int field442;

	@ObfuscatedName("cb.v")
	public int field443;

	public class29(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
		field434 = arg1;
		field435 = arg0;
		field436 = arg4;
		field437 = arg8;
		field438 = arg6;
		field439 = arg2;
		field440 = arg7;
		field441 = class65.field946[arg3];
		field442 = 0;
		field443 = client.field1256;
		if (arg5 && field441.field951 != -1) {
			field442 = (int) (Math.random() * field441.field947);
			field443 -= (int) (Math.random() * field441.method373(field442));
		}
	}

	@ObfuscatedName("cb.a(Z)Lfb;")
	public final class32 method121() {
		if (field441 != null) {
			int var1 = client.field1256 - field443;
			if (var1 > 100 && field441.field951 > 0) {
				var1 = 100;
			}

			while (var1 > field441.method373(field442)) {
				var1 -= field441.method373(field442);
				field442++;
				if (field442 >= field441.field947) {
					field442 -= field441.field951;
					if (field442 < 0 || field442 >= field441.field947) {
						break;
					}
				}
			}

			field441 = null;
			field443 = client.field1256 - var1;
		}

		int var2 = -1;
		if (field441 != null) {
			var2 = field441.field948[field442];
		}

		class57 var3 = class57.method324(field434);
		return var3.method330(field435, field436, field437, field438, field439, field440, var2);
	}
}
