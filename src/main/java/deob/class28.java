package deob;

@ObfuscatedName("bb")
public class class28 extends class24 {

	@ObfuscatedName("bb.n")
	public int field439;

	@ObfuscatedName("bb.o")
	public int field440;

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
	public class67 field446;

	@ObfuscatedName("bb.v")
	public int field447;

	@ObfuscatedName("bb.w")
	public int field448;

	public class28(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field439 = arg5;
		field440 = arg7;
		field441 = arg1;
		field442 = arg4;
		field443 = arg3;
		field444 = arg8;
		field445 = arg6;
		field446 = class67.field991[arg0];
		field447 = 0;
		field448 = client.field1058;
		if (arg2 && field446.field996 != -1) {
			field447 = (int) (Math.random() * field446.field992);
			field448 -= (int) (Math.random() * field446.method379(field447));
		}
	}

	@ObfuscatedName("bb.a(I)Leb;")
	public final class31 method109() {
		if (field446 != null) {
			int var1 = client.field1058 - field448;
			if (var1 > 100 && field446.field996 > 0) {
				var1 = 100;
			}

			while (var1 > field446.method379(field447)) {
				var1 -= field446.method379(field447);
				field447++;
				if (field447 >= field446.field992) {
					field447 -= field446.field996;
					if (field447 < 0 || field447 >= field446.field992) {
						break;
					}
				}
			}

			field446 = null;
			field448 = client.field1058 - var1;
		}

		int var2 = -1;
		if (field446 != null) {
			var2 = field446.field993[field447];
		}

		class58 var3 = class58.method329(field439);
		return var3.method335(field440, field441, field442, field443, field444, field445, var2);
	}
}
