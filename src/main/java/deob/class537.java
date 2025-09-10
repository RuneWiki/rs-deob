package deob;

@ObfuscatedName("ub")
public class class537 {

	@ObfuscatedName("ub.ay")
	public static final int[] field5575 = new int[2048];

	@ObfuscatedName("ub.ad")
	public static final int[] field5572 = new int[2048];

	@ObfuscatedName("ub.ag")
	public static final int[][] field5577 = new int[512][512];

	static {
		double var0 = 0.0030679615757712823D;
		for (int var2 = 0; var2 < 2048; var2++) {
			field5575[var2] = (int) (Math.sin((double) var2 * var0) * 65536.0D);
			field5572[var2] = (int) (Math.cos((double) var2 * var0) * 65536.0D);
		}
		for (int var3 = -256; var3 < 256; var3++) {
			for (int var4 = -256; var4 < 256; var4++) {
				field5577[var3 + 256][var4 + 256] = (int) Math.round(Math.atan2((double) var3, (double) var4) * 325.94932345220167D) - 512 & 0x7FF;
			}
		}
	}

	public class537() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("bc.af(IB)F")
	public static float method1865(int arg0) {
		int var1 = arg0 & 0x7FF;
		return (float) ((double) ((float) var1 / 2048.0F) * 6.283185307179586D);
	}

	@ObfuscatedName("et.aw(III)I")
	public static int method3431(int arg0, int arg1) {
		return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 325.94932345220167D) - 512 & 0x7FF;
	}

	@ObfuscatedName("ij.at(II)D")
	public static double method4516(int arg0) {
		int var1 = field5575[arg0 & 0x7FF];
		return (double) var1 / 65536.0D;
	}

	@ObfuscatedName("gy.ac(IIB)I")
	public static int method3777(int arg0, int arg1) {
		int var2 = arg1 - arg0 & 0x7FF;
		return var2 > 1024 ? -(2048 - var2) : var2;
	}
}
