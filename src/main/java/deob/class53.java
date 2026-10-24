package deob;

@ObfuscatedName("ac")
public class class53 {

	@ObfuscatedName("ac.b")
	public int field765;

	@ObfuscatedName("ac.c")
	public int[] field766;

	@ObfuscatedName("ac.d")
	public int[] field767;

	@ObfuscatedName("ac.e")
	public int field768;

	@ObfuscatedName("ac.f")
	public int field769;

	@ObfuscatedName("ac.g")
	public int field770;

	@ObfuscatedName("ac.h")
	public int field771;

	@ObfuscatedName("ac.i")
	public int field772;

	@ObfuscatedName("ac.j")
	public int field773;

	@ObfuscatedName("ac.k")
	public int field774;

	@ObfuscatedName("ac.l")
	public int field775;

	@ObfuscatedName("ac.a(Llb;B)V")
	public final void method305(class38 arg0) {
		field770 = arg0.method225();
		field768 = arg0.method230();
		field769 = arg0.method230();
		method306(arg0);
	}

	@ObfuscatedName("ac.a(ILlb;)V")
	public final void method306(class38 arg0) {
		field765 = arg0.method225();
		field766 = new int[field765];
		field767 = new int[field765];
		for (int var2 = 0; var2 < field765; var2++) {
			field766[var2] = arg0.method227();
			field767[var2] = arg0.method227();
		}
	}

	@ObfuscatedName("ac.a(Z)V")
	public final void method307() {
		field771 = 0;
		field772 = 0;
		field773 = 0;
		field774 = 0;
		field775 = 0;
	}

	@ObfuscatedName("ac.a(BI)I")
	public final int method308(int arg0) {
		if (field775 >= field771) {
			field774 = field767[field772++] << 15;

			if (field772 >= field765) {
				field772 = field765 - 1;
			}

			field771 = (int) (field766[field772] / 65536.0D * arg0);
			if (field771 > field775) {
				field773 = ((field767[field772] << 15) - field774) / (field771 - field775);
			}
		}

		field774 += field773;
		field775++;
		return field774 - field773 >> 15;
	}
}
