package deob;

@ObfuscatedName("s")
public final class class19 {

	@ObfuscatedName("s.b")
	public int field250;

	@ObfuscatedName("s.c")
	public class20[] field251;

	public class19(int arg0) {
		field250 = arg0;
		field251 = new class20[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class20 var3 = field251[var2] = new class20();
			var3.field253 = var3;
			var3.field254 = var3;
		}
	}

	@ObfuscatedName("s.a(J)Lt;")
	public class20 method87(long arg0) {
		class20 var3 = field251[(int) (arg0 & field250 - 1)];
		for (class20 var4 = var3.field253; var4 != var3; var4 = var4.field253) {
			if (var4.field252 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("s.a(JLt;I)V")
	public void method88(long arg0, class20 arg1) {
		if (arg1.field254 != null) {
			arg1.method89();
		}

		class20 var4 = field251[(int) (arg0 & field250 - 1)];
		arg1.field254 = var4.field254;
		arg1.field253 = var4;
		arg1.field254.field253 = arg1;
		arg1.field253.field254 = arg1;
		arg1.field252 = arg0;
	}
}
