package deob;

@ObfuscatedName("xb")
public class class50 {

	@ObfuscatedName("xb.b")
	public int field653;

	@ObfuscatedName("xb.c")
	public int[] field654;

	@ObfuscatedName("xb.d")
	public int[] field655;

	@ObfuscatedName("xb.e")
	public int field656;

	@ObfuscatedName("xb.f")
	public int field657;

	@ObfuscatedName("xb.g")
	public int field658;

	@ObfuscatedName("xb.h")
	public int field659;

	@ObfuscatedName("xb.i")
	public int field660;

	@ObfuscatedName("xb.j")
	public int field661;

	@ObfuscatedName("xb.k")
	public int field662;

	@ObfuscatedName("xb.l")
	public int field663;

	@ObfuscatedName("xb.a(ILkb;)V")
	public final void method260(class37 arg0) {
		field658 = arg0.method209();
		field656 = arg0.method214();
		field657 = arg0.method214();
		field653 = arg0.method209();
		field654 = new int[field653];
		field655 = new int[field653];
		for (int var2 = 0; var2 < field653; var2++) {
			field654[var2] = arg0.method211();
			field655[var2] = arg0.method211();
		}
	}

	@ObfuscatedName("xb.a(Z)V")
	public final void method261() {
		field659 = 0;
		field660 = 0;
		field661 = 0;
		field662 = 0;
		field663 = 0;
	}

	@ObfuscatedName("xb.a(II)I")
	public final int method262(int arg0) {
		if (field663 >= field659) {
			field662 = field655[field660++] << 15;

			if (field660 >= field653) {
				field660 = field653 - 1;
			}

			field659 = (int) (field654[field660] / 65536.0D * arg0);
			if (field659 > field663) {
				field661 = ((field655[field660] << 15) - field662) / (field659 - field663);
			}
		}

		field662 += field661;
		field663++;
		return field662 - field661 >> 15;
	}
}
