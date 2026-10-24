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

	public class40(int arg0, int arg1, int arg2, class62 arg3, int arg4, int arg5, boolean arg6) {
		field569 = arg2;
		field570 = arg5;
		field571 = arg4;
		field572 = arg1;
		field573 = arg0;
		field574 = arg3;
		if (arg6 && arg3.field898 != -1) {
			field575 = (int) (Math.random() * field574.field894);
			field576 = (int) (Math.random() * field574.field897[field575]);
		} else {
			field575 = -1;
			field576 = 0;
		}
	}
}
