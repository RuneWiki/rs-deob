package deob;

@ObfuscatedName("cb")
public class class29 extends class25 {

	@ObfuscatedName("cb.l")
	public int field445;

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
	public class66 field452;

	@ObfuscatedName("cb.t")
	public int field453;

	@ObfuscatedName("cb.u")
	public int field454;

	public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field445 = arg2;
		field446 = arg5;
		field447 = arg1;
		field448 = arg4;
		field449 = arg3;
		field450 = arg0;
		field451 = arg7;
		field452 = class66.field978[arg8];
		field453 = 0;
		field454 = client.field1060;
		if (arg6 && field452.field983 != -1) {
			field453 = (int) (Math.random() * field452.field979);
			field454 -= (int) (Math.random() * field452.method384(field453));
		}
	}

	@ObfuscatedName("cb.a(B)Lfb;")
	public final class32 method123() {
		if (field452 != null) {
			int var1 = client.field1060 - field454;
			if (var1 > 100 && field452.field983 > 0) {
				var1 = 100;
			}

			while (var1 > field452.method384(field453)) {
				var1 -= field452.method384(field453);
				field453++;
				if (field453 >= field452.field979) {
					field453 -= field452.field983;
					if (field453 < 0 || field453 >= field452.field979) {
						break;
					}
				}
			}

			field452 = null;
			field454 = client.field1060 - var1;
		}

		int var2 = -1;
		if (field452 != null) {
			var2 = field452.field980[field453];
		}

		class57 var3 = class57.method334(field445);
		return var3.method340(field446, field447, field448, field449, field450, field451, var2);
	}
}
