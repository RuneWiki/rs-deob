package deob;

@ObfuscatedName("bc")
public class class54 {

	@ObfuscatedName("bc.b")
	public int field770;

	@ObfuscatedName("bc.c")
	public int[] field771;

	@ObfuscatedName("bc.d")
	public int[] field772;

	@ObfuscatedName("bc.e")
	public int field773;

	@ObfuscatedName("bc.f")
	public int field774;

	@ObfuscatedName("bc.g")
	public int field775;

	@ObfuscatedName("bc.h")
	public int field776;

	@ObfuscatedName("bc.i")
	public int field777;

	@ObfuscatedName("bc.j")
	public int field778;

	@ObfuscatedName("bc.k")
	public int field779;

	@ObfuscatedName("bc.l")
	public int field780;

	@ObfuscatedName("bc.a(ZLmb;)V")
	public final void method318(class39 arg0) {
		field775 = arg0.method238();
		field773 = arg0.method243();
		field774 = arg0.method243();
		field770 = arg0.method238();
		field771 = new int[field770];
		field772 = new int[field770];
		for (int var2 = 0; var2 < field770; var2++) {
			field771[var2] = arg0.method240();
			field772[var2] = arg0.method240();
		}
	}

	@ObfuscatedName("bc.a(B)V")
	public final void method319() {
		field776 = 0;
		field777 = 0;
		field778 = 0;
		field779 = 0;
		field780 = 0;
	}

	@ObfuscatedName("bc.a(II)I")
	public final int method320(int arg0) {
		if (field780 >= field776) {
			field779 = field772[field777++] << 15;

			if (field777 >= field770) {
				field777 = field770 - 1;
			}

			field776 = (int) (field771[field777] / 65536.0D * arg0);
			if (field776 > field780) {
				field778 = ((field772[field777] << 15) - field779) / (field776 - field780);
			}
		}

		field779 += field778;
		field780++;
		return field779 - field778 >> 15;
	}
}
