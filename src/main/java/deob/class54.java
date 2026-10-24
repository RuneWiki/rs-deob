package deob;

@ObfuscatedName("bc")
public class class54 {

	@ObfuscatedName("bc.d")
	public int field753;

	@ObfuscatedName("bc.e")
	public int[] field754;

	@ObfuscatedName("bc.f")
	public int[] field755;

	@ObfuscatedName("bc.g")
	public int field756;

	@ObfuscatedName("bc.h")
	public int field757;

	@ObfuscatedName("bc.i")
	public int field758;

	@ObfuscatedName("bc.j")
	public int field759;

	@ObfuscatedName("bc.k")
	public int field760;

	@ObfuscatedName("bc.l")
	public int field761;

	@ObfuscatedName("bc.m")
	public int field762;

	@ObfuscatedName("bc.n")
	public int field763;

	@ObfuscatedName("bc.a(ZLmb;)V")
	public final void method305(class39 arg0) {
		field758 = arg0.method231();
		field756 = arg0.method236();
		field757 = arg0.method236();
		field753 = arg0.method231();
		field754 = new int[field753];
		field755 = new int[field753];
		for (int var2 = 0; var2 < field753; var2++) {
			field754[var2] = arg0.method233();
			field755[var2] = arg0.method233();
		}
	}

	@ObfuscatedName("bc.a(Z)V")
	public final void method306() {
		field759 = 0;
		field760 = 0;
		field761 = 0;
		field762 = 0;
		field763 = 0;
	}

	@ObfuscatedName("bc.a(IZ)I")
	public final int method307(int arg0) {
		if (field763 >= field759) {
			field762 = field755[field760++] << 15;

			if (field760 >= field753) {
				field760 = field753 - 1;
			}

			field759 = (int) (field754[field760] / 65536.0D * arg0);
			if (field759 > field763) {
				field761 = ((field755[field760] << 15) - field762) / (field759 - field763);
			}
		}

		field762 += field761;
		field763++;
		return field762 - field761 >> 15;
	}
}
