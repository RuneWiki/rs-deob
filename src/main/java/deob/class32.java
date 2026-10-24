package deob;

@ObfuscatedName("fb")
public final class class32 extends class24 {

	@ObfuscatedName("fb.m")
	public class68 field549;

	@ObfuscatedName("fb.n")
	public int field550;

	@ObfuscatedName("fb.o")
	public int field551;

	@ObfuscatedName("fb.p")
	public int field552;

	@ObfuscatedName("fb.q")
	public int field553;

	@ObfuscatedName("fb.r")
	public int field554;

	@ObfuscatedName("fb.s")
	public int field555;

	@ObfuscatedName("fb.t")
	public int field556;

	@ObfuscatedName("fb.u")
	public boolean field557 = false;

	public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field549 = class68.field1001[arg5];
		field551 = arg3;
		field552 = arg1;
		field553 = arg6;
		field554 = arg2;
		field550 = arg0 + arg4;
		field557 = false;
	}

	@ObfuscatedName("fb.a(II)V")
	public final void method150(int arg0) {
		field556 += arg0;
		while (field556 > field549.field1005.method375(field555)) {
			field556 -= field549.field1005.method375(field555) + 1;
			field555++;
			if (field555 >= field549.field1005.field983 && (field555 < 0 || field555 >= field549.field1005.field983)) {
				field555 = 0;
				field557 = true;
			}
		}
	}

	@ObfuscatedName("fb.a(I)Leb;")
	public final class31 method109() {
		class31 var1 = field549.method379();
		if (var1 == null) {
			return null;
		}

		int var2 = field549.field1005.field984[field555];
		class31 var3 = new class31(false, true, var1, class7.method48(var2));
		if (!field557) {
			var3.method132();
			var3.method133(var2);
			var3.field514 = null;
			var3.field513 = null;
		}

		if (field549.field1008 != 128 || field549.field1009 != 128) {
			var3.method141(field549.field1008, field549.field1009, field549.field1008);
		}

		if (field549.field1010 != 0) {
			if (field549.field1010 == 90) {
				var3.method136();
			}

			if (field549.field1010 == 180) {
				var3.method136();
				var3.method136();
			}

			if (field549.field1010 == 270) {
				var3.method136();
				var3.method136();
				var3.method136();
			}
		}

		var3.method142(field549.field1011 + 64, field549.field1012 + 850, -30, -50, -30, true);
		return var3;
	}
}
