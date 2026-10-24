package deob;

@ObfuscatedName("t")
public class class20 {

	@ObfuscatedName("t.a")
	public long field252;

	@ObfuscatedName("t.b")
	public class20 field253;

	@ObfuscatedName("t.c")
	public class20 field254;

	@ObfuscatedName("t.a()V")
	public void method89() {
		if (field254 != null) {
			field254.field253 = field253;
			field253.field254 = field254;
			field253 = null;
			field254 = null;
		}
	}
}
