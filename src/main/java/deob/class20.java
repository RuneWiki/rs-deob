package deob;

@ObfuscatedName("t")
public final class class20 {

	@ObfuscatedName("t.b")
	public int field263;

	@ObfuscatedName("t.c")
	public class21[] field264;

	public class20(int arg0) {
		field263 = arg0;
		field264 = new class21[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class21 var3 = field264[var2] = new class21();
			var3.field266 = var3;
			var3.field267 = var3;
		}
	}

	@ObfuscatedName("t.a(J)Lu;")
	public class21 method106(long arg0) {
		class21 var3 = field264[(int) (arg0 & field263 - 1)];
		for (class21 var4 = var3.field266; var4 != var3; var4 = var4.field266) {
			if (var4.field265 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("t.a(JILu;)V")
	public void method107(long arg0, class21 arg1) {
		if (arg1.field267 != null) {
			arg1.method108();
		}

		class21 var4 = field264[(int) (arg0 & field263 - 1)];
		arg1.field267 = var4.field267;
		arg1.field266 = var4;
		arg1.field267.field266 = arg1;
		arg1.field266.field267 = arg1;
		arg1.field265 = arg0;
	}
}
