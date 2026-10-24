package deob;

@ObfuscatedName("bc")
public class class54 {

	@ObfuscatedName("bc.b")
	public int field768;

	@ObfuscatedName("bc.c")
	public int[] field769;

	@ObfuscatedName("bc.d")
	public int[] field770;

	@ObfuscatedName("bc.e")
	public int field771;

	@ObfuscatedName("bc.f")
	public int field772;

	@ObfuscatedName("bc.g")
	public int field773;

	@ObfuscatedName("bc.h")
	public int field774;

	@ObfuscatedName("bc.i")
	public int field775;

	@ObfuscatedName("bc.j")
	public int field776;

	@ObfuscatedName("bc.k")
	public int field777;

	@ObfuscatedName("bc.l")
	public int field778;

	@ObfuscatedName("bc.a(Lmb;I)V")
	public final void method318(class39 arg0) {
		field773 = arg0.method238();
		field771 = arg0.method243();
		field772 = arg0.method243();
		field768 = arg0.method238();
		field769 = new int[field768];
		field770 = new int[field768];
		for (int var2 = 0; var2 < field768; var2++) {
			field769[var2] = arg0.method240();
			field770[var2] = arg0.method240();
		}
	}

	@ObfuscatedName("bc.a(Z)V")
	public final void method319() {
		field774 = 0;
		field775 = 0;
		field776 = 0;
		field777 = 0;
		field778 = 0;
	}

	@ObfuscatedName("bc.a(II)I")
	public final int method320(int arg0) {
		if (field778 >= field774) {
			field777 = field770[field775++] << 15;

			if (field775 >= field768) {
				field775 = field768 - 1;
			}

			field774 = (int) (field769[field775] / 65536.0D * arg0);
			if (field774 > field778) {
				field776 = ((field770[field775] << 15) - field777) / (field774 - field778);
			}
		}

		field777 += field776;
		field778++;
		return field777 - field776 >> 15;
	}
}
