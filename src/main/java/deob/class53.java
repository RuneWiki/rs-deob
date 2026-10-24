package deob;

@ObfuscatedName("ac")
public class class53 {

	@ObfuscatedName("ac.d")
	public int field763;

	@ObfuscatedName("ac.e")
	public int[] field764;

	@ObfuscatedName("ac.f")
	public int[] field765;

	@ObfuscatedName("ac.g")
	public int field766;

	@ObfuscatedName("ac.h")
	public int field767;

	@ObfuscatedName("ac.i")
	public int field768;

	@ObfuscatedName("ac.j")
	public int field769;

	@ObfuscatedName("ac.k")
	public int field770;

	@ObfuscatedName("ac.l")
	public int field771;

	@ObfuscatedName("ac.m")
	public int field772;

	@ObfuscatedName("ac.n")
	public int field773;

	@ObfuscatedName("ac.a(Llb;I)V")
	public final void method304(class38 arg0) {
		field768 = arg0.method224();
		field766 = arg0.method229();
		field767 = arg0.method229();
		method305(arg0);
	}

	@ObfuscatedName("ac.a(BLlb;)V")
	public final void method305(class38 arg0) {
		field763 = arg0.method224();
		field764 = new int[field763];
		field765 = new int[field763];
		for (int var2 = 0; var2 < field763; var2++) {
			field764[var2] = arg0.method226();
			field765[var2] = arg0.method226();
		}
	}

	@ObfuscatedName("ac.a(I)V")
	public final void method306() {
		field769 = 0;
		field770 = 0;
		field771 = 0;
		field772 = 0;
		field773 = 0;
	}

	@ObfuscatedName("ac.a(II)I")
	public final int method307(int arg0) {
		if (field773 >= field769) {
			field772 = field765[field770++] << 15;

			if (field770 >= field763) {
				field770 = field763 - 1;
			}

			field769 = (int) (field764[field770] / 65536.0D * arg0);
			if (field769 > field773) {
				field771 = ((field765[field770] << 15) - field772) / (field769 - field773);
			}
		}

		field772 += field771;
		field773++;
		return field772 - field771 >> 15;
	}
}
