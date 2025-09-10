package deob;

@ObfuscatedName("cm")
public class class59 {

	@ObfuscatedName("cm.aw")
	public static final class95[] field833 = new class95[50];

	@ObfuscatedName("cm.at")
	public static final int[] field830 = new int[50];

	@ObfuscatedName("cm.ac")
	public static final int[] field829 = new int[50];

	@ObfuscatedName("cm.ap")
	public static final int[] field834 = new int[50];

	@ObfuscatedName("cm.aq")
	public static final int[] field832 = new int[50];

	@ObfuscatedName("cm.ao")
	public static final int[] field831 = new int[50];

	@ObfuscatedName("cm.as")
	public static final int[] field835 = new int[50];

	@ObfuscatedName("cm.al")
	public static final boolean[] field836 = new boolean[50];

	@ObfuscatedName("cm.au")
	public static int field837 = 0;

	public class59() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("kw.aw(IIIIIIIIZI)V")
	public static void method5548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		field829[field837] = arg0;
		field833[field837] = null;
		field834[field837] = (arg2 << 16) + (arg3 << 8) + arg4;
		field835[field837] = arg1;
		field831[field837] = arg6;
		field832[field837] = arg7;
		field830[field837] = arg5;
		field836[field837] = arg8;
		field837++;
	}

	@ObfuscatedName("hg.at(II)V")
	public static void method3919(int arg0) {
		field837--;
		for (int var1 = arg0; var1 < field837; var1++) {
			field829[var1] = field829[var1 + 1];
			field833[var1] = field833[var1 + 1];
			field834[var1] = field834[var1 + 1];
			field835[var1] = field835[var1 + 1];
			field831[var1] = field831[var1 + 1];
			field832[var1] = field832[var1 + 1];
			field830[var1] = field830[var1 + 1];
			field836[var1] = field836[var1 + 1];
		}
	}

	@ObfuscatedName("wv.ac(IIIB)V")
	public static void method10185(int arg0, int arg1, int arg2) {
		if (Statics.field240.method2569() != 0 && arg1 != 0 && field837 < 50) {
			method5548(-1, arg0, 0, 0, 0, 0, arg1, arg2, false);
		}
	}

	@ObfuscatedName("bl.ap(IIIIIIIII)V")
	public static void method679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (Statics.field240.method2624() != 0 && arg6 > 0 && field837 < 50) {
			method5548(Statics.field5344.field1173, arg1, arg2, arg3, arg4, arg5, arg6, arg7, false);
		}
	}
}
