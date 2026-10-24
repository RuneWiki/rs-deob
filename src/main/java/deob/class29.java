package deob;

@ObfuscatedName("cb")
public class class29 extends class25 {

	@ObfuscatedName("cb.n")
	public int field434;

	@ObfuscatedName("cb.o")
	public int field435;

	@ObfuscatedName("cb.p")
	public int field436;

	@ObfuscatedName("cb.q")
	public int field437;

	@ObfuscatedName("cb.r")
	public int field438;

	@ObfuscatedName("cb.s")
	public int field439;

	@ObfuscatedName("cb.t")
	public int field440;

	@ObfuscatedName("cb.u")
	public class65 field441;

	@ObfuscatedName("cb.v")
	public int field442;

	@ObfuscatedName("cb.w")
	public int field443;

	public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field434 = arg3;
		field435 = arg7;
		field436 = arg1;
		field437 = arg0;
		field438 = arg2;
		field439 = arg4;
		field440 = arg8;
		field441 = class65.field943[arg5];
		field442 = 0;
		field443 = client.field1131;
		if (arg6 && field441.field948 != -1) {
			field442 = (int) (Math.random() * field441.field944);
			field443 -= (int) (Math.random() * field441.method369(field442));
		}
	}

	@ObfuscatedName("cb.a(I)Lfb;")
	public final class32 method121() {
		if (field441 != null) {
			int var1 = client.field1131 - field443;
			if (var1 > 100 && field441.field948 > 0) {
				var1 = 100;
			}

			while (var1 > field441.method369(field442)) {
				var1 -= field441.method369(field442);
				field442++;
				if (field442 >= field441.field944) {
					field442 -= field441.field948;
					if (field442 < 0 || field442 >= field441.field944) {
						break;
					}
				}
			}

			field441 = null;
			field443 = client.field1131 - var1;
		}

		int var2 = -1;
		if (field441 != null) {
			var2 = field441.field945[field442];
		}

		class57 var3 = class57.method320(field434);
		return var3.method326(field435, field436, field437, field438, field439, field440, var2);
	}
}
