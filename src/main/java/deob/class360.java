package deob;

@ObfuscatedName("ny")
public class class360 extends class545 {

	@ObfuscatedName("ny.af")
	public final int field4050;

	@ObfuscatedName("ny.aw")
	public final int field4049;

	@ObfuscatedName("ny.at")
	public final int field4046;

	@ObfuscatedName("ny.ac")
	public final int field4047;

	@ObfuscatedName("ny.ap")
	public class360 field4048;

	public class360(int arg0, int arg1, int arg2, int arg3) {
		this.field4050 = arg0;
		this.field4049 = arg1;
		this.field4046 = arg2;
		this.field4047 = arg3;
	}

	@ObfuscatedName("ny.af(I)I")
	public int method6890() {
		return this.field4046;
	}

	@ObfuscatedName("ny.aw(I)I")
	public int method6886() {
		return this.field4047;
	}

	@ObfuscatedName("tb.ac(Lny;IB)Lny;")
	public static class360 method9540(class360 arg0, int arg1) {
		for (class360 var2 = arg0; var2 != null; var2 = var2.field4048) {
			if (arg1 >= var2.field4050 && arg1 <= var2.field4049) {
				return var2;
			}
		}
		return null;
	}
}
