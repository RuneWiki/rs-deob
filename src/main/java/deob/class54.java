package deob;

@ObfuscatedName("bc")
public class class54 {

	@ObfuscatedName("bc.c")
	public int field756;

	@ObfuscatedName("bc.d")
	public int[] field757;

	@ObfuscatedName("bc.e")
	public int[] field758;

	@ObfuscatedName("bc.f")
	public int field759;

	@ObfuscatedName("bc.g")
	public int field760;

	@ObfuscatedName("bc.h")
	public int field761;

	@ObfuscatedName("bc.i")
	public int field762;

	@ObfuscatedName("bc.j")
	public int field763;

	@ObfuscatedName("bc.k")
	public int field764;

	@ObfuscatedName("bc.l")
	public int field765;

	@ObfuscatedName("bc.m")
	public int field766;

	@ObfuscatedName("bc.a(ILmb;)V")
	public final void method309(class39 arg0) {
		field761 = arg0.method231();
		field759 = arg0.method236();
		field760 = arg0.method236();
		field756 = arg0.method231();
		field757 = new int[field756];
		field758 = new int[field756];
		for (int var2 = 0; var2 < field756; var2++) {
			field757[var2] = arg0.method233();
			field758[var2] = arg0.method233();
		}
	}

	@ObfuscatedName("bc.a(Z)V")
	public final void method310() {
		field762 = 0;
		field763 = 0;
		field764 = 0;
		field765 = 0;
		field766 = 0;
	}

	@ObfuscatedName("bc.a(II)I")
	public final int method311(int arg0) {
		if (field766 >= field762) {
			field765 = field758[field763++] << 15;

			if (field763 >= field756) {
				field763 = field756 - 1;
			}

			field762 = (int) (field757[field763] / 65536.0D * arg0);
			if (field762 > field766) {
				field764 = ((field758[field763] << 15) - field765) / (field762 - field766);
			}
		}

		field765 += field764;
		field766++;
		return field765 - field764 >> 15;
	}
}
