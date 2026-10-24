package deob;

@ObfuscatedName("cb")
public class class29 extends class25 {

	@ObfuscatedName("cb.m")
	public int field446;

	@ObfuscatedName("cb.n")
	public int field447;

	@ObfuscatedName("cb.o")
	public int field448;

	@ObfuscatedName("cb.p")
	public int field449;

	@ObfuscatedName("cb.q")
	public int field450;

	@ObfuscatedName("cb.r")
	public int field451;

	@ObfuscatedName("cb.s")
	public int field452;

	@ObfuscatedName("cb.t")
	public class66 field453;

	@ObfuscatedName("cb.u")
	public int field454;

	@ObfuscatedName("cb.v")
	public int field455;

	public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		field446 = arg2;
		field447 = arg3;
		field448 = arg4;
		field449 = arg1;
		field450 = arg8;
		field451 = arg0;
		field452 = arg5;
		field453 = class66.field980[arg6];
		field454 = 0;
		field455 = client.field1417;
		if (arg7 && field453.field985 != -1) {
			field454 = (int) (Math.random() * field453.field981);
			field455 -= (int) (Math.random() * field453.method384(field454));
		}
	}

	@ObfuscatedName("cb.a(I)Lfb;")
	public final class32 method123() {
		if (field453 != null) {
			int var1 = client.field1417 - field455;
			if (var1 > 100 && field453.field985 > 0) {
				var1 = 100;
			}

			while (var1 > field453.method384(field454)) {
				var1 -= field453.method384(field454);
				field454++;
				if (field454 >= field453.field981) {
					field454 -= field453.field985;
					if (field454 < 0 || field454 >= field453.field981) {
						break;
					}
				}
			}

			field453 = null;
			field455 = client.field1417 - var1;
		}

		int var2 = -1;
		if (field453 != null) {
			var2 = field453.field982[field454];
		}

		class57 var3 = class57.method334(field446);
		return var3.method340(field447, field448, field449, field450, field451, field452, var2);
	}
}
