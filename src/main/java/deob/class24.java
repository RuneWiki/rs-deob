package deob;

@ObfuscatedName("x")
public class class24 extends class22 {

	@ObfuscatedName("x.e")
	public class24 field365;

	@ObfuscatedName("x.f")
	public class24 field366;

	@ObfuscatedName("x.b()V")
	public void method121() {
		if (field366 != null) {
			field366.field365 = field365;
			field365.field366 = field366;
			field365 = null;
			field366 = null;
		}
	}
}
