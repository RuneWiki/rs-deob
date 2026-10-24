package deob;

@ObfuscatedName("fb")
public final class class32 extends class24 {

	@ObfuscatedName("fb.n")
	public class69 field548;

	@ObfuscatedName("fb.o")
	public int field549;

	@ObfuscatedName("fb.p")
	public int field550;

	@ObfuscatedName("fb.q")
	public int field551;

	@ObfuscatedName("fb.r")
	public int field552;

	@ObfuscatedName("fb.s")
	public int field553;

	@ObfuscatedName("fb.t")
	public int field554;

	@ObfuscatedName("fb.u")
	public int field555;

	@ObfuscatedName("fb.v")
	public boolean field556 = false;

	public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field548 = class69.field1010[arg1];
		field550 = arg4;
		field551 = arg6;
		field552 = arg2;
		field553 = arg5;
		field549 = arg0 + arg3;
		field556 = false;
	}

	@ObfuscatedName("fb.a(II)V")
	public final void method150(int arg0) {
		field555 += arg0;
		while (field555 > field548.field1014.method379(field554)) {
			field555 -= field548.field1014.method379(field554) + 1;
			field554++;
			if (field554 >= field548.field1014.field992 && (field554 < 0 || field554 >= field548.field1014.field992)) {
				field554 = 0;
				field556 = true;
			}
		}
	}

	@ObfuscatedName("fb.a(I)Leb;")
	public final class31 method109() {
		class31 var1 = field548.method383();
		if (var1 == null) {
			return null;
		}

		int var2 = field548.field1014.field993[field554];
		class31 var3 = new class31(false, var1, true, class7.method48(var2));
		if (!field556) {
			var3.method132();
			var3.method133(var2);
			var3.field513 = null;
			var3.field512 = null;
		}

		if (field548.field1017 != 128 || field548.field1018 != 128) {
			var3.method141(field548.field1017, field548.field1017, field548.field1018);
		}

		if (field548.field1019 != 0) {
			if (field548.field1019 == 90) {
				var3.method136();
			}

			if (field548.field1019 == 180) {
				var3.method136();
				var3.method136();
			}

			if (field548.field1019 == 270) {
				var3.method136();
				var3.method136();
				var3.method136();
			}
		}

		var3.method142(field548.field1020 + 64, field548.field1021 + 850, -30, -50, -30, true);
		return var3;
	}
}
