package deob;

@ObfuscatedName("nb")
public final class class40 extends class21 {

	@ObfuscatedName("nb.f")
	public int field570;

	@ObfuscatedName("nb.g")
	public int field571;

	@ObfuscatedName("nb.h")
	public int field572;

	@ObfuscatedName("nb.i")
	public int field573;

	@ObfuscatedName("nb.j")
	public int field574;

	@ObfuscatedName("nb.k")
	public class62 field575;

	@ObfuscatedName("nb.l")
	public int field576;

	@ObfuscatedName("nb.m")
	public int field577;

	public class40(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class62 arg6) {
		field570 = arg4;
		field571 = arg5;
		field572 = arg0;
		field573 = arg1;
		field574 = arg3;
		field575 = arg6;
		if (arg2 && arg6.field901 != -1) {
			field576 = (int) (Math.random() * field575.field897);
			field577 = (int) (Math.random() * field575.field900[field576]);
		} else {
			field576 = -1;
			field577 = 0;
		}
	}
}
