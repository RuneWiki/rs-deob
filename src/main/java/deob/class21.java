package deob;

@ObfuscatedName("u")
public class class21 {

	@ObfuscatedName("u.c")
	public long field330;

	@ObfuscatedName("u.d")
	public class21 field331;

	@ObfuscatedName("u.e")
	public class21 field332;

	@ObfuscatedName("u.a()V")
	public void method106() {
		if (field332 != null) {
			field332.field331 = field331;
			field331.field332 = field332;
			field331 = null;
			field332 = null;
		}
	}
}
