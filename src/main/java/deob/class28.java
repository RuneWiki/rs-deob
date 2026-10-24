package deob;

@ObfuscatedName("bb")
public class class28 extends class24 {

	@ObfuscatedName("bb.n")
	public static client field441;

	@ObfuscatedName("bb.o")
	public int field442;

	@ObfuscatedName("bb.p")
	public int field443;

	@ObfuscatedName("bb.q")
	public int field444;

	@ObfuscatedName("bb.r")
	public int field445;

	@ObfuscatedName("bb.s")
	public int field446;

	@ObfuscatedName("bb.t")
	public int field447;

	@ObfuscatedName("bb.u")
	public int field448;

	@ObfuscatedName("bb.v")
	public class66 field449;

	@ObfuscatedName("bb.w")
	public int field450;

	@ObfuscatedName("bb.x")
	public int field451;

	@ObfuscatedName("bb.y")
	public int field452;

	@ObfuscatedName("bb.z")
	public int field453;

	@ObfuscatedName("bb.A")
	public int[] field454;

	public class28(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field442 = arg8;
		field443 = arg6;
		field444 = arg4;
		field445 = arg2;
		field446 = arg5;
		field447 = arg1;
		field448 = arg7;

		if (arg0 != -1) {
			field449 = class66.field997[arg0];
			field450 = 0;
			field451 = client.field1116;
			if (arg3 && field449.field1002 != -1) {
				field450 = (int) (Math.random() * field449.field998);
				field451 -= (int) (Math.random() * field449.method382(field450));
			}
		}

		class57 var10 = class57.method330(field442);
		field452 = var10.field864;
		field453 = var10.field865;
		field454 = var10.field863;
	}

	@ObfuscatedName("bb.a(B)Leb;")
	public final class31 method109() {
		int var1 = -1;
		if (field449 != null) {
			int var2 = client.field1116 - field451;
			if (var2 > 100 && field449.field1002 > 0) {
				var2 = 100;
			}

			while (var2 > field449.method382(field450)) {
				var2 -= field449.method382(field450);
				field450++;
				if (field450 >= field449.field998) {
					field450 -= field449.field1002;
					if (field450 < 0 || field450 >= field449.field998) {
						break;
					}
				}
			}

			field449 = null;
			field451 = client.field1116 - var2;

			if (field449 != null) {
				var1 = field449.field999[field450];
			}
		}

		class57 var3;
		if (field454 == null) {
			var3 = class57.method330(field442);
		} else {
			var3 = method119();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method336(field443, field444, field445, field446, field447, field448, var1);
	}

	@ObfuscatedName("bb.a(I)Lec;")
	public final class57 method119() {
		int var1 = -1;
		if (field452 != -1) {
			class69 var2 = class69.field1031[field452];
			int var3 = var2.field1033;
			int var4 = var2.field1034;
			int var5 = var2.field1035;
			int var6 = client.field1343[var5 - var4];
			var1 = field441.field1073[var3] >> var4 & var6;
		} else if (field453 != -1) {
			var1 = field441.field1073[field453];
		}

		if (var1 >= 0 && var1 < field454.length && field454[var1] != -1) {
			return class57.method330(field454[var1]);
		}

		return null;
	}
}
