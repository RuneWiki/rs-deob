package deob;

@ObfuscatedName("nb")
public final class class40 extends class21 {

	@ObfuscatedName("nb.e")
	public int field571 = 4;

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

	public class40(int arg0, int arg1, int arg2, boolean arg3, class62 arg4, int arg5, int arg6, int arg7) {
		field572 = arg2;
		field573 = arg0;

		if (arg5 < field571 || arg5 > field571) {
			field571 = -40;
		}

		field574 = arg7;
		field575 = arg1;
		field576 = arg6;
		field577 = arg4;
		if (arg3 && arg4.field906 != -1) {
			field578 = (int) (Math.random() * field577.field902);
			field579 = (int) (Math.random() * field577.field905[field578]);
		} else {
			field578 = -1;
			field579 = 0;
		}
	}
}
