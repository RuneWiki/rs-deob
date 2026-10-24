package deob;

@ObfuscatedName("nb")
public final class class40 extends class21 {

	@ObfuscatedName("nb.f")
	public int field569;

	@ObfuscatedName("nb.g")
	public int field570;

	@ObfuscatedName("nb.h")
	public int field571;

	@ObfuscatedName("nb.i")
	public int field572;

	@ObfuscatedName("nb.j")
	public int field573;

	@ObfuscatedName("nb.k")
	public class62 field574;

	@ObfuscatedName("nb.l")
	public int field575;

	@ObfuscatedName("nb.m")
	public int field576;

	public class40(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class62 arg6) {
		field569 = arg2;
		field570 = arg3;
		field571 = arg5;
		field572 = arg1;
		field573 = arg0;
		field574 = arg6;
		if (arg4 && arg6.field900 != -1) {
			field575 = (int) (Math.random() * field574.field896);
			field576 = (int) (Math.random() * field574.field899[field575]);
		} else {
			field575 = -1;
			field576 = 0;
		}
	}
}
