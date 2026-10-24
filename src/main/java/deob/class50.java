package deob;

@ObfuscatedName("xb")
public class class50 {

	@ObfuscatedName("xb.b")
	public int field656;

	@ObfuscatedName("xb.c")
	public int[] field657;

	@ObfuscatedName("xb.d")
	public int[] field658;

	@ObfuscatedName("xb.e")
	public int field659;

	@ObfuscatedName("xb.f")
	public int field660;

	@ObfuscatedName("xb.g")
	public int field661;

	@ObfuscatedName("xb.h")
	public int field662;

	@ObfuscatedName("xb.i")
	public int field663;

	@ObfuscatedName("xb.j")
	public int field664;

	@ObfuscatedName("xb.k")
	public int field665;

	@ObfuscatedName("xb.l")
	public int field666;

	@ObfuscatedName("xb.a(Lkb;I)V")
	public final void method260(class37 arg0) {
		field661 = arg0.method209();
		field659 = arg0.method214();
		field660 = arg0.method214();
		field656 = arg0.method209();
		field657 = new int[field656];
		field658 = new int[field656];
		for (int var2 = 0; var2 < field656; var2++) {
			field657[var2] = arg0.method211();
			field658[var2] = arg0.method211();
		}
	}

	@ObfuscatedName("xb.a(Z)V")
	public final void method261() {
		field662 = 0;
		field663 = 0;
		field664 = 0;
		field665 = 0;
		field666 = 0;
	}

	@ObfuscatedName("xb.a(II)I")
	public final int method262(int arg0) {
		if (field666 >= field662) {
			field665 = field658[field663++] << 15;

			if (field663 >= field656) {
				field663 = field656 - 1;
			}

			field662 = (int) (field657[field663] / 65536.0D * arg0);
			if (field662 > field666) {
				field664 = ((field658[field663] << 15) - field665) / (field662 - field666);
			}
		}

		field665 += field664;
		field666++;
		return field665 - field664 >> 15;
	}
}
