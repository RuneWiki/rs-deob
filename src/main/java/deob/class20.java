package deob;

@ObfuscatedName("t")
public final class class20 {

	@ObfuscatedName("t.a")
	public int field328;

	@ObfuscatedName("t.b")
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

	@ObfuscatedName("t.a(JILu;)V")
	public void method105(long arg0, class21 arg1) {
		if (arg1.field332 != null) {
			arg1.method106();
		}

		class21 var4 = field329[(int) (arg0 & field328 - 1)];
		arg1.field332 = var4.field332;
		arg1.field331 = var4;
		arg1.field332.field331 = arg1;
		arg1.field331.field332 = arg1;
		arg1.field330 = arg0;
	}
}
