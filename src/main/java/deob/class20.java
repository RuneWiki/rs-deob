package deob;

@ObfuscatedName("t")
public final class class20 {

	@ObfuscatedName("t.c")
	public int field328;

	@ObfuscatedName("t.d")
	public class21[] field329;

	public class20(int arg0) {
		field328 = arg0;
		field329 = new class21[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class21 var3 = field329[var2] = new class21();
			var3.field331 = var3;
			var3.field332 = var3;
		}
	}

	@ObfuscatedName("t.a(J)Lu;")
	public class21 method104(long arg0) {
		class21 var3 = field329[(int) (arg0 & field328 - 1)];
		for (class21 var4 = var3.field331; var4 != var3; var4 = var4.field331) {
			if (var4.field330 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("t.a(Lu;JI)V")
	public void method105(class21 arg0, long arg1) {
		if (arg0.field332 != null) {
			arg0.method106();
		}

		class21 var4 = field329[(int) (arg1 & field328 - 1)];
		arg0.field332 = var4.field332;
		arg0.field331 = var4;
		arg0.field332.field331 = arg0;
		arg0.field331.field332 = arg0;
		arg0.field330 = arg1;
	}
}
