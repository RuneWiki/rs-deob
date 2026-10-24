package deob;

@ObfuscatedName("bc")
public class class54 {

	@ObfuscatedName("bc.b")
	public int field772;

	@ObfuscatedName("bc.c")
	public int[] field773;

	@ObfuscatedName("bc.d")
	public int[] field774;

	@ObfuscatedName("bc.e")
	public int field775;

	@ObfuscatedName("bc.f")
	public int field776;

	@ObfuscatedName("bc.g")
	public int field777;

	@ObfuscatedName("bc.h")
	public int field778;

	@ObfuscatedName("bc.i")
	public int field779;

	@ObfuscatedName("bc.j")
	public int field780;

	@ObfuscatedName("bc.k")
	public int field781;

	@ObfuscatedName("bc.l")
	public int field782;

	@ObfuscatedName("bc.a(BLmb;)V")
	public final void method308(class39 arg0) {
		field777 = arg0.method228();
		field775 = arg0.method233();
		field776 = arg0.method233();
		method309(arg0);
	}

	@ObfuscatedName("bc.a(ILmb;)V")
	public final void method309(class39 arg0) {
		field772 = arg0.method228();
		field773 = new int[field772];
		field774 = new int[field772];
		for (int var2 = 0; var2 < field772; var2++) {
			field773[var2] = arg0.method230();
			field774[var2] = arg0.method230();
		}
	}

	@ObfuscatedName("bc.a(I)V")
	public final void method310() {
		field778 = 0;
		field779 = 0;
		field780 = 0;
		field781 = 0;
		field782 = 0;
	}

	@ObfuscatedName("bc.a(IZ)I")
	public final int method311(int arg0) {
		if (field782 >= field778) {
			field781 = field774[field779++] << 15;

			if (field779 >= field772) {
				field779 = field772 - 1;
			}

			field778 = (int) (field773[field779] / 65536.0D * arg0);
			if (field778 > field782) {
				field780 = ((field774[field779] << 15) - field781) / (field778 - field782);
			}
		}

		field781 += field780;
		field782++;
		return field781 - field780 >> 15;
	}
}
