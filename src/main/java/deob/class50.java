package deob;

@ObfuscatedName("xb")
public class class50 {

	@ObfuscatedName("xb.b")
	public int field655;

	@ObfuscatedName("xb.c")
	public int[] field656;

	@ObfuscatedName("xb.d")
	public int[] field657;

	@ObfuscatedName("xb.e")
	public int field658;

	@ObfuscatedName("xb.f")
	public int field659;

	@ObfuscatedName("xb.g")
	public int field660;

	@ObfuscatedName("xb.h")
	public int field661;

	@ObfuscatedName("xb.i")
	public int field662;

	@ObfuscatedName("xb.j")
	public int field663;

	@ObfuscatedName("xb.k")
	public int field664;

	@ObfuscatedName("xb.l")
	public int field665;

	@ObfuscatedName("xb.a(Lkb;Z)V")
	public final void method267(class37 arg0) {
		field660 = arg0.method216();
		field658 = arg0.method221();
		field659 = arg0.method221();
		field655 = arg0.method216();
		field656 = new int[field655];
		field657 = new int[field655];
		for (int var2 = 0; var2 < field655; var2++) {
			field656[var2] = arg0.method218();
			field657[var2] = arg0.method218();
		}
	}

	@ObfuscatedName("xb.a(I)V")
	public final void method268() {
		field661 = 0;
		field662 = 0;
		field663 = 0;
		field664 = 0;
		field665 = 0;
	}

	@ObfuscatedName("xb.a(IB)I")
	public final int method269(int arg0) {
		if (field665 >= field661) {
			field664 = field657[field662++] << 15;

			if (field662 >= field655) {
				field662 = field655 - 1;
			}

			field661 = (int) (field656[field662] / 65536.0D * arg0);
			if (field661 > field665) {
				field663 = ((field657[field662] << 15) - field664) / (field661 - field665);
			}
		}

		field664 += field663;
		field665++;
		return field664 - field663 >> 15;
	}
}
