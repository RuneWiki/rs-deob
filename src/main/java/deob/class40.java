package deob;

@ObfuscatedName("nb")
public final class class40 extends class21 {

	@ObfuscatedName("nb.f")
	public int field566;

	@ObfuscatedName("nb.g")
	public int field567;

	@ObfuscatedName("nb.h")
	public int field568;

	@ObfuscatedName("nb.i")
	public int field569;

	@ObfuscatedName("nb.j")
	public int field570;

	@ObfuscatedName("nb.k")
	public class59 field571;

	@ObfuscatedName("nb.l")
	public int field572;

	@ObfuscatedName("nb.m")
	public int field573;

	public class40(int arg0, int arg1, int arg2, boolean arg3, class59 arg4, int arg5, int arg6) {
		field566 = arg1;
		field567 = arg0;
		field568 = arg6;
		field569 = arg5;
		field570 = arg2;
		field571 = arg4;
		if (arg3) {
			field572 = (int) (Math.random() * field571.field844);
			field573 = (int) (Math.random() * field571.field847[field572]);
		} else {
			field572 = -1;
			field573 = 0;
		}
	}
}
