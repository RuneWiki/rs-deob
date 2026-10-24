package deob;

@ObfuscatedName("xb")
public class class50 {

	@ObfuscatedName("xb.c")
	public int field652;

	@ObfuscatedName("xb.d")
	public int[] field653;

	@ObfuscatedName("xb.e")
	public int[] field654;

	@ObfuscatedName("xb.f")
	public int field655;

	@ObfuscatedName("xb.g")
	public int field656;

	@ObfuscatedName("xb.h")
	public int field657;

	@ObfuscatedName("xb.i")
	public int field658;

	@ObfuscatedName("xb.j")
	public int field659;

	@ObfuscatedName("xb.k")
	public int field660;

	@ObfuscatedName("xb.l")
	public int field661;

	@ObfuscatedName("xb.m")
	public int field662;

	@ObfuscatedName("xb.a(BLkb;)V")
	public final void method260(class37 arg0) {
		field657 = arg0.method209();
		field655 = arg0.method214();
		field656 = arg0.method214();
		field652 = arg0.method209();
		field653 = new int[field652];
		field654 = new int[field652];
		for (int var2 = 0; var2 < field652; var2++) {
			field653[var2] = arg0.method211();
			field654[var2] = arg0.method211();
		}
	}

	@ObfuscatedName("xb.a(I)V")
	public final void method261() {
		field658 = 0;
		field659 = 0;
		field660 = 0;
		field661 = 0;
		field662 = 0;
	}

	@ObfuscatedName("xb.a(BI)I")
	public final int method262(int arg0) {
		if (field662 >= field658) {
			field661 = field654[field659++] << 15;

			if (field659 >= field652) {
				field659 = field652 - 1;
			}

			field658 = (int) (field653[field659] / 65536.0D * arg0);
			if (field658 > field662) {
				field660 = ((field654[field659] << 15) - field661) / (field658 - field662);
			}
		}

		field661 += field660;
		field662++;
		return field661 - field660 >> 15;
	}
}
