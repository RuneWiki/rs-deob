package deob;

@ObfuscatedName("bb")
public class class28 extends class24 {

	@ObfuscatedName("bb.p")
	public int field441;

	@ObfuscatedName("bb.q")
	public int field442;

	@ObfuscatedName("bb.r")
	public int field443;

	@ObfuscatedName("bb.s")
	public int field444;

	@ObfuscatedName("bb.t")
	public int field445;

	@ObfuscatedName("bb.u")
	public int field446;

	@ObfuscatedName("bb.v")
	public int field447;

	@ObfuscatedName("bb.w")
	public class66 field448;

	@ObfuscatedName("bb.x")
	public int field449;

	@ObfuscatedName("bb.y")
	public int field450;

	public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field441 = arg8;
		field442 = arg0;
		field443 = arg7;
		field444 = arg1;
		field445 = arg4;
		field446 = arg3;
		field447 = arg2;
		field448 = class66.field985[arg5];
		field449 = 0;
		field450 = client.field1160;
		if (arg6 && field448.field990 != -1) {
			field449 = (int) (Math.random() * field448.field986);
			field450 -= (int) (Math.random() * field448.method376(field449));
		}
	}

	@ObfuscatedName("bb.a(Z)Leb;")
	public final class31 method109() {
		if (field448 != null) {
			int var1 = client.field1160 - field450;
			if (var1 > 100 && field448.field990 > 0) {
				var1 = 100;
			}

			while (var1 > field448.method376(field449)) {
				var1 -= field448.method376(field449);
				field449++;
				if (field449 >= field448.field986) {
					field449 -= field448.field990;
					if (field449 < 0 || field449 >= field448.field986) {
						break;
					}
				}
			}

			field448 = null;
			field450 = client.field1160 - var1;
		}

		int var2 = -1;
		if (field448 != null) {
			var2 = field448.field987[field449];
		}

		class57 var3 = class57.method326(field441);
		return var3.method332(field442, field443, field444, field445, field446, field447, var2);
	}
}
