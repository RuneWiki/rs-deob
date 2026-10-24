package deob;

@ObfuscatedName("xb")
public class class50 {

	@ObfuscatedName("xb.c")
	public int field651;

	@ObfuscatedName("xb.d")
	public int[] field652;

	@ObfuscatedName("xb.e")
	public int[] field653;

	@ObfuscatedName("xb.f")
	public int field654;

	@ObfuscatedName("xb.g")
	public int field655;

	@ObfuscatedName("xb.h")
	public int field656;

	@ObfuscatedName("xb.i")
	public int field657;

	@ObfuscatedName("xb.j")
	public int field658;

	@ObfuscatedName("xb.k")
	public int field659;

	@ObfuscatedName("xb.l")
	public int field660;

	@ObfuscatedName("xb.m")
	public int field661;

	@ObfuscatedName("xb.a(BLkb;)V")
	public final void method259(class37 arg0) {
		field656 = arg0.method208();
		field654 = arg0.method213();
		field655 = arg0.method213();
		field651 = arg0.method208();
		field652 = new int[field651];
		field653 = new int[field651];
		for (int var2 = 0; var2 < field651; var2++) {
			field652[var2] = arg0.method210();
			field653[var2] = arg0.method210();
		}
	}

	@ObfuscatedName("xb.a(I)V")
	public final void method260() {
		field657 = 0;
		field658 = 0;
		field659 = 0;
		field660 = 0;
		field661 = 0;
	}

	@ObfuscatedName("xb.a(II)I")
	public final int method261(int arg0) {
		if (field661 >= field657) {
			field660 = field653[field658++] << 15;

			if (field658 >= field651) {
				field658 = field651 - 1;
			}

			field657 = (int) (field652[field658] / 65536.0D * arg0);
			if (field657 > field661) {
				field659 = ((field653[field658] << 15) - field660) / (field657 - field661);
			}
		}

		field660 += field659;
		field661++;
		return field660 - field659 >> 15;
	}
}
