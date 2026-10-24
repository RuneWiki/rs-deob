package deob;

@ObfuscatedName("fb")
public final class class32 extends class24 {

	@ObfuscatedName("fb.s")
	public class68 field550;

	@ObfuscatedName("fb.t")
	public int field551;

	@ObfuscatedName("fb.u")
	public int field552;

	@ObfuscatedName("fb.v")
	public int field553;

	@ObfuscatedName("fb.w")
	public int field554;

	@ObfuscatedName("fb.x")
	public int field555;

	@ObfuscatedName("fb.y")
	public int field556;

	@ObfuscatedName("fb.z")
	public int field557;

	@ObfuscatedName("fb.A")
	public boolean field558 = false;

	public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field550 = class68.field1005[arg0];
		field552 = arg1;
		field553 = arg5;
		field554 = arg2;
		field555 = arg3;
		field551 = arg4 + arg6;
		field558 = false;
	}

	@ObfuscatedName("fb.a(II)V")
	public final void method150(int arg0) {
		field557 += arg0;
		while (field557 > field550.field1009.method376(field556)) {
			field557 -= field550.field1009.method376(field556) + 1;
			field556++;
			if (field556 >= field550.field1009.field986 && (field556 < 0 || field556 >= field550.field1009.field986)) {
				field556 = 0;
				field558 = true;
			}
		}
	}

	@ObfuscatedName("fb.a(Z)Leb;")
	public final class31 method109() {
		class31 var1 = field550.method380();
		if (var1 == null) {
			return null;
		}

		int var2 = field550.field1009.field987[field556];
		class31 var3 = new class31(false, class7.method48(var2), true, var1);
		if (!field558) {
			var3.method132();
			var3.method133(var2);
			var3.field515 = null;
			var3.field514 = null;
		}

		if (field550.field1012 != 128 || field550.field1013 != 128) {
			var3.method141(field550.field1012, field550.field1012, field550.field1013);
		}

		if (field550.field1014 != 0) {
			if (field550.field1014 == 90) {
				var3.method136();
			}

			if (field550.field1014 == 180) {
				var3.method136();
				var3.method136();
			}

			if (field550.field1014 == 270) {
				var3.method136();
				var3.method136();
				var3.method136();
			}
		}

		var3.method142(field550.field1015 + 64, field550.field1016 + 850, -30, -50, -30, true);
		return var3;
	}
}
