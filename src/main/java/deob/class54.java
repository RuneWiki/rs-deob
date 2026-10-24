package deob;

@ObfuscatedName("bc")
public class class54 {

	@ObfuscatedName("bc.b")
	public int field771;

	@ObfuscatedName("bc.c")
	public int[] field772;

	@ObfuscatedName("bc.d")
	public int[] field773;

	@ObfuscatedName("bc.e")
	public int field774;

	@ObfuscatedName("bc.f")
	public int field775;

	@ObfuscatedName("bc.g")
	public int field776;

	@ObfuscatedName("bc.h")
	public int field777;

	@ObfuscatedName("bc.i")
	public int field778;

	@ObfuscatedName("bc.j")
	public int field779;

	@ObfuscatedName("bc.k")
	public int field780;

	@ObfuscatedName("bc.l")
	public int field781;

	@ObfuscatedName("bc.a(ILmb;)V")
	public final void method319(class39 arg0) {
		field776 = arg0.method239();
		field774 = arg0.method244();
		field775 = arg0.method244();
		field771 = arg0.method239();
		field772 = new int[field771];
		field773 = new int[field771];
		for (int var2 = 0; var2 < field771; var2++) {
			field772[var2] = arg0.method241();
			field773[var2] = arg0.method241();
		}
	}

	@ObfuscatedName("bc.a(I)V")
	public final void method320() {
		field777 = 0;
		field778 = 0;
		field779 = 0;
		field780 = 0;
		field781 = 0;
	}

	@ObfuscatedName("bc.a(II)I")
	public final int method321(int arg0) {
		if (field781 >= field777) {
			field780 = field773[field778++] << 15;

			if (field778 >= field771) {
				field778 = field771 - 1;
			}

			field777 = (int) (field772[field778] / 65536.0D * arg0);
			if (field777 > field781) {
				field779 = ((field773[field778] << 15) - field780) / (field777 - field781);
			}
		}

		field780 += field779;
		field781++;
		return field780 - field779 >> 15;
	}
}
