package deob;

@ObfuscatedName("v")
public class class22 {

	@ObfuscatedName("v.a")
	public long field329;

	@ObfuscatedName("v.b")
	public class22 field330;

	@ObfuscatedName("v.c")
	public class22 field331;

	@ObfuscatedName("v.a()V")
	public void method118() {
		if (field331 != null) {
			field331.field330 = field330;
			field330.field331 = field331;
			field330 = null;
			field331 = null;
		}
	}
}
