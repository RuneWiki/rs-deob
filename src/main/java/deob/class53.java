package deob;

@ObfuscatedName("ac")
public class class53 {

	@ObfuscatedName("ac.c")
	public int field770;

	@ObfuscatedName("ac.d")
	public int[] field771;

	@ObfuscatedName("ac.e")
	public int[] field772;

	@ObfuscatedName("ac.f")
	public int field773;

	@ObfuscatedName("ac.g")
	public int field774;

	@ObfuscatedName("ac.h")
	public int field775;

	@ObfuscatedName("ac.i")
	public int field776;

	@ObfuscatedName("ac.j")
	public int field777;

	@ObfuscatedName("ac.k")
	public int field778;

	@ObfuscatedName("ac.l")
	public int field779;

	@ObfuscatedName("ac.m")
	public int field780;

	@ObfuscatedName("ac.a(Llb;I)V")
	public final void method309(class38 arg0) {
		field775 = arg0.method229();
		field773 = arg0.method234();
		field774 = arg0.method234();
		method310(arg0);
	}

	@ObfuscatedName("ac.a(Llb;Z)V")
	public final void method310(class38 arg0) {
		field770 = arg0.method229();
		field771 = new int[field770];
		field772 = new int[field770];
		for (int var2 = 0; var2 < field770; var2++) {
			field771[var2] = arg0.method231();
			field772[var2] = arg0.method231();
		}
	}

	@ObfuscatedName("ac.a(B)V")
	public final void method311() {
		field776 = 0;
		field777 = 0;
		field778 = 0;
		field779 = 0;
		field780 = 0;
	}

	@ObfuscatedName("ac.a(II)I")
	public final int method312(int arg0) {
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
