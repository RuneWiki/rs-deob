package deob;

@ObfuscatedName("ac")
public class class53 {

	@ObfuscatedName("ac.b")
	public int field771;

	@ObfuscatedName("ac.c")
	public int[] field772;

	@ObfuscatedName("ac.d")
	public int[] field773;

	@ObfuscatedName("ac.e")
	public int field774;

	@ObfuscatedName("ac.f")
	public int field775;

	@ObfuscatedName("ac.g")
	public int field776;

	@ObfuscatedName("ac.h")
	public int field777;

	@ObfuscatedName("ac.i")
	public int field778;

	@ObfuscatedName("ac.j")
	public int field779;

	@ObfuscatedName("ac.k")
	public int field780;

	@ObfuscatedName("ac.l")
	public int field781;

	@ObfuscatedName("ac.a(Llb;Z)V")
	public final void method309(class38 arg0) {
		field776 = arg0.method229();
		field774 = arg0.method234();
		field775 = arg0.method234();
		method310(arg0);
	}

	@ObfuscatedName("ac.b(Llb;Z)V")
	public final void method310(class38 arg0) {
		field771 = arg0.method229();
		field772 = new int[field771];
		field773 = new int[field771];
		for (int var2 = 0; var2 < field771; var2++) {
			field772[var2] = arg0.method231();
			field773[var2] = arg0.method231();
		}
	}

	@ObfuscatedName("ac.a(I)V")
	public final void method311() {
		field777 = 0;
		field778 = 0;
		field779 = 0;
		field780 = 0;
		field781 = 0;
	}

	@ObfuscatedName("ac.a(II)I")
	public final int method312(int arg0) {
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
