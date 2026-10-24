package deob;

@ObfuscatedName("u")
public class class21 {

	@ObfuscatedName("u.a")
	public long field265;

	@ObfuscatedName("u.b")
	public class21 field266;

	@ObfuscatedName("u.c")
	public class21 field267;

	@ObfuscatedName("u.a()V")
	public void method108() {
		if (field267 != null) {
			field267.field266 = field266;
			field266.field267 = field267;
			field266 = null;
			field267 = null;
		}
	}
}
