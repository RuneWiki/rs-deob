package deob;

@ObfuscatedName("nb")
public final class class40 extends class21 {

	@ObfuscatedName("nb.g")
	public int field569;

	@ObfuscatedName("nb.h")
	public int field570;

	@ObfuscatedName("nb.i")
	public int field571;

	@ObfuscatedName("nb.j")
	public int field572;

	@ObfuscatedName("nb.k")
	public int field573;

	@ObfuscatedName("nb.l")
	public class62 field574;

	@ObfuscatedName("nb.m")
	public int field575;

	@ObfuscatedName("nb.n")
	public int field576;

	public class40(boolean arg0, int arg1, int arg2, int arg3, class62 arg4, int arg5, int arg6) {
		field569 = arg5;
		field570 = arg6;
		field571 = arg2;
		field572 = arg3;
		field573 = arg1;
		field574 = arg4;
		if (arg0 && arg4.field900 != -1) {
			field575 = (int) (Math.random() * field574.field896);
			field576 = (int) (Math.random() * field574.field899[field575]);
		} else {
			field575 = -1;
			field576 = 0;
		}
	}
}
