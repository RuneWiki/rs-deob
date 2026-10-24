package deob;

@ObfuscatedName("nb")
public final class class40 extends class21 {

	@ObfuscatedName("nb.f")
	public int field572;

	@ObfuscatedName("nb.g")
	public int field573;

	@ObfuscatedName("nb.h")
	public int field574;

	@ObfuscatedName("nb.i")
	public int field575;

	@ObfuscatedName("nb.j")
	public int field576;

	@ObfuscatedName("nb.k")
	public class62 field577;

	@ObfuscatedName("nb.l")
	public int field578;

	@ObfuscatedName("nb.m")
	public int field579;

	public class40(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class62 arg6) {
		field572 = arg5;
		field573 = arg3;
		field574 = arg0;
		field575 = arg1;
		field576 = arg4;
		field577 = arg6;
		if (arg2 && arg6.field906 != -1) {
			field578 = (int) (Math.random() * field577.field902);
			field579 = (int) (Math.random() * field577.field905[field578]);
		} else {
			field578 = -1;
			field579 = 0;
		}
	}
}
